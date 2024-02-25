package com.facebook.y0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.g0;
import com.facebook.y0.q0.g;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.y.d.l;

public final class u {
    public static final u a = new u();
    private static final String b;
    private static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static String f2158d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f2159e;

    static {
        String simpleName = u.class.getSimpleName();
        l.c(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        b = simpleName;
    }

    private u() {
    }

    public static final String a() {
        if (!f2159e) {
            Log.w(b, "initStore should have been called before calling setUserID");
            a.b();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f2158d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    private final void b() {
        if (!f2159e) {
            ReentrantReadWriteLock reentrantReadWriteLock = c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f2159e) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                g0 g0Var = g0.a;
                f2158d = PreferenceManager.getDefaultSharedPreferences(g0.c()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                f2159e = true;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                c.writeLock().unlock();
                throw th;
            }
        }
    }

    public static final void c() {
        if (!f2159e) {
            g0.b.b().execute(b.f1811e);
        }
    }

    /* access modifiers changed from: private */
    public static final void d() {
        a.b();
    }

    public static final void g(String str) {
        g gVar = g.a;
        g.b();
        if (!f2159e) {
            Log.w(b, "initStore should have been called before calling setUserID");
            a.b();
        }
        g0.b.b().execute(new a(str));
    }

    /* access modifiers changed from: private */
    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f2158d = str;
            g0 g0Var = g0.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(g0.c()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", f2158d);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            c.writeLock().unlock();
            throw th;
        }
    }
}
