package p.e0.l;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p.e0.j.g;

public abstract class c {
    public static c b(X509TrustManager x509TrustManager) {
        return g.l().c(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
