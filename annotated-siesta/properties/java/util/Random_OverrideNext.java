package mop;

import java.lang.reflect.Method;

import mop.LoggerSpecification.SpecificationType;

public class Random_OverrideNext {

	public void eventRandom_OverrideNext(Class objClasse) {
		
		if (objClasse != null) {
			try {
				Method nextmethod = objClasse.getDeclaredMethod("next", Integer.class);
				
			}catch (NoSuchMethodException e) {
				
				LoggerSpecification.printLogging(SpecificationType.Random_OverrideNext, objClasse.getName());
				
			}
	     }
	}
}
