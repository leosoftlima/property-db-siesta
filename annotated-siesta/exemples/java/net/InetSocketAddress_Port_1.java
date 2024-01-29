package mop;

import java.net.*;

public class InetSocketAddress_Port_1 {
	public static void main(String[] args) {
		create(false, 65535);

		create(false, 65536);
	}

	private static void create(boolean legal, int port) {
		try {
			InetSocketAddress addr = new InetSocketAddress("localhost", port);
			
//			addr.createUnresolved("google.com", 66500);
			InetSocketAddress.createUnresolved("leo.com", 77000);
		}
		catch (IllegalArgumentException e) {
			if (legal)
				throw e;
		}
	}
}
