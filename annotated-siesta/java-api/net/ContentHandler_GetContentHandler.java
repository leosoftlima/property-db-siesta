package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if ContentHandler.getContent() is invoked.
 *
 * According to the reference, an application does not generally call the
 * getContent() method in the ContentHandler class. Instead, an application
 * calls the getContent() method in class URL or in URLConnection.
 * http://docs.oracle.com/javase/6/docs/api/java/net/ContentHandler.html
 *
 * Since the reference was not clear about the consequence of calling
 * ContentHandler.getContent(), a violation of this property is not considered
 * an error.
 *
 * @severity suggestion
 */

public class ContentHandler_GetContentHandler {

    @Before("* java.net.ContentHandler+.getContent(..)")
    public static void vioContentHandler_GetContent(String name, boolean isStatic, Object[] args) {

          NetSpecificationHandler.EventcontentHandler_GetContent();
    }
}
