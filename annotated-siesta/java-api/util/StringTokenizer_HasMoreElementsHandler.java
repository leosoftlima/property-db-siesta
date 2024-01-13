package mop;


import org.aspectjml.lang.annotation.siesta.After;
import org.aspectjml.lang.annotation.siesta.Before;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;

public class StringTokenizer_HasMoreElementsHandler {

	Set<Object> objetcs = new HashSet();

	@Before("* java.util.StringTokenizer.nextToken()")
	@Before("* java.util.StringTokenizer.nextElement()")
	public static void vioStringTokenizer_HasMoreElementsNextToken(StringTokenizer  i) {

		UtilSpecificationHandler.StringTokenizer_HasMoreElements_nextEvent(i);
	}

	@After("boolean java.util.StringTokenizer.hasMoreTokens()")
	@After("boolean java.util.StringTokenizer.hasMoreElements()")
	public static void vioStringTokenizer_HasMoreElementsHasMoreToken(StringTokenizer i, boolean b){

		UtilSpecificationHandler.StringTokenizer_HasMoreElements_hasnexttrueEvent(i, b);
		UtilSpecificationHandler.StringTokenizer_HasMoreElements_hasnextfalseEvent(i, b);
	}
}
