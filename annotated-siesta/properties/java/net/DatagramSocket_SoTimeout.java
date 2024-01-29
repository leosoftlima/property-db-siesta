package mop;

import mop.LoggerSpecification.SpecificationType;

public class DatagramSocket_SoTimeout {

	
	 public void datagramSocket_SoTimeoutEvent(int timeout) {

	      if (timeout <= 0) {
	    	  LoggerSpecification.printLogging(SpecificationType.DatagramSocket_SoTimeout, String.valueOf(timeout));
  
	      }
	   }
}
