package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.io.StringBufferInputStream;

/**
 * Warns read(), available(), reset() or skip() after close().
 *
 * Properties.loadFromXML() takes an InputStream object, uses it, and then
 * closes it when it returns. That is, calling loadFromXML() is like calling
 * InputStream.close(), and the InputStream object should be considered
 * closed.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Properties.html#loadFromXML%28java.io.InputStream%29
 *
 * This property is similar to InputStream_ManipulateAfterClose; only 'close'
 * event is different.
 *
 * @severity error
 */

public class Properties_ManipulateAfterLoadHandler {

    @Before("* java.util.Properties+.loadFromXML(..)")
    public static void vioProperties_ManipulateAfterLoad(String name, boolean isStatic, Object[] args, String[] history){
        InputStream inputStream = (InputStream) args[1];
        if(!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof StringBufferInputStream)){
            UtilSpecificationHandler.eventProperties_ManipulateAfterLoad(history);
        }
    }

}
