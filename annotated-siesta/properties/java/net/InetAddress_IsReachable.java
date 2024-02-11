package mop;

public class InetAddress_IsReachable {
	
	public void eventInetAddress_IsReachable(Integer ttl, Integer timeout) {

			if ((ttl != null && timeout != null) && (ttl < 0 && timeout < 0)){
		    	LoggerSpecification.printLogging_InetAddress_IsReachable(3);
		    } else if (ttl != null && ttl < 0) {
		    	LoggerSpecification.printLogging_InetAddress_IsReachable(2);
		    } else if (timeout != null && timeout < 0) {
		    	LoggerSpecification.printLogging_InetAddress_IsReachable(1);
		    }
	}
}

