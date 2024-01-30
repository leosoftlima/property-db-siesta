package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the name argument to valueOf() method of Enum contains any whitespace.
 *
 * According to the manual, extraneous whitespace characters are not permitted in the name
 * for an enum constant.
 * http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Enum.html#valueOf%28java.lang.Class,%20java.lang.String%29
 *
 * @severity error
 */
public class Enum_NoExtraWhiteSpaceHandler {

    @Before("* java.lang.Enum+.valueOf(..)")
    public static void vioEnum_NoExtraWhiteSpace(String name, boolean isStatic, Object[] args) {
    	    LangSpecificationHandler.eventEnum_NoExtraWhiteSpace(args);
    }

}
