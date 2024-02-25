package f.e.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i extends l implements Iterable<l> {

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f4332e = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f4332e.equals(this.f4332e));
    }

    public int hashCode() {
        return this.f4332e.hashCode();
    }

    public Iterator<l> iterator() {
        return this.f4332e.iterator();
    }

    public String k() {
        if (this.f4332e.size() == 1) {
            return this.f4332e.get(0).k();
        }
        throw new IllegalStateException();
    }

    public void p(l lVar) {
        if (lVar == null) {
            lVar = n.a;
        }
        this.f4332e.add(lVar);
    }
}
