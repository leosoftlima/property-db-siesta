package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_FlushBeforeRetrieveHandler {

    @Before("* java.io.ByteArrayOutputStream.toByteArray()")
    public static void vioByteArrayOutputStream_FlushBeforeRetrieve(ByteArrayOutputStream  byteArrayOutputStream , String[] history){

       IOSpecificationHandler.EventByteArrayOutputStream_FlushBeforeRetrieve(history);
    }
}
