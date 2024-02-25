package com.facebook.y0.u0;

import android.os.Bundle;
import android.view.View;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.u;
import com.facebook.y0.m0.n.f;
import com.facebook.y0.r0.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import m.y.d.g;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONException;
import org.json.JSONObject;

public final class j implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f2178i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private static final Set<Integer> f2179j = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final View.OnClickListener f2180e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<View> f2181f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<View> f2182g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2183h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            h hVar = h.a;
            if (h.e(str)) {
                g0 g0Var = g0.a;
                new com.facebook.y0.g0(g0.c()).e(str, str2);
            } else if (h.d(str)) {
                h(str, str2, fArr);
            }
        }

        /* access modifiers changed from: private */
        public final boolean f(String str, String str2) {
            f fVar = f.a;
            String d2 = f.d(str);
            if (d2 == null) {
                return false;
            }
            if (l.a(d2, "other")) {
                return true;
            }
            o0 o0Var = o0.a;
            o0.w0(new c(d2, str2));
            return true;
        }

        /* access modifiers changed from: private */
        public static final void g(String str, String str2) {
            l.d(str, "$queriedEvent");
            l.d(str2, "$buttonText");
            j.f2178i.e(str, str2, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i2 = 0;
                while (i2 < length) {
                    float f2 = fArr[i2];
                    i2++;
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                j0.c cVar = j0.f1546n;
                s sVar = s.a;
                Locale locale = Locale.US;
                g0 g0Var = g0.a;
                String format = String.format(locale, "%s/suggested_events", Arrays.copyOf(new Object[]{g0.d()}, 1));
                l.c(format, "java.lang.String.format(locale, format, *args)");
                j0 A = cVar.A((u) null, format, (JSONObject) null, (j0.b) null);
                A.G(bundle);
                A.j();
            } catch (JSONException unused) {
            }
        }

        public final void c(View view, View view2, String str) {
            l.d(view, "hostView");
            l.d(view2, "rootView");
            l.d(str, "activityName");
            int hashCode = view.hashCode();
            if (!j.a().contains(Integer.valueOf(hashCode))) {
                f fVar = f.a;
                f.r(view, new j(view, view2, str, (g) null));
                j.a().add(Integer.valueOf(hashCode));
            }
        }
    }

    private j(View view, View view2, String str) {
        f fVar = f.a;
        this.f2180e = f.g(view);
        this.f2181f = new WeakReference<>(view2);
        this.f2182g = new WeakReference<>(view);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f2183h = p.r(lowerCase, "activity", "", false, 4, (Object) null);
    }

    public /* synthetic */ j(View view, View view2, String str, g gVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set a() {
        if (com.facebook.internal.s0.n.a.d(j.class)) {
            return null;
        }
        try {
            return f2179j;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, j.class);
            return null;
        }
    }

    private final void c(String str, String str2, JSONObject jSONObject) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                o0 o0Var = o0.a;
                o0.w0(new d(jSONObject, str2, this, str));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void d(JSONObject jSONObject, String str, j jVar, String str2) {
        if (!com.facebook.internal.s0.n.a.d(j.class)) {
            try {
                l.d(jSONObject, "$viewData");
                l.d(str, "$buttonText");
                l.d(jVar, "this$0");
                l.d(str2, "$pathID");
                try {
                    o0 o0Var = o0.a;
                    g0 g0Var = g0.a;
                    String s2 = o0.s(g0.c());
                    if (s2 != null) {
                        String lowerCase = s2.toLowerCase();
                        l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                        e eVar = e.a;
                        float[] a2 = e.a(jSONObject, lowerCase);
                        String c = e.c(str, jVar.f2183h, lowerCase);
                        if (a2 != null) {
                            h hVar = h.a;
                            String[] q2 = h.q(h.a.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{c});
                            if (q2 != null) {
                                String str3 = q2[0];
                                f fVar = f.a;
                                f.a(str2, str3);
                                if (!l.a(str3, "other")) {
                                    f2178i.e(str3, str, a2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, j.class);
            }
        }
    }

    private final void e() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                View view = (View) this.f2181f.get();
                View view2 = (View) this.f2182g.get();
                if (view != null && view2 != null) {
                    try {
                        g gVar = g.a;
                        String d2 = g.d(view2);
                        f fVar = f.a;
                        String b = f.b(view2, d2);
                        if (b != null && !f2178i.f(b, d2)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", g.b(view, view2));
                            jSONObject.put("screenname", this.f2183h);
                            c(b, d2, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onClick(View view) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(view, "view");
                View.OnClickListener onClickListener = this.f2180e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                e();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
