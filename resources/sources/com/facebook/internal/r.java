package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.y0.g0;
import java.util.Set;
import m.d0.f;
import m.y.d.g;
import m.y.d.l;

public final class r extends BroadcastReceiver {
    public static final a b = new a((g) null);
    private static r c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f1503d = "com.parse.bolts.measurement_event";
    private final Context a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final r a(Context context) {
            l.d(context, "context");
            if (r.a() != null) {
                return r.a();
            }
            r rVar = new r(context, (g) null);
            r.b(rVar);
            r.c(rVar);
            return r.a();
        }
    }

    private r(Context context) {
        Context applicationContext = context.getApplicationContext();
        l.c(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }

    public /* synthetic */ r(Context context, g gVar) {
        this(context);
    }

    public static final /* synthetic */ r a() {
        if (com.facebook.internal.s0.n.a.d(r.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(r rVar) {
        if (!com.facebook.internal.s0.n.a.d(r.class)) {
            try {
                rVar.e();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, r.class);
            }
        }
    }

    public static final /* synthetic */ void c(r rVar) {
        if (!com.facebook.internal.s0.n.a.d(r.class)) {
            try {
                c = rVar;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, r.class);
            }
        }
    }

    private final void d() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                e.n.a.a b2 = e.n.a.a.b(this.a);
                l.c(b2, "getInstance(applicationContext)");
                b2.e(this);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    private final void e() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                e.n.a.a b2 = e.n.a.a.b(this.a);
                l.c(b2, "getInstance(applicationContext)");
                b2.c(this, new IntentFilter(f1503d));
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public final void finalize() {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                d();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                g0 g0Var = new g0(context);
                Set<String> set = null;
                String j2 = l.j("bf_", intent == null ? null : intent.getStringExtra("event_name"));
                Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
                Bundle bundle = new Bundle();
                if (bundleExtra != null) {
                    set = bundleExtra.keySet();
                }
                if (set != null) {
                    for (String str : set) {
                        l.c(str, "key");
                        bundle.putString(new f("[ -]*$").b(new f("^[ -]*").b(new f("[^0-9a-zA-Z _-]").b(str, "-"), ""), ""), (String) bundleExtra.get(str));
                    }
                }
                g0Var.d(j2, bundle);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
