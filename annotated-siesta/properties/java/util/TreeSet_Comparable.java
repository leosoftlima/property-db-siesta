package mop;

import java.util.Collection;
import java.util.Iterator;

import mop.LoggerSpecification.SpecificationType;


public class TreeSet_Comparable {

//	public void treeSet_ComparableAddAll(Collection collection) {
//		Iterator iteratorCollection = collection.iterator();
//
//		while(iteratorCollection.hasNext()) {
//			Object objectCollection = iteratorCollection.next();
//			if(!(objectCollection instanceof Comparable)) {
//				LoggerSpecification.printLogging(SpecificationType.TreeSet_Comparable); 
//			}
//		}
//	}
	
	public void treeSet_ComparableAddAll(Collection<?> collection) {
        for (Object element : collection) {
            if (!(element instanceof Comparable<?>)) {
                LoggerSpecification.printLogging(SpecificationType.TreeSet_Comparable);
                break;
            }
        }
    }
	
	public void treeSet_ComparableAdd(Object object) {
		if(!(object instanceof Comparable)) {
			LoggerSpecification.printLogging(SpecificationType.TreeSet_Comparable); 
		}
	}

}
