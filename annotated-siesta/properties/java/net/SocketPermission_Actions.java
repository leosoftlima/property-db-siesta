package mop;

import java.util.HashSet;

import mop.LoggerSpecification.SpecificationType;

public class SocketPermission_Actions {

	private final boolean verifySocketPermission_Actions(String string) {
	    String[] validEvents = {"connect", "listen", "accept", "resolve"};
	    boolean isValidEvent = false; 

	    String[] events = string.split(",");
	    if (events.length == 0) {
	        isValidEvent = false;
	    } else {
	        for (String event : events) {    
	            for (String validEvent : validEvents) {
	                if (event.trim().equals(validEvent)) {
	                    isValidEvent = true;
	                    break;
	                }
	            }
	            if (isValidEvent) { 
	                break;
	            }
	        }
	    }
	    return isValidEvent;
	}

	public void SocketPermission_ActionsEvent(String permission) {
		if(verifySocketPermission_Actions(permission)) {
		   LoggerSpecification.printLogging(SpecificationType.SocketPermission_Actions, permission);
		}
	}


}
