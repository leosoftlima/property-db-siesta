import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.*;
import org.aspectjml.lang.annotation.After;
import org.aspectjml.lang.annotation.After.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Random_OverrideNextHandler$9ad2b7ac_c007_4bb2_bf9c_b71eb3de19ff {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioRandom_OverrideNext. */
   after (final org.aspectj.lang.JoinPoint joinPoint) throwing (Throwable rac$e) :
     call(static void mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(joinPoint) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Random_OverrideNextHandler.java\" by method mop.Random_OverrideNextHandler.vioRandom_OverrideNext\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Random_OverrideNextHandler.vioRandom_OverrideNext regarding code at \nFile \"mop.Random_OverrideNextHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to mark/annotate all advice method in AspectJML */
  declare @method: public static void mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint): @org.aspectjml.lang.annotation.Advice;


  /** Generated by AspectJML to activate the crosscutting concern modularization */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Random_OverrideNextHandler{

  /** Generated by AspectJML to modularize a crosscutting structure for
   * the Java members intercepted by vioRandom_OverrideNext AspectJML/Advice. */
  @org.aspectj.lang.annotation.After("(staticinitialization(java.util.Random+)) && !within(*..AspectJMLInnerCC_*) && !within(AspectJMLInnerCC_*) && !@annotation(ExcludeAdvising) && !@annotation(Sealed) && !cflowbelow(staticinitialization(java.util.Random+)) && !cflow(execution(public static void mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint)))")
  public void vioRandom_OverrideNext (final org.aspectj.lang.JoinPoint joinPoint) {//#public static void mop.Random_OverrideNextHandler.vioRandom_OverrideNext(org.aspectj.lang.JoinPoint)#'mop.Random_OverrideNextHandler' (Random_OverrideNextHandler.java:19)
//      if(JMLChecker.checkJP(joinPoint, true, "mop.Random_OverrideNextHandler", true, true, true))
       mop.Random_OverrideNextHandler.vioRandom_OverrideNext(joinPoint);
  }

  }
}