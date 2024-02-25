package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class q extends s {

    /* renamed from: j  reason: collision with root package name */
    private static final t.b f1097j = new a();
    private final HashMap<String, Fragment> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, q> f1098d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, u> f1099e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1100f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1101g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1102h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1103i = false;

    class a implements t.b {
        a() {
        }

        public <T extends s> T a(Class<T> cls) {
            return new q(true);
        }
    }

    q(boolean z) {
        this.f1100f = z;
    }

    static q j(u uVar) {
        return (q) new t(uVar, f1097j).a(q.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1101g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.c.equals(qVar.c) && this.f1098d.equals(qVar.f1098d) && this.f1099e.equals(qVar.f1099e);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f1103i) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.c.containsKey(fragment.mWho)) {
            this.c.put(fragment.mWho, fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f1098d.get(fragment.mWho);
        if (qVar != null) {
            qVar.d();
            this.f1098d.remove(fragment.mWho);
        }
        u uVar = this.f1099e.get(fragment.mWho);
        if (uVar != null) {
            uVar.a();
            this.f1099e.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.c.get(str);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.f1098d.hashCode()) * 31) + this.f1099e.hashCode();
    }

    /* access modifiers changed from: package-private */
    public q i(Fragment fragment) {
        q qVar = this.f1098d.get(fragment.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f1100f);
        this.f1098d.put(fragment.mWho, qVar2);
        return qVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.c.values());
    }

    /* access modifiers changed from: package-private */
    public u l(Fragment fragment) {
        u uVar = this.f1099e.get(fragment.mWho);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        this.f1099e.put(fragment.mWho, uVar2);
        return uVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f1101g;
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (!this.f1103i) {
            if ((this.c.remove(fragment.mWho) != null) && n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (n.F0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z) {
        this.f1103i = z;
    }

    /* access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (!this.c.containsKey(fragment.mWho)) {
            return true;
        }
        return this.f1100f ? this.f1101g : !this.f1102h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1098d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1099e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
