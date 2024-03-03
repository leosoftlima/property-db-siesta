package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a Closeable object, used in Scanner, is used after the Scanner
 * object is closed.
 *
 * A Scanner object can take a Closeable object, such as Readable, InputStream
 * and ReadableByteChannel, and uses it as input. When the Scanner object is
 * closed, the Closeable object is closed as well. Thus any further operations
 * on the Closeable object is prohibited.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Scanner.html
 *
 * This property warns if any method invocation on the Closeable object once
 * the object is passed to a Scanner object. This does not give false warning
 * during the execution of Scanner because the callsite is hidden in the
 * Scanner implementation.
 *
 * @severity error
 */

public class Scanner_ManipulateAfterCloseHandler {

    @Before("java.util.Scanner+.new(..)")
    public static void vioScanner_ManipulateAfterClose(String name, boolean isStatic, Object[] args, String[] history){
       UtilSpecificationHandler.eventScanner_ManipulateAfterClose(args, history);
    }

}
