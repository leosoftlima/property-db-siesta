import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.*;
import org.aspectjml.lang.annotation.After;
import org.aspectjml.lang.annotation.After.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_URLConnection_OverrideGetPermissionHandler$8c1d91c4_c8db_46b7_a265_9ff6e035cdb9 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioURLConnection_OverrideGetPermission. */
  after (final mop.URLConnection_OverrideGetPermissionHandler object$rac, final org.aspectj.lang.JoinPoint joinPoint) throwing (Throwable rac$e) :
     (call(void mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint))) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) && args(joinPoint) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.URLConnection_OverrideGetPermissionHandler.java\" by method mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission\nCaused by: "+rac$e);
  			   }
  			   if(!rac$b1) {
  			     if(rac$ErrorMsg.equals("")) {
  			       rac$ErrorMsg = "jml$ex";
  			     }
  			     else {
  			       rac$ErrorMsg += " and jml$ex";
  			     }
  			   }
  			   rac$b = rac$b && rac$b1;
           if(rac$ErrorMsg.indexOf("and") >= 0 ){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission regarding code at \nFile \"mop.URLConnection_OverrideGetPermissionHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to mark/annotate all advice method in AspectJML */
  declare @method: public void mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint): @org.aspectjml.lang.annotation.Advice;


  /** Generated by AspectJML to activate the crosscutting concern modularization */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_URLConnection_OverrideGetPermissionHandler{
  private mop.URLConnection_OverrideGetPermissionHandler object$rac = new URLConnection_OverrideGetPermissionHandler();

  /** Generated by AspectJML to modularize a crosscutting structure for
   * the Java members intercepted by vioURLConnection_OverrideGetPermission AspectJML/Advice. */
  @org.aspectj.lang.annotation.After("(staticinitialization(java.net.URLConnection+)) && !within(*..AspectJMLInnerCC_*) && !within(AspectJMLInnerCC_*) && !cflowbelow(staticinitialization(java.net.URLConnection+)) && !cflow(execution(public void mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint)))")
  public void vioURLConnection_OverrideGetPermission (/*final mop.URLConnection_OverrideGetPermissionHandler object$rac,*/ final org.aspectj.lang.JoinPoint joinPoint) {//#public void mop.URLConnection_OverrideGetPermissionHandler.vioURLConnection_OverrideGetPermission(org.aspectj.lang.JoinPoint)#'mop.URLConnection_OverrideGetPermissionHandler' (URLConnection_OverrideGetPermissionHandler.java:9)
      //if(JMLChecker.checkJP(joinPoint, false, "mop.URLConnection_OverrideGetPermissionHandler", true, true, true))
       object$rac.vioURLConnection_OverrideGetPermission(joinPoint);
  }

  }
}