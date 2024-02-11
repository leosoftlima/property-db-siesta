package mop;

import mop.LoggerSpecification.SpecificationType;

public class URL_SetURLStreamHandlerFactory {
	
	public void URL_SetURLStreamHandlerFactoryEvent(String[] history) {
		
		String[] interesting = new String[] {"setURLStreamHandlerFactory"};
		if(filter(history,interesting) >= 2) {
			LoggerSpecification.printLogging(SpecificationType.URL_SetURLStreamHandlerFactory);
		}
	}
	
	private int filter(String[] history , String[] interesting) {
		int count =0;
		for (int i = 0; i < interesting.length; i++) {
			String string = interesting[i];
			for (int j = 0; j < history.length; j++) {
				String strHistory = history[j];
				if(strHistory !=null && strHistory.equals(string)) {
					count++;
				}
				
			}
		}
		return count;
	}

}
