package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when the argument to decode is wrong
 *
 * According to the manual, the argument cannot contain any whitespace.
 * Also, there is a format to follow.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Long.html#decode%28java.lang.String%29
 *
 * @severity error
 */

public class Long_BadDecodeArgHandler {

    @Before("* java.lang.Long.decode(..)")
    public static void vioLong_BadDecodeArg(String name, boolean isStatic, Object[] args){
		Long i = null;
		
		if(args[0]!=null) {
			i = (Long) args[0];
		}
		
		String str = (String) args[1];
        LangSpecificationHandler.eventLong_BadDecodeArg(i, str);
    }
}
