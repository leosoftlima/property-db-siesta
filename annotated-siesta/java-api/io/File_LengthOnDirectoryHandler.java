package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.File;

/**
 * Warns if length() is invoked on a File object that represents a directory.
 *
 * The return value of length() is unspecified if the File instance denotes a
 * directory.
 * http://download.oracle.com/javase/6/docs/api/java/io/File.html#length%28%29
 *
 * @severity error
 */
public class File_LengthOnDirectoryHandler {

    @Before("* java.io.File+.length()")
    public static void vioFile_LengthOnDirectory(File file){
       IOSpecificationHandler.EventFile_LengthOnDirectory(file);
    }
}
