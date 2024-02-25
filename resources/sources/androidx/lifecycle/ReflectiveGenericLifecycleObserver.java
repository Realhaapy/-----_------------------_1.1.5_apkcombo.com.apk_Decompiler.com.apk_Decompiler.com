package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.e;

class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: e  reason: collision with root package name */
    private final Object f1205e;

    /* renamed from: f  reason: collision with root package name */
    private final b.a f1206f;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1205e = obj;
        this.f1206f = b.c.c(obj.getClass());
    }

    public void a(h hVar, e.b bVar) {
        this.f1206f.a(hVar, bVar, this.f1205e);
    }
}
