package mop;

import mop.LoggerSpecification.SpecificationType;

public class IDN_ToAscii {
	
	private boolean isAsciiSafe(String input) {
	    for (char character : input.toCharArray()) {
	        if (character > 127) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public void EventIDN_ToAscii(String input) {

		 boolean response = this.isAsciiSafe(input);
	      if (!response) 
	    	  LoggerSpecification.printLogging(SpecificationType.IDN_ToAscii);
	}

}
