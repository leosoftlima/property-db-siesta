package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the Enumeration class is used.
 *
 * The Iterator interface takes the place of the Enumeration interface.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Enumeration.html
 * http://docs.oracle.com/javase/6/docs/api/java/util/Iterator.html
 *
 * This property warns if any method of the Enumeration interface is invoked.
 * To avoid too verbose messages, this property warns once per object.
 *
 * @severity suggestion
 */
public class Enumeration_ObsoleteHandler {

    @Before("* java.util.Enumeration+.*(..)")
    public static void vioEnumeration_Obsolete(String name, boolean isStatic, Object[] args){
       UtilSpecificationHandler.EventEnumeration_Obsolete();
    }
}
