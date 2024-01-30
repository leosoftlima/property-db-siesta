package mop;

import mop.LoggerSpecification.SpecificationType;

public class LongBadparsingArgs {
	 
	public void longBadParsingRadix(String string , int radix){
	        if (string != null && string.length() != 0) {
	            if (radix >= 2 && radix <= 36) {
	                for(int number = 0; number < string.length(); ++number) {
	                    if (verifyDigitRadix(string, radix, number)) {
	                        LoggerSpecification.printLogging(SpecificationType.Long_BadParsingRadix);
	                        break;
	                    }
	                }
	            } else {
	                LoggerSpecification.printLogging(SpecificationType.Long_BadParsingRadix);
	            }
	        } else {
	            LoggerSpecification.printLogging(SpecificationType.Long_BadParsingRadix);
	        }
	    }
	   
	    public void longBadParsing(String string ){
	        if (string != null && string.length() != 0) {
	            for(int str = 0; str < string.length(); ++str) {
	                if (verifyDigit(str, string)) {
	                    LoggerSpecification.printLogging(SpecificationType.Long_BadParsingArgs);
	                    break;
	                }
	            }
	        } else {
	            LoggerSpecification.printLogging(SpecificationType.Long_BadParsingArgs);
	        }
	    }
	    
	    private boolean verifyDigitRadix(String string,int radix ,int number) {
	        return (Character.digit(string.charAt(number), radix) == -1 &&
	                (number != 0 || string.length() <= 1 || string.charAt(0) != '-') &&
	                (number != string.length() - 1 || string.charAt(number) != 'l' &&
	                        string.charAt(number) != 'L'));
	    }
	    
	    private boolean verifyDigit(int str, String string) {
	        return (Character.digit(string.charAt(str), 10) == -1 &&
	                (str != 0 || string.length() <= 1 || string.charAt(0) != '-') &&
	                (str != string.length() - 1 || string.charAt(str) != 'l' && string.charAt(str) != 'L'));
	    }
}
