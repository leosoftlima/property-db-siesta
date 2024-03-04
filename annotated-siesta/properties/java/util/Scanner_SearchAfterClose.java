package mop;

import mop.LoggerSpecification.SpecificationType;

public class Scanner_SearchAfterClose {
	
	public void eventScanner_SearchAfterClose(String[] history) {

        String[] interesting = new String[] {"find","has","match","next","skip"};
        if (filter(history, interesting)) {
            LoggerSpecification.printLogging(SpecificationType.Scanner_SearchAfterClose);
        }

    }

    private boolean filter(String[] history, String[] interesting) {
        boolean foundClose = false;
        for (int i = 0; i < history.length; i++) {
            if ("close".equals(history[i])) {
                foundClose = true;
                // Verifica se há algum método interessante após o "close"
                for (int j = i + 1; j < history.length; j++) {
                    for (String interestingMethod : interesting) {
                    	String historyString = history[j];
                    	String interestingMethodString = interestingMethod;
//
//                    	System.out.println("history[j]: " + historyString);
//                    	System.out.println("interestingMethod: " + interestingMethodString);
                    	
                        if (history[j] !=null && historyString.startsWith(interestingMethodString)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
