import org.aspectjml.lang.annotation.siesta.Before;
import br.cin.ufpe.SpecificationRuntimeSiesta;

import java.util.SortedSet;

public class SortedSet_ComparableHandler {

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public void vioSortedSet_ComparableAddAll(SortedSet sortedSet) {

    	SpecificationRuntimeSiesta.eventSortedSet_ComparableAddAll(sortedSet);
    }

    @Before("* java.util.Collection+.add(java.lang.Object)")
    @Before("* java.util.Queue+.offer(java.lang.Object)")
    public void vioSortedSet_ComparableAdd(SortedSet sortedSet) {
    	
    	SpecificationRuntimeSiesta.eventSortedSet_ComparableAdd(sortedSet);

    }
}
