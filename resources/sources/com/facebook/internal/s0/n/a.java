package com.facebook.internal.s0.n;

import android.os.Handler;
import android.os.Looper;
import com.facebook.g0;
import com.facebook.internal.s0.h;
import com.facebook.internal.s0.i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import m.y.d.l;

public final class a {
    public static final a a = new a();
    private static final Set<Object> b = Collections.newSetFromMap(new WeakHashMap());
    private static boolean c;

    /* renamed from: com.facebook.internal.s0.n.a$a  reason: collision with other inner class name */
    public static final class C0027a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Throwable f1520e;

        C0027a(Throwable th) {
            this.f1520e = th;
        }

        public void run() {
            throw new RuntimeException(this.f1520e);
        }
    }

    private a() {
    }

    public static final void a() {
        c = true;
    }

    public static final void b(Throwable th, Object obj) {
        l.d(obj, "o");
        if (c) {
            b.add(obj);
            g0 g0Var = g0.a;
            if (g0.g()) {
                h hVar = h.a;
                h.b(th);
                i.a aVar = i.a.a;
                i.a.b(th, i.c.CrashShield).g();
            }
            e(th);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object obj) {
        l.d(obj, "o");
        return b.contains(obj);
    }

    public static final void e(Throwable th) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new C0027a(th));
        }
    }
}
