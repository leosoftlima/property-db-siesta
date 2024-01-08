import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

import br.cin.ufpe.SpecificationRuntimeSiesta;

public class URLConnection_OverrideGetPermissionHandler {

    @After("staticinitialization(java.net.URLConnection+)")
    public void vioCollectionHashCode(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	SpecificationRuntimeSiesta.eventURLConnection_OverrideGetPermission(objClasse);
    }
}
