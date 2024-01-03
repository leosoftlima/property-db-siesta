import br.cin.ufpe.SpecificationRuntimeSiesta;
import org.aspectjml.lang.annotation.siesta.Before;

public class URLEncoder_EncodeUTF8Handler {

    @Before("* java.net.URLEncoder.encode(..)")
    public static void vioEncoder_encodeUTF8(String name, boolean isStatic, Object[] args) {

        SpecificationRuntimeSiesta.eventURLEncoder_EncodeUTF8(args);

    }
}
