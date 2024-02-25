package com.google.firebase.o.j;

import com.google.firebase.o.b;
import com.google.firebase.o.c;
import com.google.firebase.o.d;
import com.google.firebase.o.e;
import com.google.firebase.o.f;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class g implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f2866f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final c f2867g;

    /* renamed from: h  reason: collision with root package name */
    private static final c f2868h;

    /* renamed from: i  reason: collision with root package name */
    private static final d<Map.Entry<Object, Object>> f2869i = a.a;
    private OutputStream a;
    private final Map<Class<?>, d<?>> b;
    private final Map<Class<?>, f<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final d<Object> f2870d;

    /* renamed from: e  reason: collision with root package name */
    private final i f2871e = new i(this);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.o.j.f$a[] r0 = com.google.firebase.o.j.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.firebase.o.j.f$a r1 = com.google.firebase.o.j.f.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.o.j.f$a r1 = com.google.firebase.o.j.f.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.o.j.f$a r1 = com.google.firebase.o.j.f.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.o.j.g.a.<clinit>():void");
        }
    }

    static {
        c.b a2 = c.a("key");
        c b2 = c.b();
        b2.c(1);
        a2.b(b2.a());
        f2867g = a2.a();
        c.b a3 = c.a("value");
        c b3 = c.b();
        b3.c(2);
        a3.b(b3.a());
        f2868h = a3.a();
    }

    g(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.f2870d = dVar;
    }

    private static ByteBuffer l(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long m(d<T> dVar, T t) {
        OutputStream outputStream;
        d dVar2 = new d();
        try {
            outputStream = this.a;
            this.a = dVar2;
            dVar.a(t, this);
            this.a = outputStream;
            long a2 = dVar2.a();
            dVar2.close();
            return a2;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> g n(d<T> dVar, c cVar, T t, boolean z) {
        long m2 = m(dVar, t);
        if (z && m2 == 0) {
            return this;
        }
        t((r(cVar) << 3) | 2);
        u(m2);
        dVar.a(t, this);
        return this;
    }

    private <T> g o(f<T> fVar, c cVar, T t, boolean z) {
        this.f2871e.b(cVar, z);
        fVar.a(t, this.f2871e);
        return this;
    }

    private static f q(c cVar) {
        f fVar = (f) cVar.c(f.class);
        if (fVar != null) {
            return fVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int r(c cVar) {
        f fVar = (f) cVar.c(f.class);
        if (fVar != null) {
            return fVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    static /* synthetic */ void s(Map.Entry entry, e eVar) {
        eVar.e(f2867g, entry.getKey());
        eVar.e(f2868h, entry.getValue());
    }

    private void t(int i2) {
        while (true) {
            int i3 = (((long) (i2 & -128)) > 0 ? 1 : (((long) (i2 & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 != 0) {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & 127);
                return;
            }
        }
    }

    private void u(long j2) {
        while (true) {
            int i2 = ((-128 & j2) > 0 ? 1 : ((-128 & j2) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } else {
                outputStream.write(((int) j2) & 127);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ e a(c cVar, long j2) {
        i(cVar, j2);
        return this;
    }

    public /* bridge */ /* synthetic */ e b(c cVar, int i2) {
        g(cVar, i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e c(c cVar, double d2, boolean z) {
        if (z && d2 == 0.0d) {
            return this;
        }
        t((r(cVar) << 3) | 1);
        this.a.write(l(8).putDouble(d2).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e d(c cVar, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        t((r(cVar) << 3) | 5);
        this.a.write(l(4).putFloat(f2).array());
        return this;
    }

    public e e(c cVar, Object obj) {
        return f(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    public e f(c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            t((r(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f2866f);
            t(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object f2 : (Collection) obj) {
                f(cVar, f2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry n2 : ((Map) obj).entrySet()) {
                n(f2869i, cVar, n2, false);
            }
            return this;
        } else if (obj instanceof Double) {
            c(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            d(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            j(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            k(cVar, ((Boolean) obj).booleanValue(), z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            t((r(cVar) << 3) | 2);
            t(bArr.length);
            this.a.write(bArr);
            return this;
        } else {
            d dVar = this.b.get(obj.getClass());
            if (dVar != null) {
                n(dVar, cVar, obj, z);
                return this;
            }
            f fVar = this.c.get(obj.getClass());
            if (fVar != null) {
                o(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof e) {
                g(cVar, ((e) obj).b());
                return this;
            } else if (obj instanceof Enum) {
                g(cVar, ((Enum) obj).ordinal());
                return this;
            } else {
                n(this.f2870d, cVar, obj, z);
                return this;
            }
        }
    }

    public g g(c cVar, int i2) {
        h(cVar, i2, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    public g h(c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        f q2 = q(cVar);
        int i3 = a.a[q2.intEncoding().ordinal()];
        if (i3 == 1) {
            t(q2.tag() << 3);
            t(i2);
        } else if (i3 == 2) {
            t(q2.tag() << 3);
            t((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            t((q2.tag() << 3) | 5);
            this.a.write(l(4).putInt(i2).array());
        }
        return this;
    }

    public g i(c cVar, long j2) {
        j(cVar, j2, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    public g j(c cVar, long j2, boolean z) {
        if (z && j2 == 0) {
            return this;
        }
        f q2 = q(cVar);
        int i2 = a.a[q2.intEncoding().ordinal()];
        if (i2 == 1) {
            t(q2.tag() << 3);
            u(j2);
        } else if (i2 == 2) {
            t(q2.tag() << 3);
            u((j2 >> 63) ^ (j2 << 1));
        } else if (i2 == 3) {
            t((q2.tag() << 3) | 1);
            this.a.write(l(8).putLong(j2).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public g k(c cVar, boolean z, boolean z2) {
        h(cVar, z ? 1 : 0, z2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public g p(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = this.b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
