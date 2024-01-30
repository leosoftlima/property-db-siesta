package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a class is runnable without overriding run() method.
 *
 * According to the manual, runnable class must provide its own run() method.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Runnable.html
 *
 * @severity error
 */
public class Runnable_OverrideRunHandler {

    @After("staticinitialization(java.lang.Runnable+)")
    public static void vioRunnable_OverrideRun(JoinPoint joinPoint) {
       Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
       LangSpecificationHandler.eventRunnable_OverrideRun(objClasse);
    }
}
