package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the 'actions' parameter is invalid.
 *
 * The 'actions' parameter contains a comma-separated list of the actions
 * granted for the specified host (and port(s)). Possible actions are
 * "connect", "listen", "accept", "resolve", or any combination of those.
 * "resolve" is automatically added when any of the other three are specified.
 * http://docs.oracle.com/javase/6/docs/api/java/net/SocketPermission.html#SocketPermission%28java.lang.String,%20java.lang.String%29
 *
 * @severity error
 */

public class SocketPermission_ActionsHandler {

    @Before("java.net.SocketPermission.new(..)")
    public static void vioSocketPermission_Actions(String name, boolean isStatic, Object[] args){
       String str = (String) args[2];	
       NetSpecificationHandler.EventSocketPermission_Actions(str);
    }
}
