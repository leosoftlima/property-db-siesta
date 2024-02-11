import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.net.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Socket_TrafficClassHandler$a529bf41_f56b_4d25_a962_211ae57cdbc9 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioSocket_TrafficClass. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.Socket_TrafficClassHandler.vioSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Socket_TrafficClassHandler.vioSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Socket_TrafficClassHandler.java\" by method mop.Socket_TrafficClassHandler.vioSocket_TrafficClass\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Socket_TrafficClassHandler.vioSocket_TrafficClass regarding code at \nFile \"mop.Socket_TrafficClassHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Socket_TrafficClassHandler.vioSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Socket_TrafficClassHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioSocket_TrafficClass. */
  @org.aspectj.lang.annotation.Before("call(* java.net.Socket.setTrafficClass(..))")
  public void vioSocket_TrafficClass_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.Socket_TrafficClassHandler.vioSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])#'mop.Socket_TrafficClassHandler' (Socket_TrafficClassHandler.java:18)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.Socket_TrafficClassHandler.vioSocket_TrafficClass(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  }
}