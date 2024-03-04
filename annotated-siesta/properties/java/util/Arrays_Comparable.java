package mop;

import mop.LoggerSpecification.SpecificationType;

public class Arrays_Comparable {
	
	public void eventArrays_Comparable(Object[] objects) {
		if(objects !=null) {
	      for(int i = 0; i < objects.length; ++i) {
	          Object obj = objects[i];
	          if (!(obj instanceof Comparable)) {
	               LoggerSpecification.printLogging(SpecificationType.Arrays_Comparable, String.valueOf(i));   	  
	          }
	          try {
	          Comparable c1 = (Comparable) obj;
				for (int j = i + 1; j < objects.length; ++j) {
					 try {
						Comparable c2 = (Comparable) objects[j];
						c1.compareTo(c2);
						c2.compareTo(c1);
					} catch (ClassCastException e) {
                        LoggerSpecification.printLogging(SpecificationType.Arrays_Comparable, String.valueOf(i), String.valueOf(j));
					}
	              }
				}catch (Exception e) {
					 LoggerSpecification.printLogging(SpecificationType.Arrays_Comparable, String.valueOf(i));   
				}
	      }
		}
	}

}
