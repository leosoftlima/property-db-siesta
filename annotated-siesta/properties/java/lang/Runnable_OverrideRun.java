package mop;

import java.lang.reflect.Method;

import mop.LoggerSpecification.SpecificationType;

public class Runnable_OverrideRun {
	
	 private String[] getMethodRunnable_OverrideRun(Class<?> klazz) {
	        if (klazz != null) {
	            try {
	                Method method = klazz.getMethod("run");
	                if (method != null && method.getName().equals("run")) {
	                    return new String[]{"run"}; 
	                }
	            } catch (NoSuchMethodException e) {
	                e.printStackTrace();
	            }
	        }
	        return null; 
	    }
	 
	 public void Runnable_OverrideRunEvent(Class<?> klazz) {
	   String [] methodRun= getMethodRunnable_OverrideRun(klazz);
		 
		if (methodRun !=null) {
		    if(!methodRun[0].equals("run")) {
		    	LoggerSpecification.printLogging(SpecificationType.Authenticator_OverrideGetPasswordAuthentication);
		    }
		}
	 }

}
