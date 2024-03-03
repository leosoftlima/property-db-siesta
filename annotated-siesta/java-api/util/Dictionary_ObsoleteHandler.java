package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an obsolete class Dictionary is used.
 *
 * The Dictionary class is obsolete in favor of the Map interface.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Dictionary.html
 *
 * This property warns if any method of the Dictionary class is invoked. To
 * avoid too verbose messages, this property warns once per object.
 *
 * @severity warning
 */

public class Dictionary_ObsoleteHandler {

    @Before("* java.util.Dictionary+.*(..)")
    public static void vioDictionary_Obsolete(String name, boolean isStatic, Object[] args){
         UtilSpecificationHandler.EventDictionary_Obsolete();
    }
}
