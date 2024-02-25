package f.e.c.a.a0;

import f.e.c.a.a0.n;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class m<T_WRAPPER extends n<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f4018d = Logger.getLogger(m.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f4019e = (v.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>());

    /* renamed from: f  reason: collision with root package name */
    public static final m<n.a, Cipher> f4020f = new m<>(new n.a());

    /* renamed from: g  reason: collision with root package name */
    public static final m<n.b, Mac> f4021g = new m<>(new n.b());
    private T_WRAPPER a;
    private List<Provider> b = f4019e;
    private boolean c = true;

    public m(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f4018d.info(String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider a2 : this.b) {
            try {
                return this.a.a(str, a2);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.c) {
            return this.a.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
