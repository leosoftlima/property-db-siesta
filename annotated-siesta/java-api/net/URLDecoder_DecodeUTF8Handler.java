import br.cin.ufpe.SpecificationRuntimeSiesta;
import org.aspectjml.lang.annotation.siesta.Before;

public class URLDecoder_DecodeUTF8Handler {

    @Before("* java.net.URLDecoder.decode(..)")
    public static void vioDecoder_DecodeUTF8(String name, boolean isStatic, Object[] args) {

          SpecificationRuntimeSiesta.eventURLDecoder_DecodeUTF8(args);

    }
}
