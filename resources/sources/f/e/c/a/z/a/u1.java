package f.e.c.a.z.a;

public final class u1 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f4177d = c(3, 2);

    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: e  reason: collision with root package name */
        private final c f4191e;

        /* renamed from: f  reason: collision with root package name */
        private final int f4192f;

        private b(c cVar, int i2) {
            this.f4191e = cVar;
            this.f4192f = i2;
        }

        public c a() {
            return this.f4191e;
        }

        public int c() {
            return this.f4192f;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f4106f),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: e  reason: collision with root package name */
        private final Object f4203e;

        private c(Object obj) {
            this.f4203e = obj;
        }
    }

    public static int a(int i2) {
        return i2 >>> 3;
    }

    public static int b(int i2) {
        return i2 & 7;
    }

    static int c(int i2, int i3) {
        return (i2 << 3) | i3;
    }
}
