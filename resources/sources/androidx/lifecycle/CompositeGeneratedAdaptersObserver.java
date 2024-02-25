package androidx.lifecycle;

import androidx.lifecycle.e;

class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: e  reason: collision with root package name */
    private final d[] f1188e;

    CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f1188e = dVarArr;
    }

    public void a(h hVar, e.b bVar) {
        l lVar = new l();
        for (d a : this.f1188e) {
            a.a(hVar, bVar, false, lVar);
        }
        for (d a2 : this.f1188e) {
            a2.a(hVar, bVar, true, lVar);
        }
    }
}
