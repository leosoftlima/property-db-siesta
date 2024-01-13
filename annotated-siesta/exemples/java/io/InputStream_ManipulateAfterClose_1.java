package mop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class InputStream_ManipulateAfterClose_1 {
	
	public static void main(String[] args) throws IOException {
		File file = File.createTempFile("javamoptest1", ".tmp");
		FileWriter writer = new FileWriter(file);
		writer.write("0123456789");
		writer.close();
		file.deleteOnExit();

		InputStream input = new FileInputStream(file);

		byte[] buf = new byte[5];
		input.read();
		int i = input.read(buf);
		input.available();
		input.close();
//		java.lang.Byte[] a = 
//		input.read()

		// After a stream is closed, most operations, such as read() and reset(), are banned.
//		int j = input.read(buf);
//		input.available();
		input.skip(10);
//		input.read(buf, 10, 10);
//		input.reset();
	}
	
//	public static void main(String[] args) throws IOException {
//		byte[] buffer = { 1, 2, 3, 4, 5};
//		ByteArrayInputStream input = new ByteArrayInputStream(buffer);
//		int i = input.read();
//		input.close();
//
//		// Although ByteArrayInputStream is a subclass of InputStream, calling
//		// read() after close() is allowed.
//		int j = input.read();
//	}

}
