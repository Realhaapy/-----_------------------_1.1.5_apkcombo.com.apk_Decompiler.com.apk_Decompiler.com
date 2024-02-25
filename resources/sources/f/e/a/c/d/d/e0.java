package f.e.a.c.d.d;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class e0 implements Map, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private transient f0 f3901e;

    /* renamed from: f  reason: collision with root package name */
    private transient f0 f3902f;

    /* renamed from: g  reason: collision with root package name */
    private transient y f3903g;

    e0() {
    }

    /* access modifiers changed from: package-private */
    public abstract y a();

    /* renamed from: b */
    public final y values() {
        y yVar = this.f3903g;
        if (yVar != null) {
            return yVar;
        }
        y a = a();
        this.f3903g = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    public abstract f0 c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract f0 d();

    /* renamed from: e */
    public final f0 entrySet() {
        f0 f0Var = this.f3901e;
        if (f0Var != null) {
            return f0Var;
        }
        f0 c = c();
        this.f3901e = c;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return h.a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        f0 f0Var = this.f3902f;
        if (f0Var != null) {
            return f0Var;
        }
        f0 d2 = d();
        this.f3902f = d2;
        return d2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
