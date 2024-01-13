package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

public class URLConnection_OverrideGetPermissionHandler {

    @After("staticinitialization(java.net.URLConnection+)")
    public void vioURLConnection_OverrideGetPermission(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	NetSpecificationHandler.eventURLConnection_OverrideGetPermission(objClasse);
    }
}
