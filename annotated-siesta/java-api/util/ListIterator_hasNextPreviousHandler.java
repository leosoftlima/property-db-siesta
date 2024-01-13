package mop;


import org.aspectjml.lang.annotation.siesta.After;
import org.aspectjml.lang.annotation.siesta.Before;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator_hasNextPreviousHandler {

	Set<Object> objetcs = new HashSet();


	@Before("* java.util.ListIterator.previous()")
	public static void vioBeforeListIterator_hasNextPrevious(ListIterator i) {
		UtilSpecificationHandler.ListIterator_hasNextPrevious_previousEvent(i);
	}

	@Before("* java.util.ListIterator.next()")
	public static void vioBeforeListIterator_NextPrevious(ListIterator i) {
		UtilSpecificationHandler.ListIterator_hasNextPrevious_nextEvent(i);
	}

	@After("* java.util.ListIterator.hasNext()")
	public static void vioAfterListIterator_hasNextPrevious(ListIterator i, boolean b) {
	  	
		UtilSpecificationHandler.ListIterator_hasNextPrevious_hasprevioustrueEvent(i, b);
		UtilSpecificationHandler.ListIterator_hasNextPrevious_haspreviousfalseEvent(i, b);
		
	}
	
	@After("* java.util.ListIterator.hasPrevious()")
	public static void vioAfterListIterator_hasPrevious(ListIterator i, boolean b) {
		
		UtilSpecificationHandler.ListIterator_hasNextPrevious_hasprevioustrueEvent(i, b);
		UtilSpecificationHandler.ListIterator_hasNextPrevious_haspreviousfalseEvent(i, b);
	}

}
