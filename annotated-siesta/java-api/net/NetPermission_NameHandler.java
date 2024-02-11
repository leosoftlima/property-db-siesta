package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a target name for NetPermission does not conform to the naming
 * convention.
 *
 * The naming convention follows the hierarchical property naming convention.
 * Also, an asterisk may appear at the end of the name, following a ".", or by
 * itself, to signify a wildcard match.
 * http://docs.oracle.com/javase/6/docs/api/java/net/NetPermission.html#NetPermission%28java.lang.String%29
 *
 * @severity error
 */

public class NetPermission_NameHandler {

    @Before("java.net.NetPermission.new(..)")
    public static void vioNetPermission_Name(String name, boolean isStatic, Object[] args){
        NetSpecificationHandler.EventNetPermission_Name(args);
    }
}
