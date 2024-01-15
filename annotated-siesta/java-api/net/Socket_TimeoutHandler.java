package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an invalid timeout value is set to a Socket object.
 *
 * The timeout value must be > 0.
 * http://docs.oracle.com/javase/6/docs/api/java/net/Socket.html#setSoTimeout%28int%29
 *
 * @severity error
 */

public class Socket_TimeoutHandler {

	@Before("* java.net.Socket+.setSoTimeout(..)")
	public static void vioSocket_Timeout(String name, boolean isStatic, Object[] args) {
		if(hasElements(args)) {	
			int i = 	(int) args[1];
			NetSpecificationHandler.EventSocket_Timeout(i);
		}
	}

	private static boolean hasElements(Object[] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i] !=null)
				return true;
		}
		return false;
	}
}