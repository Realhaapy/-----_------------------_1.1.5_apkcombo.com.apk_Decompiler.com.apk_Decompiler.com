package f.e.c.a.y;

import f.e.c.a.z.a.a1;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.z;

public final class a0 extends z<a0, b> implements Object {
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile a1<a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private i value_ = i.f4106f;

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
            throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.y.a0.a.<clinit>():void");
        }
    }

    public static final class b extends z.a<a0, b> implements Object {
        private b() {
            super(a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(String str) {
            t();
            ((a0) this.f4250f).X(str);
            return this;
        }

        public b B(i iVar) {
            t();
            ((a0) this.f4250f).Y(iVar);
            return this;
        }

        public b z(i0 i0Var) {
            t();
            ((a0) this.f4250f).W(i0Var);
            return this;
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        z.L(a0.class, a0Var);
    }

    private a0() {
    }

    public static a0 R() {
        return DEFAULT_INSTANCE;
    }

    public static b V() {
        return (b) DEFAULT_INSTANCE.t();
    }

    /* access modifiers changed from: private */
    public void W(i0 i0Var) {
        this.outputPrefixType_ = i0Var.b();
    }

    /* access modifiers changed from: private */
    public void X(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void Y(i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    public i0 S() {
        i0 a2 = i0.a(this.outputPrefixType_);
        return a2 == null ? i0.UNRECOGNIZED : a2;
    }

    public String T() {
        return this.typeUrl_;
    }

    public i U() {
        return this.value_;
    }

    /* access modifiers changed from: protected */
    public final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b((a) null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<a0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (a0.class) {
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
