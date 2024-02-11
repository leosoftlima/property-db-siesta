package mop;

import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class DatagramSocket_TrafficClass {

	public void eventDatagramSocket_TrafficClass(DatagramSocket socket, Integer integer) {
		boolean outofrange  = 0 > integer || integer > 255;
	      boolean mbz  = false;
	      boolean precedence  = false;
	      InetAddress addr  = socket.getLocalAddress();
	      if (addr  instanceof Inet4Address) {
	         mbz  = (integer & 1) != 0;
	         precedence  = integer >> 5 != 0;
	      }

	      if (outofrange  || mbz  || precedence ) {
	    	  if (outofrange) {
	    		    LoggerSpecification.printLogging_DatagramSocket_TrafficClass(1, integer);

				} else {
					if (mbz) {
						LoggerSpecification.printLogging_DatagramSocket_TrafficClass(2, 0);
					}
					if (precedence) {
						LoggerSpecification.printLogging_DatagramSocket_TrafficClass(3, 0);
					}
				}
	      }
	}
}
