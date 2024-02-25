package f.e.d;

import f.e.d.y.h;
import java.util.Map;
import java.util.Set;

public final class o extends l {
    private final h<String, l> a = new h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void p(String str, l lVar) {
        h<String, l> hVar = this.a;
        if (lVar == null) {
            lVar = n.a;
        }
        hVar.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> q() {
        return this.a.entrySet();
    }

    public boolean r(String str) {
        return this.a.containsKey(str);
    }

    public l s(String str) {
        return this.a.remove(str);
    }
}
