package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

public class CollectionHashCodeHandler {

    @After("staticinitialization(java.util.Collection+)")
    public void vioCollectionHashCode(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	UtilSpecificationHandler.eventCollectionHashCode(objClasse);
    }
}
