package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the input to IDN.toASCII() should not be used in an
 * internationalized domain name.
 *
 * IDN.toASCII(), which translates Unicode to ASCII, can fail when the given
 * string cannot be used in an internationalized domain name.
 * http://docs.oracle.com/javase/6/docs/api/java/net/IDN.html#toASCII%28java.lang.String%29
 *
 * @severity error
 */
public class IDN_ToAsciiHandler {

    @Before("* java.net.IDN.toASCII(..)")
    public static void vioIDN_ToAscii(String name, boolean isStatic, Object[] args) {
    	String str  = (String) args[1];
        NetSpecificationHandler.EventIDN_ToAscii(str);
    }
	
}
