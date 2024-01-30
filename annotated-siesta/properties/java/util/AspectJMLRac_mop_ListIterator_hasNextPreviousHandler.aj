import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.After;
import org.aspectjml.lang.annotation.siesta.After.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.HashSet;
import java.util.HashSet.*;
import java.util.ListIterator;
import java.util.ListIterator.*;
import java.util.Set;
import java.util.Set.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_ListIterator_hasNextPreviousHandler$bd2b6bbf_6507_4165_a6ca_9d6c90c09e5d {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioListIterator_hasNextPrevious. */
   after (final java.util.ListIterator i) throwing (Throwable rac$e) :
     call(static void mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious(java.util.ListIterator)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(i) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious(java.util.ListIterator)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.ListIterator_hasNextPreviousHandler.java\" by method mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious regarding code at \nFile \"mop.ListIterator_hasNextPreviousHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious(java.util.ListIterator)", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioListIterator_NextPrevious. */
   after (final java.util.ListIterator i) throwing (Throwable rac$e) :
     call(static void mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious(java.util.ListIterator)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(i) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious(java.util.ListIterator)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.ListIterator_hasNextPreviousHandler.java\" by method mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious regarding code at \nFile \"mop.ListIterator_hasNextPreviousHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious(java.util.ListIterator)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_ListIterator_hasNextPreviousHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioListIterator_hasNextPrevious. */
  @org.aspectj.lang.annotation.Before("(call(* java.util.ListIterator.previous()) && target(java.util.ListIterator))")
  public void vioListIterator_hasNextPrevious_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.ListIterator_hasNextPreviousHandler.vioListIterator_hasNextPrevious(java.util.ListIterator)#'mop.ListIterator_hasNextPreviousHandler' (ListIterator_hasNextPreviousHandler.java:19)
  mop.ListIterator_hasNextPreviousHandler.vioBeforeListIterator_hasNextPrevious((java.util.ListIterator)thisJP.getTarget());
  }

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioListIterator_NextPrevious. */
  @org.aspectj.lang.annotation.Before("(call(* java.util.ListIterator.next()) && target(java.util.ListIterator))")
  public void vioListIterator_NextPrevious_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.ListIterator_hasNextPreviousHandler.vioListIterator_NextPrevious(java.util.ListIterator)#'mop.ListIterator_hasNextPreviousHandler' (ListIterator_hasNextPreviousHandler.java:23)
  mop.ListIterator_hasNextPreviousHandler.vioBeforeListIterator_NextPrevious((java.util.ListIterator)thisJP.getTarget());
  }

	@org.aspectj.lang.annotation.Pointcut(value = "(call(* java.util.ListIterator.hasNext()) && target(i))", argNames = "i")
	public void ListIterator_hasNextPrevious_hasnexttrue(java.util.ListIterator i) { }

	@org.aspectj.lang.annotation.AfterReturning(pointcut = "ListIterator_hasNextPrevious_hasnexttrue(i)", returning = "b", argNames = "i, b")
	public void afterReturningListIterator_hasNextPrevious(java.util.ListIterator i, boolean b) {
		 mop.ListIterator_hasNextPreviousHandler.vioAfterListIterator_hasNextPrevious(i, b);
	}
  
	@org.aspectj.lang.annotation.Pointcut(value = "(call(* java.util.ListIterator.hasPrevious()) && target(i))", argNames = "i")
	public void ListIterator_hasNextPrevious_hasprevioustrue(java.util.ListIterator i) { }

	@org.aspectj.lang.annotation.AfterReturning(pointcut = "ListIterator_hasNextPrevious_hasprevioustrue(i)", returning = "b", argNames = "i, b")
	public void afterReturningListIterator_hasNextPrevioustrue(java.util.ListIterator i, boolean b) {
		mop.ListIterator_hasNextPreviousHandler.vioAfterListIterator_hasPrevious(i, b);
	}
  
  }
}