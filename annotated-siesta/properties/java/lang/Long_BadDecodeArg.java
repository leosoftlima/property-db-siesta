package mop;

import mop.LoggerSpecification.SpecificationType;

public class Long_BadDecodeArg {

	public void Long_BadDecodeArgEvent(Long integer, String str) {

		if (str != null && str.length() != 0) {
			for(int i = 0; i < str.length(); ++i) {
				if (Character.isWhitespace(str.charAt(i))) {
					LoggerSpecification.printLogging(SpecificationType.Integer_BadDecodeArg);
				}
			}

			String substr;
			if (str.charAt(0) == '-') {
				substr = str.substring(1);
			} else {
				substr = str;
			}

			byte radix;
			if (!substr.startsWith("0x") && !substr.startsWith("0X")) {
				if (substr.startsWith("#")) {
					substr = substr.substring(1);
					radix = 16;
				} else if (substr.startsWith("0")) {
					substr = substr.substring(1);
					radix = 8;
				} else {
					radix = 10;
				}
			} else {
				substr = substr.substring(2);
				radix = 16;
			}

			try {
				if (Integer.parseInt(substr, radix) < 0L) {
					LoggerSpecification.printLogging(SpecificationType.Integer_BadDecodeArg);	
				}
			} catch (Exception e) {
				LoggerSpecification.printLogging(SpecificationType.Integer_BadDecodeArg);	
			}

		}else {
			LoggerSpecification.printLogging(SpecificationType.Integer_BadDecodeArg);	
		}

	}
}