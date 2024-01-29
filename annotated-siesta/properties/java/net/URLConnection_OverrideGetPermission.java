package mop;

import java.lang.reflect.Method;

import mop.LoggerSpecification.SpecificationType;

public class URLConnection_OverrideGetPermission {
	
	public void vioURLConnection_OverrideGetPermission(Class objClasse) {


		Method method;
		for(method = null; objClasse != null && !objClasse.getName().equals("java.net.URLConnection");
				objClasse = objClasse.getSuperclass()) {
			try {
				Method[] listDeclareMethods = objClasse.getDeclaredMethods();
				int lengthMethods = listDeclareMethods.length;

				for(int i = 0; i < lengthMethods; ++i) {
					Method methodPermission = listDeclareMethods[i];
					if (methodPermission.getName().equals("getPermission") && methodPermission.getParameterTypes().length == 0) {
						method = methodPermission;
						break;
					}
				}

				if (method != null) {
					break;
				}
			} catch (SecurityException e) {
			}
		}

		if (method == null) {
			LoggerSpecification.printLogging(SpecificationType.URLConnection_OverrideGetPermission); 
		}
	}

}
