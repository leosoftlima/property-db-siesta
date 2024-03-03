package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.Scanner;

/**
 * Warns if a closed Scanner object attempts to perform search operations.
 *
 * http://docs.oracle.com/javase/6/docs/api/java/util/Scanner.html#close%28%29
 *
 * @severity error
 */

public class Scanner_SearchAfterCloseHandler {

    @Before("* java.util.Scanner+.close()")
    public static void vioScanner_SearchAfterClose(Scanner scanner, String[] history){
         UtilSpecificationHandler.EventScanner_SearchAfterClose(history); 
    }
}
