package mop;

import mop.LoggerSpecification.SpecificationType;

public class InputStream_ManipulateAfterClose {

    public void InputStream_ManipulateAfterCloseEvent(String[] history) {

        String[] interesting = new String[] {"read", "available", "reset", "skip"};
        if (filter(history, interesting)) {
            LoggerSpecification.printLogging(SpecificationType.InputStream_ManipulateAfterClose);
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
                        if (interestingMethod.equals(history[j])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

