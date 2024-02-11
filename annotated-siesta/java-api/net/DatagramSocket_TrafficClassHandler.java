package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if DatagramSocket.setTrafficClass() is called with an invalid traffic
 * class value.
 *
 * The traffic class value, the only parameter of
 * DatagramSocket.setTrafficClass(), must be between 0 and 255 inclusive.
 * http://docs.oracle.com/javase/6/docs/api/java/net/DatagramSocket.html#setTrafficClass%28int%29
 *
 * According to the reference, when IPv4 is used, the last low order bit is
 * always ignored and setting bits in the precedence field may result in a
 * SocketException indicating that the operation is not permitted. To inform
 * the user that some bits are ignored and may cause an error, this property
 * warns if the last low bit or the precedence field is set.
 *
 * @severity error
 */

public class DatagramSocket_TrafficClassHandler {

    @Before("* java.net.DatagramSocket.setTrafficClass(..)")
    public static void vioDatagramSocketSocket_TrafficClass(String name, boolean isStatic, Object[] args){
       NetSpecificationHandler.EventDatagramSocket_TrafficClass(args);
    }
}
