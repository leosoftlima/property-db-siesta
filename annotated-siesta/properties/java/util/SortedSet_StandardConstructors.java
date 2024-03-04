package mop;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

import mop.LoggerSpecification.SpecificationType;

public class SortedSet_StandardConstructors {

	public void eventSortedSet_StandardConstructors(Class klass) {
		if (klass != null) {
			try {
				Constructor ctor1 = klass.getDeclaredConstructor((Class[]) null);
				Constructor ctor2 = klass.getDeclaredConstructor(Comparator.class);
				Constructor ctor3 = klass.getDeclaredConstructor(Collection.class);
				Constructor ctor4 = klass.getDeclaredConstructor(SortedSet.class);
			} catch (NoSuchMethodException e) {
				LoggerSpecification.printLogging(SpecificationType.SortedSet_StandardConstructors, klass.getName());
			}
		}
	}
}
