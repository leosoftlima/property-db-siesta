package mop;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

public class Socket_TrafficClass {

	public void eventSocket_TrafficClass(Socket socket, Integer integer) {
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
	    		    LoggerSpecification.printLogging_Socket_TrafficClass(1, integer);

				} else {
					if (mbz) {
						LoggerSpecification.printLogging_Socket_TrafficClass(2, 0);
					}
					if (precedence) {
						LoggerSpecification.printLogging_Socket_TrafficClass(3, 0);
					}
				}
	      }
	}
}
