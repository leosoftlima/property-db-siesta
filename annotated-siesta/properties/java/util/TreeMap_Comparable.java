package mop;

import java.util.Collection;
import java.util.Map;

import mop.LoggerSpecification.SpecificationType;

public class TreeMap_Comparable {

	public void eventTreeMap_ComparableCreate(Map map) {
		verify(map);
	}

	public void eventTreeMap_ComparablePut(Object key) {
		verify(key);
	}

	public void eventTreeMap_ComparablePutAll(Map src) {
		for (Map.Entry entry : (Collection<Map.Entry>) src.entrySet()) {
			verify(entry.getKey());
		}
	}

	private void verify(Object element) {
		if(!(element instanceof Comparable)) {
			LoggerSpecification.printLogging(SpecificationType.TreeMap_Comparable);
		}
	}

}
