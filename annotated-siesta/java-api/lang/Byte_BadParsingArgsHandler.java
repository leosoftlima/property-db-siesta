import br.cin.ufpe.SpecificationRuntimeSiesta;
import org.aspectjml.lang.annotation.siesta.Before;

public class Byte_BadParsingArgsHandler {

    @Before("* java.lang.Byte.parseByte(..)")
    public static void vioLongBadParsingArgs(String name, boolean isStatic, Object[] args) {

         SpecificationRuntimeSiesta.eventByteBadParsingArgs(args);

    }

}
