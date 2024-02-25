package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends w implements n.o {

    /* renamed from: q  reason: collision with root package name */
    final n f968q;

    /* renamed from: r  reason: collision with root package name */
    boolean f969r;

    /* renamed from: s  reason: collision with root package name */
    int f970s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(n nVar) {
        super(nVar.q0(), nVar.t0() != null ? nVar.t0().f().getClassLoader() : null);
        this.f970s = -1;
        this.f968q = nVar;
    }

    private static boolean w(w.a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: package-private */
    public Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.f1137h = aVar.f1136g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1123g) {
            return true;
        }
        this.f968q.e(this);
        return true;
    }

    public int f() {
        return n(false);
    }

    public int g() {
        return n(true);
    }

    public void h() {
        i();
        this.f968q.c0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void j(int i2, Fragment fragment, String str, int i3) {
        super.j(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f968q;
    }

    public w k(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.f968q) {
            super.k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void m(int i2) {
        if (this.f1123g) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                w.a aVar = this.a.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int n(boolean z) {
        if (!this.f969r) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                o("  ", printWriter);
                printWriter.close();
            }
            this.f969r = true;
            this.f970s = this.f1123g ? this.f968q.j() : -1;
            this.f968q.Z(this, z);
            return this.f970s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1124h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f970s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f969r);
            if (this.f1122f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1122f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.f1120d == 0 && this.f1121e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1120d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1121e));
            }
            if (!(this.f1125i == 0 && this.f1126j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1125i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1126j);
            }
            if (!(this.f1127k == 0 && this.f1128l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1127k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1128l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                w.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.f1133d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1133d));
                    }
                    if (aVar.f1134e != 0 || aVar.f1135f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1134e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1135f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            w.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f1122f);
                fragment.setSharedElementNames(this.f1129m, this.f1130n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, false);
                    this.f968q.g(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.c1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.C0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, false);
                    this.f968q.o1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, false);
                    this.f968q.l(fragment);
                    break;
                case 8:
                    this.f968q.m1(fragment);
                    break;
                case 9:
                    this.f968q.m1((Fragment) null);
                    break;
                case 10:
                    this.f968q.l1(fragment, aVar.f1137h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!this.f1131o && aVar.a != 1 && fragment != null && !n.P) {
                this.f968q.P0(fragment);
            }
        }
        if (!this.f1131o && !n.P) {
            n nVar = this.f968q;
            nVar.Q0(nVar.f1081q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(n.h1(this.f1122f));
                fragment.setSharedElementNames(this.f1130n, this.f1129m);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, true);
                    this.f968q.c1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.o1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, true);
                    this.f968q.C0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.f1133d, aVar.f1134e, aVar.f1135f);
                    this.f968q.k1(fragment, true);
                    this.f968q.y(fragment);
                    break;
                case 8:
                    this.f968q.m1((Fragment) null);
                    break;
                case 9:
                    this.f968q.m1(fragment);
                    break;
                case 10:
                    this.f968q.l1(fragment, aVar.f1136g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!this.f1131o && aVar.a != 3 && fragment != null && !n.P) {
                this.f968q.P0(fragment);
            }
        }
        if (!this.f1131o && z && !n.P) {
            n nVar = this.f968q;
            nVar.Q0(nVar.f1081q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            w.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i4 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i2, new w.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.f1134e = aVar.f1134e;
                                aVar2.f1133d = aVar.f1133d;
                                aVar2.f1135f = aVar.f1135f;
                                this.a.add(i2, aVar2);
                                arrayList2.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i2);
                        i2--;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i2, new w.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.a.add(i2, new w.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.b;
                    }
                }
                i2++;
            }
            arrayList2.add(aVar.b);
            i2++;
        }
        return fragment2;
    }

    public String t() {
        return this.f1124h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f970s >= 0) {
            sb.append(" #");
            sb.append(this.f970s);
        }
        if (this.f1124h != null) {
            sb.append(" ");
            sb.append(this.f1124h);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean v(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (w(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f1132p != null) {
            for (int i2 = 0; i2 < this.f1132p.size(); i2++) {
                this.f1132p.get(i2).run();
            }
            this.f1132p = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void z(Fragment.l lVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            w.a aVar = this.a.get(i2);
            if (w(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }
}
