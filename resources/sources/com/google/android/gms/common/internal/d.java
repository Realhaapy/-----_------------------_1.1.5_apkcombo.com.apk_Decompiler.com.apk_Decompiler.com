package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import e.e.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, a0> f2516d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2517e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2518f;

    /* renamed from: g  reason: collision with root package name */
    private final f.e.a.c.e.a f2519g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f2520h;

    public static final class a {
        private Account a;
        private b<Scope> b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f2521d;

        /* renamed from: e  reason: collision with root package name */
        private f.e.a.c.e.a f2522e = f.e.a.c.e.a.f3917j;

        public d a() {
            return new d(this.a, this.b, (Map<com.google.android.gms.common.api.a<?>, a0>) null, 0, (View) null, this.c, this.f2521d, this.f2522e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new b<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.f2521d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, a0> map, int i2, View view, String str, String str2, f.e.a.c.e.a aVar, boolean z) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f2516d = map;
        this.f2517e = str;
        this.f2518f = str2;
        this.f2519g = aVar == null ? f.e.a.c.e.a.f3917j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (a0 a0Var : map.values()) {
            hashSet.addAll(a0Var.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.c;
    }

    public String d() {
        return this.f2517e;
    }

    public Set<Scope> e() {
        return this.b;
    }

    public final f.e.a.c.e.a f() {
        return this.f2519g;
    }

    public final Integer g() {
        return this.f2520h;
    }

    public final String h() {
        return this.f2518f;
    }

    public final void i(Integer num) {
        this.f2520h = num;
    }
}
