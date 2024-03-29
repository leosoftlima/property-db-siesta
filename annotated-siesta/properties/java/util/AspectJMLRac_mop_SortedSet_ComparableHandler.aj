import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.SortedSet;
import java.util.SortedSet.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_SortedSet_ComparableHandler {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioSortedSet_ComparableAddAll. */
  after (final mop.SortedSet_ComparableHandler object$rac, final java.util.SortedSet sortedSet) throwing (Throwable rac$e) :
     (call(void mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAddAll(java.util.SortedSet))) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) && args(sortedSet) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioSortedSet_ComparableAddAll(java.util.SortedSet)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.SortedSet_ComparableHandler.java\" by method mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAddAll\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAddAll regarding code at \nFile \"mop.SortedSet_ComparableHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioSortedSet_ComparableAddAll(java.util.SortedSet)", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioSortedSet_ComparableAdd. */
  after (final mop.SortedSet_ComparableHandler object$rac, final java.util.SortedSet sortedSet) throwing (Throwable rac$e) :
     (call(void mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAdd(java.util.SortedSet))) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) && args(sortedSet) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioSortedSet_ComparableAdd(java.util.SortedSet)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.SortedSet_ComparableHandler.java\" by method mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAdd\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAdd regarding code at \nFile \"mop.SortedSet_ComparableHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".vioSortedSet_ComparableAdd(java.util.SortedSet)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_SortedSet_ComparableHandler{
  private mop.SortedSet_ComparableHandler object$siesta = new SortedSet_ComparableHandler();

//  @org.aspectj.lang.annotation.AfterReturning(pointcut = "call(mop.SortedSet_ComparableHandler.new(..))", returning = "object$siesta")
//  public void get$mop$SortedSet_ComparableHandlerinstance (mop.SortedSet_ComparableHandler object$siesta){//#AJML-IGNORE
//    if(this.object$siesta == null)
//      this.object$siesta = object$siesta;
//  }

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioSortedSet_ComparableAddAll. */
  @org.aspectj.lang.annotation.Before("(call(* java.util.Collection+.addAll(java.util.Collection)) && target(java.util.SortedSet))")
  public void vioSortedSet_ComparableAddAll_Before(org.aspectj.lang.JoinPoint thisJP) {//#public void mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAddAll(java.util.SortedSet)#'mop.SortedSet_ComparableHandler' (SortedSet_ComparableHandler.java:9)
    object$siesta.vioSortedSet_ComparableAddAll((java.util.SortedSet)thisJP.getTarget());
  }

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioSortedSet_ComparableAdd. */
  @org.aspectj.lang.annotation.Before("((call(* java.util.Collection+.add(java.lang.Object)) || call(* java.util.Queue+.offer(java.lang.Object))) && target(java.util.SortedSet))")
  public void vioSortedSet_ComparableAdd_Before(org.aspectj.lang.JoinPoint thisJP) {//#public void mop.SortedSet_ComparableHandler.vioSortedSet_ComparableAdd(java.util.SortedSet)#'mop.SortedSet_ComparableHandler' (SortedSet_ComparableHandler.java:16)
    object$siesta.vioSortedSet_ComparableAdd((java.util.SortedSet)thisJP.getTarget());
  }

  }
}
