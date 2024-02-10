package mop;

import mop.LoggerSpecification.SpecificationType;

public class ClassLoader_UnsafeClassDefinition {
	
	public void EventClassLoader_UnsafeClassDefinition(String string) {
		 if (string.startsWith("java.")) {
	        LoggerSpecification.printLogging(SpecificationType.Arrays_DeepHashCode);    
		 }
	}

}
