package androidx.lifecycle;

import androidx.lifecycle.e;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    static final Object f1192j = new Object();
    final Object a = new Object();
    private e.b.a.b.b<n<? super T>, LiveData<T>.defpackage.b> b = new e.b.a.b.b<>();
    int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1193d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f1194e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f1195f;

    /* renamed from: g  reason: collision with root package name */
    private int f1196g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1197h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1198i;

    class LifecycleBoundObserver extends LiveData<T>.defpackage.b implements f {

        /* renamed from: i  reason: collision with root package name */
        final h f1199i;

        LifecycleBoundObserver(h hVar, n<? super T> nVar) {
            super(nVar);
            this.f1199i = hVar;
        }

        public void a(h hVar, e.b bVar) {
            e.c b = this.f1199i.getLifecycle().b();
            if (b == e.c.DESTROYED) {
                LiveData.this.i(this.f1201e);
                return;
            }
            e.c cVar = null;
            while (cVar != b) {
                b(e());
                cVar = b;
                b = this.f1199i.getLifecycle().b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1199i.getLifecycle().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean d(h hVar) {
            return this.f1199i == hVar;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f1199i.getLifecycle().b().a(e.c.STARTED);
        }
    }

    private class a extends LiveData<T>.defpackage.b {
        a(LiveData liveData, n<? super T> nVar) {
            super(nVar);
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return true;
        }
    }

    private abstract class b {

        /* renamed from: e  reason: collision with root package name */
        final n<? super T> f1201e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1202f;

        /* renamed from: g  reason: collision with root package name */
        int f1203g = -1;

        b(n<? super T> nVar) {
            this.f1201e = nVar;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z) {
            if (z != this.f1202f) {
                this.f1202f = z;
                LiveData.this.b(z ? 1 : -1);
                if (this.f1202f) {
                    LiveData.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
        }

        /* access modifiers changed from: package-private */
        public boolean d(h hVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean e();
    }

    public LiveData() {
        Object obj = f1192j;
        this.f1195f = obj;
        this.f1194e = obj;
        this.f1196g = -1;
    }

    static void a(String str) {
        if (!e.b.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(LiveData<T>.defpackage.b bVar) {
        if (bVar.f1202f) {
            if (!bVar.e()) {
                bVar.b(false);
                return;
            }
            int i2 = bVar.f1203g;
            int i3 = this.f1196g;
            if (i2 < i3) {
                bVar.f1203g = i3;
                bVar.f1201e.a(this.f1194e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        int i3 = this.c;
        this.c = i2 + i3;
        if (!this.f1193d) {
            this.f1193d = true;
            while (true) {
                try {
                    int i4 = this.c;
                    if (i3 != i4) {
                        boolean z = i3 == 0 && i4 > 0;
                        boolean z2 = i3 > 0 && i4 == 0;
                        if (z) {
                            g();
                        } else if (z2) {
                            h();
                        }
                        i3 = i4;
                    } else {
                        return;
                    }
                } finally {
                    this.f1193d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(LiveData<T>.defpackage.b bVar) {
        if (this.f1197h) {
            this.f1198i = true;
            return;
        }
        this.f1197h = true;
        do {
            this.f1198i = false;
            if (bVar == null) {
                e.b.a.b.b<K, V>.d k2 = this.b.k();
                while (k2.hasNext()) {
                    c((b) ((Map.Entry) k2.next()).getValue());
                    if (this.f1198i) {
                        break;
                    }
                }
            } else {
                c(bVar);
                bVar = null;
            }
        } while (this.f1198i);
        this.f1197h = false;
    }

    public void e(h hVar, n<? super T> nVar) {
        a("observe");
        if (hVar.getLifecycle().b() != e.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, nVar);
            b n2 = this.b.n(nVar, lifecycleBoundObserver);
            if (n2 != null && !n2.d(hVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (n2 == null) {
                hVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void f(n<? super T> nVar) {
        a("observeForever");
        a aVar = new a(this, nVar);
        b n2 = this.b.n(nVar, aVar);
        if (n2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (n2 == null) {
            aVar.b(true);
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    public void i(n<? super T> nVar) {
        a("removeObserver");
        b o2 = this.b.o(nVar);
        if (o2 != null) {
            o2.c();
            o2.b(false);
        }
    }

    /* access modifiers changed from: protected */
    public void j(T t) {
        a("setValue");
        this.f1196g++;
        this.f1194e = t;
        d((LiveData<T>.defpackage.b) null);
    }
}
