package mop;

import mop.LoggerSpecification.SpecificationType;

public class RandomAccessFile_ManipulateAfterClose {

	public void RandomAccessFile_ManipulateAfterCloseEvent(String[] history) {

		String[] interesting = new String[] {"read", "write", "seek"};
		if (filter(history, interesting)) {
			LoggerSpecification.printLogging(SpecificationType.RandomAccessFile_ManipulateAfterClose);
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
						if (history[j] != null && history[j].trim().startsWith(interestingMethod.trim())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
