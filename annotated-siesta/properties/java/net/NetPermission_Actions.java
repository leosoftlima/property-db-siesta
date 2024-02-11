package mop;

import mop.LoggerSpecification.SpecificationType;

public class NetPermission_Actions {
     public void eventNetPermission_Actions(String actions) {
    	 if (actions != null) {
    		 LoggerSpecification.printLogging(SpecificationType.NetPermission_Actions);
    	 }
     }
}
