package mop;

import java.util.Dictionary;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if null key or value is inserted into a Dictionary object.
 *
 * Neither the key nor the value can be null in a Dictionary object, according
 * to the manual.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Dictionary.html#put%28K,%20V%29
 *
 * This property warns if such case is detected.
 *
 * @severity error
 */
public class Dictionary_NullKeyOrValueHandler {

	@Before("* java.util.Dictionary+.put(..)")
	public static void vioDictionary_NullKeyOrValue(String name, boolean isStatic, Object[] args) {
		if(hasElements(args)) {
		    Dictionary dictionary = (Dictionary) args[0];		    
		    UtilSpecificationHandler.eventDictionary_NullKeyOrValue(dictionary, args[1], args[2]);
		}
		
	}
	
	private static boolean hasElements(Object[] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i] !=null)
				return true;
		}
		return false;
	}
}
