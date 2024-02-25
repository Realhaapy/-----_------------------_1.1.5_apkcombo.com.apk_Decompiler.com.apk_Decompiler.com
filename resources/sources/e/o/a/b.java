package e.o.a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

public final class b {
    private final String a;

    public static final class a {
        private final String a;
        private KeyGenParameterSpec b;
        private C0093b c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3577d;

        /* renamed from: e  reason: collision with root package name */
        private int f3578e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3579f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f3580g;

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public a(Context context, String str) {
            this.f3580g = context.getApplicationContext();
            this.a = str;
        }

        private b b() {
            C0093b bVar = this.c;
            if (bVar == null && this.b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (bVar == C0093b.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                if (this.f3577d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f3578e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f3579f && this.f3580g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.b;
            Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
            return new b(c.c(keyGenParameterSpec), this.b);
        }

        public b a() {
            return Build.VERSION.SDK_INT >= 23 ? b() : new b(this.a, (Object) null);
        }

        public a c(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            } else if (this.a.equals(keyGenParameterSpec.getKeystoreAlias())) {
                this.b = keyGenParameterSpec;
                return this;
            } else {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.a + " vs " + keyGenParameterSpec.getKeystoreAlias());
            }
        }
    }

    /* renamed from: e.o.a.b$b  reason: collision with other inner class name */
    public enum C0093b {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(this.a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.a + ", isKeyStoreBacked=" + b() + "}";
    }
}
