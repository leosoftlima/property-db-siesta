package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class ClassLoader_UnsafeClassDefinitionHandler {

    @Before("* java.lang.ClassLoader+.defineClass(..)")
    public static void vioClassLoader_UnsafeClassDefinition(String name, boolean isStatic, Object[] args){
    	String str = (String) args[1];
        LangSpecificationHandler.eventClassLoader_UnsafeClassDefinition(str);
    }
}
