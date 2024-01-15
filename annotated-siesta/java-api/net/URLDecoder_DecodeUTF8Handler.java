package mop;


import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if URLDecoder.decode() is used for non-UTF-8 encoding.
 *
 * The World Wide Web Consortium Recommendation states that UTF-8 should be
 * used. Not doing so may introduce incompatibilites.
 * http://docs.oracle.com/javase/6/docs/api/java/net/URLDecoder.html#decode%28java.lang.String,%20java.lang.String%29
 *
 * @severity warning
 */

public class URLDecoder_DecodeUTF8Handler {

    @Before("* java.net.URLDecoder.decode(..)")
    public static void vioDecoder_DecodeUTF8(String name, boolean isStatic, Object[] args) {

    	NetSpecificationHandler.eventURLDecoder_DecodeUTF8(args);

    }
}
