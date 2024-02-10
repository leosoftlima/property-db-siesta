package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.StringWriter;
import java.io.CharArrayWriter;
import java.io.Writer;

/**
 * Warns write(), or flush() after close().
 *
 * According to the Writer.close() documentation, further write() or flush()
 * invocations will cause an IOException to be thrown.
 * http://download.oracle.com/javase/6/docs/api/java/io/Writer.html#close%28%29
 *
 * Other subclasses of Writer are deemed to be similar, except CharArrayWriter
 * and StringWriter.
 * http://docs.oracle.com/javase/6/docs/api/java/io/CharArrayWriter.html#close%28%29
 * http://docs.oracle.com/javase/6/docs/api/java/io/StringWriter.html#close%28%29
 *
 * @severity error
 */

public class Writer_ManipulateAfterCloseHandler {

    @Before("* java.io.Writer+.close()")
    public static void vioWriter_ManipulateAfterClose(Writer  writer, String[] history){

        if(!(writer instanceof CharArrayWriter) && !(writer instanceof StringWriter )){
           IOSpecificationHandler.EventWriter_ManipulateAfterClose(history);
        }
    }

}
