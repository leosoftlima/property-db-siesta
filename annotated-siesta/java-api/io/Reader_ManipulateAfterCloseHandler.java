package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.Reader;

/**
 * Warns read(), ready(), mark(), reset() or skip() after close().
 *
 * According to the Reader.close() documentation, read(), ready(), mark(),
 * reset() or skip() invocations will throw an IOException, once the stream
 * has been closed.
 * http://download.oracle.com/javase/6/docs/api/java/io/Reader.html#close%28%29
 *
 * This property warns if a closed Reader object invokes the aforementioned
 * methods.
 *
 * @severity error
 */

public class Reader_ManipulateAfterCloseHandler {

    @Before("* java.io.Reader+.close()")
    public static void vioReader_ManipulateAfterClose(Reader  reader, String[] history){
         
    	IOSpecificationHandler.EventReader_ManipulateAfterClose(history);

    }

}
