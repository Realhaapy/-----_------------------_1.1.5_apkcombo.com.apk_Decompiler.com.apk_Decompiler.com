package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {
    private e.b.a.b.b<String, b> a = new e.b.a.b.b<>();
    private Bundle b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f1238d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1239e = true;

    public interface a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void b(e eVar, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            eVar.a(new f() {
                public void a(h hVar, e.b bVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (bVar == e.b.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (bVar == e.b.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f1239e = z;
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        e.b.a.b.b<K, V>.d k2 = this.a.k();
        while (k2.hasNext()) {
            Map.Entry entry = (Map.Entry) k2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.a.n(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.f1239e) {
            if (this.f1238d == null) {
                this.f1238d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1238d.b(cls.getName());
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
