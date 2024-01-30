package mop;


import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when arguments to parseLong are wrong.
 *
 * According to the manual, the first argument cannot be null or of length zero.
 * Also, radix should be in the range.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Long.html#parseLong%28java.lang.String,%20int%29
 *
 * @severity warning
 */

public class Long_BadParsingArgsHandler {

    @Before("* java.lang.Long.parseLong(..)")
    public static void vioLongBadParsingArgs(String name, boolean isStatic, Object[] args) {

    	LangSpecificationHandler.eventLongBadParsingArgs(args);

    }

}
