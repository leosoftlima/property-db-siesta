import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Scanner_ManipulateAfterCloseHandler$60780beb_7630_49f0_8a2c_9750fdadeee1 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioScanner_ManipulateAfterClose. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Scanner_ManipulateAfterCloseHandler.java\" by method mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose regarding code at \nFile \"mop.Scanner_ManipulateAfterCloseHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Scanner_ManipulateAfterCloseHandler{
	  private String[] list= null;
  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioScanner_ManipulateAfterClose. */
  @org.aspectj.lang.annotation.Before("call(java.util.Scanner+.new(..))")
  public void vioScanner_ManipulateAfterClose_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose(java.lang.String, boolean, java.lang.Object[])#'mop.Scanner_ManipulateAfterCloseHandler' (Scanner_ManipulateAfterCloseHandler.java:26)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.Scanner_ManipulateAfterCloseHandler.vioScanner_ManipulateAfterClose(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray(), semantic(thisJP));
  }
  private String[] semantic(org.aspectj.lang.JoinPoint thisJP) {
		try {
			list =  SemanticParser.historyOf(thisJP.getStaticPart().getSourceLocation());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 return list; 
  }
  }
}