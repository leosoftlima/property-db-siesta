package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when the argument to decode is wrong
 *
 * According to the manual, the argument cannot contain any whitespace.
 * Also, there is a format to follow.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#decode%28java.lang.String%29
 *
 * @severity error
 */

public class Integer_BadDecodeArgHandler {

	@Before("* java.lang.Integer.decode(..)")
	public static void vioInteger_BadDecodeArg(String name, boolean isStatic, Object[] args){
		Integer i = null;
		
		if(args[0]!=null) {
			i = (Integer) args[0];
		}
		
		String str = (String) args[1];
		LangSpecificationHandler.eventInteger_BadDecodeArg(i, str);
	}
}
