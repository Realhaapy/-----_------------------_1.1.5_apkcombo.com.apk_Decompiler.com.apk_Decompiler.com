package m.z;

import java.io.Serializable;
import m.w.b;
import m.y.d.g;

public abstract class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5064e = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final c f5065f = b.a.b();

    public static final class a extends c implements Serializable {

        /* renamed from: m.z.c$a$a  reason: collision with other inner class name */
        private static final class C0147a implements Serializable {

            /* renamed from: e  reason: collision with root package name */
            public static final C0147a f5066e = new C0147a();
            private static final long serialVersionUID = 0;

            private C0147a() {
            }

            private final Object readResolve() {
                return c.f5064e;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Object writeReplace() {
            return C0147a.f5066e;
        }

        public int b() {
            return c.f5065f.b();
        }
    }

    public abstract int b();
}
