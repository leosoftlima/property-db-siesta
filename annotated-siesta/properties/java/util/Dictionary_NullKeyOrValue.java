package mop;

import java.util.Dictionary;

import mop.LoggerSpecification.SpecificationType;

public class Dictionary_NullKeyOrValue {
     
	public void EventDictionary_NullKeyOrValue(Dictionary dictionary , Object object , Object object2){
		if(object == null || object2 == null)
			LoggerSpecification.printLogging(SpecificationType.Dictionary_NullKeyOrValue);
	}
}
