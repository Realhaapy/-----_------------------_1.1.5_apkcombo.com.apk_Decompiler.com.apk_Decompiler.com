package f.e.c.a.v.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f.e.c.a.a0.o;
import f.e.c.a.l;
import f.e.c.a.y.c0;
import f.e.c.a.y.t;
import java.io.IOException;

public final class e implements l {
    private final SharedPreferences.Editor a;
    private final String b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            this.a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public void a(c0 c0Var) {
        if (!this.a.putString(this.b, o.b(c0Var.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public void b(t tVar) {
        if (!this.a.putString(this.b, o.b(tVar.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
