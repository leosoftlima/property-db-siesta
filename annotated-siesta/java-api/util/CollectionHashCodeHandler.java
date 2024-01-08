import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

import br.cin.ufpe.SpecificationRuntimeSiesta;

import java.util.Collection;

public class CollectionHashCodeHandler {

    @After("staticinitialization(java.util.Collection+)")
    public void vioCollectionHashCode(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	SpecificationRuntimeSiesta.eventCollectionHashCode(objClasse);
    }
}
