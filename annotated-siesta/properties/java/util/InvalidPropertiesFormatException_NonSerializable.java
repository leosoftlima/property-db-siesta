package mop;

import java.util.InvalidPropertiesFormatException;

import mop.LoggerSpecification.SpecificationType;

public class InvalidPropertiesFormatException_NonSerializable {
	
	public void eventInvalidPropertiesFormatException_NonSerializableWriteObject(Object o) {
		if(o instanceof InvalidPropertiesFormatException) {
			LoggerSpecification.printLogging(SpecificationType.InvalidPropertiesFormatException_NonSerializable);
		}
	}
	
	public void eventInvalidPropertiesFormatException_NonSerializableReadObject(Object o) {
		LoggerSpecification.printLogging(SpecificationType.InvalidPropertiesFormatException_NonSerializable);
		
	}

}
