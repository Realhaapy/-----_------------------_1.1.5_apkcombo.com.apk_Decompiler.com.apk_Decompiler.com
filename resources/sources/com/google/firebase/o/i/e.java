package com.google.firebase.o.i;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.o.b;
import com.google.firebase.o.c;
import com.google.firebase.o.d;
import com.google.firebase.o.f;
import com.google.firebase.o.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

final class e implements com.google.firebase.o.e, g {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f2857d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f2858e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Object> f2859f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2860g;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.f2857d = map;
        this.f2858e = map2;
        this.f2859f = dVar;
        this.f2860g = z;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) {
        t();
        this.c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    private e s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.c.name(str);
        return h(obj, false);
    }

    private void t() {
        if (this.b) {
            e eVar = this.a;
            if (eVar != null) {
                eVar.t();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public com.google.firebase.o.e a(c cVar, long j2) {
        k(cVar.b(), j2);
        return this;
    }

    public com.google.firebase.o.e b(c cVar, int i2) {
        j(cVar.b(), i2);
        return this;
    }

    public /* bridge */ /* synthetic */ g c(String str) {
        i(str);
        return this;
    }

    public /* bridge */ /* synthetic */ g d(boolean z) {
        m(z);
        return this;
    }

    public com.google.firebase.o.e e(c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    public e f(int i2) {
        t();
        this.c.value((long) i2);
        return this;
    }

    public e g(long j2) {
        t();
        this.c.value(j2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e h(Object obj, boolean z) {
        int i2 = 0;
        if (z && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                n((byte[]) obj);
                return this;
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    this.c.value((long) iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    g(jArr[i2]);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    this.c.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    this.c.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                for (Number h2 : (Number[]) obj) {
                    h(h2, false);
                }
            } else {
                for (Object h3 : (Object[]) obj) {
                    h(h3, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object h4 : (Collection) obj) {
                h(h4, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    l((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.c.endObject();
            return this;
        } else {
            d dVar = this.f2857d.get(obj.getClass());
            if (dVar != null) {
                q(dVar, obj, z);
                return this;
            }
            f fVar = this.f2858e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                i(((Enum) obj).name());
                return this;
            } else {
                q(this.f2859f, obj, z);
                return this;
            }
        }
    }

    public e i(String str) {
        t();
        this.c.value(str);
        return this;
    }

    public e j(String str, int i2) {
        t();
        this.c.name(str);
        f(i2);
        return this;
    }

    public e k(String str, long j2) {
        t();
        this.c.name(str);
        g(j2);
        return this;
    }

    public e l(String str, Object obj) {
        return this.f2860g ? s(str, obj) : r(str, obj);
    }

    public e m(boolean z) {
        t();
        this.c.value(z);
        return this;
    }

    public e n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        t();
        this.c.flush();
    }

    /* access modifiers changed from: package-private */
    public e q(d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        dVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
