package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a Random subclass does not override next(int).
 *
 * A subclass of Random should override next(int), according to the
 * documentation.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Random.html#next%28int%29
 *
 * @severity warning
 */

public class Random_OverrideNextHandler {

    @After("staticinitialization(java.util.Random+))")
    public static void vioRandom_OverrideNext(JoinPoint joinPoint) {

        Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
        UtilSpecificationHandler.EventRandom_OverrideNext(objClasse);
    }
}
