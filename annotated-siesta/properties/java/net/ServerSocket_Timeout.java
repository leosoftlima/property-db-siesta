package mop;

import mop.LoggerSpecification.SpecificationType;

public class ServerSocket_Timeout {
	
	 public void Socket_TimeoutEvent(int timeout) {

	      if (timeout <= 0) {
	    	  LoggerSpecification.printLogging(SpecificationType.ServerSocket_Timeout, String.valueOf(timeout));
   
	      }
	   }

}
