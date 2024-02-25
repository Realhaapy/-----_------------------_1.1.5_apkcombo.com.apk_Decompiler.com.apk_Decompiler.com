package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class u {
    private final HashMap<String, s> a = new HashMap<>();

    public final void a() {
        for (s a2 : this.a.values()) {
            a2.a();
        }
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final s b(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, s sVar) {
        s put = this.a.put(str, sVar);
        if (put != null) {
            put.d();
        }
    }
}
