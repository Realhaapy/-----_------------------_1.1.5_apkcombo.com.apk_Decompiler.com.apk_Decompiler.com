package f.e.c.a.y;

import f.e.c.a.z.a.a1;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.q;
import f.e.c.a.z.a.z;

public final class w extends z<w, b> implements Object {
    /* access modifiers changed from: private */
    public static final w DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile a1<w> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private x params_;
    private int version_;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.e.c.a.z.a.z$f[] r0 = f.e.c.a.z.a.z.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.e.c.a.z.a.z$f r1 = f.e.c.a.z.a.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.y.w.a.<clinit>():void");
        }
    }

    public static final class b extends z.a<w, b> implements Object {
        private b() {
            super(w.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        z.L(w.class, wVar);
    }

    private w() {
    }

    public static w O() {
        return DEFAULT_INSTANCE;
    }

    public static w R(i iVar, q qVar) {
        return (w) z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    public int P() {
        return this.keySize_;
    }

    public x Q() {
        x xVar = this.params_;
        return xVar == null ? x.O() : xVar;
    }

    /* access modifiers changed from: protected */
    public final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new b((a) null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<w> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (w.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}