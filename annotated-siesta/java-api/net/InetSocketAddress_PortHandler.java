package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an InetSocketAddress_Port object is created with an invalid port.
 *
 * A valid port value is between 0 and 65535 inclusive.
 * http://docs.oracle.com/javase/6/docs/api/java/net/InetSocketAddress.html#InetSocketAddress%28int%29
 *
 * @severity error
 */

public class InetSocketAddress_PortHandler {

    @Before("java.net.InetSocketAddress.new(..)")
    @Before("* java.net.InetSocketAddress.createUnresolved(..)")
    public static void vioInetSocketAddress_Port_New(String name, boolean isStatic, Object[] args){
    	int i = (int) args[2];
        NetSpecificationHandler.EventInetSocketAddress_Port(i); 
    }

}
