package mop;


import org.aspectjml.lang.annotation.siesta.After;
import org.aspectjml.lang.annotation.siesta.Before;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_HasNexHandler {

	Set<Object> objetcs = new HashSet();

	@Before("* java.util.Iterator+.next()")
	public void vioIteratorNext(Iterator i) {

		UtilSpecificationHandler.Iterator_HasNext_nextEvent(i);

	}

	@After("* java.util.Iterator+.hasnext()")
	public void vioIteratorHasNext(Iterator i, boolean b){
		
		UtilSpecificationHandler.Iterator_HasNext_hasnexttrueEvent(i, b);
		UtilSpecificationHandler.Iterator_HasNext_hasnextfalseEvent(i, b);
	}
}
