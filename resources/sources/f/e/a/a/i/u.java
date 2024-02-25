package f.e.a.a.i;

import android.content.Context;
import f.e.a.a.i.a0.j.j0;
import java.io.Closeable;

abstract class u implements Closeable {

    interface a {
        u a();

        a b(Context context);
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public abstract j0 a();

    /* access modifiers changed from: package-private */
    public abstract t c();

    public void close() {
        a().close();
    }
}
