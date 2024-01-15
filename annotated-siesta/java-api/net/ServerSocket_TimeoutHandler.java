package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an invalid timeout value is set to a ServerSocket object.
 *
 * The timeout value must be > 0.
 * http://docs.oracle.com/javase/6/docs/api/java/net/ServerSocket.html#setSoTimeout%28int%29
 *
 * @severity error
 */

public class ServerSocket_TimeoutHandler {

    @Before("* java.net.ServerSocket+.setSoTimeout(..)")
    public static void vioServerSocket_Timeout(String name, boolean isStatic, Object[] args) {
    	if(hasElements(args))
           NetSpecificationHandler.EventServerSocket_Timeout((int)args[1]);
    }
    
	private static boolean hasElements(Object[] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i] !=null)
				return true;
		}
		return false;
	}

}
