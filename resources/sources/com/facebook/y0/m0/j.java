package com.facebook.y0.m0;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.y0.m0.h;
import com.facebook.y0.m0.k;
import com.facebook.y0.m0.n.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import m.y.d.g;
import m.y.d.l;

public final class j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2003f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f2004g = "com.facebook.y0.m0.j";

    /* renamed from: h  reason: collision with root package name */
    private static j f2005h;
    private final Handler a;
    private final Set<Activity> b;
    private final Set<c> c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet<String> f2006d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, HashSet<String>> f2007e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final synchronized j a() {
            j a;
            if (j.a() == null) {
                j.c(new j((g) null));
            }
            a = j.a();
            if (a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return a;
        }

        public final Bundle b(com.facebook.y0.m0.n.a aVar, View view, View view2) {
            List<com.facebook.y0.m0.n.b> c;
            String str;
            int i2;
            int i3;
            List<com.facebook.y0.m0.n.c> list;
            View view3;
            com.facebook.y0.m0.n.a aVar2;
            c.a aVar3;
            String k2;
            String a;
            l.d(view, "rootView");
            l.d(view2, "hostView");
            Bundle bundle = new Bundle();
            if (!(aVar == null || (c = aVar.c()) == null)) {
                for (com.facebook.y0.m0.n.b next : c) {
                    if (next.d() != null) {
                        if (next.d().length() > 0) {
                            a = next.a();
                            k2 = next.d();
                            bundle.putString(a, k2);
                        }
                    }
                    if (next.b().size() > 0) {
                        if (l.a(next.c(), "relative")) {
                            aVar3 = c.f2008j;
                            list = next.b();
                            i3 = 0;
                            i2 = -1;
                            str = view2.getClass().getSimpleName();
                            l.c(str, "hostView.javaClass.simpleName");
                            aVar2 = aVar;
                            view3 = view2;
                        } else {
                            aVar3 = c.f2008j;
                            list = next.b();
                            i3 = 0;
                            i2 = -1;
                            str = view.getClass().getSimpleName();
                            l.c(str, "rootView.javaClass.simpleName");
                            aVar2 = aVar;
                            view3 = view;
                        }
                        Iterator<b> it = aVar3.a(aVar2, view3, list, i3, i2, str).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b next2 = it.next();
                            if (next2.a() != null) {
                                f fVar = f.a;
                                k2 = f.k(next2.a());
                                if (k2.length() > 0) {
                                    a = next.a();
                                    break;
                                }
                            }
                        }
                        bundle.putString(a, k2);
                    }
                }
            }
            return bundle;
        }
    }

    public static final class b {
        private final WeakReference<View> a;
        private final String b;

        public b(View view, String str) {
            l.d(view, "view");
            l.d(str, "viewMapKey");
            this.a = new WeakReference<>(view);
            this.b = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public final String b() {
            return this.b;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: j  reason: collision with root package name */
        public static final a f2008j = new a((g) null);

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference<View> f2009e;

        /* renamed from: f  reason: collision with root package name */
        private List<com.facebook.y0.m0.n.a> f2010f;

        /* renamed from: g  reason: collision with root package name */
        private final Handler f2011g;

        /* renamed from: h  reason: collision with root package name */
        private final HashSet<String> f2012h;

        /* renamed from: i  reason: collision with root package name */
        private final String f2013i;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            private final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt.getVisibility() == 0) {
                            l.c(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i3 >= childCount) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return arrayList;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
                if (m.y.d.l.a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L_0x0065;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private final boolean c(android.view.View r9, com.facebook.y0.m0.n.c r10, int r11) {
                /*
                    r8 = this;
                    int r0 = r10.e()
                    r1 = 0
                    r2 = -1
                    if (r0 == r2) goto L_0x000f
                    int r0 = r10.e()
                    if (r11 == r0) goto L_0x000f
                    return r1
                L_0x000f:
                    java.lang.Class r11 = r9.getClass()
                    java.lang.String r11 = r11.getCanonicalName()
                    java.lang.String r0 = r10.a()
                    boolean r11 = m.y.d.l.a(r11, r0)
                    r0 = 1
                    if (r11 != 0) goto L_0x0066
                    java.lang.String r11 = r10.a()
                    m.d0.f r2 = new m.d0.f
                    java.lang.String r3 = ".*android\\..*"
                    r2.<init>((java.lang.String) r3)
                    boolean r11 = r2.a(r11)
                    if (r11 == 0) goto L_0x0065
                    java.lang.String r2 = r10.a()
                    java.lang.String r11 = "."
                    java.lang.String[] r3 = new java.lang.String[]{r11}
                    r4 = 0
                    r5 = 0
                    r6 = 6
                    r7 = 0
                    java.util.List r11 = m.d0.q.U(r2, r3, r4, r5, r6, r7)
                    boolean r2 = r11.isEmpty()
                    r2 = r2 ^ r0
                    if (r2 == 0) goto L_0x0065
                    int r2 = r11.size()
                    int r2 = r2 - r0
                    java.lang.Object r11 = r11.get(r2)
                    java.lang.String r11 = (java.lang.String) r11
                    java.lang.Class r2 = r9.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    boolean r11 = m.y.d.l.a(r2, r11)
                    if (r11 != 0) goto L_0x0066
                L_0x0065:
                    return r1
                L_0x0066:
                    int r11 = r10.f()
                    com.facebook.y0.m0.n.c$a r2 = com.facebook.y0.m0.n.c.a.ID
                    int r2 = r2.c()
                    r11 = r11 & r2
                    if (r11 <= 0) goto L_0x007e
                    int r11 = r10.d()
                    int r2 = r9.getId()
                    if (r11 == r2) goto L_0x007e
                    return r1
                L_0x007e:
                    int r11 = r10.f()
                    com.facebook.y0.m0.n.c$a r2 = com.facebook.y0.m0.n.c.a.TEXT
                    int r2 = r2.c()
                    r11 = r11 & r2
                    java.lang.String r2 = ""
                    if (r11 <= 0) goto L_0x00ae
                    java.lang.String r11 = r10.h()
                    com.facebook.y0.m0.n.f r3 = com.facebook.y0.m0.n.f.a
                    java.lang.String r3 = com.facebook.y0.m0.n.f.k(r9)
                    com.facebook.internal.o0 r4 = com.facebook.internal.o0.a
                    java.lang.String r4 = com.facebook.internal.o0.A0(r3)
                    java.lang.String r4 = com.facebook.internal.o0.i(r4, r2)
                    boolean r3 = m.y.d.l.a(r11, r3)
                    if (r3 != 0) goto L_0x00ae
                    boolean r11 = m.y.d.l.a(r11, r4)
                    if (r11 != 0) goto L_0x00ae
                    return r1
                L_0x00ae:
                    int r11 = r10.f()
                    com.facebook.y0.m0.n.c$a r3 = com.facebook.y0.m0.n.c.a.DESCRIPTION
                    int r3 = r3.c()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x00e6
                    java.lang.String r11 = r10.b()
                    java.lang.CharSequence r3 = r9.getContentDescription()
                    if (r3 != 0) goto L_0x00c7
                    r3 = r2
                    goto L_0x00cf
                L_0x00c7:
                    java.lang.CharSequence r3 = r9.getContentDescription()
                    java.lang.String r3 = r3.toString()
                L_0x00cf:
                    com.facebook.internal.o0 r4 = com.facebook.internal.o0.a
                    java.lang.String r4 = com.facebook.internal.o0.A0(r3)
                    java.lang.String r4 = com.facebook.internal.o0.i(r4, r2)
                    boolean r3 = m.y.d.l.a(r11, r3)
                    if (r3 != 0) goto L_0x00e6
                    boolean r11 = m.y.d.l.a(r11, r4)
                    if (r11 != 0) goto L_0x00e6
                    return r1
                L_0x00e6:
                    int r11 = r10.f()
                    com.facebook.y0.m0.n.c$a r3 = com.facebook.y0.m0.n.c.a.HINT
                    int r3 = r3.c()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x0114
                    java.lang.String r11 = r10.c()
                    com.facebook.y0.m0.n.f r3 = com.facebook.y0.m0.n.f.a
                    java.lang.String r3 = com.facebook.y0.m0.n.f.i(r9)
                    com.facebook.internal.o0 r4 = com.facebook.internal.o0.a
                    java.lang.String r4 = com.facebook.internal.o0.A0(r3)
                    java.lang.String r4 = com.facebook.internal.o0.i(r4, r2)
                    boolean r3 = m.y.d.l.a(r11, r3)
                    if (r3 != 0) goto L_0x0114
                    boolean r11 = m.y.d.l.a(r11, r4)
                    if (r11 != 0) goto L_0x0114
                    return r1
                L_0x0114:
                    int r11 = r10.f()
                    com.facebook.y0.m0.n.c$a r3 = com.facebook.y0.m0.n.c.a.TAG
                    int r3 = r3.c()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x014c
                    java.lang.String r10 = r10.g()
                    java.lang.Object r11 = r9.getTag()
                    if (r11 != 0) goto L_0x012d
                    r9 = r2
                    goto L_0x0135
                L_0x012d:
                    java.lang.Object r9 = r9.getTag()
                    java.lang.String r9 = r9.toString()
                L_0x0135:
                    com.facebook.internal.o0 r11 = com.facebook.internal.o0.a
                    java.lang.String r11 = com.facebook.internal.o0.A0(r9)
                    java.lang.String r11 = com.facebook.internal.o0.i(r11, r2)
                    boolean r9 = m.y.d.l.a(r10, r9)
                    if (r9 != 0) goto L_0x014c
                    boolean r9 = m.y.d.l.a(r10, r11)
                    if (r9 != 0) goto L_0x014c
                    return r1
                L_0x014c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.m0.j.c.a.c(android.view.View, com.facebook.y0.m0.n.c, int):boolean");
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce A[LOOP:1: B:33:0x00b5->B:35:0x00ce, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0 A[EDGE_INSN: B:38:0x00d0->B:36:0x00d0 ?: BREAK  , SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List<com.facebook.y0.m0.j.b> a(com.facebook.y0.m0.n.a r10, android.view.View r11, java.util.List<com.facebook.y0.m0.n.c> r12, int r13, int r14, java.lang.String r15) {
                /*
                    r9 = this;
                    java.lang.String r0 = "path"
                    m.y.d.l.d(r12, r0)
                    java.lang.String r0 = "mapKey"
                    m.y.d.l.d(r15, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r15)
                    r15 = 46
                    r0.append(r15)
                    r0.append(r14)
                    java.lang.String r15 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r11 != 0) goto L_0x0026
                    return r0
                L_0x0026:
                    int r1 = r12.size()
                    r2 = 0
                    if (r13 < r1) goto L_0x0037
                    com.facebook.y0.m0.j$b r14 = new com.facebook.y0.m0.j$b
                    r14.<init>(r11, r15)
                L_0x0032:
                    r0.add(r14)
                    goto L_0x00a4
                L_0x0037:
                    java.lang.Object r1 = r12.get(r13)
                    com.facebook.y0.m0.n.c r1 = (com.facebook.y0.m0.n.c) r1
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = ".."
                    boolean r3 = m.y.d.l.a(r3, r4)
                    if (r3 == 0) goto L_0x007a
                    android.view.ViewParent r11 = r11.getParent()
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L_0x0079
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto L_0x0079
                    r6 = 0
                L_0x005e:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    r0.addAll(r1)
                    if (r8 < r14) goto L_0x0077
                    goto L_0x0079
                L_0x0077:
                    r6 = r8
                    goto L_0x005e
                L_0x0079:
                    return r0
                L_0x007a:
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = "."
                    boolean r3 = m.y.d.l.a(r3, r4)
                    if (r3 == 0) goto L_0x008f
                    com.facebook.y0.m0.j$b r10 = new com.facebook.y0.m0.j$b
                    r10.<init>(r11, r15)
                    r0.add(r10)
                    return r0
                L_0x008f:
                    boolean r14 = r9.c(r11, r1, r14)
                    if (r14 != 0) goto L_0x0096
                    return r0
                L_0x0096:
                    int r14 = r12.size()
                    int r14 = r14 + -1
                    if (r13 != r14) goto L_0x00a4
                    com.facebook.y0.m0.j$b r14 = new com.facebook.y0.m0.j$b
                    r14.<init>(r11, r15)
                    goto L_0x0032
                L_0x00a4:
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L_0x00d0
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto L_0x00d0
                    r6 = 0
                L_0x00b5:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    r0.addAll(r1)
                    if (r8 < r14) goto L_0x00ce
                    goto L_0x00d0
                L_0x00ce:
                    r6 = r8
                    goto L_0x00b5
                L_0x00d0:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.m0.j.c.a.a(com.facebook.y0.m0.n.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            l.d(handler, "handler");
            l.d(hashSet, "listenerSet");
            l.d(str, "activityName");
            this.f2009e = new WeakReference<>(view);
            this.f2011g = handler;
            this.f2012h = hashSet;
            this.f2013i = str;
            handler.postDelayed(this, 200);
        }

        private final void a(b bVar, View view, com.facebook.y0.m0.n.a aVar) {
            if (aVar != null) {
                try {
                    View a2 = bVar.a();
                    if (a2 != null) {
                        f fVar = f.a;
                        View a3 = f.a(a2);
                        if (a3 == null || !fVar.p(a2, a3)) {
                            String name = a2.getClass().getName();
                            l.c(name, "view.javaClass.name");
                            if (!p.t(name, "com.facebook.react", false, 2, (Object) null)) {
                                if (!(a2 instanceof AdapterView)) {
                                    b(bVar, view, aVar);
                                } else if (a2 instanceof ListView) {
                                    c(bVar, view, aVar);
                                }
                            }
                        } else {
                            d(bVar, view, aVar);
                        }
                    }
                } catch (Exception e2) {
                    o0 o0Var = o0.a;
                    o0.d0(j.b(), e2);
                }
            }
        }

        private final void b(b bVar, View view, com.facebook.y0.m0.n.a aVar) {
            boolean z;
            View a2 = bVar.a();
            if (a2 != null) {
                String b = bVar.b();
                f fVar = f.a;
                View.OnClickListener g2 = f.g(a2);
                if (g2 instanceof h.a) {
                    Objects.requireNonNull(g2, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    if (((h.a) g2).a()) {
                        z = true;
                        if (!this.f2012h.contains(b) && !z) {
                            h hVar = h.a;
                            a2.setOnClickListener(h.a(aVar, view, a2));
                            this.f2012h.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f2012h.contains(b)) {
                }
            }
        }

        private final void c(b bVar, View view, com.facebook.y0.m0.n.a aVar) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String b = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof h.b) {
                    Objects.requireNonNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    if (((h.b) onItemClickListener).a()) {
                        z = true;
                        if (!this.f2012h.contains(b) && !z) {
                            h hVar = h.a;
                            adapterView.setOnItemClickListener(h.b(aVar, view, adapterView));
                            this.f2012h.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f2012h.contains(b)) {
                }
            }
        }

        private final void d(b bVar, View view, com.facebook.y0.m0.n.a aVar) {
            boolean z;
            View a2 = bVar.a();
            if (a2 != null) {
                String b = bVar.b();
                f fVar = f.a;
                View.OnTouchListener h2 = f.h(a2);
                if (h2 instanceof k.a) {
                    Objects.requireNonNull(h2, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    if (((k.a) h2).a()) {
                        z = true;
                        if (!this.f2012h.contains(b) && !z) {
                            k kVar = k.a;
                            a2.setOnTouchListener(k.a(aVar, view, a2));
                            this.f2012h.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f2012h.contains(b)) {
                }
            }
        }

        private final void e(com.facebook.y0.m0.n.a aVar, View view) {
            if (aVar != null && view != null) {
                String a2 = aVar.a();
                if ((a2 == null || a2.length() == 0) || l.a(aVar.a(), this.f2013i)) {
                    List<com.facebook.y0.m0.n.c> d2 = aVar.d();
                    if (d2.size() <= 25) {
                        for (b a3 : f2008j.a(aVar, view, d2, 0, -1, this.f2013i)) {
                            a(a3, view, aVar);
                        }
                    }
                }
            }
        }

        private final void f() {
            List<com.facebook.y0.m0.n.a> list = this.f2010f;
            if (list != null && this.f2009e.get() != null) {
                int i2 = 0;
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        e(list.get(i2), (View) this.f2009e.get());
                        if (i3 <= size) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public void onGlobalLayout() {
            f();
        }

        public void onScrollChanged() {
            f();
        }

        public void run() {
            View view;
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    g0 g0Var = g0.a;
                    String d2 = g0.d();
                    d0 d0Var = d0.a;
                    c0 c = d0.c(d2);
                    if (c == null) {
                        return;
                    }
                    if (c.b()) {
                        List<com.facebook.y0.m0.n.a> b = com.facebook.y0.m0.n.a.f2023e.b(c.d());
                        this.f2010f = b;
                        if (b != null && (view = (View) this.f2009e.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            f();
                        }
                    }
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }
    }

    private j() {
        this.a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        l.c(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.f2006d = new HashSet<>();
        this.f2007e = new HashMap<>();
    }

    public /* synthetic */ j(g gVar) {
        this();
    }

    public static final /* synthetic */ j a() {
        Class<j> cls = j.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2005h;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        Class<j> cls = j.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2004g;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void c(j jVar) {
        Class<j> cls = j.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                f2005h = jVar;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void g() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                for (Activity next : this.b) {
                    if (next != null) {
                        com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
                        View e2 = com.facebook.y0.q0.g.e(next);
                        String simpleName = next.getClass().getSimpleName();
                        l.c(simpleName, "activity.javaClass.simpleName");
                        this.c.add(new c(e2, this.a, this.f2006d, simpleName));
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void i() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    g();
                } else {
                    this.a.post(new d(this));
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j(j jVar) {
        Class<j> cls = j.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(jVar, "this$0");
                jVar.g();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public final void d(Activity activity) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(activity, "activity");
                com.facebook.internal.g0 g0Var = com.facebook.internal.g0.a;
                if (!com.facebook.internal.g0.b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.b.add(activity);
                        this.f2006d.clear();
                        HashSet<String> hashSet = this.f2007e.get(Integer.valueOf(activity.hashCode()));
                        if (hashSet != null) {
                            this.f2006d = hashSet;
                        }
                        i();
                        return;
                    }
                    throw new com.facebook.c0("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void e(Activity activity) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(activity, "activity");
                this.f2007e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void h(Activity activity) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(activity, "activity");
                com.facebook.internal.g0 g0Var = com.facebook.internal.g0.a;
                if (!com.facebook.internal.g0.b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.b.remove(activity);
                        this.c.clear();
                        this.f2007e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f2006d.clone());
                        this.f2006d.clear();
                        return;
                    }
                    throw new com.facebook.c0("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
