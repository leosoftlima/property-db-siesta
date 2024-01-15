package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a DatagramSocket object is created with an invalid port.
 *
 * The local port, a parameter of some DatagramSocket's constructors, must be
 * between 0 and 65535 inclusive.
 * http://docs.oracle.com/javase/6/docs/api/java/net/DatagramSocket.html#DatagramSocket%28int,%20java.net.InetAddress%29
 *
 * @severity error
 */
public class DatagramSocket_PortHandler {

	@Before("java.net.DatagramSocket.new(..)")
	public static void vioDatagramSocket_PortHandler(String name, boolean isStatic, Object[] args) {
		if(hasElements(args)) {	
			int i = (int) args[1];
			NetSpecificationHandler.EventDatagramSocket_Port(i);
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
