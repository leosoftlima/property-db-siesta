package mop;

import java.lang.reflect.Constructor;
import java.util.Map;

import mop.LoggerSpecification.SpecificationType;

public class Map_StandardConstructors {
	
	public void eventMap_StandardConstructors(Class klass) {
		try {
			
			Constructor ctor1 = klass.getDeclaredConstructor((Class[]) null);
			Constructor ctor2 = klass.getDeclaredConstructor(Map.class);
			
		} catch (NoSuchMethodException e) {
			LoggerSpecification.printLogging(SpecificationType.Map_StandardConstructors);
		}
	}

}
