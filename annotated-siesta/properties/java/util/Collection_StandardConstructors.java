package mop;

import java.lang.reflect.Constructor;
import java.util.Collection;

import mop.LoggerSpecification.SpecificationType;

public class Collection_StandardConstructors {

	public void eventCollection_StandardConstructors(Class klazz) {
		if (klazz != null) {
			try {
				Constructor ctor1 = klazz.getDeclaredConstructor((Class[]) null);
				Constructor ctor2 = klazz.getDeclaredConstructor(Collection.class);
			} catch (NoSuchMethodException e) {
                LoggerSpecification.printLogging(SpecificationType.Collection_StandardConstructors,klazz.getName());
			}
		}
	}
}