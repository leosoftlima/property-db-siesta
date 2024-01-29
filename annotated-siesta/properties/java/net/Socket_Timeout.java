package mop;

import mop.LoggerSpecification.SpecificationType;

public class Socket_Timeout {
	
	 public void Socket_TimeoutEvent(int timeout) {

	      if (timeout <= 0) {
	    	  LoggerSpecification.printLogging(SpecificationType.Socket_Timeout, String.valueOf(timeout));
   
	      }
	   }

}
