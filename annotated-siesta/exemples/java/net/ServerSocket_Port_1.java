package mop;

import java.net.*;
import java.io.IOException;

public class ServerSocket_Port_1 {
	public static void main(String[] args) throws IOException {
		ServerSocket good = new ServerSocket(65535, 50);
		ServerSocket bad3 = new ServerSocket(2, 0);
		ServerSocket bad = null;

		try {
			bad = new ServerSocket(65536);
			
			ServerSocket	bad2 = new ServerSocket(3, 0, null);
		}
		catch (IllegalArgumentException e) {
		}

		try {
			bad = new ServerSocket(65536, 50);
		}
		catch (IllegalArgumentException e) {
		}
	}
}
