package mop;

import mop.LoggerSpecification.SpecificationType;

public class Closeable_MultipleClose {
	
	public void Closeable_MultipleCloseEvent(String[] history) {
	    if (history == null || history.length == 0) {
	        return;
	    }

	    String[] interesting = new String[] {"close"};
	    if (filter(history, interesting) >= 2) {
	        LoggerSpecification.printLogging(SpecificationType.Closeable_MultipleClose);
	    }
	}


	private int filter(String[] history, String[] interesting) {
	    int count = 0;
	    for (String strInteresting : interesting) {
	        for (String strHistory : history) {
	            if (strHistory !=null && strHistory.equals(strInteresting)) {
	                count++;
	            }
	        }
	    }
	    return count;
	}


}
