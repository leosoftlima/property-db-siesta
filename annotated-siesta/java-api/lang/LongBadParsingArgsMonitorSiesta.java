import br.cin.ufpe.SpecificationRuntimeSiesta;
import org.aspectjml.lang.annotation.siesta.Before;

public class LongBadParsingArgsMonitorSiesta {

    @Before("* java.lang.Long.parseLong(..)")
    public static void vioLongBadParsingArgs(String name, boolean isStatic, Object[] args) {

         SpecificationRuntimeSiesta.eventLongBadParsingArgs(args);

    }

}
