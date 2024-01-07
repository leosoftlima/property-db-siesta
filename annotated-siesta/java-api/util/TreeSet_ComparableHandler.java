import java.util.TreeSet;
import org.aspectjml.lang.annotation.siesta.Before;
import br.cin.ufpe.SpecificationRuntimeSiesta;

public class TreeSet_ComparableHandler {

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public void vioTreeSet_ComparableAddAll(TreeSet collection) {
    	SpecificationRuntimeSiesta.eventTreeSet_ComparableAddAll(collection);

    }

    @Before("* java.util.Collection+.add(java.lang.Object)")
    public void vioTreeSet_ComparableAdd(TreeSet treeSet) {
    	SpecificationRuntimeSiesta.eventTreeSet_ComparableAdd(treeSet);
    }

}
