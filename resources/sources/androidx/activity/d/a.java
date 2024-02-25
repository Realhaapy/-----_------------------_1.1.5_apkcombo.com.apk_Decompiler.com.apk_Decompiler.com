package androidx.activity.d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
    private final Set<b> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public void a(b bVar) {
        if (this.b != null) {
            bVar.a(this.b);
        }
        this.a.add(bVar);
    }

    public void b() {
        this.b = null;
    }

    public void c(Context context) {
        this.b = context;
        for (b a2 : this.a) {
            a2.a(context);
        }
    }

    public Context d() {
        return this.b;
    }

    public void e(b bVar) {
        this.a.remove(bVar);
    }
}
