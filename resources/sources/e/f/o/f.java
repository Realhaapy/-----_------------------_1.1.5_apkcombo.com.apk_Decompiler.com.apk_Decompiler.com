package e.f.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import e.e.g;
import e.f.o.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

class f {
    static final e.e.e<String, Typeface> a = new e.e.e<>(16);
    private static final ExecutorService b = h.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final g<String, ArrayList<e.f.q.a<e>>> f3374d = new g<>();

    class a implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ e c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3375d;

        a(String str, Context context, e eVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = eVar;
            this.f3375d = i2;
        }

        /* renamed from: a */
        public e call() {
            return f.c(this.a, this.b, this.c, this.f3375d);
        }
    }

    class b implements e.f.q.a<e> {
        final /* synthetic */ b a;

        b(b bVar) {
            this.a = bVar;
        }

        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    class c implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ e c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3376d;

        c(String str, Context context, e eVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = eVar;
            this.f3376d = i2;
        }

        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.a, this.b, this.c, this.f3376d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements e.f.q.a<e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((e.f.q.a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(e.f.o.f.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = e.f.o.f.c
                monitor-enter(r0)
                e.e.g<java.lang.String, java.util.ArrayList<e.f.q.a<e.f.o.f$e>>> r1 = e.f.o.f.f3374d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                e.f.q.a r1 = (e.f.q.a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.o.f.d.accept(e.f.o.f$e):void");
        }
    }

    static final class e {
        final Typeface a;
        final int b;

        e(int i2) {
            this.a = null;
            this.b = i2;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }
    }

    private static String a(e eVar, int i2) {
        return eVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b2 = aVar.b();
        if (!(b2 == null || b2.length == 0)) {
            int length = b2.length;
            i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                int b3 = b2[i3].b();
                if (b3 == 0) {
                    i3++;
                } else if (b3 < 0) {
                    return -3;
                } else {
                    return b3;
                }
            }
        }
        return i2;
    }

    static e c(String str, Context context, e eVar, int i2) {
        e.e.e<String, Typeface> eVar2 = a;
        Typeface c2 = eVar2.c(str);
        if (c2 != null) {
            return new e(c2);
        }
        try {
            g.a d2 = d.d(context, eVar, (CancellationSignal) null);
            int b2 = b(d2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = e.f.k.d.b(context, (CancellationSignal) null, d2.b(), i2);
            if (b3 == null) {
                return new e(-3);
            }
            eVar2.d(str, b3);
            return new e(b3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new e.f.o.f.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        e.f.o.h.b(r8, r9, new e.f.o.f.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface d(android.content.Context r5, e.f.o.e r6, int r7, java.util.concurrent.Executor r8, e.f.o.b r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            e.e.e<java.lang.String, android.graphics.Typeface> r1 = a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            e.f.o.f$e r5 = new e.f.o.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            e.f.o.f$b r1 = new e.f.o.f$b
            r1.<init>(r9)
            java.lang.Object r9 = c
            monitor-enter(r9)
            e.e.g<java.lang.String, java.util.ArrayList<e.f.q.a<e.f.o.f$e>>> r2 = f3374d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            e.f.o.f$c r9 = new e.f.o.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = b
        L_0x0044:
            e.f.o.f$d r5 = new e.f.o.f$d
            r5.<init>(r0)
            e.f.o.h.b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.o.f.d(android.content.Context, e.f.o.e, int, java.util.concurrent.Executor, e.f.o.b):android.graphics.Typeface");
    }

    static Typeface e(Context context, e eVar, b bVar, int i2, int i3) {
        String a2 = a(eVar, i2);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            bVar.b(new e(c2));
            return c2;
        } else if (i3 == -1) {
            e c3 = c(a2, context, eVar, i2);
            bVar.b(c3);
            return c3.a;
        } else {
            try {
                e eVar2 = (e) h.c(b, new a(a2, context, eVar, i2), i3);
                bVar.b(eVar2);
                return eVar2.a;
            } catch (InterruptedException unused) {
                bVar.b(new e(-3));
                return null;
            }
        }
    }
}
