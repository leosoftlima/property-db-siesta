package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.io.StringBufferInputStream;

public class Properties_ManipulateAfterLoadHandler {

    @Before("* java.util.Properties+.loadFromXML(..)")
    public static void vioProperties_ManipulateAfterLoad(String name, boolean isStatic, Object[] args, String[] history){
        InputStream inputStream = (InputStream) args[1];
        if(!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof StringBufferInputStream)){
            UtilSpecificationHandler.eventProperties_ManipulateAfterLoad(history);
        }
    }

}
