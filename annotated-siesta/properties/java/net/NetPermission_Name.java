package mop;

import mop.LoggerSpecification.SpecificationType;

public class NetPermission_Name {
	
	public void eventNetPermission_Name(String name) {
		boolean valid = false;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '*') {
                valid = true;
                break;
            }
        }
        if(valid)
        	LoggerSpecification.printLogging(SpecificationType.NetPermission_Name);

	}

}
