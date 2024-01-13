package mop;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoder_DecodeUTF8_1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        URLDecoder.decode("Hello", "utf-8");

        // As UTF-8 is recommended, the following should trigger the property
        // handler.
        URLDecoder.decode("Hello", "utf-16");
    }
}
