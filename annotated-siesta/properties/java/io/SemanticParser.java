package mop;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import org.aspectj.lang.reflect.SourceLocation;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.TraceClassVisitor;

import aj.org.objectweb.asm.Type;

public class SemanticParser {
    private static final int MAX_SIZE = 50;
    static String classNoInterface = null;

    public static  String[] historyOf(SourceLocation source ) throws IOException {
//    	System.out.println("line : " + source.getLine());
        return parsingMethods2(source.getWithinType(), source.getLine() ,false);
    }

    
    public static boolean hasMethodSpecification(Class<?> clazz, String...owner) throws IOException {
    	if (isValidClass(clazz)) {
            String classNames = getFormattedClassFileName(clazz);
            System.err.println("Analyzed Class: " + classNames);
            
            InputStream classFileStream = SemanticParser.class.getResourceAsStream(classNames); 
                if (classFileStream != null) {
                    return processClassFileSpecification(classFileStream,owner);
                } else {
//                    System.err.println("Class File Not Found for: " + clazz.getName());
                }
          
        }
    	return false;
    }
    
    private static final boolean processClassFileSpecification(InputStream classFileStream, String... target) throws IOException {
        final boolean[] valid = {false}; // Usando um array para contornar a restrição de variável final

        ClassReader classReader = new ClassReader(classFileStream);
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(new PrintWriter(System.out));
        
        classReader.accept(new ClassVisitor(Opcodes.ASM9, traceClassVisitor) {
            String classNoInterface = null;

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                System.out.println("1 - " + name + " - " + signature);
                if (isValidMethod(name, signature)) {
                    classNoInterface = null;
                    return new MethodVisitor(Opcodes.ASM9) {
                        @Override
                        public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                            if (verifyClasseNameOf(owner, name)) {
                                classNoInterface = owner;
                            }

                            if (handleMethodSpecInsn(owner, name, target, classNoInterface)) {
                                valid[0] = true;
                            }

                            // Chama o método pai para continuar o processamento
                            super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
                        }
                    };
                }
                return null;
            }
        }, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

        return valid[0];
    }

    
    private static boolean handleMethodSpecInsn(String owner, String name,String[] target, String classNoInterface) {
    	System.out.println("2 - " + owner + " - " + name);
    	String nameClass = null;
    	if(classNoInterface!=null) {
    		Type typeOwner = Type.getObjectType(classNoInterface);
    		nameClass = typeOwner.getClassName() + "." + name + "()";
//    		System.out.println(typeOwner.getClassName() + "." + name + "()");
    	}else {
    		nameClass = "";
    	}
    	if (verifyOf(owner, name)) {
    		for (String string : target) {
    			
    			if(string.startsWith(nameClass) && string.contains(name)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

    private static final String[] parsingMethods2(Class<?> clazz,int lineNumber ,boolean withPackage) throws IOException {
        String[] classNames = new String[MAX_SIZE];
        
        if (isValidClass(clazz)) {
            classNames[0] = getFormattedClassFileName(clazz);
//            System.err.println("Analyzed Class: " + classNames[0]);
            
            
            	InputStream classFileStream = SemanticParser.class.getResourceAsStream(classNames[0]);
                if (classFileStream != null) {
                    return processClassFile(classFileStream, lineNumber, withPackage);
                } else {
//                    System.err.println("Class File Not Found for: " + clazz.getName());
                }
          
        }
        
        return classNames;
    }
    
    private static final String[] processClassFile(InputStream classFileStream, int lineNumber, boolean withPackage) throws IOException {
          String[] methodCalls = new String[MAX_SIZE];

        ClassReader classReader = new ClassReader(classFileStream);
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(new PrintWriter(System.out));

        classReader.accept(new ClassVisitor(Opcodes.ASM9, traceClassVisitor) {
            int methodIndex = 0;

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                if (isValidMethod(name, signature)) {
                    methodIndex = 0;
                    int[] i = getMethodLineNumber(classReader, name);
                    return new MethodVisitor(Opcodes.ASM9) {
                      
                        @Override
                        public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {

                            if (lineNumber >= i[0] && lineNumber <= i[1]) {
                                handleMethodInsn(methodCalls, methodIndex, owner, name, withPackage);
                                methodIndex++;
                            }
                        }
                    };
                }
                return null;
            }

            @Override
            public void visitEnd() {
            }
        }, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

        return methodCalls;
    }

 


    private static final void handleMethodInsn(String[] methodCalls, int methodIndex, String owner, String name, boolean withPackage) {

        if (verifyClasseNameOf(owner, name)) {
            classNoInterface = owner;
        }

        if (verifyOf(owner, name)) {
            if (withPackage) {
                if (classNoInterface != null && !classNoInterface.isEmpty()) {
                    Type typeOwner = Type.getObjectType(classNoInterface);
                    methodCalls[methodIndex++] = typeOwner.getClassName() + "." + name + "()";
                    System.out.println(typeOwner.getClassName() + "." + name + "()");
                    classNoInterface = null;
                } else {
                    methodCalls[methodIndex++] = owner.replace("/", ".") + "." + name + "()";
                }
            } else {
                methodCalls[methodIndex++] = name;
            }
        }
    }

    private static boolean verifyOf(String owner, String name) {
        // Expressão regular para verificar se a string contém um método de uma das classes mencionadas
        String regex = "\\b(java\\/lang\\/|java\\/io\\/|java\\/util\\/).*";

        if (Pattern.matches(regex, owner) && !name.contains("<init>") && !name.contains("<clinit>") && !name.contains("ajc$preClinit")) {
            return true;
        }

        return false;
    }

    private static boolean verifyClasseNameOf(String owner, String name) {
        // Expressão regular para verificar se a string contém um método de uma das classes mencionadas
        String regex = "\\b(java\\/io\\/).*";

        if (Pattern.matches(regex, owner) && name.contains("<init>") && !name.contains("<clinit>") && !name.contains("ajc$preClinit")) {
            return true;
        }

        return false;
    }

    private static boolean isValidClass(Class<?> clazz) {
        return clazz != null && !clazz.getName().equals("org.objectweb.asm.ClassReader") &&
                !clazz.getName().equals("com.sun.tools.javac.jvm.ClassReader") &&
                !clazz.getName().equals("com.sun.tools.javac.jvm.ClassWriter");
    }

    private static String getFormattedClassFileName(Class<?> clazz) {
        return "/" + clazz.getName().replace('.', '/') + ".class";
    }

    private static boolean isValidMethod(String name, String signature) {
        return (!name.equals("ajc$preClinit") && name != null && !name.equals("<init>") && !name.equals("<clinit>") && signature == null);
    }

    
    private static int[] getMethodLineNumber(ClassReader classReader, final String methodName) {
        final int[] lineNumberRange = new int[2]; 

        classReader.accept(new ClassVisitor(Opcodes.ASM9) {
            int startLineNumber = -1;
            int endLineNumber = -1;

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                if (name.equals(methodName)) {
                    return new MethodVisitor(Opcodes.ASM9) {
                        @Override
                        public void visitLineNumber(int line, Label start) {
                            if (startLineNumber == -1) {
                                startLineNumber = line;
                            } else {
                                endLineNumber = line;
                            }
                        }
                    };
                }
                return null;
            }

            @Override
            public void visitEnd() {
                lineNumberRange[0] = startLineNumber;
                lineNumberRange[1] = endLineNumber;
            }
        }, 0);

        return lineNumberRange;
    }


}
