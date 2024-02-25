package p;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.e0.c;
import p.x;

public final class n {
    private int a = 64;
    private int b = 5;
    private Runnable c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f5393d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<x.b> f5394e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<x.b> f5395f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<x> f5396g = new ArrayDeque();

    private <T> void d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!g() && runnable != null) {
            runnable.run();
        }
    }

    private boolean g() {
        int i2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<x.b> it = this.f5394e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x.b next = it.next();
                if (this.f5395f.size() >= this.a) {
                    break;
                } else if (i(next) < this.b) {
                    it.remove();
                    arrayList.add(next);
                    this.f5395f.add(next);
                }
            }
            z = h() > 0;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((x.b) arrayList.get(i2)).l(c());
        }
        return z;
    }

    private int i(x.b bVar) {
        int i2 = 0;
        for (x.b next : this.f5395f) {
            if (!next.m().f5454j && next.n().equals(bVar.n())) {
                i2++;
            }
        }
        return i2;
    }

    public synchronized void a() {
        for (x.b m2 : this.f5394e) {
            m2.m().d();
        }
        for (x.b m3 : this.f5395f) {
            m3.m().d();
        }
        for (x d2 : this.f5396g) {
            d2.d();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(x xVar) {
        this.f5396g.add(xVar);
    }

    public synchronized ExecutorService c() {
        if (this.f5393d == null) {
            this.f5393d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.E("OkHttp Dispatcher", false));
        }
        return this.f5393d;
    }

    /* access modifiers changed from: package-private */
    public void e(x.b bVar) {
        d(this.f5395f, bVar);
    }

    /* access modifiers changed from: package-private */
    public void f(x xVar) {
        d(this.f5396g, xVar);
    }

    public synchronized int h() {
        return this.f5395f.size() + this.f5396g.size();
    }
}
