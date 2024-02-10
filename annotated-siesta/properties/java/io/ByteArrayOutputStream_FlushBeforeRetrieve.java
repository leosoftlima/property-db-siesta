package mop;

import mop.LoggerSpecification.SpecificationType;

public class ByteArrayOutputStream_FlushBeforeRetrieve {

	public void ByteArrayOutputStream_FlushBeforeRetrieveEvent(String[] history) {
		
		String[] interesting = new String[] {"flush", "close"};
		if(filter(history,interesting) < 1) {
			LoggerSpecification.printLogging(SpecificationType.ByteArrayOutputStream_FlushBeforeRetrieve);
		}
		
	}
	private int filter(String[] history , String[] interesting) {
		int count =0;
		for (int i = 0; i < interesting.length; i++) {
			String string = interesting[i];
			for (int j = 0; j < history.length; j++) {
				String strHistory = history[j];
				if (strHistory != null && string != null && strHistory.equals(string)) {
				    count++;
				}			
			}
		}
		return count;
	}
}
