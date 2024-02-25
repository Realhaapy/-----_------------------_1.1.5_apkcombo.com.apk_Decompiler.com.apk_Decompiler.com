package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.w;
import e.e.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class k1 extends Fragment implements g {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap<e, WeakReference<k1>> f2455h = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, LifecycleCallback> f2456e = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f2457f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Bundle f2458g;

    public static k1 f(e eVar) {
        k1 k1Var;
        WeakHashMap<e, WeakReference<k1>> weakHashMap = f2455h;
        WeakReference weakReference = weakHashMap.get(eVar);
        if (weakReference != null && (k1Var = (k1) weakReference.get()) != null) {
            return k1Var;
        }
        try {
            k1 k1Var2 = (k1) eVar.getSupportFragmentManager().i0("SupportLifecycleFragmentImpl");
            if (k1Var2 == null || k1Var2.isRemoving()) {
                k1Var2 = new k1();
                w m2 = eVar.getSupportFragmentManager().m();
                m2.d(k1Var2, "SupportLifecycleFragmentImpl");
                m2.g();
            }
            weakHashMap.put(eVar, new WeakReference(k1Var2));
            return k1Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f2456e.containsKey(str)) {
            this.f2456e.put(str, lifecycleCallback);
            if (this.f2457f > 0) {
                new f.e.a.c.d.c.e(Looper.getMainLooper()).post(new j1(this, lifecycleCallback, str));
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
        return (LifecycleCallback) cls.cast(this.f2456e.get(str));
    }

    public final /* synthetic */ Activity c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f2456e.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback e2 : this.f2456e.values()) {
            e2.e(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2457f = 1;
        this.f2458g = bundle;
        for (Map.Entry next : this.f2456e.entrySet()) {
            ((LifecycleCallback) next.getValue()).f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2457f = 5;
        for (LifecycleCallback g2 : this.f2456e.values()) {
            g2.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2457f = 3;
        for (LifecycleCallback h2 : this.f2456e.values()) {
            h2.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2456e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2457f = 2;
        for (LifecycleCallback j2 : this.f2456e.values()) {
            j2.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2457f = 4;
        for (LifecycleCallback k2 : this.f2456e.values()) {
            k2.k();
        }
    }
}
