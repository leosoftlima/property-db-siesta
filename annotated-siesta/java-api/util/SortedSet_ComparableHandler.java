package mop;

import java.util.SortedSet;

import org.aspectjml.lang.annotation.siesta.Before;

public class SortedSet_ComparableHandler {

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public void vioSortedSet_ComparableAddAll(SortedSet sortedSet) {

    	UtilSpecificationHandler.eventSortedSet_ComparableAddAll(sortedSet);
    }

    @Before("* java.util.Collection+.add(java.lang.Object)")
    @Before("* java.util.Queue+.offer(java.lang.Object)")
    public void vioSortedSet_ComparableAdd(SortedSet sortedSet) {
    	
    	UtilSpecificationHandler.eventSortedSet_ComparableAdd(sortedSet);

    }
}
