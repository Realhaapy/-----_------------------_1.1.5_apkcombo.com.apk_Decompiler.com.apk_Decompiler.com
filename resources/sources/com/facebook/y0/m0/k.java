package com.facebook.y0.m0;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.y0.m0.n.f;
import java.lang.ref.WeakReference;
import m.y.d.l;

public final class k {
    public static final k a = new k();

    public static final class a implements View.OnTouchListener {

        /* renamed from: e  reason: collision with root package name */
        private final com.facebook.y0.m0.n.a f2014e;

        /* renamed from: f  reason: collision with root package name */
        private final WeakReference<View> f2015f;

        /* renamed from: g  reason: collision with root package name */
        private final WeakReference<View> f2016g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnTouchListener f2017h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2018i = true;

        public a(com.facebook.y0.m0.n.a aVar, View view, View view2) {
            l.d(aVar, "mapping");
            l.d(view, "rootView");
            l.d(view2, "hostView");
            this.f2014e = aVar;
            this.f2015f = new WeakReference<>(view2);
            this.f2016g = new WeakReference<>(view);
            f fVar = f.a;
            this.f2017h = f.h(view2);
        }

        public final boolean a() {
            return this.f2018i;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            l.d(view, "view");
            l.d(motionEvent, "motionEvent");
            View view2 = (View) this.f2016g.get();
            View view3 = (View) this.f2015f.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                h hVar = h.a;
                h.d(this.f2014e, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f2017h;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private k() {
    }

    public static final a a(com.facebook.y0.m0.n.a aVar, View view, View view2) {
        Class<k> cls = k.class;
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
}
