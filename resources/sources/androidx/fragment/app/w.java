package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class w {
    ArrayList<a> a = new ArrayList<>();
    int b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    int f1120d;

    /* renamed from: e  reason: collision with root package name */
    int f1121e;

    /* renamed from: f  reason: collision with root package name */
    int f1122f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1123g;

    /* renamed from: h  reason: collision with root package name */
    String f1124h;

    /* renamed from: i  reason: collision with root package name */
    int f1125i;

    /* renamed from: j  reason: collision with root package name */
    CharSequence f1126j;

    /* renamed from: k  reason: collision with root package name */
    int f1127k;

    /* renamed from: l  reason: collision with root package name */
    CharSequence f1128l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<String> f1129m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<String> f1130n;

    /* renamed from: o  reason: collision with root package name */
    boolean f1131o = false;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<Runnable> f1132p;

    static final class a {
        int a;
        Fragment b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f1133d;

        /* renamed from: e  reason: collision with root package name */
        int f1134e;

        /* renamed from: f  reason: collision with root package name */
        int f1135f;

        /* renamed from: g  reason: collision with root package name */
        e.c f1136g;

        /* renamed from: h  reason: collision with root package name */
        e.c f1137h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            e.c cVar = e.c.RESUMED;
            this.f1136g = cVar;
            this.f1137h = cVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
    }

    public w b(int i2, Fragment fragment, String str) {
        j(i2, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        b(viewGroup.getId(), fragment, str);
        return this;
    }

    public w d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.f1133d = this.c;
        aVar.f1134e = this.f1120d;
        aVar.f1135f = this.f1121e;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public w i() {
        if (!this.f1123g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void j(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.mFragmentId;
                if (i4 == 0 || i4 == i2) {
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i3, fragment));
    }

    public w k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w l(boolean z) {
        this.f1131o = z;
        return this;
    }
}
