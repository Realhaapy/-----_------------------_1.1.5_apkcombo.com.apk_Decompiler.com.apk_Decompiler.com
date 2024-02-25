package f.e.d.y.n;

import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.v;
import f.e.d.w;
import java.util.ArrayList;

public final class h extends v<Object> {
    public static final w b = new a();
    private final f a;

    class a implements w {
        a() {
        }

        public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.d.a0.b[] r0 = f.e.d.a0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.d.a0.b r1 = f.e.d.a0.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.d.a0.b r1 = f.e.d.a0.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.d.a0.b r1 = f.e.d.a0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.d.a0.b r1 = f.e.d.a0.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.d.a0.b r1 = f.e.d.a0.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.d.a0.b r1 = f.e.d.a0.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.n.h.b.<clinit>():void");
        }
    }

    h(f fVar) {
        this.a = fVar;
    }

    public Object c(f.e.d.a0.a aVar) {
        switch (b.a[aVar.d0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.L()) {
                    arrayList.add(c(aVar));
                }
                aVar.z();
                return arrayList;
            case 2:
                f.e.d.y.h hVar = new f.e.d.y.h();
                aVar.c();
                while (aVar.L()) {
                    hVar.put(aVar.X(), c(aVar));
                }
                aVar.B();
                return hVar;
            case 3:
                return aVar.b0();
            case 4:
                return Double.valueOf(aVar.U());
            case 5:
                return Boolean.valueOf(aVar.T());
            case 6:
                aVar.Z();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.S();
            return;
        }
        v<?> k2 = this.a.k(obj.getClass());
        if (k2 instanceof h) {
            cVar.o();
            cVar.B();
            return;
        }
        k2.e(cVar, obj);
    }
}
