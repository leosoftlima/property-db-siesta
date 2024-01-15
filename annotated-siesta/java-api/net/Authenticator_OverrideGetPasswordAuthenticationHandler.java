package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of Authenticator does not override getPasswordAuthentication().
 *
 * Subclasses of Authenticator should override the default implementation,
 * which returns null.
 * http://docs.oracle.com/javase/6/docs/api/java/net/Authenticator.html#getPasswordAuthentication%28%29
 *
 * This property warns if a class or one of its superclass does not override
 * getPasswordAuthentication().
 *
 * @severity error
 */
public class Authenticator_OverrideGetPasswordAuthenticationHandler {

    @After("staticinitialization(java.net.Authenticator+)")
    public static void vioAuthenticator_OverrideGetPasswordAuthentication(JoinPoint joinPoint) {

     	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	NetSpecificationHandler.EventAuthenticator_OverrideGetPasswordAuthentication(objClasse);
    }
}
