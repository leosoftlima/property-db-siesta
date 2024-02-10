import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_ByteArrayOutputStream_FlushBeforeRetrieveHandler$b3de609a_80d7_42e9_9741_9b6b37456227 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioByteArrayOutputStream_FlushBeforeRetrieve. */
   after (final java.io.ByteArrayOutputStream byteArrayOutputStream) throwing (Throwable rac$e) :
     call(static void mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve(java.io.ByteArrayOutputStream)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(byteArrayOutputStream) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve(java.io.ByteArrayOutputStream)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.java\" by method mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve regarding code at \nFile \"mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve(java.io.ByteArrayOutputStream)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_ByteArrayOutputStream_FlushBeforeRetrieveHandler{
	   private String[] list= null;
	   
  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioByteArrayOutputStream_FlushBeforeRetrieve. */
  @org.aspectj.lang.annotation.Before("(call(* java.io.ByteArrayOutputStream.toByteArray()) && target(java.io.ByteArrayOutputStream))")
  public void vioByteArrayOutputStream_FlushBeforeRetrieve_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve(java.io.ByteArrayOutputStream)#'mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler' (ByteArrayOutputStream_FlushBeforeRetrieveHandler.java:9)
  mop.ByteArrayOutputStream_FlushBeforeRetrieveHandler.vioByteArrayOutputStream_FlushBeforeRetrieve((java.io.ByteArrayOutputStream)thisJP.getTarget(),semantic_mop_ByteArrayOutputStream_FlushBeforeRetrieve(thisJP));
  }
  /** Manually by code to get methods in the classe
   * 
   */
  private String[] semantic_mop_ByteArrayOutputStream_FlushBeforeRetrieve(org.aspectj.lang.JoinPoint thisJP) {
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