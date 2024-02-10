package mop;

import java.lang.reflect.Method;

import mop.LoggerSpecification.SpecificationType;

public class CollectionHashCode {

	public void vioCollectionHashCode(Class clazz) {

		if (clazz != null) {
			Method methodEquals = null;
			Method methodHashCode = null;

			try {
				methodEquals = clazz.getDeclaredMethod("equals", Object.class);
				methodHashCode = clazz.getDeclaredMethod("hashCode", (Class[])null);

			} catch (NoSuchMethodException e) {}

			if (methodEquals != null && methodHashCode == null) {
				LoggerSpecification.printLogging(SpecificationType.CollectionHashCode, clazz.getName()); 
			}


		}

	}
}
