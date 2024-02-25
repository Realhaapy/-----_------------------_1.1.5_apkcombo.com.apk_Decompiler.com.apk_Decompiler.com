package f.f.a.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

class a {
    private final String a;
    private final Context b;

    public a(Context context) {
        this.a = context.getPackageName() + ".FlutterSecureStoragePluginKey";
        this.b = context;
        b(context);
    }

    /* JADX INFO: finally extract failed */
    private void a(Context context) {
        AlgorithmParameterSpec algorithmParameterSpec;
        Locale locale = Locale.getDefault();
        try {
            h(Locale.ENGLISH);
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 25);
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            if (Build.VERSION.SDK_INT < 23) {
                algorithmParameterSpec = f(context, instance, instance2);
            } else {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(this.a, 3);
                algorithmParameterSpec = builder.setCertificateSubject(new X500Principal("CN=" + this.a)).setDigests(new String[]{"SHA-256"}).setBlockModes(new String[]{"ECB"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setCertificateSerialNumber(BigInteger.valueOf(1)).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
            }
            instance3.initialize(algorithmParameterSpec);
            instance3.generateKeyPair();
            h(locale);
        } catch (Throwable th) {
            h(locale);
            throw th;
        }
    }

    private void b(Context context) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        if (instance.getKey(this.a, (char[]) null) == null) {
            a(context);
        }
    }

    private PrivateKey c() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Key key = instance.getKey(this.a, (char[]) null);
        if (key == null) {
            throw new Exception("No key found under alias: " + this.a);
        } else if (key instanceof PrivateKey) {
            return (PrivateKey) key;
        } else {
            throw new Exception("Not an instance of a PrivateKey");
        }
    }

    private PublicKey d() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Certificate certificate = instance.getCertificate(this.a);
        if (certificate != null) {
            PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                return publicKey;
            }
            throw new Exception("No key found under alias: " + this.a);
        }
        throw new Exception("No certificate found under alias: " + this.a);
    }

    private Cipher e() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", Build.VERSION.SDK_INT < 23 ? "AndroidOpenSSL" : "AndroidKeyStoreBCWorkaround");
    }

    private AlgorithmParameterSpec f(Context context, Calendar calendar, Calendar calendar2) {
        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(this.a);
        return alias.setSubject(new X500Principal("CN=" + this.a)).setSerialNumber(BigInteger.valueOf(1)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
    }

    private void g(Context context, Configuration configuration) {
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    private void h(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.b.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            i(configuration, locale);
            this.b.createConfigurationContext(configuration);
            return;
        }
        j(configuration, locale);
        g(this.b, configuration);
    }

    @TargetApi(24)
    private void i(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    private void j(Configuration configuration, Locale locale) {
        configuration.locale = locale;
    }

    public Key k(byte[] bArr, String str) {
        PrivateKey c = c();
        Cipher e2 = e();
        e2.init(4, c);
        return e2.unwrap(bArr, str, 3);
    }

    public byte[] l(Key key) {
        PublicKey d2 = d();
        Cipher e2 = e();
        e2.init(3, d2);
        return e2.wrap(key);
    }
}
