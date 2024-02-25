package f.e.a.a.i;

import f.e.a.a.b;
import f.e.a.a.e;
import f.e.a.a.f;
import f.e.a.a.g;
import java.util.Set;

final class q implements g {
    private final Set<b> a;
    private final p b;
    private final s c;

    q(Set<b> set, p pVar, s sVar) {
        this.a = set;
        this.b = pVar;
        this.c = sVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new r(this.b, str, bVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.a}));
    }
}
