package mop;

import java.util.Comparator;

import mop.LoggerSpecification.SpecificationType;


public class Arrays_MutuallyComparable {

	public void eventArrays_MutuallyComparable(Object[] arr, Comparator comp) {
		if(arr !=null && comp !=null) {	
			for (int i = 0; i < arr.length; ++i) {
				Object o1 = arr[i];

				for (int j = i + 1; j < arr.length; ++j) {
					Object o2 = arr[j];
					try {
						comp.compare(o1, o2);
						comp.compare(o2, o1);
					} catch (ClassCastException e) {
						LoggerSpecification.printLogging(SpecificationType.Arrays_MutuallyComparable, String.valueOf(i), String.valueOf(j));
					}
				}

			}
		}
	}

}
