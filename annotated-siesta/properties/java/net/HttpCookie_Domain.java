package mop;

import mop.LoggerSpecification.SpecificationType;

public class HttpCookie_Domain {
	
	void eventSetDomain(String domain) {
	    String separators = "()<>@,;:\\\"/[]?={} \t";

	    if (isQuoted(domain)) {
	        domain = removeQuotes(domain);
	    }

	    if (isOutOfRange(domain) || hasControlChars(domain) || hasSeparators(domain, separators)) {
	        LoggerSpecification.printLogging(SpecificationType.HttpCookie_Name, domain,"");
	    }
	}

	private boolean isQuoted(String domain) {
	    return domain.length() >= 2 && domain.charAt(0) == '"' && domain.charAt(domain.length() - 1) == '"';
	}

	private String removeQuotes(String domain) {
	    return domain.substring(1, domain.length() - 1);
	}

	private boolean isOutOfRange(String domain) {
	    for (int i = 0; i < domain.length(); ++i) {
	        char ch = domain.charAt(i);
	        if (!(0 <= ch && ch <= 127)) {
	            return true;
	        }
	    }
	    return false;
	}

	private boolean hasControlChars(String domain) {
	    for (int i = 0; i < domain.length(); ++i) {
	        char ch = domain.charAt(i);
	        if (ch <= 31 || ch == 127) {
	            return true;
	        }
	    }
	    return false;
	}

	private boolean hasSeparators(String domain, String separators) {
	    for (int i = 0; i < domain.length(); ++i) {
	        char ch = domain.charAt(i);
	        if (separators.indexOf(ch) != -1) {
	            return true;
	        }
	    }
	    return false;
	}

}
