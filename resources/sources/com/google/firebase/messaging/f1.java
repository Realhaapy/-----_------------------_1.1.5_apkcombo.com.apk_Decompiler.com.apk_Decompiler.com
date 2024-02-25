package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class f1 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<f1> f2744d;
    private final SharedPreferences a;
    private b1 b;
    private final Executor c;

    private f1(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized f1 b(Context context, Executor executor) {
        f1 f1Var;
        synchronized (f1.class) {
            f1Var = null;
            WeakReference<f1> weakReference = f2744d;
            if (weakReference != null) {
                f1Var = (f1) weakReference.get();
            }
            if (f1Var == null) {
                f1Var = new f1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                f1Var.d();
                f2744d = new WeakReference<>(f1Var);
            }
        }
        return f1Var;
    }

    private synchronized void d() {
        this.b = b1.c(this.a, "topic_operation_queue", ",", this.c);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(e1 e1Var) {
        return this.b.a(e1Var.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized e1 c() {
        return e1.a(this.b.f());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean e(e1 e1Var) {
        return this.b.g(e1Var.e());
    }
}
