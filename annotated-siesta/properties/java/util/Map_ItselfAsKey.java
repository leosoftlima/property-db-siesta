package mop;

import java.util.Map;
import java.util.Set;

import mop.LoggerSpecification.SpecificationType;

public class Map_ItselfAsKey {

	public void eventMap_ItselfAsKeyPut(Map map, Object key, Object value){
		if(key == map) {
			LoggerSpecification.printLogging(SpecificationType.Map_ItselfAsKey); 
		}
	}

	public void eventMap_ItselfAsKeyPutAll(Map map, Map src){
		for (Map.Entry entry : (Set<Map.Entry>) src.entrySet()) {
			if (entry.getKey() == map) {
				LoggerSpecification.printLogging(SpecificationType.Map_ItselfAsKey); 
			}
		}
	}

}
