package mop;

import mop.LoggerSpecification.SpecificationType;

public class Iterator_RemoveOnce {

	public void eventIterator_RemoveOnce(String[] history) {
		String[] interesting = new String[] {"next"};

			if(filter(history, interesting)  && !validate(history)) {
				LoggerSpecification.printLogging(SpecificationType.Iterator_RemoveOnce);
			}
	}
	private boolean validate(String[] history) {
		for (int i = 0; i < history.length; i++) {
			String string = history[i];
			if(history[i] !=null && history[i].equals("listIterator")) {
				return true;
			}
		}
		return false;
	}
	
	private boolean filter(String[] history, String[] interesting) {
	    boolean foundRemove = false;
	    boolean foundNext = false;

	    for (String action : history) {
	        if ("remove".equals(action)) {
	            if (foundRemove) {
	                return true; // Retorna true se encontrar dois "remove" consecutivos sem um "next" entre eles
	            }
	            foundRemove = true; // Marca que encontrou um "remove"
	        } else if ("next".equals(action)) {
	            if (!foundRemove) {
	                foundNext = true; // Marca que encontrou um "next" sem um "remove" anterior
	            }else {
	            	foundNext = false;
	            }
	        }
	    }

	    // Retorna true se encontrar um único "remove" sem um "next" subsequente
	    return foundRemove && !foundNext;
	}




}
