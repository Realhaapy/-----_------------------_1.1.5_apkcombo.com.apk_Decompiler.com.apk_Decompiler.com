package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class r extends t.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?>[] f1227f;

    /* renamed from: g  reason: collision with root package name */
    private static final Class<?>[] f1228g;
    private final Application a;
    private final t.b b;
    private final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    private final e f1229d;

    /* renamed from: e  reason: collision with root package name */
    private final SavedStateRegistry f1230e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.q> r0 = androidx.lifecycle.q.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f1227f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f1228g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public r(Application application, c cVar, Bundle bundle) {
        this.f1230e = cVar.getSavedStateRegistry();
        this.f1229d = cVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        this.b = application != null ? t.a.c(application) : t.d.b();
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public <T extends s> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    public void b(s sVar) {
        SavedStateHandleController.b(sVar, this.f1230e, this.f1229d);
    }

    public <T extends s> T c(String str, Class<T> cls) {
        T newInstance;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor<T> d2 = (!isAssignableFrom || this.a == null) ? d(cls, f1228g) : d(cls, f1227f);
        if (d2 == null) {
            return this.b.a(cls);
        }
        SavedStateHandleController d3 = SavedStateHandleController.d(this.f1230e, this.f1229d, str, this.c);
        if (isAssignableFrom) {
            try {
                Application application = this.a;
                if (application != null) {
                    newInstance = d2.newInstance(new Object[]{application, d3.e()});
                    T t = (s) newInstance;
                    t.e("androidx.lifecycle.savedstate.vm.tag", d3);
                    return t;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        }
        newInstance = d2.newInstance(new Object[]{d3.e()});
        T t2 = (s) newInstance;
        t2.e("androidx.lifecycle.savedstate.vm.tag", d3);
        return t2;
    }
}
