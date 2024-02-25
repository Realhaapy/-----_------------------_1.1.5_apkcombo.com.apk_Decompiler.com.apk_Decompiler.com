package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.j;
import f.e.a.c.g.i;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

public abstract class e<O extends a.d> {
    private final Context a;
    private final String b;
    private final a<O> c;

    /* renamed from: d  reason: collision with root package name */
    private final O f2384d;

    /* renamed from: e  reason: collision with root package name */
    private final b<O> f2385e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2386f;

    /* renamed from: g  reason: collision with root package name */
    private final m f2387g;

    /* renamed from: h  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.e f2388h;

    public static class a {
        public static final a c = new C0041a().a();
        public final m a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0041a {
            private m a;
            private Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        private a(m mVar, Account account, Looper looper) {
            this.a = mVar;
            this.b = looper;
        }
    }

    private e(Context context, Activity activity, a<O> aVar, O o2, a aVar2) {
        n.i(context, "Null context is not permitted.");
        n.i(aVar, "Api must not be null.");
        n.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (j.j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = aVar;
        this.f2384d = o2;
        Looper looper = aVar2.b;
        b<O> a2 = b.a(aVar, o2, str);
        this.f2385e = a2;
        com.google.android.gms.common.api.internal.e x = com.google.android.gms.common.api.internal.e.x(this.a);
        this.f2388h = x;
        this.f2386f = x.m();
        this.f2387g = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            r.u(activity, x, a2);
        }
        x.b(this);
    }

    public e(Context context, a<O> aVar, O o2, a aVar2) {
        this(context, (Activity) null, aVar, o2, aVar2);
    }

    private final <TResult, A extends a.b> i<TResult> i(int i2, com.google.android.gms.common.api.internal.n<A, TResult> nVar) {
        f.e.a.c.g.j jVar = new f.e.a.c.g.j();
        this.f2388h.D(this, i2, nVar, jVar, this.f2387g);
        return jVar.a();
    }

    /* access modifiers changed from: protected */
    public d.a b() {
        Account account;
        GoogleSignInAccount b2;
        GoogleSignInAccount b3;
        d.a aVar = new d.a();
        O o2 = this.f2384d;
        if (!(o2 instanceof a.d.b) || (b3 = ((a.d.b) o2).b()) == null) {
            O o3 = this.f2384d;
            account = o3 instanceof a.d.C0040a ? ((a.d.C0040a) o3).a() : null;
        } else {
            account = b3.b();
        }
        aVar.d(account);
        O o4 = this.f2384d;
        aVar.c((!(o4 instanceof a.d.b) || (b2 = ((a.d.b) o4).b()) == null) ? Collections.emptySet() : b2.j());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> i<TResult> c(com.google.android.gms.common.api.internal.n<A, TResult> nVar) {
        return i(2, nVar);
    }

    public final b<O> d() {
        return this.f2385e;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return this.b;
    }

    public final int f() {
        return this.f2386f;
    }

    public final a.f g(Looper looper, z<O> zVar) {
        com.google.android.gms.common.internal.d a2 = b().a();
        a.C0039a<?, O> a3 = this.c.a();
        n.h(a3);
        a.f a4 = a3.a(this.a, looper, a2, this.f2384d, zVar, zVar);
        String e2 = e();
        if (e2 != null && (a4 instanceof c)) {
            ((c) a4).O(e2);
        }
        if (e2 != null && (a4 instanceof com.google.android.gms.common.api.internal.i)) {
            ((com.google.android.gms.common.api.internal.i) a4).r(e2);
        }
        return a4;
    }

    public final q0 h(Context context, Handler handler) {
        return new q0(context, handler, b().a());
    }
}
