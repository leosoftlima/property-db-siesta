package mop;


import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when arguments to parseShort are wrong.
 *
 * According to the manual, the first argument cannot be null or of length zero.
 * Also, radix should be in the range.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Short.html#parseShort%28java.lang.String,%20int%29
 *
 * @severity warning
 */

public class Short_BadParsingArgsHandler {

    @Before("* java.lang.Short.parseShort(..)")
    public static void vioShortBadParsingArgs(String name, boolean isStatic, Object[] args) {

         LangSpecificationHandler.eventShortBadParsingArgs(args);

    }

}
