package mop;

import mop.LoggerSpecification.SpecificationType;

public class URLDecoder_DecodeUTF8 {
	
    public final void urlDecoder_DecodeUT8(String decode) {
    	
        if (!decode.equalsIgnoreCase("utf-8") && !decode.equalsIgnoreCase("utf8")) {
            LoggerSpecification.printLogging(SpecificationType.URLDecoder_DecodeUTF8);
        }
        
    }
}
