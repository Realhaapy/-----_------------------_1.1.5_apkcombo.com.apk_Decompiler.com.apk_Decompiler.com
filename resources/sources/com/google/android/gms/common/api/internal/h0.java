package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.b;
import f.e.a.c.g.d;
import f.e.a.c.g.i;

final class h0<T> implements d<T> {
    private final e a;
    private final int b;
    private final b<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2432d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2433e;

    h0(e eVar, int i2, b<?> bVar, long j2, long j3, String str, String str2) {
        this.a = eVar;
        this.b = i2;
        this.c = bVar;
        this.f2432d = j2;
        this.f2433e = j3;
    }

    static <T> h0<T> b(e eVar, int i2, b<?> bVar) {
        boolean z;
        if (!eVar.f()) {
            return null;
        }
        p a2 = o.b().a();
        if (a2 == null) {
            z = true;
        } else if (!a2.d()) {
            return null;
        } else {
            z = a2.e();
            z w = eVar.w(bVar);
            if (w != null) {
                if (!(w.v() instanceof c)) {
                    return null;
                }
                c cVar = (c) w.v();
                if (cVar.I() && !cVar.i()) {
                    e c2 = c(w, cVar, i2);
                    if (c2 == null) {
                        return null;
                    }
                    w.G();
                    z = c2.f();
                }
            }
        }
        return new h0(eVar, i2, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static e c(z<?> zVar, c<?> cVar, int i2) {
        int[] c2;
        int[] d2;
        e G = cVar.G();
        if (G == null || !G.e() || ((c2 = G.c()) != null ? !b.a(c2, i2) : !((d2 = G.d()) == null || !b.a(d2, i2))) || zVar.s() >= G.b()) {
            return null;
        }
        return G;
    }

    public final void a(i<T> iVar) {
        z w;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        long j3;
        if (this.a.f()) {
            p a2 = o.b().a();
            if ((a2 == null || a2.d()) && (w = this.a.w(this.c)) != null && (w.v() instanceof c)) {
                c cVar = (c) w.v();
                boolean z = true;
                boolean z2 = this.f2432d > 0;
                int y = cVar.y();
                if (a2 != null) {
                    boolean e2 = z2 & a2.e();
                    int b2 = a2.b();
                    int c2 = a2.c();
                    i4 = a2.f();
                    if (cVar.I() && !cVar.i()) {
                        e c3 = c(w, cVar, this.b);
                        if (c3 != null) {
                            if (!c3.f() || this.f2432d <= 0) {
                                z = false;
                            }
                            c2 = c3.b();
                            e2 = z;
                        } else {
                            return;
                        }
                    }
                    i3 = b2;
                    i2 = c2;
                } else {
                    i4 = 0;
                    i3 = 5000;
                    i2 = 100;
                }
                e eVar = this.a;
                if (iVar.m()) {
                    i6 = 0;
                    i5 = 0;
                } else {
                    if (iVar.k()) {
                        i6 = 100;
                    } else {
                        Exception h2 = iVar.h();
                        if (h2 instanceof com.google.android.gms.common.api.b) {
                            Status a3 = ((com.google.android.gms.common.api.b) h2).a();
                            int c4 = a3.c();
                            a b3 = a3.b();
                            i5 = b3 == null ? -1 : b3.b();
                            i6 = c4;
                        } else {
                            i6 = 101;
                        }
                    }
                    i5 = -1;
                }
                if (z2) {
                    long j4 = this.f2432d;
                    j2 = System.currentTimeMillis();
                    j3 = j4;
                    i7 = (int) (SystemClock.elapsedRealtime() - this.f2433e);
                } else {
                    j3 = 0;
                    j2 = 0;
                    i7 = -1;
                }
                eVar.E(new l(this.b, i6, i5, j3, j2, (String) null, (String) null, y, i7), i4, (long) i3, i2);
            }
        }
    }
}
