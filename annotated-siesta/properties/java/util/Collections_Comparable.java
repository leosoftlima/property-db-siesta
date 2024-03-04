package mop;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import mop.LoggerSpecification.SpecificationType;

public class Collections_Comparable {
	
	 public void collectionsComparableInvalidMinMax(final Collection collection, Comparator comparator) {
		 verification(collection.toArray(), comparator);
	 }
	 
	 public void collectionsComparableInvalidSort(final List list, Comparator comparator ) {
		 verification(list.toArray(), comparator);
	 }

	 private void verification(Object[] objects, Comparator comparator) {
	      for(int j = 0; j < objects.length; ++j) {
	          Object object = objects[j];

	          for(int i = j + 1; i < objects.length; ++i) {
	        	  Object objectCompare = objects[i];
	        	  try {

	        		  comparator.compare(object, objectCompare);
	        		  comparator.compare(objectCompare, object);
	        		  
	             } catch (ClassCastException e) {
	            	 LoggerSpecification.printLogging(SpecificationType.Collection_Comparable, String.valueOf(j), String.valueOf(i));
	             }
	          }
	       }

	    }
}
