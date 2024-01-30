package mop;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import mop.LoggerSpecification.SpecificationType;

public class Serializable_NoArgConstructor {

	public void EventSerializable_NoArgConstructor(Class klass) {
		if (klass != null) {
			Class<?> nonSerializable = klass;

			while (Serializable.class.isAssignableFrom(nonSerializable)) {
				nonSerializable = nonSerializable.getSuperclass();

				if (nonSerializable == null) {
					break;
				}
			}

			if (nonSerializable != null) {
				boolean samePackage = klass.getClassLoader() == nonSerializable.getClassLoader() &&
						getPackageName(klass).equals(getPackageName(nonSerializable));

				boolean inaccessible = true;

				try {
					Constructor<?> ctor = nonSerializable.getDeclaredConstructor((Class<?>[]) null);
					int mod = ctor.getModifiers();
					inaccessible = (mod & Modifier.PRIVATE) != 0 || ((mod & 5) == 0 && !samePackage);
				} catch (NoSuchMethodException e) {
					// Handle the exception if needed
				}

				if(inaccessible) {
                    LoggerSpecification.printLogging(SpecificationType.Serializable_NoArgConstructor, nonSerializable.getName());
				}

			}
		}
	}

	private String getPackageName(Class<?> clazz) {
		String className = clazz.getName();
		int lastDot = className.lastIndexOf('.');
		return (lastDot < 0) ? "" : className.substring(0, lastDot);
	}

}
