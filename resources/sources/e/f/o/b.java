package e.f.o;

import android.graphics.Typeface;
import android.os.Handler;
import e.f.o.f;
import e.f.o.g;

class b {
    private final g.c a;
    private final Handler b;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g.c f3367e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f3368f;

        a(b bVar, g.c cVar, Typeface typeface) {
            this.f3367e = cVar;
            this.f3368f = typeface;
        }

        public void run() {
            this.f3367e.b(this.f3368f);
        }
    }

    /* renamed from: e.f.o.b$b  reason: collision with other inner class name */
    class C0073b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g.c f3369e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f3370f;

        C0073b(b bVar, g.c cVar, int i2) {
            this.f3369e = cVar;
            this.f3370f = i2;
        }

        public void run() {
            this.f3369e.a(this.f3370f);
        }
    }

    b(g.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i2) {
        this.b.post(new C0073b(this, this.a, i2));
    }

    private void c(Typeface typeface) {
        this.b.post(new a(this, this.a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}
