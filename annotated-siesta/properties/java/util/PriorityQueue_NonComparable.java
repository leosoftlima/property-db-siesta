package mop;

import java.util.PriorityQueue;

import mop.LoggerSpecification.SpecificationType;

public class PriorityQueue_NonComparable {
	
	public void eventPriorityQueue_NonComparableAdd(Object o) {
		if(!(o instanceof Comparable)) {
			LoggerSpecification.printLogging(SpecificationType.PriorityQueue_NonComparable);
		}
	}
	
    public void eventPriorityQueue_NonComparableAddAll(PriorityQueue<Object> objects) {
	   	for (Object o : objects) {
	   		if(!(o instanceof Comparable)) {
				LoggerSpecification.printLogging(SpecificationType.PriorityQueue_NonComparable);
			}
		}
	}

}
