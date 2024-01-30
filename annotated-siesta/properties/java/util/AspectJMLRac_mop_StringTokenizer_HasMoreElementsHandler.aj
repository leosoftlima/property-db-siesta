import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.After;
import org.aspectjml.lang.annotation.siesta.After.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.HashSet;
import java.util.HashSet.*;
import java.util.StringTokenizer;
import java.util.StringTokenizer.*;
import java.util.Set;
import java.util.Set.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_StringTokenizer_HasMoreElementsHandler$2b01bb43_4aa7_4571_8ff3_a48ba8a71009 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioStringTokenizer_HasMoreElementsNextToken. */
   after (final java.util.StringTokenizer i) throwing (Throwable rac$e) :
     call(static void mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken(java.util.StringTokenizer)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(i) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken(java.util.StringTokenizer)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.StringTokenizer_HasMoreElementsHandler.java\" by method mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken regarding code at \nFile \"mop.StringTokenizer_HasMoreElementsHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken(java.util.StringTokenizer)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_StringTokenizer_HasMoreElementsHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioStringTokenizer_HasMoreElementsNextToken. */
  @org.aspectj.lang.annotation.Before("((call(* java.util.StringTokenizer.nextToken()) || call(* java.util.StringTokenizer.nextElement())) && target(java.util.StringTokenizer))")
  public void vioStringTokenizer_HasMoreElementsNextToken_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken(java.util.StringTokenizer)#'mop.StringTokenizer_HasMoreElementsHandler' (StringTokenizer_HasMoreElementsHandler.java:19)
  mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsNextToken((java.util.StringTokenizer)thisJP.getTarget());
  }
  
	@org.aspectj.lang.annotation.Pointcut(value = "((call(boolean java.util.StringTokenizer.hasMoreTokens()) || call(boolean java.util.StringTokenizer.hasMoreElements())) && target(i)) ", argNames = "i")
	public void StringTokenizer_HasMoreElements_hasnexttrue(java.util.StringTokenizer  i) { }

	@org.aspectj.lang.annotation.AfterReturning(pointcut = "StringTokenizer_HasMoreElements_hasnexttrue(i)", returning = "b", argNames = "i, b")
	public void afterReturningStringTokenizer_HasMoreElementsHasMoreToken(java.util.StringTokenizer  i, boolean b) {
		mop.StringTokenizer_HasMoreElementsHandler.vioStringTokenizer_HasMoreElementsHasMoreToken(i, b);
	}

  }
}