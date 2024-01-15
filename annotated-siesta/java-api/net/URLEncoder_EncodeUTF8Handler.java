package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if URLEncoder.encode() is used for non-UTF-8 encoding.
 *
 * The World Wide Web Consortium Recommendation states that UTF-8 should be
 * used. Not doing so may introduce incompatibilites.
 * http://docs.oracle.com/javase/6/docs/api/java/net/URLEncoder.html#encode%28java.lang.String,%20java.lang.String%29
 *
 * @severity warning
 */

public class URLEncoder_EncodeUTF8Handler {

    @Before("* java.net.URLEncoder.encode(..)")
    public static void vioEncoder_encodeUTF8(String name, boolean isStatic, Object[] args) {

    	NetSpecificationHandler.eventURLEncoder_EncodeUTF8(args);

    }
}
