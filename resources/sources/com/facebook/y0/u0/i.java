package com.facebook.y0.u0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.y0.m0.n.d;
import com.facebook.y0.u0.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;

public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h  reason: collision with root package name */
    public static final a f2173h = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Integer, i> f2174i = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<Activity> f2175e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f2176f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f2177g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Activity activity) {
            l.d(activity, "activity");
            int hashCode = activity.hashCode();
            Map a = i.a();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = a.get(valueOf);
            if (obj == null) {
                obj = new i(activity, (g) null);
                a.put(valueOf, obj);
            }
            i.b((i) obj);
        }

        public final void b(Activity activity) {
            l.d(activity, "activity");
            i iVar = (i) i.a().remove(Integer.valueOf(activity.hashCode()));
            if (iVar != null) {
                i.c(iVar);
            }
        }
    }

    private i(Activity activity) {
        this.f2175e = new WeakReference<>(activity);
        this.f2176f = new Handler(Looper.getMainLooper());
        this.f2177g = new AtomicBoolean(false);
    }

    public /* synthetic */ i(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map a() {
        if (com.facebook.internal.s0.n.a.d(i.class)) {
            return null;
        }
        try {
            return f2174i;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, i.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(i iVar) {
        if (!com.facebook.internal.s0.n.a.d(i.class)) {
            try {
                iVar.g();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, i.class);
            }
        }
    }

    public static final /* synthetic */ void c(i iVar) {
        if (!com.facebook.internal.s0.n.a.d(i.class)) {
            try {
                iVar.h();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, i.class);
            }
        }
    }

    private final void e() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                b bVar = new b(this);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    bVar.run();
                } else {
                    this.f2176f.post(bVar);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(i iVar) {
        if (!com.facebook.internal.s0.n.a.d(i.class)) {
            try {
                l.d(iVar, "this$0");
                try {
                    com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                    View e2 = com.facebook.y0.q0.g.e((Activity) iVar.f2175e.get());
                    Activity activity = (Activity) iVar.f2175e.get();
                    if (e2 == null) {
                        return;
                    }
                    if (activity != null) {
                        g gVar2 = g.a;
                        for (View next : g.a(e2)) {
                            d dVar = d.a;
                            if (!d.g(next)) {
                                g gVar3 = g.a;
                                String d2 = g.d(next);
                                if ((d2.length() > 0) && d2.length() <= 300) {
                                    j.a aVar = j.f2178i;
                                    String localClassName = activity.getLocalClassName();
                                    l.c(localClassName, "activity.localClassName");
                                    aVar.c(next, e2, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, i.class);
            }
        }
    }

    private final void g() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (!this.f2177g.getAndSet(true)) {
                    com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                    View e2 = com.facebook.y0.q0.g.e((Activity) this.f2175e.get());
                    if (e2 != null) {
                        ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            e();
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void h() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (this.f2177g.getAndSet(false)) {
                    com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                    View e2 = com.facebook.y0.q0.g.e((Activity) this.f2175e.get());
                    if (e2 != null) {
                        ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onGlobalLayout() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                e();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
