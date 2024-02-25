package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class FragmentManager$6 implements f {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f964e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ s f965f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e f966g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ n f967h;

    public void a(h hVar, e.b bVar) {
        Bundle bundle;
        if (bVar == e.b.ON_START && (bundle = (Bundle) this.f967h.f1074j.get(this.f964e)) != null) {
            this.f965f.a(this.f964e, bundle);
            this.f967h.r(this.f964e);
        }
        if (bVar == e.b.ON_DESTROY) {
            this.f966g.c(this);
            this.f967h.f1075k.remove(this.f964e);
        }
    }
}
