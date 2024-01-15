package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class ContentHandler_GetContentHandler {

    @Before("* java.net.ContentHandler+.getContent(..)")
    public static void vioContentHandler_GetContent(String name, boolean isStatic, Object[] args) {

          NetSpecificationHandler.EventcontentHandler_GetContent();
    }
}
