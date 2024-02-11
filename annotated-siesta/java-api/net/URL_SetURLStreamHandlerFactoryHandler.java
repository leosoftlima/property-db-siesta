package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if URL.setURLStreamHandlerFactory() is called multiple times.
 *
 * This method can be called at most once in a given Java Virtual Machine.
 * http://docs.oracle.com/javase/6/docs/api/java/net/URL.html#setURLStreamHandlerFactory%28java.net.URLStreamHandlerFactory%29
 *
 * @severity error
 */

public class URL_SetURLStreamHandlerFactoryHandler {

    @Before("* java.net.URL.setURLStreamHandlerFactory(..)")
    public static void vioURL_SetURLStreamHandlerFactory(String name, boolean isStatic, Object[] args, String[] history){
        NetSpecificationHandler.EventURL_SetURLStreamHandlerFactory(history);
    }
}
