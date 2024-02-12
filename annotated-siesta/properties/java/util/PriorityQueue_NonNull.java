package mop;

import java.util.PriorityQueue;

import mop.LoggerSpecification.SpecificationType;

public class PriorityQueue_NonNull {
	
	public void eventPriorityQueue_NonNullAdd(Object o) {
		if(o == null) {
			LoggerSpecification.printLogging(SpecificationType.PriorityQueue_NonNull);
		}
	}
	
    public void eventPriorityQueue_NonNullAddAll(PriorityQueue<Object> objects) {
	   	for (Object o : objects) {
	   		if(o == null) {
				LoggerSpecification.printLogging(SpecificationType.PriorityQueue_NonNull);
			}
		}
	}

}
