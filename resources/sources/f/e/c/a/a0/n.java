package f.e.c.a.a0;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public interface n<T> {

    public static class a implements n<Cipher> {
        /* renamed from: b */
        public Cipher a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    public static class b implements n<Mac> {
        /* renamed from: b */
        public Mac a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}
