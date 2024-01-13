package mop;

import java.io.InputStream;
import org.aspectjml.lang.annotation.siesta.Before;

public class InputStream_ManipulateAfterCloseHandler {

	@Before("* java.io.InputStream+.close()")
	public static void vioManipulateAfterClose(InputStream  inputStream){

		IOSpecificationHandler.InputStream_ManipulateAfterClose_closeEvent2(inputStream);

	}

	@Before("* java.io.InputStream+.available()")
	@Before("* java.io.InputStream+.reset()")
	public static void vioManipulateAfterOtherMethods(InputStream  inputStream){

		IOSpecificationHandler.InputStream_ManipulateAfterClose_manipulateEvent(inputStream);

	}

	@Before("* java.io.InputStream+.skip(long)")
	public static void vioManipulateAfterOtherMethodsSkip(InputStream  inputStream){
		
		IOSpecificationHandler.InputStream_ManipulateAfterClose_manipulateEvent(inputStream);
	
	}

	@Before("* java.io.InputStream+.read(..)")
	public static void vioManipulateAfterOtherMethodsRead(String name , boolean isStatic, Object[] objects){
    
		if (objects !=null) {
    	   InputStream inputStream = (InputStream) objects[0];
    	   IOSpecificationHandler.InputStream_ManipulateAfterClose_manipulateEvent(inputStream);
       }
		
	}

}
