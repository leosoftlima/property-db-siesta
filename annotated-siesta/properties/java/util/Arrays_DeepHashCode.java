package mop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import mop.LoggerSpecification.SpecificationType;

public class Arrays_DeepHashCode {
	
	 private static boolean detectCycle(ArrayList<Object[]> list, Object[] array) {
	        Iterator<Object[]> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Object[] currentArray = iterator.next();
	            if (Arrays.equals(currentArray, array)) {
	                return true;
	            }
	        }

	        list.add(array);
	        for (Object element : array) {
	            if (element instanceof Object[] && detectCycle(list, (Object[]) element)) {
	                return true;
	            }
	        }

	        list.remove(list.size() - 1);
	        return false;
	    }
	 
	 public void Arrays_DeepHashCodeEvent(Object[] listObjs) {
		 ArrayList list = new ArrayList();
		 if(detectCycle(list, listObjs)) {
			 LoggerSpecification.printLogging(SpecificationType.Arrays_DeepHashCode);
		 }
	 }

}
