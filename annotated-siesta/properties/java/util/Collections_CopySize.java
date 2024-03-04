package mop;

import java.util.List;

import mop.LoggerSpecification.SpecificationType;

public class Collections_CopySize {

	
	public void eventCollections_CopySize(List dest, List origen) {
		if (dest.size() < origen.size()) {
			LoggerSpecification.printLogging(SpecificationType.Collections_CopySize);
		}
	}
}
