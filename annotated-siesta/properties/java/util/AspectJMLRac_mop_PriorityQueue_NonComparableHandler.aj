import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.PriorityQueue;
import java.util.PriorityQueue.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_PriorityQueue_NonComparableHandler$9a39e5fa_443b_4b85_90aa_a3f77f72ef9a {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioPriorityQueue_NonComparableAdd. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.PriorityQueue_NonComparableHandler.java\" by method mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd regarding code at \nFile \"mop.PriorityQueue_NonComparableHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioPriorityQueue_NonComparableaddAll. */
   after (final java.util.PriorityQueue priorityQueue) throwing (Throwable rac$e) :
     call(static void mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll(java.util.PriorityQueue)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(priorityQueue) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll(java.util.PriorityQueue)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.PriorityQueue_NonComparableHandler.java\" by method mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll regarding code at \nFile \"mop.PriorityQueue_NonComparableHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll(java.util.PriorityQueue)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_PriorityQueue_NonComparableHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioPriorityQueue_NonComparableAdd. */
  @org.aspectj.lang.annotation.Before("(call(* java.util.PriorityQueue.add*(..)) || call(* java.util.Queue+.offer*(..)))")
  public void vioPriorityQueue_NonComparableAdd_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd(java.lang.String, boolean, java.lang.Object[])#'mop.PriorityQueue_NonComparableHandler' (PriorityQueue_NonComparableHandler.java:23)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableAdd(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioPriorityQueue_NonComparableaddAll. */
  @org.aspectj.lang.annotation.Before("(call(* java.util.Collection+.addAll(java.util.Collection)) && target(java.util.PriorityQueue))")
  public void vioPriorityQueue_NonComparableaddAll_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll(java.util.PriorityQueue)#'mop.PriorityQueue_NonComparableHandler' (PriorityQueue_NonComparableHandler.java:28)
  mop.PriorityQueue_NonComparableHandler.vioPriorityQueue_NonComparableaddAll((java.util.PriorityQueue)thisJP.getTarget());
  }

  }
}