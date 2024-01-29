package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a ServerSocket object is created with an invalid port.
 *
 * The port, a parameter of some ServerSocket's constructors, must be between
 * 0 and 65535 inclusive.
 * http://docs.oracle.com/javase/6/docs/api/java/net/ServerSocket.html#ServerSocket%28int,%20int,%20java.net.InetAddress%29
 *
 * @severity error
 */
public class ServerSocket_PortHandler {

	@Before("java.net.ServerSocket.new(..)")
	public static void vioServerSocket_PortHandler(String name, boolean isStatic, Object[] args) {
		if(hasElements(args)) {	
			int i = (int) args[1];
            NetSpecificationHandler.EventServerSocket_Port(i);
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
