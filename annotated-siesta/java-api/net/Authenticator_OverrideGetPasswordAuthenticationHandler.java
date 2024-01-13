package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

public class Authenticator_OverrideGetPasswordAuthenticationHandler {

    @After("staticinitialization(java.net.Authenticator+)")
    public static void vioAuthenticator_OverrideGetPasswordAuthentication(JoinPoint joinPoint) {

     	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	NetSpecificationHandler.EventAuthenticator_OverrideGetPasswordAuthentication(objClasse);
    }
}
