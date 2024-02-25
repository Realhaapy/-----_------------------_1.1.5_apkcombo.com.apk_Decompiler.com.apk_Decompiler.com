package com.facebook.y0.k0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.y0.g0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;

public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f1856i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Integer, f> f1857j = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f1858e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f1859f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<Activity> f1860g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f1861h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String c(String str, String str2) {
            return l.a("r2", str) ? new m.d0.f("[^\\d.]").b(str2, "") : str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
            if (r7.equals("r4") == false) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
            r8 = new m.d0.f("[^a-z]+").b(r8, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
            if (r7.equals("r5") == false) goto L_0x007d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L_0x0057;
                    case 3586: goto L_0x0040;
                    case 3587: goto L_0x0037;
                    case 3588: goto L_0x000c;
                    default: goto L_0x000a;
                }
            L_0x000a:
                goto L_0x007d
            L_0x000c:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0016
                goto L_0x007d
            L_0x0016:
                java.lang.String r0 = "-"
                boolean r1 = m.d0.q.w(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L_0x007d
                m.d0.f r1 = new m.d0.f
                r1.<init>((java.lang.String) r0)
                java.util.List r8 = r1.c(r8, r3)
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r8, r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L_0x007d
            L_0x0037:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0049
                goto L_0x007d
            L_0x0040:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0049
                goto L_0x007d
            L_0x0049:
                m.d0.f r0 = new m.d0.f
                java.lang.String r1 = "[^a-z]+"
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.b(r8, r1)
                goto L_0x007d
            L_0x0057:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0060
                goto L_0x007d
            L_0x0060:
                java.lang.String r0 = "m"
                boolean r4 = m.d0.p.t(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L_0x007c
                java.lang.String r4 = "b"
                boolean r4 = m.d0.p.t(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L_0x007c
                java.lang.String r4 = "ge"
                boolean r8 = m.d0.p.t(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L_0x0079
                goto L_0x007c
            L_0x0079:
                java.lang.String r8 = "f"
                goto L_0x007d
            L_0x007c:
                r8 = r0
            L_0x007d:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.k0.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            l.d(activity, "activity");
            int hashCode = activity.hashCode();
            Map a = f.a();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = a.get(valueOf);
            if (obj == null) {
                obj = new f(activity, (g) null);
                a.put(valueOf, obj);
            }
            f.b((f) obj);
        }
    }

    private f(Activity activity) {
        this.f1858e = new LinkedHashSet();
        this.f1859f = new Handler(Looper.getMainLooper());
        this.f1860g = new WeakReference<>(activity);
        this.f1861h = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map a() {
        if (com.facebook.internal.s0.n.a.d(f.class)) {
            return null;
        }
        try {
            return f1857j;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(f fVar) {
        if (!com.facebook.internal.s0.n.a.d(f.class)) {
            try {
                fVar.h();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, f.class);
            }
        }
    }

    private final void d(View view) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                g(new b(view, this));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e(View view, f fVar) {
        if (!com.facebook.internal.s0.n.a.d(f.class)) {
            try {
                l.d(view, "$view");
                l.d(fVar, "this$0");
                if (view instanceof EditText) {
                    fVar.f(view);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, f.class);
            }
        }
    }

    private final void f(View view) {
        String c;
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                String obj = ((EditText) view).getText().toString();
                if (obj != null) {
                    String obj2 = q.i0(obj).toString();
                    if (obj2 != null) {
                        String lowerCase = obj2.toLowerCase();
                        l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (!(lowerCase.length() == 0) && !this.f1858e.contains(lowerCase)) {
                            if (lowerCase.length() <= 100) {
                                this.f1858e.add(lowerCase);
                                HashMap hashMap = new HashMap();
                                d dVar = d.a;
                                List<String> b = d.b(view);
                                List<String> list = null;
                                for (e next : e.f1854d.c()) {
                                    a aVar = f1856i;
                                    String a2 = aVar.c(next.c(), lowerCase);
                                    if (next.d().length() > 0) {
                                        d dVar2 = d.a;
                                        if (!d.f(a2, next.d())) {
                                        }
                                    }
                                    d dVar3 = d.a;
                                    if (d.e(b, next.b())) {
                                        c = next.c();
                                    } else {
                                        if (list == null) {
                                            list = d.a(view);
                                        }
                                        if (d.e(list, next.b())) {
                                            c = next.c();
                                        }
                                    }
                                    aVar.d(hashMap, c, a2);
                                }
                                g0.b.e(hashMap);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void g(Runnable runnable) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f1859f.post(runnable);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void h() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (!this.f1861h.getAndSet(true)) {
                    com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                    View e2 = com.facebook.y0.q0.g.e((Activity) this.f1860g.get());
                    if (e2 != null) {
                        ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            if (view != null) {
                try {
                    d(view);
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                    return;
                }
            }
            if (view2 != null) {
                d(view2);
            }
        }
    }
}
