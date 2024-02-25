package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m.y.d.l;

public final class l0 extends AbstractList<j0> {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f1568k = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private Handler f1569e;

    /* renamed from: f  reason: collision with root package name */
    private int f1570f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1571g = String.valueOf(f1568k.incrementAndGet());

    /* renamed from: h  reason: collision with root package name */
    private List<j0> f1572h;

    /* renamed from: i  reason: collision with root package name */
    private List<a> f1573i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private String f1574j;

    public interface a {
        void a(l0 l0Var);
    }

    public interface b extends a {
        void b(l0 l0Var, long j2, long j3);
    }

    public l0(Collection<j0> collection) {
        l.d(collection, "requests");
        this.f1572h = new ArrayList(collection);
    }

    public l0(j0... j0VarArr) {
        l.d(j0VarArr, "requests");
        this.f1572h = new ArrayList(e.a(j0VarArr));
    }

    private final List<m0> m() {
        return j0.f1546n.g(this);
    }

    private final k0 o() {
        return j0.f1546n.j(this);
    }

    public /* bridge */ boolean A(j0 j0Var) {
        return super.remove(j0Var);
    }

    public j0 B(int i2) {
        return this.f1572h.remove(i2);
    }

    /* renamed from: C */
    public j0 set(int i2, j0 j0Var) {
        l.d(j0Var, "element");
        return this.f1572h.set(i2, j0Var);
    }

    public final void D(Handler handler) {
        this.f1569e = handler;
    }

    public void clear() {
        this.f1572h.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof j0)) {
            return false;
        }
        return k((j0) obj);
    }

    /* renamed from: h */
    public void add(int i2, j0 j0Var) {
        l.d(j0Var, "element");
        this.f1572h.add(i2, j0Var);
    }

    /* renamed from: i */
    public boolean add(j0 j0Var) {
        l.d(j0Var, "element");
        return this.f1572h.add(j0Var);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof j0)) {
            return -1;
        }
        return x((j0) obj);
    }

    public final void j(a aVar) {
        l.d(aVar, "callback");
        if (!this.f1573i.contains(aVar)) {
            this.f1573i.add(aVar);
        }
    }

    public /* bridge */ boolean k(j0 j0Var) {
        return super.contains(j0Var);
    }

    public final List<m0> l() {
        return m();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof j0)) {
            return -1;
        }
        return y((j0) obj);
    }

    public final k0 n() {
        return o();
    }

    /* renamed from: p */
    public j0 get(int i2) {
        return this.f1572h.get(i2);
    }

    public final String q() {
        return this.f1574j;
    }

    public final Handler r() {
        return this.f1569e;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof j0)) {
            return false;
        }
        return A((j0) obj);
    }

    public final List<a> s() {
        return this.f1573i;
    }

    public final /* bridge */ int size() {
        return v();
    }

    public final String t() {
        return this.f1571g;
    }

    public final List<j0> u() {
        return this.f1572h;
    }

    public int v() {
        return this.f1572h.size();
    }

    public final int w() {
        return this.f1570f;
    }

    public /* bridge */ int x(j0 j0Var) {
        return super.indexOf(j0Var);
    }

    public /* bridge */ int y(j0 j0Var) {
        return super.lastIndexOf(j0Var);
    }

    /* renamed from: z */
    public final /* bridge */ j0 remove(int i2) {
        return B(i2);
    }
}
