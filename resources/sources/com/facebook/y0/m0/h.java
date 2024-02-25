package com.facebook.y0.m0;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.g0;
import com.facebook.y0.a0;
import com.facebook.y0.m0.n.f;
import com.facebook.y0.q0.g;
import java.lang.ref.WeakReference;
import m.y.d.l;

public final class h {
    public static final h a = new h();

    public static final class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        private com.facebook.y0.m0.n.a f1988e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f1989f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f1990g;

        /* renamed from: h  reason: collision with root package name */
        private View.OnClickListener f1991h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1992i = true;

        public a(com.facebook.y0.m0.n.a aVar, View view, View view2) {
            l.d(aVar, "mapping");
            l.d(view, "rootView");
            l.d(view2, "hostView");
            this.f1988e = aVar;
            this.f1989f = new WeakReference<>(view2);
            this.f1990g = new WeakReference<>(view);
            f fVar = f.a;
            this.f1991h = f.g(view2);
        }

        public final boolean a() {
            return this.f1992i;
        }

        public void onClick(View view) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    l.d(view, "view");
                    View.OnClickListener onClickListener = this.f1991h;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f1990g.get();
                    View view3 = (View) this.f1989f.get();
                    if (view2 != null && view3 != null) {
                        h hVar = h.a;
                        h.d(this.f1988e, view2, view3);
                    }
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }
    }

    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: e  reason: collision with root package name */
        private com.facebook.y0.m0.n.a f1993e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<AdapterView<?>> f1994f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f1995g;

        /* renamed from: h  reason: collision with root package name */
        private AdapterView.OnItemClickListener f1996h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1997i = true;

        public b(com.facebook.y0.m0.n.a aVar, View view, AdapterView<?> adapterView) {
            l.d(aVar, "mapping");
            l.d(view, "rootView");
            l.d(adapterView, "hostView");
            this.f1993e = aVar;
            this.f1994f = new WeakReference<>(adapterView);
            this.f1995g = new WeakReference<>(view);
            this.f1996h = adapterView.getOnItemClickListener();
        }

        public final boolean a() {
            return this.f1997i;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            l.d(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f1996h;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            View view2 = (View) this.f1995g.get();
            AdapterView adapterView2 = (AdapterView) this.f1994f.get();
            if (view2 != null && adapterView2 != null) {
                h hVar = h.a;
                h.d(this.f1993e, view2, adapterView2);
            }
        }
    }

    private h() {
    }

    public static final a a(com.facebook.y0.m0.n.a aVar, View view, View view2) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(aVar, "mapping");
            l.d(view, "rootView");
            l.d(view2, "hostView");
            return new a(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final b b(com.facebook.y0.m0.n.a aVar, View view, AdapterView<?> adapterView) {
        Class<h> cls = h.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(aVar, "mapping");
            l.d(view, "rootView");
            l.d(adapterView, "hostView");
            return new b(aVar, view, adapterView);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final void d(com.facebook.y0.m0.n.a aVar, View view, View view2) {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(aVar, "mapping");
                l.d(view, "rootView");
                l.d(view2, "hostView");
                String b2 = aVar.b();
                Bundle b3 = j.f2003f.b(aVar, view, view2);
                a.f(b3);
                g0 g0Var = g0.a;
                g0.k().execute(new a(b2, b3));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e(String str, Bundle bundle) {
        Class<h> cls = h.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                l.d(str, "$eventName");
                l.d(bundle, "$parameters");
                g0 g0Var = g0.a;
                a0.b.h(g0.c()).f(str, bundle);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public final void f(Bundle bundle) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(bundle, "parameters");
                String string = bundle.getString("_valueToSum");
                if (string != null) {
                    g gVar = g.a;
                    bundle.putDouble("_valueToSum", g.g(string));
                }
                bundle.putString("_is_fb_codeless", "1");
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
