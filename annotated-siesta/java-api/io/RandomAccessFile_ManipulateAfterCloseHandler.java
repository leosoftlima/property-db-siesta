package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.RandomAccessFile;

/**
 * Warns if a closed object performs input or output operations.
 *
 * According to the documentation, a closed random access file cannot perform
 * input or output operations and cannot be reopened.
 * http://download.oracle.com/javase/6/docs/api/java/io/RandomAccessFile.html#close%28%29
 *
 * This property captures only input or output operations performed after
 * close(), because reopening a file is prevented by the language.
 *
 * @severity error
 */

public class RandomAccessFile_ManipulateAfterCloseHandler {

    @Before("* java.io.RandomAccessFile+.close()")
    public static void vioRandomAccessFile_ManipulateAfterClose(RandomAccessFile  randomAccessFile, String[] history){

         IOSpecificationHandler.EventRandomAccessFile_ManipulateAfterClose(history);
    }

}
