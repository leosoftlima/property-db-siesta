import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import br.cin.ufpe.SpecificationRuntimeSiesta;
import br.cin.ufpe.SpecificationRuntimeSiesta.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Byte_BadParsingArgsHandler$f41457f2_965b_4920_842e_15747f902967 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioByteBadParsingArgs. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Byte_BadParsingArgsHandler.java\" by method mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs regarding code at \nFile \"mop.Byte_BadParsingArgsHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Byte_BadParsingArgsHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioByteBadParsingArgs. */
  @org.aspectj.lang.annotation.Before("call(* java.lang.Byte.parseByte(..))")
  public void vioByteBadParsingArgs_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs(java.lang.String, boolean, java.lang.Object[])#'mop.Byte_BadParsingArgsHandler' (Byte_BadParsingArgsHandler.java:9)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.Byte_BadParsingArgsHandler.vioByteBadParsingArgs(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  }
}