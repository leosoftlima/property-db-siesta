package mop;

import mop.LoggerSpecification.SpecificationType;

public class URLEncoder_EncodeUTF8 {
	
	public final void urlEncoder_EncodeUTF8(String encode) {
	
		if (!encode.equalsIgnoreCase("utf-8") && !encode.equalsIgnoreCase("utf8")) {
			LoggerSpecification.printLogging(SpecificationType.URLEncoder_encoderUTF8);
		}
		
	}
}
