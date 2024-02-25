package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.c;
import f.e.a.c.g.j;

public abstract class n<A extends a.b, ResultT> {
    private final c[] a;
    private final boolean b;
    private final int c;

    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */
        public l<A, j<ResultT>> a;
        private boolean b = true;
        private c[] c;

        /* renamed from: d  reason: collision with root package name */
        private int f2459d = 0;

        /* synthetic */ a(s0 s0Var) {
        }

        public n<A, ResultT> a() {
            com.google.android.gms.common.internal.n.b(this.a != null, "execute parameter required");
            return new r0(this, this.c, this.b, this.f2459d);
        }

        public a<A, ResultT> b(l<A, j<ResultT>> lVar) {
            this.a = lVar;
            return this;
        }

        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        public a<A, ResultT> d(c... cVarArr) {
            this.c = cVarArr;
            return this;
        }
    }

    protected n(c[] cVarArr, boolean z, int i2) {
        this.a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i2;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((s0) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a2, j<ResultT> jVar);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final c[] e() {
        return this.a;
    }
}
