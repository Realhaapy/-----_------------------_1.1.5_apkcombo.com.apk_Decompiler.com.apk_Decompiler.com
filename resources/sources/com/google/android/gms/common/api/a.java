package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.n;
import java.util.Set;

public final class a<O extends d> {
    private final C0039a<?, O> a;
    private final String b;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0039a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o2, f fVar, g gVar) {
            return b(context, looper, dVar, o2, fVar, gVar);
        }

        public T b(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o2, com.google.android.gms.common.api.internal.d dVar2, j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface C0040a extends d {
            Account a();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(c.e eVar);

        boolean b();

        Set<Scope> c();

        void d(i iVar, Set<Scope> set);

        void e(String str);

        boolean f();

        int h();

        boolean i();

        com.google.android.gms.common.c[] j();

        String k();

        String l();

        void m(c.C0042c cVar);

        void n();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0039a<C, O> aVar, g<C> gVar) {
        n.i(aVar, "Cannot construct an Api with a null ClientBuilder");
        n.i(gVar, "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = aVar;
    }

    public final C0039a<?, O> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
