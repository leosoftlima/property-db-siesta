package mop;

import java.io.*;

public class Writer_ManipulateAfterClose_1 {
	
//	public static void main(String[] args) throws IOException {
//		File file = File.createTempFile("javamoptest1", ".tmp");
//		file.deleteOnExit();
//
//		Writer writer = new FileWriter(file);
//		writer.write(100);
//		writer.close();
//
//		// A closed stream cannot perform output operations.
//		writer.write(101);
//	}
	
	public static void main(String[] args) throws IOException {
		Writer writer = new StringWriter();
		writer.write(100);
		writer.close();

		// StringWriter is an exceptional subclass of Writer;
		// write() after close() is valid.
		writer.write(101);
	}

}
