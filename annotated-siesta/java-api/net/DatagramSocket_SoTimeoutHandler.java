package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if DatagramSocket.setSoTimeout() is called with an invalid timeout value.
 *
 * The timeout parameter of DatagramSocket.setSoTimeout() must be zero or
 * greater than 0.
 * http://docs.oracle.com/javase/6/docs/api/java/net/DatagramSocket.html#setSoTimeout%28int%29
 *
 * @severity error
 */

public class DatagramSocket_SoTimeoutHandler {

	@Before("void java.net.DatagramSocket.setSoTimeout(..)")
	public static void vioDatagramSocket_SoTimeout(String name, boolean isStatic, Object[] args) {
		if(hasElements(args)) {	
			int i = (int) args[1];
			NetSpecificationHandler.EventDatagramSocket_SoTimeout(i);
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
