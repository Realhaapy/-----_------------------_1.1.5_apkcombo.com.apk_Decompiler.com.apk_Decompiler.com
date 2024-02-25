package com.google.firebase.q;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.t;
import com.google.firebase.h;
import com.google.firebase.q.k;
import com.google.firebase.r.b;
import com.google.firebase.t.i;
import f.e.a.c.g.l;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class g implements j, k {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f2874f = d.a;
    private final b<l> a;
    private final Context b;
    private final b<i> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<h> f2875d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2876e;

    private g(Context context, String str, Set<h> set, b<i> bVar) {
        this(new a(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f2874f), bVar, context);
    }

    g(b<l> bVar, Set<h> set, Executor executor, b<i> bVar2, Context context) {
        this.a = bVar;
        this.f2875d = set;
        this.f2876e = executor;
        this.c = bVar2;
        this.b = context;
    }

    public static m<g> c() {
        m.b<g> b2 = m.b(g.class, j.class, k.class);
        b2.b(t.i(Context.class));
        b2.b(t.i(h.class));
        b2.b(t.k(h.class));
        b2.b(t.j(i.class));
        b2.f(b.a);
        return b2.d();
    }

    static /* synthetic */ g d(n nVar) {
        return new g((Context) nVar.get(Context.class), ((h) nVar.get(h.class)).p(), nVar.a(h.class), nVar.b(i.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ String f() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            l lVar = this.a.get();
            List<m> c2 = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < c2.size(); i2++) {
                m mVar = c2.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray(mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    static /* synthetic */ l g(Context context, String str) {
        return new l(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void i() {
        synchronized (this) {
            this.a.get().k(System.currentTimeMillis(), this.c.get().a());
        }
        return null;
    }

    static /* synthetic */ Thread j(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    public f.e.a.c.g.i<String> a() {
        return e.f.n.i.a(this.b) ^ true ? l.f("") : l.d(this.f2876e, new c(this));
    }

    public synchronized k.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.a.get();
        if (lVar.i(currentTimeMillis)) {
            lVar.g();
            return k.a.GLOBAL;
        }
        return k.a.NONE;
    }

    public f.e.a.c.g.i<Void> k() {
        return this.f2875d.size() <= 0 ? l.f(null) : e.f.n.i.a(this.b) ^ true ? l.f(null) : l.d(this.f2876e, new e(this));
    }
}
