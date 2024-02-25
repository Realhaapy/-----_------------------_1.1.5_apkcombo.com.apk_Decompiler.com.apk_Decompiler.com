package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.c0;
import com.facebook.e0;
import com.facebook.g0;
import com.facebook.login.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.l;

public final class j0 {
    public static final j0 a;
    private static final String b;
    private static final List<e> c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<e> f1452d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f1453e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private static final Integer[] f1454f = {20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};

    private static final class a extends e {
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    private static final class b extends e {
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        public String d() {
            return "com.instagram.android";
        }

        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    private static final class c extends e {
        private final boolean g() {
            g0 g0Var = g0.a;
            return g0.c().getApplicationInfo().targetSdkVersion >= 30;
        }

        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        public String d() {
            return "com.facebook.katana";
        }

        public void f() {
            if (g()) {
                Log.w(j0.b(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private static final class d extends e {
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static abstract class e {
        private TreeSet<Integer> a;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            if (m.y.d.l.a(r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty()), java.lang.Boolean.FALSE) == false) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L_0x001b
                java.util.TreeSet<java.lang.Integer> r2 = r1.a     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x001b
                if (r2 != 0) goto L_0x000b
                r2 = 0
                goto L_0x0013
            L_0x000b:
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0038 }
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0038 }
            L_0x0013:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0038 }
                boolean r2 = m.y.d.l.a(r2, r0)     // Catch:{ all -> 0x0038 }
                if (r2 != 0) goto L_0x0023
            L_0x001b:
                com.facebook.internal.j0 r2 = com.facebook.internal.j0.a     // Catch:{ all -> 0x0038 }
                java.util.TreeSet r2 = com.facebook.internal.j0.a(r2, r1)     // Catch:{ all -> 0x0038 }
                r1.a = r2     // Catch:{ all -> 0x0038 }
            L_0x0023:
                java.util.TreeSet<java.lang.Integer> r2 = r1.a     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x0030
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x002e
                goto L_0x0030
            L_0x002e:
                r2 = 0
                goto L_0x0031
            L_0x0030:
                r2 = 1
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r1.f()     // Catch:{ all -> 0x0038 }
            L_0x0036:
                monitor-exit(r1)
                return
            L_0x0038:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.j0.e.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (m.y.d.l.a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L_0x0018;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.TreeSet<java.lang.Integer> b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.a
                if (r0 == 0) goto L_0x0018
                if (r0 != 0) goto L_0x0008
                r0 = 0
                goto L_0x0010
            L_0x0008:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L_0x0010:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = m.y.d.l.a(r0, r1)
                if (r0 != 0) goto L_0x001c
            L_0x0018:
                r0 = 0
                r2.a(r0)
            L_0x001c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.j0.e.b():java.util.TreeSet");
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    public static final class f {
        public static final a c = new a((m.y.d.g) null);
        /* access modifiers changed from: private */
        public e a;
        /* access modifiers changed from: private */
        public int b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(m.y.d.g gVar) {
                this();
            }

            public final f a(e eVar, int i2) {
                f fVar = new f((m.y.d.g) null);
                fVar.a = eVar;
                fVar.b = i2;
                return fVar;
            }

            public final f b() {
                f fVar = new f((m.y.d.g) null);
                fVar.b = -1;
                return fVar;
            }
        }

        private f() {
        }

        public /* synthetic */ f(m.y.d.g gVar) {
            this();
        }

        public final int c() {
            return this.b;
        }
    }

    private static final class g extends e {
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        j0 j0Var = new j0();
        a = j0Var;
        String name = j0.class.getName();
        l.c(name, "NativeProtocol::class.java.name");
        b = name;
        c = j0Var.e();
        f1452d = j0Var.d();
        j0Var.c();
    }

    private j0() {
    }

    public static final Intent A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            y yVar = y.a;
            String str = resolveService.serviceInfo.packageName;
            l.c(str, "resolveInfo.serviceInfo.packageName");
            if (!y.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet a(j0 j0Var, e eVar) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return j0Var.n(eVar);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final Map<String, List<e>> c() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f1452d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    private final List<e> d() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            ArrayList c2 = j.c(new a());
            c2.addAll(e());
            return c2;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    private final List<e> e() {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return j.c(new c(), new g());
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    private final Uri f(e eVar) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            l.c(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final int g(TreeSet<Integer> treeSet, int i2, int[] iArr) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return 0;
        }
        try {
            l.d(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i3 = -1;
            while (descendingIterator.hasNext()) {
                Integer next = descendingIterator.next();
                l.c(next, "fbAppVersion");
                i3 = Math.max(i3, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i3, i2);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return 0;
        }
    }

    public static final Bundle h(c0 c0Var) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls) || c0Var == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", c0Var.toString());
            if (c0Var instanceof e0) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final Intent i(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, p pVar, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(context2, "context");
            l.d(str, "applicationId");
            l.d(collection, "permissions");
            l.d(str2, "e2e");
            l.d(pVar, "defaultAudience");
            l.d(str3, "clientState");
            l.d(str4, "authType");
            b bVar = new b();
            return z(context2, a.j(bVar, str, collection, str2, z2, pVar, str3, str4, false, str5, z3, com.facebook.login.c0.INSTAGRAM, z4, z5, "", (String) null, (String) null), bVar);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final Intent j(e eVar, String str, Collection<String> collection, String str2, boolean z, p pVar, String str3, String str4, boolean z2, String str5, boolean z3, com.facebook.login.c0 c0Var, boolean z4, boolean z5, String str6, String str7, String str8) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            String c2 = eVar.c();
            if (c2 == null) {
                return null;
            }
            String str9 = str;
            Intent putExtra = new Intent().setClassName(eVar.d(), c2).putExtra("client_id", str);
            l.c(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            g0 g0Var = g0.a;
            putExtra.putExtra("facebook_sdk_version", g0.r());
            o0 o0Var = o0.a;
            if (!o0.W(collection)) {
                Collection<String> collection2 = collection;
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!o0.V(str2)) {
                String str10 = str2;
                putExtra.putExtra("e2e", str2);
            }
            String str11 = str3;
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", pVar.c());
            }
            putExtra.putExtra("legacy_override", g0.m());
            String str12 = str4;
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            String str13 = str5;
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", c0Var.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final Intent k(Context context) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            for (e next : c) {
                Intent A = A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(next.d()).addCategory("android.intent.category.DEFAULT"), next);
                if (A != null) {
                    return A;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final Intent l(Intent intent, Bundle bundle, c0 c0Var) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(intent, "requestIntent");
            UUID o2 = o(intent);
            if (o2 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", u(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", o2.toString());
            if (c0Var != null) {
                bundle2.putBundle("error", h(c0Var));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final List<Intent> m(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, p pVar, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "applicationId");
            l.d(collection, "permissions");
            l.d(str2, "e2e");
            l.d(pVar, "defaultAudience");
            l.d(str3, "clientState");
            l.d(str4, "authType");
            List<e> list = c;
            ArrayList arrayList = new ArrayList();
            for (e j2 : list) {
                ArrayList arrayList2 = arrayList;
                Intent j3 = a.j(j2, str, collection, str2, z2, pVar, str3, str4, z3, str5, z4, com.facebook.login.c0.FACEBOOK, z5, z6, str6, str7, str8);
                if (j3 != null) {
                    arrayList2.add(j3);
                }
                String str9 = str;
                Collection<String> collection2 = collection;
                String str10 = str2;
                p pVar2 = pVar;
                String str11 = str3;
                String str12 = str4;
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[LOOP:0: B:27:0x005b->B:30:0x0061, LOOP_START, SYNTHETIC, Splitter:B:27:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[SYNTHETIC, Splitter:B:35:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083 A[Catch:{ all -> 0x0087 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.TreeSet<java.lang.Integer> n(com.facebook.internal.j0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = com.facebook.internal.s0.n.a.d(r12)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            com.facebook.g0 r4 = com.facebook.g0.a     // Catch:{ all -> 0x0087 }
            android.content.Context r4 = com.facebook.g0.c()     // Catch:{ all -> 0x0087 }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ all -> 0x0087 }
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0087 }
            android.net.Uri r6 = r12.f(r13)     // Catch:{ all -> 0x0087 }
            android.content.Context r4 = com.facebook.g0.c()     // Catch:{ all -> 0x007e }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r13.d()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = m.y.d.l.j(r13, r8)     // Catch:{ all -> 0x007e }
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r13 = move-exception
            java.lang.String r4 = b     // Catch:{ all -> 0x007e }
            android.util.Log.e(r4, r1, r13)     // Catch:{ all -> 0x007e }
            r13 = r3
        L_0x0042:
            if (r13 == 0) goto L_0x0076
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ NullPointerException -> 0x0055, SecurityException -> 0x004f, IllegalArgumentException -> 0x004c }
            goto L_0x0059
        L_0x004c:
            java.lang.String r13 = b     // Catch:{ all -> 0x007e }
            goto L_0x0051
        L_0x004f:
            java.lang.String r13 = b     // Catch:{ all -> 0x007e }
        L_0x0051:
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x007e }
            goto L_0x0058
        L_0x0055:
            java.lang.String r13 = b     // Catch:{ all -> 0x007e }
            goto L_0x0051
        L_0x0058:
            r13 = r3
        L_0x0059:
            if (r13 == 0) goto L_0x0077
        L_0x005b:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0077
            int r1 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r13.getInt(r1)     // Catch:{ all -> 0x0071 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0071 }
            r2.add(r1)     // Catch:{ all -> 0x0071 }
            goto L_0x005b
        L_0x0071:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x0080
        L_0x0076:
            r13 = r3
        L_0x0077:
            if (r13 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r13.close()     // Catch:{ all -> 0x0087 }
        L_0x007d:
            return r2
        L_0x007e:
            r13 = move-exception
            r0 = r3
        L_0x0080:
            if (r0 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r0.close()     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r13     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r13 = move-exception
            com.facebook.internal.s0.n.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.j0.n(com.facebook.internal.j0$e):java.util.TreeSet");
    }

    public static final UUID o(Intent intent) {
        String str;
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls) || intent == null) {
            return null;
        }
        try {
            if (v(u(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final c0 p(Bundle bundle) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !p.l(string, "UserCanceled", true)) ? new c0(string2) : new e0(string2);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final f q(List<? extends e> list, int[] iArr) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            x();
            if (list == null) {
                return f.c.b();
            }
            for (e eVar : list) {
                int g2 = g(eVar.b(), s(), iArr);
                if (g2 != -1) {
                    return f.c.a(eVar, g2);
                }
            }
            return f.c.b();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final int r(int i2) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return 0;
        }
        try {
            return a.q(c, new int[]{i2}).c();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return 0;
        }
    }

    public static final int s() {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return 0;
        }
        try {
            return f1454f[0].intValue();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return 0;
        }
    }

    public static final Bundle t(Intent intent) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(intent, "intent");
            return !v(u(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final int u(Intent intent) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return 0;
        }
        try {
            l.d(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return 0;
        }
    }

    public static final boolean v(int i2) {
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            return m.t.b.i(f1454f, Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final void x() {
        Class<j0> cls = j0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                if (f1453e.compareAndSet(false, true)) {
                    g0 g0Var = g0.a;
                    g0.k().execute(j.f1451e);
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void y() {
        Class<j0> cls = j0.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                for (e a2 : c) {
                    a2.a(true);
                }
                f1453e.set(false);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    public static final Intent z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        Class<j0> cls = j0.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            y yVar = y.a;
            String str = resolveActivity.activityInfo.packageName;
            l.c(str, "resolveInfo.activityInfo.packageName");
            if (!y.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }
}
