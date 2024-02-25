package f.e.a.c.d.d;

import java.util.Iterator;
import java.util.Map;

final class d extends f0 {

    /* renamed from: g  reason: collision with root package name */
    private final transient e0 f3896g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final transient Object[] f3897h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final transient int f3898i;

    d(e0 e0Var, Object[] objArr, int i2, int i3) {
        this.f3896g = e0Var;
        this.f3897h = objArr;
        this.f3898i = i3;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f3896g.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    public final int h(Object[] objArr, int i2) {
        return k().h(objArr, 0);
    }

    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    public final i l() {
        return k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final b0 o() {
        return new c(this);
    }

    public final int size() {
        return this.f3898i;
    }
}
