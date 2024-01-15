package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the name of an HttpCookie object has invalid character.
 *
 * According to the Java documentation, a HttpCookie name must conform to RFC
 * 2965.
 * http://docs.oracle.com/javase/6/docs/api/java/net/HttpCookie.html#HttpCookie%28java.lang.String,%20java.lang.String%29
 *
 * There is inconsistency between the Java documentation and RFC 2965,
 * referred to by the Java documentation. The former states that the name can
 * contain only ASCII alphanumeric characters and cannot contain commas,
 * semicolons, or white space or begin with a $ character. The latter sets
 * slightly different restriction: the name is a token, which is defined as follows
 * in RFC 2616:
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
 * Since the definition of ASCII alphanumeric character is unclear, this
 * property is based on RFC 2696; i.e., a name that does not conform to RFC
 * 2616 will be warned.
 *
 * @severity error
 */

public class HttpCookie_NameHandler {

    @Before("HttpCookie.new(java.lang.String, java.lang.String)")
    public static void vioHttpCookie_Name(String name, boolean isStatic, Object[] args) {

       NetSpecificationHandler.EventHttpCookie_Name(String.valueOf(args[1]));
    }
    
}
