package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the arguments for an InetAddress.isReachable() call are invalid.
 *
 * Both the timeout parameter and the ttl parameter must be 0 or a positive
 * value.
 * http://docs.oracle.com/javase/6/docs/api/java/net/InetAddress.html#isReachable%28int%29
 *
 * @severity error
 */

public class InetAddress_IsReachableHandler {

    @Before("* java.net.InetAddress+.isReachable(..)")
    public static void vioInetAddress_IsReachable(String name, boolean isStatic, Object[] args){
       NetSpecificationHandler.EventInetAddress_IsReachable(args);
    }
}
