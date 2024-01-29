package mop;

import mop.LoggerSpecification.SpecificationType;

public class DatagramSocket_Port {

	 public void datagramSocket_PortEvent(int port) {

		 if (!(0 <= port && port <= 65535)) {
	    	  LoggerSpecification.printLogging(SpecificationType.DatagramSocket_SoTimeout, String.valueOf(port));
 
	      }
	   }
	 
}
