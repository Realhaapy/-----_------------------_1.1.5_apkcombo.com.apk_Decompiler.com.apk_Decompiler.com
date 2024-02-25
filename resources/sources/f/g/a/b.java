package f.g.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import r.b.a.y.c;
import r.b.a.y.h;
import r.b.a.y.i;

final class b extends h {
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4582d;

    b(Context context, String str) {
        this.c = context;
        this.f4582d = str;
    }

    /* access modifiers changed from: protected */
    public void b() {
        InputStream inputStream = null;
        try {
            inputStream = this.c.getAssets().open(this.f4582d);
            c cVar = new c(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            i.f(cVar);
        } catch (IOException e2) {
            throw new IllegalStateException(this.f4582d + " missing from assets", e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
