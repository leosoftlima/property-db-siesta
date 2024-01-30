package mop;

import mop.LoggerSpecification.SpecificationType;

public class Enum_NoExtraWhiteSpace {
	
	public void EventEnum_NoExtraWhiteSpace(String name) {
		if (name.length() != name.trim().length()) {
			LoggerSpecification.printLogging(SpecificationType.Enum_NoExtraWhiteSpace);
		}
	}

}
