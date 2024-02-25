package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class v {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, u> b = new HashMap<>();
    private q c;

    v() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        for (u next : this.b.values()) {
            if (next != null) {
                next.t(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u next : this.b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k2 = next.k();
                    printWriter.println(k2);
                    k2.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        u uVar = this.b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (u next : this.b.values()) {
            if (next != null) {
                Fragment k2 = next.k();
                if (k2.mFragmentId == i2) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u next : this.b.values()) {
            if (next != null) {
                Fragment k2 = next.k();
                if (str.equals(k2.mTag)) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (u next : this.b.values()) {
            if (next != null && (findFragmentByWho = next.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.a.get(i2);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u next : this.b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public u m(String str) {
        return this.b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public q o() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void p(u uVar) {
        Fragment k2 = uVar.k();
        if (!c(k2.mWho)) {
            this.b.put(k2.mWho, uVar);
            if (k2.mRetainInstanceChangedWhileDetached) {
                if (k2.mRetainInstance) {
                    this.c.f(k2);
                } else {
                    this.c.n(k2);
                }
                k2.mRetainInstanceChangedWhileDetached = false;
            }
            if (n.F0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(u uVar) {
        Fragment k2 = uVar.k();
        if (k2.mRetainInstance) {
            this.c.n(k2);
        }
        if (this.b.put(k2.mWho, (Object) null) != null && n.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k2);
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            u uVar = this.b.get(it.next().mWho);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u next : this.b.values()) {
            if (next != null) {
                next.m();
                Fragment k2 = next.k();
                if (k2.mRemoving && !k2.isInBackStack()) {
                    q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f2 = f(next);
                if (f2 != null) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.b.size());
        for (u next : this.b.values()) {
            if (next != null) {
                Fragment k2 = next.k();
                t r2 = next.r();
                arrayList.add(r2);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k2 + ": " + r2.f1116q);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public void x(q qVar) {
        this.c = qVar;
    }
}
