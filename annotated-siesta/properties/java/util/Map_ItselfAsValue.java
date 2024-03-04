package mop;

import java.util.Map;
import java.util.Set;

import mop.LoggerSpecification.SpecificationType;

public class Map_ItselfAsValue {

	public void eventMap_ItselfAsValuePut(Map map, Object key, Object value){
		if(value == map) {
			LoggerSpecification.printLogging(SpecificationType.Map_ItselfAsValue);
		}
	}

	public void eventMap_ItselfAsValuePutAll(Map map, Map src){
		for (Map.Entry entry : (Set<Map.Entry>) src.entrySet()) {
			if (entry.getValue() == map) {
				LoggerSpecification.printLogging(SpecificationType.Map_ItselfAsValue);
			}
		}
	}

}
