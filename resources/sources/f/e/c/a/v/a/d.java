package f.e.c.a.v.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f.e.c.a.a0.o;
import f.e.c.a.k;
import f.e.c.a.y.c0;
import f.e.c.a.y.t;
import f.e.c.a.z.a.q;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

public final class d implements k {
    private final SharedPreferences a;
    private final String b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            this.a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] b() {
        try {
            String string = this.a.getString(this.b, (String) null);
            if (string != null) {
                return o.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.b}));
        }
    }

    public t a() {
        return t.S(b(), q.b());
    }

    public c0 read() {
        return c0.X(b(), q.b());
    }
}
