package mop;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns read(), available(), reset() or skip() after close().
 *
 * According to the BufferedInputStream.close() documentation, read(),
 * available(), reset() or skip() invocations will throw an IOException, once
 * the stream has been closed.
 * http://download.oracle.com/javase/6/docs/api/java/io/BufferedInputStream.html#close%28%29
 *
 * Other subclasses of InputStream are deemed to be similar, except
 * ByteArrayInputStream and StringBufferInputStream.
 * http://docs.oracle.com/javase/6/docs/api/java/io/ByteArrayInputStream.html#close%28%29
 *
 * @severity error
 */

public class InputStream_ManipulateAfterCloseHandler {

    @Before("* java.io.InputStream+.close()")
    public static void vioInputStream_ManipulateAfterClose(InputStream  inputStream,String[] history){

        if(!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof StringBufferInputStream)){
            IOSpecificationHandler.EventInputStream_ManipulateAfterClose(history);      
        }
    }

}
