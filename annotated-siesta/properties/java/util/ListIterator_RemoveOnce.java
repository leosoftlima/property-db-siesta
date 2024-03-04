package mop;

import mop.LoggerSpecification.SpecificationType;

public class ListIterator_RemoveOnce {
	
	public void eventListIterator_RemoveOnce(String[] history) {
		String[] interesting = new String[] {"next", "previous"};
		if(validate(history)) {
			if(!filter(history, interesting)) {
				LoggerSpecification.printLogging(SpecificationType.ListIterator_RemoveOnce);
			}
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

	    for (int i = 0; i < history.length; i++) {
	        if ("remove".equals(history[i])) {
	            foundRemove = true;
	            boolean foundNextOrPrevious = false;
	            
	            // Verifica se há um "next" ou "previous" antes do "remove"
	            for (int j = i - 1; j >= 0; j--) {
	                if ("next".equals(history[j]) || "previous".equals(history[j])) {
	                    foundNextOrPrevious = true;
	                    break;
	                } else if ("remove".equals(history[j])) {
	                    return false; // Se encontrar uma sequência de dois "remove" consecutivos, retorna falso
	                }
	            }
	            
	            if (!foundNextOrPrevious) {
	                return true; // Se não encontrar um "next" ou "previous" antes do "remove", retorna falso
	            }
	        } 
//	            else {
//	            // Verifica se há um método interessante antes de encontrar um "remove"
//	            for (String interestingMethod : interesting) {
//	                if (interestingMethod.equals(history[i])) {
//	                    return true; // Se encontrar um método interessante antes de um "remove", retorna verdadeiro
//	                }
//	            }
//	        }
	    }

	    return true; // Se não encontrar nenhum método interessante ou se não houver um "remove" no histórico, retorna falso
	}





}
