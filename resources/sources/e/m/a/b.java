package e.m.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class b extends a {
    static boolean c = false;
    private final h a;
    private final c b;

    public static class a<D> extends m<D> {

        /* renamed from: k  reason: collision with root package name */
        private final int f3548k;

        /* renamed from: l  reason: collision with root package name */
        private final Bundle f3549l;

        /* renamed from: m  reason: collision with root package name */
        private final e.m.b.a<D> f3550m;

        /* renamed from: n  reason: collision with root package name */
        private h f3551n;

        /* renamed from: o  reason: collision with root package name */
        private C0090b<D> f3552o;

        /* renamed from: p  reason: collision with root package name */
        private e.m.b.a<D> f3553p;

        /* access modifiers changed from: protected */
        public void g() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f3550m.d();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void h() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f3550m.e();
            throw null;
        }

        public void i(n<? super D> nVar) {
            super.i(nVar);
            this.f3551n = null;
        }

        public void j(D d2) {
            super.j(d2);
            e.m.b.a<D> aVar = this.f3553p;
            if (aVar != null) {
                aVar.c();
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public e.m.b.a<D> k(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f3550m.a();
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3548k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3549l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3550m);
            e.m.b.a<D> aVar = this.f3550m;
            aVar.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void m() {
            h hVar = this.f3551n;
            C0090b<D> bVar = this.f3552o;
            if (hVar != null && bVar != null) {
                super.i(bVar);
                e(hVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3548k);
            sb.append(" : ");
            e.f.q.b.a(this.f3550m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: e.m.a.b$b  reason: collision with other inner class name */
    static class C0090b<D> implements n<D> {
    }

    static class c extends s {

        /* renamed from: d  reason: collision with root package name */
        private static final t.b f3554d = new a();
        private e.e.h<a> c = new e.e.h<>();

        static class a implements t.b {
            a() {
            }

            public <T extends s> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(u uVar) {
            return (c) new t(uVar, f3554d).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            if (this.c.l() <= 0) {
                this.c.d();
            } else {
                this.c.m(0).k(true);
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.c.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.c.l() > 0) {
                    a m2 = this.c.m(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.c.j(0));
                    printWriter.print(": ");
                    printWriter.println(m2.toString());
                    m2.l(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int l2 = this.c.l();
            for (int i2 = 0; i2 < l2; i2++) {
                this.c.m(i2).m();
            }
        }
    }

    b(h hVar, u uVar) {
        this.a = hVar;
        this.b = c.g(uVar);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.f(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        e.f.q.b.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
