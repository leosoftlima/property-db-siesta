package mop;


import org.aspectjml.lang.annotation.siesta.Before;

public class Long_BadParsingArgsHandler {

    @Before("* java.lang.Long.parseLong(..)")
    public static void vioLongBadParsingArgs(String name, boolean isStatic, Object[] args) {

    	LangSpecificationHandler.eventLongBadParsingArgs(args);

    }

}
