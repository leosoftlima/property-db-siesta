package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the domain of an HttpCookie object has invalid character.
 *
 * The domain name (or pattern), the only parameter of HttpCookie.setDomain(),
 * should be in the form specified by RFC 2965.
 * http://docs.oracle.com/javase/6/docs/api/java/net/HttpCookie.html#setDomain%28java.lang.String%29
 *
 * According to RFC 2965, the domain value can be either a token or a
 * quoted-string. A token is defined as follows:
 *
 *      token      = 1*<any CHAR except CTLs or separators>
 *      CHAR       = <any US-ASCII character (octets 0 - 127)>
 *      CTL        = <any US-ASCII control character
 *                   (octets 0 - 31) and DEL (127)>
 *      separators = "(" | ")" | "<" | ">" | "@"
 *                 | "," | ";" | ":" | "\" | <">
 *                 | "/" | "[" | "]" | "?" | "="
 *                 | "{" | "}" | SP | HT
 *
 * Since a quoted-string is not defined in RFC 2965, this property assumes a
 * quoted-string is a sequence of CHARs surrounded by double-quotes.
 *
 * @severity error
 */

public class HttpCookie_DomainHandler {

    @Before("void java.net.HttpCookie.setDomain(..)")
    public static void vioHttpCookie_Domain(String name, boolean isStatic, Object[] args){
    	String str  = (String) args[1];
        NetSpecificationHandler.EventHttpCookie_Domain(str);
    }
}
