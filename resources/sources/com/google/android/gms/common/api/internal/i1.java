package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import e.e.a;
import f.e.a.c.d.c.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class i1 extends Fragment implements g {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap<Activity, WeakReference<i1>> f2445h = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, LifecycleCallback> f2446e = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f2447f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Bundle f2448g;

    public static i1 f(Activity activity) {
        i1 i1Var;
        WeakHashMap<Activity, WeakReference<i1>> weakHashMap = f2445h;
        WeakReference weakReference = weakHashMap.get(activity);
        if (weakReference != null && (i1Var = (i1) weakReference.get()) != null) {
            return i1Var;
        }
        try {
            i1 i1Var2 = (i1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i1Var2 == null || i1Var2.isRemoving()) {
                i1Var2 = new i1();
                activity.getFragmentManager().beginTransaction().add(i1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i1Var2));
            return i1Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f2446e.containsKey(str)) {
            this.f2446e.put(str, lifecycleCallback);
            if (this.f2447f > 0) {
                new e(Looper.getMainLooper()).post(new h1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f2446e.get(str));
    }

    public final Activity c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f2446e.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback e2 : this.f2446e.values()) {
            e2.e(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2447f = 1;
        this.f2448g = bundle;
        for (Map.Entry next : this.f2446e.entrySet()) {
            ((LifecycleCallback) next.getValue()).f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2447f = 5;
        for (LifecycleCallback g2 : this.f2446e.values()) {
            g2.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2447f = 3;
        for (LifecycleCallback h2 : this.f2446e.values()) {
            h2.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2446e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2447f = 2;
        for (LifecycleCallback j2 : this.f2446e.values()) {
            j2.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2447f = 4;
        for (LifecycleCallback k2 : this.f2446e.values()) {
            k2.k();
        }
    }
}
