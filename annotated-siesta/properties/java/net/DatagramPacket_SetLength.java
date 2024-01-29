package mop;

import java.net.DatagramPacket;

import mop.LoggerSpecification.SpecificationType;

public class DatagramPacket_SetLength {
	
	public void EventDatagramPacket_SetLength(DatagramPacket datagramPacket ,int length ) {
		 int offset = datagramPacket.getOffset();
		    byte[] buffer = datagramPacket.getData();

		    if (length + offset > buffer.length) {
		    	LoggerSpecification.printLogging(SpecificationType.DatagramPacket_SetLength, String.valueOf(length), String.valueOf(offset), String.valueOf(buffer.length));
		    }
	}

}
