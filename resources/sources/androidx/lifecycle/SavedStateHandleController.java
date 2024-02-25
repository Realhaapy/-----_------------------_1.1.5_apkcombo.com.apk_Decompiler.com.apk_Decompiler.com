package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;

final class SavedStateHandleController implements f {

    /* renamed from: e  reason: collision with root package name */
    private final String f1207e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1208f = false;

    /* renamed from: g  reason: collision with root package name */
    private final q f1209g;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        public void a(c cVar) {
            if (cVar instanceof v) {
                u viewModelStore = ((v) cVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
                for (String b : viewModelStore.c()) {
                    SavedStateHandleController.b(viewModelStore.b(b), savedStateRegistry, cVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, q qVar) {
        this.f1207e = str;
        this.f1209g = qVar;
    }

    static void b(s sVar, SavedStateRegistry savedStateRegistry, e eVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) sVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f()) {
            savedStateHandleController.c(savedStateRegistry, eVar);
            g(savedStateRegistry, eVar);
        }
    }

    static SavedStateHandleController d(SavedStateRegistry savedStateRegistry, e eVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, q.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.c(savedStateRegistry, eVar);
        g(savedStateRegistry, eVar);
        return savedStateHandleController;
    }

    private static void g(final SavedStateRegistry savedStateRegistry, final e eVar) {
        e.c b = eVar.b();
        if (b == e.c.INITIALIZED || b.a(e.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            eVar.a(new f() {
                public void a(h hVar, e.b bVar) {
                    if (bVar == e.b.ON_START) {
                        e.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    public void a(h hVar, e.b bVar) {
        if (bVar == e.b.ON_DESTROY) {
            this.f1208f = false;
            hVar.getLifecycle().c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(SavedStateRegistry savedStateRegistry, e eVar) {
        if (!this.f1208f) {
            this.f1208f = true;
            eVar.a(this);
            savedStateRegistry.d(this.f1207e, this.f1209g.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    public q e() {
        return this.f1209g;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f1208f;
    }
}
