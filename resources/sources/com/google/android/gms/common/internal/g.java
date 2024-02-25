package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.j;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final Set<Scope> x;
    private final Account y;

    @Deprecated
    protected g(Context context, Looper looper, int i2, d dVar, f fVar, com.google.android.gms.common.api.g gVar) {
        this(context, looper, i2, dVar, (d) fVar, (j) gVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected g(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d r13, com.google.android.gms.common.api.internal.d r14, com.google.android.gms.common.api.internal.j r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.h.b(r10)
            com.google.android.gms.common.d r4 = com.google.android.gms.common.d.k()
            com.google.android.gms.common.internal.n.h(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.d r7 = (com.google.android.gms.common.api.internal.d) r7
            com.google.android.gms.common.internal.n.h(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.j r8 = (com.google.android.gms.common.api.internal.j) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.g.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected g(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.h r13, com.google.android.gms.common.d r14, int r15, com.google.android.gms.common.internal.d r16, com.google.android.gms.common.api.internal.d r17, com.google.android.gms.common.api.internal.j r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.f0 r3 = new com.google.android.gms.common.internal.f0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.g0 r0 = new com.google.android.gms.common.internal.g0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r0 = r16.a()
            r9.y = r0
            java.util.Set r0 = r16.c()
            r10.i0(r0)
            r9.x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.g.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.h, com.google.android.gms.common.d, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }

    private final Set<Scope> i0(Set<Scope> set) {
        h0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> B() {
        return this.x;
    }

    public Set<Scope> c() {
        return o() ? this.x : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> h0(Set<Scope> set) {
        return set;
    }

    public final Account t() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    public final Executor v() {
        return null;
    }
}
