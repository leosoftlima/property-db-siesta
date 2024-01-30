package mop;

import java.io.File;

import mop.LoggerSpecification.SpecificationType;

public class File_LengthOnDirectory {
	
	public void File_LengthOnDirectoryEent(File file) {
		if(file.isDirectory())
			LoggerSpecification.printLogging(SpecificationType.File_LengthOnDirectory);
	}

}
