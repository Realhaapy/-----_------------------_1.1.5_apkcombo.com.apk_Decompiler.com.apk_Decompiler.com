package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import m.y.d.g;
import m.y.d.l;

public enum n0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: f  reason: collision with root package name */
    public static final a f1464f = null;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final EnumSet<n0> f1465g = null;

    /* renamed from: e  reason: collision with root package name */
    private final long f1470e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final EnumSet<n0> a(long j2) {
            EnumSet<n0> noneOf = EnumSet.noneOf(n0.class);
            Iterator it = n0.f1465g.iterator();
            while (it.hasNext()) {
                n0 n0Var = (n0) it.next();
                if ((n0Var.d() & j2) != 0) {
                    noneOf.add(n0Var);
                }
            }
            l.c(noneOf, "result");
            return noneOf;
        }
    }

    static {
        f1464f = new a((g) null);
        EnumSet<n0> allOf = EnumSet.allOf(n0.class);
        l.c(allOf, "allOf(SmartLoginOption::class.java)");
        f1465g = allOf;
    }

    private n0(long j2) {
        this.f1470e = j2;
    }

    public final long d() {
        return this.f1470e;
    }
}
