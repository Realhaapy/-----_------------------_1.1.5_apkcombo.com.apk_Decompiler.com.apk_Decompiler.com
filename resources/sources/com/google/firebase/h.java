package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.j;
import com.google.android.gms.common.util.k;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.m;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.r;
import com.google.firebase.components.y;
import com.google.firebase.q.g;
import e.f.n.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class h {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2624k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private static final Executor f2625l = new d();

    /* renamed from: m  reason: collision with root package name */
    static final Map<String, h> f2626m = new e.e.a();
    private final Context a;
    private final String b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final r f2627d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f2628e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f2629f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final y<com.google.firebase.s.a> f2630g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.r.b<g> f2631h;

    /* renamed from: i  reason: collision with root package name */
    private final List<b> f2632i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<i> f2633j = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    private static class c implements c.a {
        private static AtomicReference<c> a = new AtomicReference<>();

        private c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet((Object) null, cVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(cVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (h.f2624k) {
                Iterator it = new ArrayList(h.f2626m.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f2628e.get()) {
                        hVar.B(z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private static final Handler f2634e = new Handler(Looper.getMainLooper());

        private d() {
        }

        public void execute(Runnable runnable) {
            f2634e.post(runnable);
        }
    }

    @TargetApi(24)
    private static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (h.f2624k) {
                for (h b2 : h.f2626m.values()) {
                    b2.q();
                }
            }
            c();
        }
    }

    protected h(Context context, String str, k kVar) {
        n.h(context);
        this.a = context;
        n.d(str);
        this.b = str;
        n.h(kVar);
        this.c = kVar;
        List<com.google.firebase.r.b<q>> a2 = o.b(context, ComponentDiscoveryService.class).a();
        r.b d2 = r.d(f2625l);
        d2.c(a2);
        d2.b(new FirebaseCommonRegistrar());
        d2.a(m.n(context, Context.class, new Class[0]));
        d2.a(m.n(this, h.class, new Class[0]));
        d2.a(m.n(kVar, k.class, new Class[0]));
        r d3 = d2.d();
        this.f2627d = d3;
        this.f2630g = new y<>(new b(this, context));
        this.f2631h = d3.b(g.class);
        e(new a(this));
    }

    private static String A(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void B(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a2 : this.f2632i) {
            a2.a(z);
        }
    }

    private void C() {
        for (i a2 : this.f2633j) {
            a2.a(this.b, this.c);
        }
    }

    private void f() {
        n.k(!this.f2629f.get(), "FirebaseApp was deleted");
    }

    private static List<String> i() {
        ArrayList arrayList = new ArrayList();
        synchronized (f2624k) {
            for (h n2 : f2626m.values()) {
                arrayList.add(n2.n());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<h> k(Context context) {
        ArrayList arrayList;
        synchronized (f2624k) {
            arrayList = new ArrayList(f2626m.values());
        }
        return arrayList;
    }

    public static h l() {
        h hVar;
        synchronized (f2624k) {
            hVar = f2626m.get("[DEFAULT]");
            if (hVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return hVar;
    }

    public static h m(String str) {
        h hVar;
        String str2;
        synchronized (f2624k) {
            hVar = f2626m.get(A(str));
            if (hVar != null) {
                hVar.f2631h.get().k();
            } else {
                List<String> i2 = i();
                if (i2.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", i2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return hVar;
    }

    /* access modifiers changed from: private */
    public void q() {
        if (!i.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + n());
            e.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + n());
        this.f2627d.g(v());
        this.f2631h.get().k();
    }

    public static h r(Context context) {
        synchronized (f2624k) {
            if (f2626m.containsKey("[DEFAULT]")) {
                h l2 = l();
                return l2;
            }
            k a2 = k.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            h s2 = s(context, a2);
            return s2;
        }
    }

    public static h s(Context context, k kVar) {
        return t(context, kVar, "[DEFAULT]");
    }

    public static h t(Context context, k kVar, String str) {
        h hVar;
        c.c(context);
        String A = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2624k) {
            Map<String, h> map = f2626m;
            boolean z = !map.containsKey(A);
            n.k(z, "FirebaseApp name " + A + " already exists!");
            n.i(context, "Application context cannot be null.");
            hVar = new h(context, A, kVar);
            map.put(A, hVar);
        }
        hVar.q();
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ com.google.firebase.s.a x(Context context) {
        return new com.google.firebase.s.a(context, p(), (com.google.firebase.p.c) this.f2627d.get(com.google.firebase.p.c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(boolean z) {
        if (!z) {
            this.f2631h.get().k();
        }
    }

    public void D(boolean z) {
        boolean z2;
        f();
        if (this.f2628e.compareAndSet(!z, z)) {
            boolean d2 = com.google.android.gms.common.api.internal.c.b().d();
            if (z && d2) {
                z2 = true;
            } else if (!z && d2) {
                z2 = false;
            } else {
                return;
            }
            B(z2);
        }
    }

    public void E(Boolean bool) {
        f();
        this.f2630g.get().e(bool);
    }

    public void e(b bVar) {
        f();
        if (this.f2628e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            bVar.a(true);
        }
        this.f2632i.add(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.b.equals(((h) obj).n());
    }

    public void g() {
        if (this.f2629f.compareAndSet(false, true)) {
            synchronized (f2624k) {
                f2626m.remove(this.b);
            }
            C();
        }
    }

    public <T> T h(Class<T> cls) {
        f();
        return this.f2627d.get(cls);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Context j() {
        f();
        return this.a;
    }

    public String n() {
        f();
        return this.b;
    }

    public k o() {
        f();
        return this.c;
    }

    public String p() {
        return com.google.android.gms.common.util.c.a(n().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(o().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        m.a c2 = com.google.android.gms.common.internal.m.c(this);
        c2.a("name", this.b);
        c2.a("options", this.c);
        return c2.toString();
    }

    public boolean u() {
        f();
        return this.f2630g.get().b();
    }

    public boolean v() {
        return "[DEFAULT]".equals(n());
    }
}
