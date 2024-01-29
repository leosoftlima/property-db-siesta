package mop;

import mop.LoggerSpecification.SpecificationType;

public class InetSocketAddress_Port {

	 public void InetSocketAddress_PortEvent(int port) {

		 if (!(0 <= port && port <= 65535)) {
	    	  LoggerSpecification.printLogging(SpecificationType.InetSocketAddress_Port, String.valueOf(port));
 
	      }
	   }
	 
}
