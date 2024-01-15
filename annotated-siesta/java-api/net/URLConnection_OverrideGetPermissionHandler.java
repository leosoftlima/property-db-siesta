package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of URLConnection does not override getPermission().
 *
 * Subclasses of URLConnection should override the default implementation of
 * getPermission().
 * http://docs.oracle.com/javase/6/docs/api/java/net/URLConnection.html#getPermission%28%29
 *
 * This property warns if a class or one of its superclass does not override
 * getPermission().
 *
 * @severity error
 */

public class URLConnection_OverrideGetPermissionHandler {

    @After("staticinitialization(java.net.URLConnection+)")
    public void vioURLConnection_OverrideGetPermission(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	NetSpecificationHandler.eventURLConnection_OverrideGetPermission(objClasse);
    }
}
