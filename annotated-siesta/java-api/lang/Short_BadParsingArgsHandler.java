package mop;


import org.aspectjml.lang.annotation.siesta.Before;

public class Short_BadParsingArgsHandler {

    @Before("* java.lang.Short.parseShort(..)")
    public static void vioShortBadParsingArgs(String name, boolean isStatic, Object[] args) {

         LangSpecificationHandler.eventShortBadParsingArgs(args);

    }

}
