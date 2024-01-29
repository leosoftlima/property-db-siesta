package mop;

import mop.LoggerSpecification.SpecificationType;

public class ServerSocket_Port {

	 public void ServerSocket_PortEvent(int port) {

		 if (!(0 <= port && port <= 65535)) {
	    	  LoggerSpecification.printLogging(SpecificationType.ServerSocket_Port, String.valueOf(port));
 
	      }
	   }
	 
}
