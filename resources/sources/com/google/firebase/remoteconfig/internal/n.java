package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.q;
import com.google.firebase.remoteconfig.s;
import java.util.Date;

public class n {

    /* renamed from: d  reason: collision with root package name */
    static final Date f2909d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    static final Date f2910e = new Date(-1);
    private final SharedPreferences a;
    private final Object b = new Object();
    private final Object c = new Object();

    static class a {
        private int a;
        private Date b;

        a(int i2, Date date) {
            this.a = i2;
            this.b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.a;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60);
    }

    public q c() {
        p a2;
        synchronized (this.b) {
            long j2 = this.a.getLong("last_fetch_time_in_millis", -1);
            int i2 = this.a.getInt("last_fetch_status", 0);
            s.b bVar = new s.b();
            bVar.d(this.a.getLong("fetch_timeout_in_seconds", 60));
            bVar.e(this.a.getLong("minimum_fetch_interval_in_seconds", l.f2899j));
            s c2 = bVar.c();
            p.b d2 = p.d();
            d2.c(i2);
            d2.d(j2);
            d2.b(c2);
            a2 = d2.a();
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1));
    }

    public long f() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", l.f2899j);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        h(0, f2910e);
    }

    /* access modifiers changed from: package-private */
    public void h(int i2, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void i(s sVar) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", sVar.a()).putLong("minimum_fetch_interval_in_seconds", sVar.b()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
