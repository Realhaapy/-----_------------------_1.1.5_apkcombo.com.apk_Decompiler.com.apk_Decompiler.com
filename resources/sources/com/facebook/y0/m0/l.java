package com.facebook.y0.m0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.g0;
import com.facebook.internal.i0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.m0;
import com.facebook.p0;
import com.facebook.u;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import m.y.d.g;
import m.y.d.s;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f2019e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f2020f;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final WeakReference<Activity> b;
    private Timer c;

    /* renamed from: d  reason: collision with root package name */
    private String f2021d = null;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void b(m0 m0Var) {
            m.y.d.l.d(m0Var, "it");
            i0.f1448e.b(p0.APP_EVENTS, l.b(), "App index sent to FB!");
        }

        public final j0 a(String str, u uVar, String str2, String str3) {
            m.y.d.l.d(str3, "requestType");
            if (str == null) {
                return null;
            }
            j0.c cVar = j0.f1546n;
            s sVar = s.a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            m.y.d.l.c(format, "java.lang.String.format(locale, format, *args)");
            j0 A = cVar.A(uVar, format, (JSONObject) null, (j0.b) null);
            Bundle t = A.t();
            if (t == null) {
                t = new Bundle();
            }
            t.putString("tree", str);
            com.facebook.y0.q0.g gVar = com.facebook.y0.q0.g.a;
            t.putString("app_version", com.facebook.y0.q0.g.d());
            t.putString("platform", "android");
            t.putString("request_type", str3);
            if (m.y.d.l.a(str3, "app_indexing")) {
                i iVar = i.a;
                t.putString("device_session_id", i.e());
            }
            A.G(t);
            A.C(f.a);
            return A;
        }
    }

    private static final class b implements Callable<String> {
        private final WeakReference<View> a;

        public b(View view) {
            m.y.d.l.d(view, "rootView");
            this.a = new WeakReference<>(view);
        }

        /* renamed from: a */
        public String call() {
            View view = (View) this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            m.y.d.l.c(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class c extends TimerTask {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f2022e;

        c(l lVar) {
            this.f2022e = lVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.facebook.y0.m0.l r0 = r7.f2022e     // Catch:{ Exception -> 0x00a3 }
                java.lang.ref.WeakReference r0 = com.facebook.y0.m0.l.a(r0)     // Catch:{ Exception -> 0x00a3 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00a3 }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.q0.g r1 = com.facebook.y0.q0.g.a     // Catch:{ Exception -> 0x00a3 }
                android.view.View r1 = com.facebook.y0.q0.g.e(r0)     // Catch:{ Exception -> 0x00a3 }
                if (r0 == 0) goto L_0x00a2
                if (r1 != 0) goto L_0x0018
                goto L_0x00a2
            L_0x0018:
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r2 = "activity.javaClass.simpleName"
                m.y.d.l.c(r0, r2)     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.i r2 = com.facebook.y0.m0.i.a     // Catch:{ Exception -> 0x00a3 }
                boolean r2 = com.facebook.y0.m0.i.f()     // Catch:{ Exception -> 0x00a3 }
                if (r2 != 0) goto L_0x002e
                return
            L_0x002e:
                com.facebook.internal.g0 r2 = com.facebook.internal.g0.a     // Catch:{ Exception -> 0x00a3 }
                boolean r2 = com.facebook.internal.g0.b()     // Catch:{ Exception -> 0x00a3 }
                if (r2 == 0) goto L_0x003c
                com.facebook.y0.m0.n.e r0 = com.facebook.y0.m0.n.e.a     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.n.e.a()     // Catch:{ Exception -> 0x00a3 }
                return
            L_0x003c:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.l$b r3 = new com.facebook.y0.m0.l$b     // Catch:{ Exception -> 0x00a3 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x00a3 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.l r3 = r7.f2022e     // Catch:{ Exception -> 0x00a3 }
                android.os.Handler r3 = com.facebook.y0.m0.l.c(r3)     // Catch:{ Exception -> 0x00a3 }
                r3.post(r2)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r3 = ""
                r4 = 1
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x005d }
                java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x005d }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x005d }
                r3 = r2
                goto L_0x0067
            L_0x005d:
                r2 = move-exception
                java.lang.String r4 = com.facebook.y0.m0.l.b()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x00a3 }
            L_0x0067:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a3 }
                r2.<init>()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r4 = "screenname"
                r2.put(r4, r0)     // Catch:{ JSONException -> 0x008a }
                java.lang.String r0 = "screenshot"
                r2.put(r0, r3)     // Catch:{ JSONException -> 0x008a }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008a }
                r0.<init>()     // Catch:{ JSONException -> 0x008a }
                com.facebook.y0.m0.n.f r3 = com.facebook.y0.m0.n.f.a     // Catch:{ JSONException -> 0x008a }
                org.json.JSONObject r1 = com.facebook.y0.m0.n.f.d(r1)     // Catch:{ JSONException -> 0x008a }
                r0.put(r1)     // Catch:{ JSONException -> 0x008a }
                java.lang.String r1 = "view"
                r2.put(r1, r0)     // Catch:{ JSONException -> 0x008a }
                goto L_0x0093
            L_0x008a:
                java.lang.String r0 = com.facebook.y0.m0.l.b()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00a3 }
            L_0x0093:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "viewTree.toString()"
                m.y.d.l.c(r0, r1)     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.l r1 = r7.f2022e     // Catch:{ Exception -> 0x00a3 }
                com.facebook.y0.m0.l.d(r1, r0)     // Catch:{ Exception -> 0x00a3 }
                goto L_0x00ad
            L_0x00a2:
                return
            L_0x00a3:
                r0 = move-exception
                java.lang.String r1 = com.facebook.y0.m0.l.b()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.m0.l.c.run():void");
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f2020f = canonicalName;
    }

    public l(Activity activity) {
        m.y.d.l.d(activity, "activity");
        this.b = new WeakReference<>(activity);
    }

    public static final /* synthetic */ WeakReference a(l lVar) {
        Class<l> cls = l.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return lVar.b;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        Class<l> cls = l.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return f2020f;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Handler c(l lVar) {
        Class<l> cls = l.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return lVar.a;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void d(l lVar, String str) {
        Class<l> cls = l.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                lVar.j(str);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void i(l lVar, TimerTask timerTask) {
        Class<l> cls = l.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                m.y.d.l.d(lVar, "this$0");
                m.y.d.l.d(timerTask, "$indexingTask");
                Timer timer = lVar.c;
                if (timer != null) {
                    timer.cancel();
                }
                lVar.f2021d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0, 1000);
                lVar.c = timer2;
            } catch (Exception e2) {
                Log.e(f2020f, "Error scheduling indexing job", e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    private final void j(String str) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                g0 g0Var = g0.a;
                g0.k().execute(new e(str, this));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void k(String str, l lVar) {
        Class<l> cls = l.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                m.y.d.l.d(str, "$tree");
                m.y.d.l.d(lVar, "this$0");
                o0 o0Var = o0.a;
                String h0 = o0.h0(str);
                u e2 = u.f1749p.e();
                if (h0 == null || !m.y.d.l.a(h0, lVar.f2021d)) {
                    a aVar = f2019e;
                    g0 g0Var = g0.a;
                    lVar.g(aVar.a(str, e2, g0.d(), "app_indexing"), h0);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public final void g(j0 j0Var, String str) {
        if (!com.facebook.internal.s0.n.a.d(this) && j0Var != null) {
            try {
                m0 j2 = j0Var.j();
                JSONObject c2 = j2.c();
                if (c2 != null) {
                    if (m.y.d.l.a("true", c2.optString("success"))) {
                        i0.f1448e.b(p0.APP_EVENTS, f2020f, "Successfully send UI component tree to server");
                        this.f2021d = str;
                    }
                    if (c2.has("is_app_indexing_enabled")) {
                        boolean z = c2.getBoolean("is_app_indexing_enabled");
                        i iVar = i.a;
                        i.n(z);
                        return;
                    }
                    return;
                }
                Log.e(f2020f, m.y.d.l.j("Error sending UI component tree to Facebook: ", j2.b()));
            } catch (JSONException e2) {
                Log.e(f2020f, "Error decoding server response.", e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void h() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                c cVar = new c(this);
                g0 g0Var = g0.a;
                g0.k().execute(new g(this, cVar));
            } catch (RejectedExecutionException e2) {
                Log.e(f2020f, "Error scheduling indexing job", e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void l() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                if (((Activity) this.b.get()) != null) {
                    Timer timer = this.c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.c = null;
                }
            } catch (Exception e2) {
                Log.e(f2020f, "Error unscheduling indexing job", e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
