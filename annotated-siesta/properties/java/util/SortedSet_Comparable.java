package mop;

import java.util.Collection;
import java.util.Iterator;

import mop.LoggerSpecification.SpecificationType;

public class SortedSet_Comparable {

	public  void sortedSet_ComparableAddAll(Collection collection) {
		Iterator iteratorCollection = collection.iterator();

		while(iteratorCollection.hasNext()) {
			Object objectCollection = iteratorCollection.next();
			if(!(objectCollection instanceof Comparable)) {
				LoggerSpecification.printLogging(SpecificationType.SortedSet_Comparable); 
			}
		}
	}
	
	public  void sortedSet_ComparableAdd(Object object) {
		if(!(object instanceof Comparable)) {
			LoggerSpecification.printLogging(SpecificationType.SortedSet_Comparable); 
		}
	}
}
