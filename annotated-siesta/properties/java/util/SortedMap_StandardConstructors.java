package mop;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

import mop.LoggerSpecification.SpecificationType;

public class SortedMap_StandardConstructors {

	public void eventSortedMap_StandardConstructors(Class klass) {
		if (klass != null) {
			try {
				Constructor ctor1 = klass.getDeclaredConstructor((Class[]) null);
				Constructor ctor2 = klass.getDeclaredConstructor(Comparator.class);
				Constructor ctor3 = klass.getDeclaredConstructor(Map.class);
				Constructor ctor4 = klass.getDeclaredConstructor(SortedMap.class);
			} catch (NoSuchMethodException e) {
                LoggerSpecification.printLogging(SpecificationType.SortedMap_StandardConstructors, klass.getName());
			}
		}
	}

}
