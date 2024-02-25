package f.h.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: g  reason: collision with root package name */
    static final Map<String, Integer> f4586g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f4587h = false;

    /* renamed from: i  reason: collision with root package name */
    private static int f4588i = 0;

    /* renamed from: j  reason: collision with root package name */
    static int f4589j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f4590k = new Object();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4591l = new Object();

    /* renamed from: m  reason: collision with root package name */
    static String f4592m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static int f4593n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static HandlerThread f4594o;

    /* renamed from: p  reason: collision with root package name */
    private static Handler f4595p;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: q  reason: collision with root package name */
    static final Map<Integer, a> f4596q = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Context f4597e;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f4598f;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MethodCall f4599e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4600f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f4601g;

        a(MethodCall methodCall, i iVar, a aVar) {
            this.f4599e = methodCall;
            this.f4600f = iVar;
            this.f4601g = aVar;
        }

        public void run() {
            boolean unused = c.this.M(this.f4601g, new f.h.a.f.e(this.f4599e, this.f4600f));
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MethodCall f4603e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4604f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f4605g;

        b(MethodCall methodCall, i iVar, a aVar) {
            this.f4603e = methodCall;
            this.f4604f = iVar;
            this.f4605g = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
            r6.o(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
            r6.n(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                f.h.a.f.e r0 = new f.h.a.f.e
                io.flutter.plugin.common.MethodCall r1 = r9.f4603e
                f.h.a.c$i r2 = r9.f4604f
                r0.<init>(r1, r2)
                boolean r1 = r0.c()
                boolean r0 = r0.f()
                io.flutter.plugin.common.MethodCall r2 = r9.f4603e
                java.lang.String r3 = "operations"
                java.lang.Object r2 = r2.argument(r3)
                java.util.List r2 = (java.util.List) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0024:
                boolean r4 = r2.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x00ea
                java.lang.Object r4 = r2.next()
                java.util.Map r4 = (java.util.Map) r4
                f.h.a.f.c r6 = new f.h.a.f.c
                r6.<init>(r4, r1)
                java.lang.String r4 = r6.j()
                r4.hashCode()
                r7 = -1
                int r8 = r4.hashCode()
                switch(r8) {
                    case -1319569547: goto L_0x0067;
                    case -1183792455: goto L_0x005c;
                    case -838846263: goto L_0x0051;
                    case 107944136: goto L_0x0046;
                    default: goto L_0x0045;
                }
            L_0x0045:
                goto L_0x0071
            L_0x0046:
                java.lang.String r8 = "query"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x004f
                goto L_0x0071
            L_0x004f:
                r7 = 3
                goto L_0x0071
            L_0x0051:
                java.lang.String r8 = "update"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x005a
                goto L_0x0071
            L_0x005a:
                r7 = 2
                goto L_0x0071
            L_0x005c:
                java.lang.String r8 = "insert"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x0065
                goto L_0x0071
            L_0x0065:
                r7 = 1
                goto L_0x0071
            L_0x0067:
                java.lang.String r8 = "execute"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x0070
                goto L_0x0071
            L_0x0070:
                r7 = 0
            L_0x0071:
                switch(r7) {
                    case 0: goto L_0x00ce;
                    case 1: goto L_0x00ba;
                    case 2: goto L_0x00a6;
                    case 3: goto L_0x0092;
                    default: goto L_0x0074;
                }
            L_0x0074:
                f.h.a.c$i r0 = r9.f4604f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Batch method '"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = "' not supported"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "bad_param"
                r0.error(r2, r1, r5)
                return
            L_0x0092:
                f.h.a.c r4 = f.h.a.c.this
                f.h.a.a r5 = r9.f4605g
                boolean r4 = r4.M(r5, r6)
                if (r4 == 0) goto L_0x009d
                goto L_0x00d8
            L_0x009d:
                if (r0 == 0) goto L_0x00a0
                goto L_0x00c7
            L_0x00a0:
                f.h.a.c$i r0 = r9.f4604f
                r6.m(r0)
                return
            L_0x00a6:
                f.h.a.c r4 = f.h.a.c.this
                f.h.a.a r5 = r9.f4605g
                boolean r4 = r4.O(r5, r6)
                if (r4 == 0) goto L_0x00b1
                goto L_0x00d8
            L_0x00b1:
                if (r0 == 0) goto L_0x00b4
                goto L_0x00c7
            L_0x00b4:
                f.h.a.c$i r0 = r9.f4604f
                r6.m(r0)
                return
            L_0x00ba:
                f.h.a.c r4 = f.h.a.c.this
                f.h.a.a r5 = r9.f4605g
                boolean r4 = r4.w(r5, r6)
                if (r4 == 0) goto L_0x00c5
                goto L_0x00d8
            L_0x00c5:
                if (r0 == 0) goto L_0x00c8
            L_0x00c7:
                goto L_0x00df
            L_0x00c8:
                f.h.a.c$i r0 = r9.f4604f
                r6.m(r0)
                return
            L_0x00ce:
                f.h.a.c r4 = f.h.a.c.this
                f.h.a.a r5 = r9.f4605g
                boolean r4 = r4.o(r5, r6)
                if (r4 == 0) goto L_0x00dd
            L_0x00d8:
                r6.o(r3)
                goto L_0x0024
            L_0x00dd:
                if (r0 == 0) goto L_0x00e4
            L_0x00df:
                r6.n(r3)
                goto L_0x0024
            L_0x00e4:
                f.h.a.c$i r0 = r9.f4604f
                r6.m(r0)
                return
            L_0x00ea:
                f.h.a.c$i r0 = r9.f4604f
                if (r1 == 0) goto L_0x00f2
                r0.success(r5)
                goto L_0x00f5
            L_0x00f2:
                r0.success(r3)
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.a.c.b.run():void");
        }
    }

    /* renamed from: f.h.a.c$c  reason: collision with other inner class name */
    class C0134c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MethodCall f4607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f4609g;

        C0134c(MethodCall methodCall, i iVar, a aVar) {
            this.f4607e = methodCall;
            this.f4608f = iVar;
            this.f4609g = aVar;
        }

        public void run() {
            boolean unused = c.this.w(this.f4609g, new f.h.a.f.e(this.f4607e, this.f4608f));
        }
    }

    class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f4611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MethodCall f4612f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f4613g;

        d(a aVar, MethodCall methodCall, i iVar) {
            this.f4611e = aVar;
            this.f4612f = methodCall;
            this.f4613g = iVar;
        }

        public void run() {
            if (c.this.p(this.f4611e, this.f4612f, this.f4613g) != null) {
                this.f4613g.success((Object) null);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MethodCall f4615e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4616f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f4617g;

        e(MethodCall methodCall, i iVar, a aVar) {
            this.f4615e = methodCall;
            this.f4616f = iVar;
            this.f4617g = aVar;
        }

        public void run() {
            boolean unused = c.this.O(this.f4617g, new f.h.a.f.e(this.f4615e, this.f4616f));
        }
    }

    class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f4619e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f4620f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f4621g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Boolean f4622h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f4623i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ MethodCall f4624j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f4625k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f4626l;

        f(boolean z, String str, i iVar, Boolean bool, a aVar, MethodCall methodCall, boolean z2, int i2) {
            this.f4619e = z;
            this.f4620f = str;
            this.f4621g = iVar;
            this.f4622h = bool;
            this.f4623i = aVar;
            this.f4624j = methodCall;
            this.f4625k = z2;
            this.f4626l = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
            r5.f4621g.success(f.h.a.c.y(r5.f4626l, false, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
            f.h.a.c.h(r5.f4627m, r1, new f.h.a.f.e(r5.f4624j, r5.f4621g), r5.f4623i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Object r0 = f.h.a.c.f4591l
                monitor-enter(r0)
                boolean r1 = r5.f4619e     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r5.f4620f     // Catch:{ all -> 0x00da }
                r1.<init>(r2)     // Catch:{ all -> 0x00da }
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00da }
                java.lang.String r1 = r1.getParent()     // Catch:{ all -> 0x00da }
                r2.<init>(r1)     // Catch:{ all -> 0x00da }
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                f.h.a.c$i r1 = r5.f4621g     // Catch:{ all -> 0x00da }
                java.lang.String r2 = "sqlite_error"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
                r3.<init>()     // Catch:{ all -> 0x00da }
                java.lang.String r4 = "open_failed "
                r3.append(r4)     // Catch:{ all -> 0x00da }
                java.lang.String r4 = r5.f4620f     // Catch:{ all -> 0x00da }
                r3.append(r4)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00da }
                r4 = 0
                r1.error(r2, r3, r4)     // Catch:{ all -> 0x00da }
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                return
            L_0x0048:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c7 }
                java.lang.Boolean r2 = r5.f4622h     // Catch:{ Exception -> 0x00c7 }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00c7 }
                if (r1 == 0) goto L_0x0058
                f.h.a.a r1 = r5.f4623i     // Catch:{ Exception -> 0x00c7 }
                r1.h()     // Catch:{ Exception -> 0x00c7 }
                goto L_0x005d
            L_0x0058:
                f.h.a.a r1 = r5.f4623i     // Catch:{ Exception -> 0x00c7 }
                r1.g()     // Catch:{ Exception -> 0x00c7 }
            L_0x005d:
                java.lang.Object r1 = f.h.a.c.f4590k     // Catch:{ all -> 0x00da }
                monitor-enter(r1)     // Catch:{ all -> 0x00da }
                boolean r2 = r5.f4625k     // Catch:{ all -> 0x00c4 }
                if (r2 == 0) goto L_0x0073
                java.util.Map<java.lang.String, java.lang.Integer> r2 = f.h.a.c.f4586g     // Catch:{ all -> 0x00c4 }
                java.lang.String r3 = r5.f4620f     // Catch:{ all -> 0x00c4 }
                int r4 = r5.f4626l     // Catch:{ all -> 0x00c4 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c4 }
                r2.put(r3, r4)     // Catch:{ all -> 0x00c4 }
            L_0x0073:
                java.util.Map<java.lang.Integer, f.h.a.a> r2 = f.h.a.c.f4596q     // Catch:{ all -> 0x00c4 }
                int r3 = r5.f4626l     // Catch:{ all -> 0x00c4 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c4 }
                f.h.a.a r4 = r5.f4623i     // Catch:{ all -> 0x00c4 }
                r2.put(r3, r4)     // Catch:{ all -> 0x00c4 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                f.h.a.a r1 = r5.f4623i     // Catch:{ all -> 0x00da }
                int r1 = r1.f4583d     // Catch:{ all -> 0x00da }
                boolean r1 = f.h.a.b.b(r1)     // Catch:{ all -> 0x00da }
                if (r1 == 0) goto L_0x00b6
                java.lang.String r1 = "Sqflite"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
                r2.<init>()     // Catch:{ all -> 0x00da }
                f.h.a.a r3 = r5.f4623i     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r3.d()     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = "opened "
                r2.append(r3)     // Catch:{ all -> 0x00da }
                int r3 = r5.f4626l     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = " "
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r5.f4620f     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00da }
                android.util.Log.d(r1, r2)     // Catch:{ all -> 0x00da }
            L_0x00b6:
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                f.h.a.c$i r0 = r5.f4621g
                int r1 = r5.f4626l
                r2 = 0
                java.util.Map r1 = f.h.a.c.y(r1, r2, r2)
                r0.success(r1)
                return
            L_0x00c4:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                throw r2     // Catch:{ all -> 0x00da }
            L_0x00c7:
                r1 = move-exception
                f.h.a.f.e r2 = new f.h.a.f.e     // Catch:{ all -> 0x00da }
                io.flutter.plugin.common.MethodCall r3 = r5.f4624j     // Catch:{ all -> 0x00da }
                f.h.a.c$i r4 = r5.f4621g     // Catch:{ all -> 0x00da }
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00da }
                f.h.a.c r3 = f.h.a.c.this     // Catch:{ all -> 0x00da }
                f.h.a.a r4 = r5.f4623i     // Catch:{ all -> 0x00da }
                r3.v(r1, r2, r4)     // Catch:{ all -> 0x00da }
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                return
            L_0x00da:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.a.c.f.run():void");
        }
    }

    class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f4628e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f4629f;

        g(a aVar, i iVar) {
            this.f4628e = aVar;
            this.f4629f = iVar;
        }

        public void run() {
            synchronized (c.f4591l) {
                c.this.k(this.f4628e);
            }
            this.f4629f.success((Object) null);
        }
    }

    class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f4631e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f4632f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f4633g;

        h(a aVar, String str, i iVar) {
            this.f4631e = aVar;
            this.f4632f = str;
            this.f4633g = iVar;
        }

        public void run() {
            synchronized (c.f4591l) {
                a aVar = this.f4631e;
                if (aVar != null) {
                    c.this.k(aVar);
                }
                try {
                    if (b.c(c.f4589j)) {
                        Log.d("Sqflite", "delete database " + this.f4632f);
                    }
                    a.b(this.f4632f);
                } catch (Exception e2) {
                    Log.e("Sqflite", "error " + e2 + " while closing database " + c.f4593n);
                }
            }
            this.f4633g.success((Object) null);
        }
    }

    private class i implements MethodChannel.Result {
        final Handler a;
        /* access modifiers changed from: private */
        public final MethodChannel.Result b;

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f4635e;

            a(Object obj) {
                this.f4635e = obj;
            }

            public void run() {
                i.this.b.success(this.f4635e);
            }
        }

        class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f4637e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f4638f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object f4639g;

            b(String str, String str2, Object obj) {
                this.f4637e = str;
                this.f4638f = str2;
                this.f4639g = obj;
            }

            public void run() {
                i.this.b.error(this.f4637e, this.f4638f, this.f4639g);
            }
        }

        /* renamed from: f.h.a.c$i$c  reason: collision with other inner class name */
        class C0135c implements Runnable {
            C0135c() {
            }

            public void run() {
                i.this.b.notImplemented();
            }
        }

        private i(c cVar, MethodChannel.Result result) {
            this.a = new Handler(Looper.getMainLooper());
            this.b = result;
        }

        /* synthetic */ i(c cVar, MethodChannel.Result result, a aVar) {
            this(cVar, result);
        }

        public void error(String str, String str2, Object obj) {
            this.a.post(new b(str, str2, obj));
        }

        public void notImplemented() {
            this.a.post(new C0135c());
        }

        public void success(Object obj) {
            this.a.post(new a(obj));
        }
    }

    private void A(MethodCall methodCall, MethodChannel.Result result) {
        a t = t(methodCall, result);
        if (t != null) {
            f4595p.post(new b(methodCall, new i(this, result, (a) null), t));
        }
    }

    private void B(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        a t = t(methodCall, result);
        if (t != null) {
            if (b.b(t.f4583d)) {
                Log.d("Sqflite", t.d() + "closing " + intValue + " " + t.b);
            }
            String str = t.b;
            synchronized (f4590k) {
                f4596q.remove(Integer.valueOf(intValue));
                if (t.a) {
                    f4586g.remove(str);
                }
            }
            f4595p.post(new g(t, new i(this, result, (a) null)));
        }
    }

    private void C(MethodCall methodCall, MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) methodCall.argument("cmd"))) {
            int i2 = f4589j;
            if (i2 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i2));
            }
            Map<Integer, a> map = f4596q;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    a aVar = (a) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", aVar.b);
                    hashMap3.put("singleInstance", Boolean.valueOf(aVar.a));
                    int i3 = aVar.f4583d;
                    if (i3 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i3));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        result.success(hashMap);
    }

    private void D(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.e.a.a = Boolean.TRUE.equals(methodCall.arguments());
        f.h.a.e.a.c = f.h.a.e.a.b && f.h.a.e.a.a;
        if (!f.h.a.e.a.a) {
            f4589j = 0;
        } else if (f.h.a.e.a.c) {
            f4589j = 2;
        } else if (f.h.a.e.a.a) {
            f4589j = 1;
        }
        result.success((Object) null);
    }

    private void E(MethodCall methodCall, MethodChannel.Result result) {
        a aVar;
        Map<Integer, a> map;
        String str = (String) methodCall.argument("path");
        synchronized (f4590k) {
            if (b.c(f4589j)) {
                Log.d("Sqflite", "Look for " + str + " in " + f4586g.keySet());
            }
            Map<String, Integer> map2 = f4586g;
            Integer num = map2.get(str);
            if (num == null || (aVar = map.get(num)) == null || !aVar.f4584e.isOpen()) {
                aVar = null;
            } else {
                if (b.c(f4589j)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.d());
                    sb.append("found single instance ");
                    sb.append(aVar.f4585f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                (map = f4596q).remove(num);
                map2.remove(str);
            }
        }
        h hVar = new h(aVar, str, new i(this, result, (a) null));
        Handler handler = f4595p;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    private void F(MethodCall methodCall, MethodChannel.Result result) {
        a t = t(methodCall, result);
        if (t != null) {
            f4595p.post(new d(t, methodCall, new i(this, result, (a) null)));
        }
    }

    private void H(MethodCall methodCall, MethodChannel.Result result) {
        a t = t(methodCall, result);
        if (t != null) {
            f4595p.post(new C0134c(methodCall, new i(this, result, (a) null), t));
        }
    }

    private void I(MethodCall methodCall, MethodChannel.Result result) {
        int i2;
        a aVar;
        String str = (String) methodCall.argument("path");
        Boolean bool = (Boolean) methodCall.argument("readOnly");
        boolean x = x(str);
        boolean z = !Boolean.FALSE.equals(methodCall.argument("singleInstance")) && !x;
        if (z) {
            synchronized (f4590k) {
                if (b.c(f4589j)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f4586g.keySet());
                }
                Integer num = f4586g.get(str);
                if (!(num == null || (aVar = f4596q.get(num)) == null)) {
                    if (aVar.f4584e.isOpen()) {
                        if (b.c(f4589j)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.d());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f4585f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        result.success(y(num.intValue(), true, aVar.f4585f));
                        return;
                    } else if (b.c(f4589j)) {
                        Log.d("Sqflite", aVar.d() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f4590k;
        synchronized (obj) {
            i2 = f4593n + 1;
            f4593n = i2;
        }
        a aVar2 = new a(str, i2, z, f4589j);
        i iVar = new i(this, result, (a) null);
        synchronized (obj) {
            if (f4595p == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f4588i);
                f4594o = handlerThread;
                handlerThread.start();
                f4595p = new Handler(f4594o.getLooper());
                if (b.b(aVar2.f4583d)) {
                    Log.d("Sqflite", aVar2.d() + "starting thread" + f4594o + " priority " + f4588i);
                }
            }
            if (b.b(aVar2.f4583d)) {
                Log.d("Sqflite", aVar2.d() + "opened " + i2 + " " + str);
            }
            f4595p.post(new f(x, str, iVar, bool, aVar2, methodCall, z, i2));
        }
    }

    private void K(MethodCall methodCall, MethodChannel.Result result) {
        a t = t(methodCall, result);
        if (t != null) {
            f4595p.post(new a(methodCall, new i(this, result, (a) null), t));
        }
    }

    private void L(MethodCall methodCall, MethodChannel.Result result) {
        a t = t(methodCall, result);
        if (t != null) {
            f4595p.post(new e(methodCall, new i(this, result, (a) null), t));
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        r5 = new java.util.ArrayList();
        r6 = new java.util.HashMap();
        r7 = r0.getColumnCount();
        r6.put("columns", java.util.Arrays.asList(r0.getColumnNames()));
        r6.put("rows", r5);
        r11 = r6;
        r6 = r5;
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        r6.add(l(r0, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        if (r5 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        r5 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        r14.success(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0043, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean M(f.h.a.a r13, f.h.a.f.f r14) {
        /*
            r12 = this;
            f.h.a.d r0 = r14.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r13.f4583d
            boolean r2 = f.h.a.b.b(r2)
            java.lang.String r3 = "Sqflite"
            if (r2 == 0) goto L_0x0029
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r13.d()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L_0x0029:
            boolean r2 = f4587h
            r4 = 0
            r5 = 0
            f.h.a.d r0 = r0.i()     // Catch:{ Exception -> 0x00c1 }
            android.database.sqlite.SQLiteDatabase r6 = r13.c()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r7 = r0.e()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String[] r0 = r0.b()     // Catch:{ Exception -> 0x00c1 }
            android.database.Cursor r0 = r6.rawQuery(r7, r0)     // Catch:{ Exception -> 0x00c1 }
            r6 = r5
            r7 = 0
        L_0x0043:
            boolean r8 = r0.moveToNext()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r8 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x0075
            java.util.Map r8 = m(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r9 = r13.f4583d     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r9 = f.h.a.b.b(r9)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r9 == 0) goto L_0x0071
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r9.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.lang.String r10 = r13.d()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r9.append(r10)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.lang.String r10 = N(r8)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r9.append(r10)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            android.util.Log.d(r3, r9)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
        L_0x0071:
            r1.add(r8)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            goto L_0x0043
        L_0x0075:
            if (r5 != 0) goto L_0x009a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r5.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r7 = r0.getColumnCount()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.lang.String r8 = "columns"
            java.lang.String[] r9 = r0.getColumnNames()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6.put(r8, r9)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            java.lang.String r8 = "rows"
            r6.put(r8, r5)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r11 = r6
            r6 = r5
            r5 = r11
        L_0x009a:
            java.util.List r8 = l(r0, r7)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6.add(r8)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            goto L_0x0043
        L_0x00a2:
            if (r2 == 0) goto L_0x00a8
            r14.success(r1)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            goto L_0x00b2
        L_0x00a8:
            if (r5 != 0) goto L_0x00af
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r5.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
        L_0x00af:
            r14.success(r5)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
        L_0x00b2:
            r13 = 1
            if (r0 == 0) goto L_0x00b8
            r0.close()
        L_0x00b8:
            return r13
        L_0x00b9:
            r13 = move-exception
            r5 = r0
            goto L_0x00cb
        L_0x00bc:
            r1 = move-exception
            r5 = r0
            goto L_0x00c2
        L_0x00bf:
            r13 = move-exception
            goto L_0x00cb
        L_0x00c1:
            r1 = move-exception
        L_0x00c2:
            r12.v(r1, r14, r13)     // Catch:{ all -> 0x00bf }
            if (r5 == 0) goto L_0x00ca
            r5.close()
        L_0x00ca:
            return r4
        L_0x00cb:
            if (r5 == 0) goto L_0x00d0
            r5.close()
        L_0x00d0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.a.c.M(f.h.a.a, f.h.a.f.f):boolean");
    }

    private static String N(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? r((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : (byte[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList.toString();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O(f.h.a.a r8, f.h.a.f.f r9) {
        /*
            r7 = this;
            boolean r0 = r7.q(r8, r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r9.c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r9.success(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r8.f()     // Catch:{ Exception -> 0x008b }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x008b }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0068
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            if (r5 <= 0) goto L_0x0068
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            if (r5 == 0) goto L_0x0068
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            int r5 = r8.f4583d     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            boolean r5 = f.h.a.b.b(r5)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.<init>()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r6 = r8.d()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r9.success(r3)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            if (r0 == 0) goto L_0x0061
            r0.close()
        L_0x0061:
            return r2
        L_0x0062:
            r8 = move-exception
            r3 = r0
            goto L_0x0095
        L_0x0065:
            r2 = move-exception
            r3 = r0
            goto L_0x008c
        L_0x0068:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.<init>()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r6 = r8.d()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r9.success(r3)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            if (r0 == 0) goto L_0x0088
            r0.close()
        L_0x0088:
            return r2
        L_0x0089:
            r8 = move-exception
            goto L_0x0095
        L_0x008b:
            r2 = move-exception
        L_0x008c:
            r7.v(r2, r9, r8)     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x0094
            r3.close()
        L_0x0094:
            return r1
        L_0x0095:
            if (r3 == 0) goto L_0x009a
            r3.close()
        L_0x009a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.a.c.O(f.h.a.a, f.h.a.f.f):boolean");
    }

    /* access modifiers changed from: private */
    public void k(a aVar) {
        try {
            if (b.b(aVar.f4583d)) {
                Log.d("Sqflite", aVar.d() + "closing database " + f4594o);
            }
            aVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + f4593n);
        }
        synchronized (f4590k) {
            if (f4596q.isEmpty() && f4595p != null) {
                if (b.b(aVar.f4583d)) {
                    Log.d("Sqflite", aVar.d() + "stopping thread" + f4594o);
                }
                f4594o.quit();
                f4594o = null;
                f4595p = null;
            }
        }
    }

    private static List<Object> l(Cursor cursor, int i2) {
        String str;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            Object n2 = n(cursor, i3);
            if (f.h.a.e.a.c) {
                String str2 = null;
                if (n2 != null) {
                    if (n2.getClass().isArray()) {
                        str2 = "array(" + n2.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = n2.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i3);
                sb.append(" ");
                sb.append(cursor.getType(i3));
                sb.append(": ");
                sb.append(n2);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(n2);
        }
        return arrayList;
    }

    private static Map<String, Object> m(Cursor cursor) {
        Object obj;
        String str;
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f.h.a.e.a.c) {
                Log.d("Sqflite", "column " + i2 + " " + cursor.getType(i2));
            }
            int type = cursor.getType(i2);
            if (type == 0) {
                str = columnNames[i2];
                obj = null;
            } else if (type == 1) {
                str = columnNames[i2];
                obj = Long.valueOf(cursor.getLong(i2));
            } else if (type == 2) {
                str = columnNames[i2];
                obj = Double.valueOf(cursor.getDouble(i2));
            } else if (type != 3) {
                if (type == 4) {
                    hashMap.put(columnNames[i2], cursor.getBlob(i2));
                }
            } else {
                str = columnNames[i2];
                obj = cursor.getString(i2);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static Object n(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i2);
    }

    /* access modifiers changed from: private */
    public boolean o(a aVar, f.h.a.f.f fVar) {
        if (!q(aVar, fVar)) {
            return false;
        }
        fVar.success((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public a p(a aVar, MethodCall methodCall, MethodChannel.Result result) {
        if (q(aVar, new f.h.a.f.d(result, u(methodCall), (Boolean) methodCall.argument("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    private boolean q(a aVar, f.h.a.f.f fVar) {
        Boolean bool = Boolean.FALSE;
        d b2 = fVar.b();
        if (b.b(aVar.f4583d)) {
            Log.d("Sqflite", aVar.d() + b2);
        }
        Boolean d2 = fVar.d();
        try {
            aVar.f().execSQL(b2.e(), b2.f());
            if (Boolean.TRUE.equals(d2)) {
                aVar.f4585f = true;
            }
            if (bool.equals(d2)) {
                aVar.f4585f = false;
            }
            return true;
        } catch (Exception e2) {
            v(e2, fVar, aVar);
            if (bool.equals(d2)) {
                aVar.f4585f = false;
            }
            return false;
        } catch (Throwable th) {
            if (bool.equals(d2)) {
                aVar.f4585f = false;
            }
            throw th;
        }
    }

    private static Map<String, Object> r(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            hashMap.put(N(next.getKey()), value instanceof Map ? r((Map) value) : N(value));
        }
        return hashMap;
    }

    private a s(int i2) {
        return f4596q.get(Integer.valueOf(i2));
    }

    private a t(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        a s2 = s(intValue);
        if (s2 != null) {
            return s2;
        }
        result.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    private d u(MethodCall methodCall) {
        return new d((String) methodCall.argument("sql"), (List) methodCall.argument("arguments"));
    }

    /* access modifiers changed from: private */
    public void v(Exception exc, f.h.a.f.f fVar, a aVar) {
        String message;
        Map<String, Object> a2;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + aVar.b;
            a2 = null;
        } else {
            boolean z = exc instanceof SQLException;
            message = exc.getMessage();
            a2 = f.h.a.f.h.a(fVar);
        }
        fVar.error("sqlite_error", message, a2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean w(f.h.a.a r10, f.h.a.f.f r11) {
        /*
            r9 = this;
            boolean r0 = r9.q(r10, r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r11.c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r11.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009f
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x009d }
            if (r5 <= 0) goto L_0x009f
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x009d }
            if (r5 == 0) goto L_0x009f
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x009d }
            if (r5 != 0) goto L_0x0069
            int r5 = r10.f4583d     // Catch:{ Exception -> 0x009d }
            boolean r5 = f.h.a.b.b(r5)     // Catch:{ Exception -> 0x009d }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r5.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r6 = r10.d()     // Catch:{ Exception -> 0x009d }
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x009d }
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009d }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x009d }
        L_0x0060:
            r11.success(r2)     // Catch:{ Exception -> 0x009d }
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            return r3
        L_0x0069:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x009d }
            int r2 = r10.f4583d     // Catch:{ Exception -> 0x009d }
            boolean r2 = f.h.a.b.b(r2)     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0090
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r2.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r7 = r10.d()     // Catch:{ Exception -> 0x009d }
            r2.append(r7)     // Catch:{ Exception -> 0x009d }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x009d }
            r2.append(r5)     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009d }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x009d }
        L_0x0090:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x009d }
            r11.success(r2)     // Catch:{ Exception -> 0x009d }
            if (r0 == 0) goto L_0x009c
            r0.close()
        L_0x009c:
            return r3
        L_0x009d:
            r2 = move-exception
            goto L_0x00c6
        L_0x009f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r5.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r6 = r10.d()     // Catch:{ Exception -> 0x009d }
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009d }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x009d }
            r11.success(r2)     // Catch:{ Exception -> 0x009d }
            if (r0 == 0) goto L_0x00bf
            r0.close()
        L_0x00bf:
            return r3
        L_0x00c0:
            r10 = move-exception
            goto L_0x00d1
        L_0x00c2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c6:
            r9.v(r2, r11, r10)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00ce
            r0.close()
        L_0x00ce:
            return r1
        L_0x00cf:
            r10 = move-exception
            r2 = r0
        L_0x00d1:
            if (r2 == 0) goto L_0x00d6
            r2.close()
        L_0x00d6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.a.c.w(f.h.a.a, f.h.a.f.f):boolean");
    }

    static boolean x(String str) {
        return str == null || str.equals(":memory:");
    }

    static Map y(int i2, boolean z, boolean z2) {
        Boolean bool = Boolean.TRUE;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z) {
            hashMap.put("recovered", bool);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", bool);
        }
        return hashMap;
    }

    private void z(Context context, BinaryMessenger binaryMessenger) {
        this.f4597e = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite");
        this.f4598f = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* access modifiers changed from: package-private */
    public void G(MethodCall methodCall, MethodChannel.Result result) {
        if (f4592m == null) {
            f4592m = this.f4597e.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f4592m);
    }

    /* access modifiers changed from: package-private */
    public void J(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("queryAsMapList");
        if (argument != null) {
            f4587h = Boolean.TRUE.equals(argument);
        }
        Object argument2 = methodCall.argument("androidThreadPriority");
        if (argument2 != null) {
            f4588i = ((Integer) argument2).intValue();
        }
        Integer a2 = b.a(methodCall);
        if (a2 != null) {
            f4589j = a2.intValue();
        }
        result.success((Object) null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        z(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f4597e = null;
        this.f4598f.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4598f = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c = 8;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c = 9;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c = 10;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c = 11;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                F(methodCall, result);
                return;
            case 1:
                B(methodCall, result);
                return;
            case 2:
                J(methodCall, result);
                return;
            case 3:
                H(methodCall, result);
                return;
            case 4:
                L(methodCall, result);
                return;
            case 5:
                E(methodCall, result);
                return;
            case 6:
                D(methodCall, result);
                return;
            case 7:
                I(methodCall, result);
                return;
            case 8:
                A(methodCall, result);
                return;
            case 9:
                C(methodCall, result);
                return;
            case 10:
                K(methodCall, result);
                return;
            case 11:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 12:
                G(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
