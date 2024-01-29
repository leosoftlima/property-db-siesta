package mop;

import mop.LoggerSpecification.SpecificationType;

public class HttpCookie_Name {
	
	public void HttpCookie_NameEvent(String input) {
	    String specialChars = "()<>@,;:\\\"/[]?={} \t";
	    char currentChar = '0';
	    boolean nonAscii = false;
	    boolean controlChars = false;
	    boolean specialCharsFound = false;
	    int index = 0;

	    while (index < input.length()) {
	        currentChar = input.charAt(index);

	        if (currentChar <= 127) {
	            if (currentChar > 31 && currentChar != 127) {
	                if (specialChars.indexOf(currentChar) != -1) {
	                    specialCharsFound = true;
	                    break;
	                }

	                index++;
	                continue;
	            }

	            controlChars = true;
	            break;
	        }

	        nonAscii = true;
	        break;
	    }

	    if (nonAscii || controlChars || specialCharsFound) {
	        LoggerSpecification.printLogging(SpecificationType.HttpCookie_Name, input, String.valueOf(currentChar));
	    }
	}


}
