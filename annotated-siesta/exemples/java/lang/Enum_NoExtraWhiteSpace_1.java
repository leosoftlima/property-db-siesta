package mop;

public class Enum_NoExtraWhiteSpace_1  {
    public static void main(String[] args) {
        // Exemplo de uso
    	 final Class<? extends Enum> enumType = EnumExample.class;
    	    final Enum<?> theOneAndOnly = Enum.valueOf(enumType, "ELVIS ");
    	    System.out.println(theOneAndOnly.name());
    	    EnumExample.valueOf("string"); //no aspect capture
    	    EnumExample.values();
    	    
    	    Enum<?> value = of(EnumExample.class, "M E");
            System.err.println(value);
    }
    private static <E extends Enum<E>> E of(Class<E> clazz, String name) {
        E value = Enum.valueOf(clazz, name);
        return value;
    }
}

enum EnumExample  {
	ELVIS
}
