package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.util.Collection;
import java.util.List;

public class Collections_ImplementComparableHandler {

    @Before("* java.util.Collections.min(java.util.Collection)")
    @Before("* java.util.Collections.max(java.util.Collection)")
    public static void vioCollections_ImplementComparable_invalid_minmax(Collection collection){

      System.out.println("aaaaaaa");
    }

    @Before("void java.util.Collections.sort(java.util.List)")
    public static void vioCollections_ImplementComparable_invalid_sort(List list){
      System.err.println("afafafa");

    }

    private void validate(Object[] arr, String msg)
	{
		for (int i = 0; i < arr.length; ++i) {
			// Each element must implement the Comparable interface.
			Object o1 = arr[i];
			if (!(o1 instanceof Comparable)) {
//				RVMLogging.out.println(Level.CRITICAL, msg);
//				RVMLogging.out.println(Level.CRITICAL, i + "-th element does not implement the Comparable interface.");
			}
			Comparable c1 = (Comparable)o1;

			// All elements must be mutually comparable.
			for (int j = i + 1; j < arr.length; ++j) {
				try {
					Comparable c2 = (Comparable)arr[j];
					c1.compareTo(c2);
					c2.compareTo(c1);
				}
				catch (ClassCastException e) {
//					RVMLogging.out.println(Level.CRITICAL, msg);
//					RVMLogging.out.println(Level.CRITICAL, i + "-th element and " + j + "-th element are not comparable.");
				}
			}
		}
	}
}
