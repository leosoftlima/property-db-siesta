package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when the argument to decode is wrong
 *
 * According to the manual, the argument cannot contain any whitespace.
 * Also, there is a format to follow.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Short.html#decode%28java.lang.String%29
 *
 * @severity error
 */

public class Short_BadDecodeArgHandler {

    @Before("* java.lang.Short.decode(..)")
    public static void vioShort_BadDecodeArg(String name, boolean isStatic, Object[] args){
		Short i = null;
		
		if(args[0]!=null) {
			i = (Short) args[0];
		}
		
		String str = (String) args[1];
		LangSpecificationHandler.eventShort_BadDecodeArg(i, str);
    }
}
