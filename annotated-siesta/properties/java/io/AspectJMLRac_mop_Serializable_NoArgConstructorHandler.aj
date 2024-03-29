import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.*;
import org.aspectjml.lang.annotation.After;
import org.aspectjml.lang.annotation.After.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Serializable_NoArgConstructorHandler$bb0300a6_c88f_4b7a_a72c_5ef8e1d9ebb8 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioSerializable_NoArgConstructor. */
   after () throwing (Throwable rac$e) :
     call(static void mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(..) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Serializable_NoArgConstructorHandler.java\" by method mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor regarding code at \nFile \"mop.Serializable_NoArgConstructorHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to mark/annotate all advice method in AspectJML */
  declare @method: public static void mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint): @org.aspectjml.lang.annotation.Advice;


  /** Generated by AspectJML to activate the crosscutting concern modularization */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Serializable_NoArgConstructorHandler{

  /** Generated by AspectJML to modularize a crosscutting structure for
   * the Java members intercepted by vioSerializable_NoArgConstructor AspectJML/Advice. */
  @org.aspectj.lang.annotation.After("staticinitialization(java.io.Serializable+) && !within(*..AspectJMLInnerCC_*) && !within(AspectJMLInnerCC_*) && !@annotation(ExcludeAdvising) && !@annotation(Sealed) && !cflowbelow(staticinitialization(java.io.Serializable+)) && !cflow(execution(public static void mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint)))")
  public void vioSerializable_NoArgConstructor (final org.aspectj.lang.JoinPoint thisJoinPoint) {//#public static void mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(org.aspectj.lang.JoinPoint)#'mop.Serializable_NoArgConstructorHandler' (Serializable_NoArgConstructorHandler.java:26)
//      if(JMLChecker.checkJP(thisJoinPoint, true, "mop.Serializable_NoArgConstructorHandler", true, true, true))
       mop.Serializable_NoArgConstructorHandler.vioSerializable_NoArgConstructor(thisJoinPoint);
  }

  }
}
