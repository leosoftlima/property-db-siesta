package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class NetPermission_ActionsHandler {

    @Before("java.net.NetPermission.new(..)")
    public static void vioNetPermission_Actions(String name, boolean isStatic, Object[] args){
       NetSpecificationHandler.EventNetPermission_Actions(args);
    }
}
