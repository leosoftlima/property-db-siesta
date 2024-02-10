package mop;

import mop.LoggerSpecification.SpecificationType;

public class Properties_ManipulateAfterLoad {

    public void Properties_ManipulateAfterLoadEvent(String[] history) {

        String[] interesting = new String[] {"read", "available", "reset", "skip"};
        if (filter(history, interesting)) {
            LoggerSpecification.printLogging(SpecificationType.Properties_ManipulateAfterLoad);
        }

    }

    private boolean filter(String[] history, String[] interesting) {
        boolean foundClose = false;
        for (int i = 0; i < history.length; i++) {
            if ("loadFromXML".equals(history[i])) {
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

