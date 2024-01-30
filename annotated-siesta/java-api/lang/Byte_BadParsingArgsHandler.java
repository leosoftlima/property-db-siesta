package mop;


import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when arguments to parseByte are wrong.
 *
 * According to the manual, the first argument cannot be null or of length zero.
 * Also, radix should be in the range.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Byte.html#parseByte%28java.lang.String,%20int%29
 *
 * @severity warning
 */

public class Byte_BadParsingArgsHandler {

    @Before("* java.lang.Byte.parseByte(..)")
    public static void vioByteBadParsingArgs(String name, boolean isStatic, Object[] args) {

         LangSpecificationHandler.eventByteBadParsingArgs(args);

    }

}
