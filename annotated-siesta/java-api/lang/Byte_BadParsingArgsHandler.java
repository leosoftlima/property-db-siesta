package mop;


import org.aspectjml.lang.annotation.siesta.Before;

public class Byte_BadParsingArgsHandler {

    @Before("* java.lang.Byte.parseByte(..)")
    public static void vioByteBadParsingArgs(String name, boolean isStatic, Object[] args) {

         LangSpecificationHandler.eventByteBadParsingArgs(args);

    }

}
