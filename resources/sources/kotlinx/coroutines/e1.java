package kotlinx.coroutines;

import java.io.Closeable;
import m.v.b;
import m.v.g;
import m.y.c.l;
import m.y.d.m;

public abstract class e1 extends f0 implements Closeable {

    public static final class a extends b<f0, e1> {

        /* renamed from: kotlinx.coroutines.e1$a$a  reason: collision with other inner class name */
        static final class C0137a extends m implements l<g.b, e1> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0137a f4787e = new C0137a();

            C0137a() {
                super(1);
            }

            /* renamed from: a */
            public final e1 invoke(g.b bVar) {
                if (bVar instanceof e1) {
                    return (e1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(f0.f4789e, C0137a.f4787e);
        }

        public /* synthetic */ a(m.y.d.g gVar) {
            this();
        }
    }

    static {
        new a((m.y.d.g) null);
    }
}
