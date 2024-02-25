package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.b0;
import com.facebook.c0;
import com.facebook.d0;
import com.facebook.e0;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.m0;
import com.facebook.u;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONObject;

public class q0 extends Dialog {

    /* renamed from: q  reason: collision with root package name */
    public static final b f1483q = new b((m.y.d.g) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final int f1484r = com.facebook.common.e.com_facebook_activity_theme;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static volatile int f1485s;
    private static d t;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f1486e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f1487f;

    /* renamed from: g  reason: collision with root package name */
    private e f1488g;

    /* renamed from: h  reason: collision with root package name */
    private WebView f1489h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ProgressDialog f1490i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public ImageView f1491j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f1492k;

    /* renamed from: l  reason: collision with root package name */
    private f f1493l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1494m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f1495n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f1496o;

    /* renamed from: p  reason: collision with root package name */
    private WindowManager.LayoutParams f1497p;

    public static class a {
        private Context a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private int f1498d;

        /* renamed from: e  reason: collision with root package name */
        private e f1499e;

        /* renamed from: f  reason: collision with root package name */
        private Bundle f1500f;

        /* renamed from: g  reason: collision with root package name */
        private u f1501g;

        public a(Context context, String str, Bundle bundle) {
            l.d(context, "context");
            l.d(str, "action");
            u.c cVar = u.f1749p;
            this.f1501g = cVar.e();
            if (!cVar.g()) {
                o0 o0Var = o0.a;
                String D = o0.D(context);
                if (D != null) {
                    this.b = D;
                } else {
                    throw new c0("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            b(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            l.d(context, "context");
            l.d(str2, "action");
            if (str == null) {
                o0 o0Var = o0.a;
                str = o0.D(context);
            }
            p0 p0Var = p0.a;
            p0.k(str, "applicationId");
            this.b = str;
            b(context, str2, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.f1500f = bundle;
            } else {
                this.f1500f = new Bundle();
            }
        }

        public q0 a() {
            u uVar = this.f1501g;
            if (uVar != null) {
                Bundle bundle = this.f1500f;
                String str = null;
                if (bundle != null) {
                    bundle.putString("app_id", uVar == null ? null : uVar.c());
                }
                Bundle bundle2 = this.f1500f;
                if (bundle2 != null) {
                    u uVar2 = this.f1501g;
                    if (uVar2 != null) {
                        str = uVar2.l();
                    }
                    bundle2.putString("access_token", str);
                }
            } else {
                Bundle bundle3 = this.f1500f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.b);
                }
            }
            b bVar = q0.f1483q;
            Context context = this.a;
            if (context != null) {
                return bVar.c(context, this.c, this.f1500f, this.f1498d, this.f1499e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String c() {
            return this.b;
        }

        public final Context d() {
            return this.a;
        }

        public final e e() {
            return this.f1499e;
        }

        public final Bundle f() {
            return this.f1500f;
        }

        public final int g() {
            return this.f1498d;
        }

        public final a h(e eVar) {
            this.f1499e = eVar;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(m.y.d.g gVar) {
            this();
        }

        public final int a() {
            p0 p0Var = p0.a;
            p0.l();
            return q0.f1485s;
        }

        /* access modifiers changed from: protected */
        public final void b(Context context) {
            if (context != null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if ((applicationInfo == null ? null : applicationInfo.metaData) != null && q0.f1485s == 0) {
                        e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }

        public final q0 c(Context context, String str, Bundle bundle, int i2, e eVar) {
            l.d(context, "context");
            q0.p(context);
            return new q0(context, str, bundle, i2, com.facebook.login.c0.FACEBOOK, eVar, (m.y.d.g) null);
        }

        public final q0 d(Context context, String str, Bundle bundle, int i2, com.facebook.login.c0 c0Var, e eVar) {
            l.d(context, "context");
            l.d(c0Var, "targetApp");
            q0.p(context);
            return new q0(context, str, bundle, i2, c0Var, eVar, (m.y.d.g) null);
        }

        public final void e(int i2) {
            if (i2 == 0) {
                i2 = q0.f1484r;
            }
            q0.f1485s = i2;
        }
    }

    private final class c extends WebViewClient {
        final /* synthetic */ q0 a;

        public c(q0 q0Var) {
            l.d(q0Var, "this$0");
            this.a = q0Var;
        }

        public void onPageFinished(WebView webView, String str) {
            ProgressDialog e2;
            l.d(webView, "view");
            l.d(str, "url");
            super.onPageFinished(webView, str);
            if (!this.a.f1495n && (e2 = this.a.f1490i) != null) {
                e2.dismiss();
            }
            FrameLayout a2 = this.a.f1492k;
            if (a2 != null) {
                a2.setBackgroundColor(0);
            }
            WebView o2 = this.a.o();
            if (o2 != null) {
                o2.setVisibility(0);
            }
            ImageView b = this.a.f1491j;
            if (b != null) {
                b.setVisibility(0);
            }
            this.a.f1496o = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog e2;
            l.d(webView, "view");
            l.d(str, "url");
            o0 o0Var = o0.a;
            o0.e0("FacebookSDK.WebDialog", l.j("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (!this.a.f1495n && (e2 = this.a.f1490i) != null) {
                e2.show();
            }
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            l.d(webView, "view");
            l.d(str, "description");
            l.d(str2, "failingUrl");
            super.onReceivedError(webView, i2, str, str2);
            this.a.y(new b0(str, i2, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            l.d(webView, "view");
            l.d(sslErrorHandler, "handler");
            l.d(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.a.y(new b0((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "view"
                m.y.d.l.d(r6, r0)
                java.lang.String r6 = "url"
                m.y.d.l.d(r7, r6)
                com.facebook.internal.o0 r6 = com.facebook.internal.o0.a
                java.lang.String r6 = "Redirect URL: "
                java.lang.String r6 = m.y.d.l.j(r6, r7)
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.o0.e0(r0, r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = r6.getPath()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0031
                java.lang.String r6 = r6.getPath()
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x0031
                r6 = 1
                goto L_0x0032
            L_0x0031:
                r6 = 0
            L_0x0032:
                com.facebook.internal.q0 r0 = r5.a
                java.lang.String r0 = r0.f1487f
                r3 = 2
                r4 = 0
                boolean r0 = m.d0.p.t(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00c2
                com.facebook.internal.q0 r6 = r5.a
                android.os.Bundle r6 = r6.w(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0054
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0054:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x0062
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x0062:
                if (r0 != 0) goto L_0x006a
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x006a:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                r3 = -1
                if (r2 == 0) goto L_0x007e
                boolean r4 = com.facebook.internal.o0.V(r2)
                if (r4 != 0) goto L_0x007e
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x007e }
                goto L_0x007f
            L_0x007e:
                r2 = -1
            L_0x007f:
                com.facebook.internal.o0 r4 = com.facebook.internal.o0.a
                boolean r4 = com.facebook.internal.o0.V(r7)
                if (r4 == 0) goto L_0x0095
                boolean r4 = com.facebook.internal.o0.V(r0)
                if (r4 == 0) goto L_0x0095
                if (r2 != r3) goto L_0x0095
                com.facebook.internal.q0 r7 = r5.a
                r7.z(r6)
                goto L_0x00c1
            L_0x0095:
                if (r7 == 0) goto L_0x00a8
                java.lang.String r6 = "access_denied"
                boolean r6 = m.y.d.l.a(r7, r6)
                if (r6 != 0) goto L_0x00ac
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = m.y.d.l.a(r7, r6)
                if (r6 == 0) goto L_0x00a8
                goto L_0x00ac
            L_0x00a8:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x00b2
            L_0x00ac:
                com.facebook.internal.q0 r6 = r5.a
                r6.cancel()
                goto L_0x00c1
            L_0x00b2:
                com.facebook.f0 r6 = new com.facebook.f0
                r6.<init>(r2, r7, r0)
                com.facebook.internal.q0 r7 = r5.a
                com.facebook.i0 r2 = new com.facebook.i0
                r2.<init>(r6, r0)
                r7.y(r2)
            L_0x00c1:
                return r1
            L_0x00c2:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = m.d0.p.t(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00d0
                com.facebook.internal.q0 r6 = r5.a
                r6.cancel()
                return r1
            L_0x00d0:
                if (r6 != 0) goto L_0x00f2
                java.lang.String r6 = "touch"
                boolean r6 = m.d0.q.w(r7, r6, r2, r3, r4)
                if (r6 == 0) goto L_0x00db
                goto L_0x00f2
            L_0x00db:
                com.facebook.internal.q0 r6 = r5.a     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00f0 }
                goto L_0x00f1
            L_0x00f0:
                r1 = 0
            L_0x00f1:
                return r1
            L_0x00f2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.q0.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public interface d {
        void a(WebView webView);
    }

    public interface e {
        void a(Bundle bundle, c0 c0Var);
    }

    private final class f extends AsyncTask<Void, Void, String[]> {
        private final String a;
        private final Bundle b;
        private Exception[] c = new Exception[0];

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q0 f1502d;

        public f(q0 q0Var, String str, Bundle bundle) {
            l.d(q0Var, "this$0");
            l.d(str, "action");
            l.d(bundle, "parameters");
            this.f1502d = q0Var;
            this.a = str;
            this.b = bundle;
        }

        /* access modifiers changed from: private */
        public static final void b(String[] strArr, int i2, f fVar, CountDownLatch countDownLatch, m0 m0Var) {
            l.d(strArr, "$results");
            l.d(fVar, "this$0");
            l.d(countDownLatch, "$latch");
            l.d(m0Var, "response");
            try {
                f0 b2 = m0Var.b();
                String str = "Error staging photo.";
                if (b2 != null) {
                    String c2 = b2.c();
                    if (c2 != null) {
                        str = c2;
                    }
                    throw new d0(m0Var, str);
                }
                JSONObject c3 = m0Var.c();
                if (c3 != null) {
                    String optString = c3.optString("uri");
                    if (optString != null) {
                        strArr[i2] = optString;
                        countDownLatch.countDown();
                        return;
                    }
                    throw new c0(str);
                }
                throw new c0(str);
            } catch (Exception e2) {
                fVar.c[i2] = e2;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(2:33|31)|41|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r12 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
            if (r12.hasNext() != false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
            ((com.facebook.k0) r12.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] a(java.lang.Void... r12) {
            /*
                r11 = this;
                boolean r0 = com.facebook.internal.s0.n.a.d(r11)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = "p0"
                m.y.d.l.d(r12, r0)     // Catch:{ all -> 0x00a2 }
                android.os.Bundle r12 = r11.b     // Catch:{ all -> 0x00a2 }
                java.lang.String r0 = "media"
                java.lang.String[] r12 = r12.getStringArray(r0)     // Catch:{ all -> 0x00a2 }
                if (r12 != 0) goto L_0x0018
                return r1
            L_0x0018:
                int r0 = r12.length     // Catch:{ all -> 0x00a2 }
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00a2 }
                int r2 = r12.length     // Catch:{ all -> 0x00a2 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x00a2 }
                r11.c = r2     // Catch:{ all -> 0x00a2 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x00a2 }
                int r3 = r12.length     // Catch:{ all -> 0x00a2 }
                r2.<init>(r3)     // Catch:{ all -> 0x00a2 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x00a2 }
                r3.<init>()     // Catch:{ all -> 0x00a2 }
                com.facebook.u$c r4 = com.facebook.u.f1749p     // Catch:{ all -> 0x00a2 }
                com.facebook.u r4 = r4.e()     // Catch:{ all -> 0x00a2 }
                r5 = 0
                r6 = 1
                int r7 = r12.length     // Catch:{ Exception -> 0x008d }
                int r7 = r7 + -1
                if (r7 < 0) goto L_0x0089
            L_0x0038:
                int r8 = r5 + 1
                boolean r9 = r11.isCancelled()     // Catch:{ Exception -> 0x008d }
                if (r9 == 0) goto L_0x0055
                java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x008d }
            L_0x0044:
                boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x008d }
                if (r0 == 0) goto L_0x0054
                java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x008d }
                com.facebook.k0 r0 = (com.facebook.k0) r0     // Catch:{ Exception -> 0x008d }
                r0.cancel(r6)     // Catch:{ Exception -> 0x008d }
                goto L_0x0044
            L_0x0054:
                return r1
            L_0x0055:
                r9 = r12[r5]     // Catch:{ Exception -> 0x008d }
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x008d }
                com.facebook.internal.o0 r10 = com.facebook.internal.o0.a     // Catch:{ Exception -> 0x008d }
                boolean r10 = com.facebook.internal.o0.X(r9)     // Catch:{ Exception -> 0x008d }
                if (r10 == 0) goto L_0x006d
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x008d }
                r0[r5] = r9     // Catch:{ Exception -> 0x008d }
                r2.countDown()     // Catch:{ Exception -> 0x008d }
                goto L_0x0084
            L_0x006d:
                com.facebook.internal.o r10 = new com.facebook.internal.o     // Catch:{ Exception -> 0x008d }
                r10.<init>(r0, r5, r11, r2)     // Catch:{ Exception -> 0x008d }
                com.facebook.share.a.a r5 = com.facebook.share.a.a.a     // Catch:{ Exception -> 0x008d }
                java.lang.String r5 = "uri"
                m.y.d.l.c(r9, r5)     // Catch:{ Exception -> 0x008d }
                com.facebook.j0 r5 = com.facebook.share.a.a.a(r4, r9, r10)     // Catch:{ Exception -> 0x008d }
                com.facebook.k0 r5 = r5.k()     // Catch:{ Exception -> 0x008d }
                r3.add(r5)     // Catch:{ Exception -> 0x008d }
            L_0x0084:
                if (r8 <= r7) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r5 = r8
                goto L_0x0038
            L_0x0089:
                r2.await()     // Catch:{ Exception -> 0x008d }
                return r0
            L_0x008d:
                java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x0091:
                boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r0 == 0) goto L_0x00a1
                java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x00a2 }
                com.facebook.k0 r0 = (com.facebook.k0) r0     // Catch:{ all -> 0x00a2 }
                r0.cancel(r6)     // Catch:{ all -> 0x00a2 }
                goto L_0x0091
            L_0x00a1:
                return r1
            L_0x00a2:
                r12 = move-exception
                com.facebook.internal.s0.n.a.b(r12, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.q0.f.a(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        public void d(String[] strArr) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    ProgressDialog e2 = this.f1502d.f1490i;
                    if (e2 != null) {
                        e2.dismiss();
                    }
                    Exception[] excArr = this.c;
                    int i2 = 0;
                    int length = excArr.length;
                    while (i2 < length) {
                        Exception exc = excArr[i2];
                        i2++;
                        if (exc != null) {
                            this.f1502d.y(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f1502d.y(new c0("Failed to stage photos for web dialog"));
                        return;
                    }
                    List a2 = e.a(strArr);
                    if (a2.contains((Object) null)) {
                        this.f1502d.y(new c0("Failed to stage photos for web dialog"));
                        return;
                    }
                    o0 o0Var = o0.a;
                    o0.k0(this.b, "media", new JSONArray(a2));
                    m0 m0Var = m0.a;
                    String b2 = m0.b();
                    StringBuilder sb = new StringBuilder();
                    g0 g0Var = g0.a;
                    sb.append(g0.m());
                    sb.append("/dialog/");
                    sb.append(this.a);
                    this.f1502d.f1486e = o0.e(b2, sb.toString(), this.b).toString();
                    ImageView b3 = this.f1502d.f1491j;
                    if (b3 != null) {
                        this.f1502d.C((b3.getDrawable().getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (com.facebook.internal.s0.n.a.d(this)) {
                return null;
            }
            try {
                return a((Void[]) objArr);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
                return null;
            }
        }

        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!com.facebook.internal.s0.n.a.d(this)) {
                try {
                    d((String[]) obj);
                } catch (Throwable th) {
                    com.facebook.internal.s0.n.a.b(th, this);
                }
            }
        }
    }

    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.facebook.login.c0.values().length];
            iArr[com.facebook.login.c0.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    public static final class h extends WebView {
        h(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected q0(Context context, String str) {
        this(context, str, f1483q.a());
        l.d(context, "context");
        l.d(str, "url");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private q0(Context context, String str, int i2) {
        super(context, i2 == 0 ? f1483q.a() : i2);
        this.f1487f = "fbconnect://success";
        this.f1486e = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private q0(Context context, String str, Bundle bundle, int i2, com.facebook.login.c0 c0Var, e eVar) {
        super(context, i2 == 0 ? f1483q.a() : i2);
        String str2;
        String str3;
        String str4 = "fbconnect://success";
        this.f1487f = str4;
        bundle = bundle == null ? new Bundle() : bundle;
        o0 o0Var = o0.a;
        str4 = o0.P(context) ? "fbconnect://chrome_os_success" : str4;
        this.f1487f = str4;
        bundle.putString("redirect_uri", str4);
        bundle.putString("display", "touch");
        g0 g0Var = g0.a;
        bundle.putString("client_id", g0.d());
        s sVar = s.a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{g0.r()}, 1));
        l.c(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f1488g = eVar;
        if (!l.a(str, "share") || !bundle.containsKey("media")) {
            if (g.a[c0Var.ordinal()] == 1) {
                m0 m0Var = m0.a;
                str3 = m0.j();
                str2 = "oauth/authorize";
            } else {
                m0 m0Var2 = m0.a;
                str3 = m0.b();
                str2 = g0.m() + "/dialog/" + str;
            }
            this.f1486e = o0.e(str3, str2, bundle).toString();
            return;
        }
        this.f1493l = new f(this, str, bundle);
    }

    public /* synthetic */ q0(Context context, String str, Bundle bundle, int i2, com.facebook.login.c0 c0Var, e eVar, m.y.d.g gVar) {
        this(context, str, bundle, i2, c0Var, eVar);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void C(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f1489h = new h(getContext());
        d dVar = t;
        if (dVar != null) {
            dVar.a(o());
        }
        WebView webView = this.f1489h;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.f1489h;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.f1489h;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.f1489h;
        WebSettings webSettings = null;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.f1489h;
        if (webView5 != null) {
            String str = this.f1486e;
            if (str != null) {
                webView5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        WebView webView6 = this.f1489h;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.f1489h;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.f1489h;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.f1489h;
        if (webView9 != null) {
            webSettings = webView9.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        WebView webView10 = this.f1489h;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.f1489h;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.f1489h;
        if (webView12 != null) {
            webView12.setOnTouchListener(p.f1477e);
        }
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.f1489h);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f1492k;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void l() {
        ImageView imageView = new ImageView(getContext());
        this.f1491j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new m(this));
        }
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.a.com_facebook_close);
        ImageView imageView2 = this.f1491j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f1491j;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public static final void m(q0 q0Var, View view) {
        l.d(q0Var, "this$0");
        q0Var.cancel();
    }

    private final int n(int i2, float f2, int i3, int i4) {
        int i5 = (int) (((float) i2) / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            d2 = 0.5d + ((((double) (i4 - i5)) / ((double) (i4 - i3))) * 0.5d);
        }
        return (int) (((double) i2) * d2);
    }

    protected static final void p(Context context) {
        f1483q.b(context);
    }

    /* access modifiers changed from: private */
    public static final void v(q0 q0Var, DialogInterface dialogInterface) {
        l.d(q0Var, "this$0");
        q0Var.cancel();
    }

    /* access modifiers changed from: protected */
    public final void A(String str) {
        l.d(str, "expectedRedirectUrl");
        this.f1487f = str;
    }

    public final void B(e eVar) {
        this.f1488g = eVar;
    }

    public void cancel() {
        if (this.f1488g != null && !this.f1494m) {
            y(new e0());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f1489h;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f1495n && (progressDialog = this.f1490i) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public final WebView o() {
        return this.f1489h;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f1495n = false;
        o0 o0Var = o0.a;
        Context context = getContext();
        l.c(context, "context");
        if (o0.i0(context) && (layoutParams = this.f1497p) != null) {
            IBinder iBinder = null;
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f1497p;
                if (layoutParams2 != null) {
                    iBinder = layoutParams2.token;
                }
                o0.e0("FacebookSDK.WebDialog", l.j("Set token on onAttachedToWindow(): ", iBinder));
            }
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f1490i = progressDialog;
        if (progressDialog != null) {
            progressDialog.requestWindowFeature(1);
        }
        ProgressDialog progressDialog2 = this.f1490i;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.d.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f1490i;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f1490i;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new n(this));
        }
        requestWindowFeature(1);
        this.f1492k = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        l();
        if (this.f1486e != null) {
            ImageView imageView = this.f1491j;
            if (imageView != null) {
                C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f1492k;
        if (frameLayout != null) {
            frameLayout.addView(this.f1491j, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f1492k;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void onDetachedFromWindow() {
        this.f1495n = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        l.d(keyEvent, "event");
        if (i2 == 4) {
            WebView webView = this.f1489h;
            if (webView != null) {
                if (l.a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f1489h;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        f fVar = this.f1493l;
        if (fVar != null) {
            if ((fVar == null ? null : fVar.getStatus()) == AsyncTask.Status.PENDING) {
                f fVar2 = this.f1493l;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f1490i;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        x();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        f fVar = this.f1493l;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.f1490i;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        l.d(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f1497p = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return this.f1494m;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return this.f1496o;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        o0 o0Var = o0.a;
        Bundle j0 = o0.j0(parse.getQuery());
        j0.putAll(o0.j0(parse.getFragment()));
        return j0;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = i2 < i3 ? i2 : i3;
        if (i2 < i3) {
            i2 = i3;
        }
        int min = Math.min(n(i4, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(n(i2, displayMetrics.density, 800, PlatformPlugin.DEFAULT_SYSTEM_UI), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    /* access modifiers changed from: protected */
    public final void y(Throwable th) {
        if (this.f1488g != null && !this.f1494m) {
            this.f1494m = true;
            c0 c0Var = th instanceof c0 ? (c0) th : new c0(th);
            e eVar = this.f1488g;
            if (eVar != null) {
                eVar.a((Bundle) null, c0Var);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void z(Bundle bundle) {
        e eVar = this.f1488g;
        if (eVar != null && !this.f1494m) {
            this.f1494m = true;
            if (eVar != null) {
                eVar.a(bundle, (c0) null);
            }
            dismiss();
        }
    }
}
