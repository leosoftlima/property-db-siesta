package mop;

import java.io.Closeable;

import org.aspectjml.lang.annotation.siesta.Before;
/**
 * Warns if close() is invoked multiple times.
 *
 * According to the Closeable.close() documentation, closing a previously closed
 * stream has no effect.
 * http://download.oracle.com/javase/6/docs/api/java/io/Closeable.html#close%28%29
 *
 * Although calling close() multiple times does not do any harm, this property
 * raises a warning in the hope that the warning helps developers to find a
 * glitch in their programs.
 *
 * @severity suggestion
 */
public class Closeable_MultipleCloseHandler {

    @Before("* java.io.Closeable+.close()")
    public static void vioCloseable_MultipleClose(Closeable closeable, String[] history){
           IOSpecificationHandler.EventCloseable_MultipleClose(history);      
    }
    
}
