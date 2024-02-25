package com.google.firebase.messaging;

import com.google.firebase.o.c;
import com.google.firebase.o.d;
import com.google.firebase.o.e;

public final class f0 implements com.google.firebase.o.h.a {
    public static final com.google.firebase.o.h.a a = new f0();

    private static final class a implements d<com.google.firebase.messaging.l1.a> {
        static final a a = new a();
        private static final com.google.firebase.o.c b;
        private static final com.google.firebase.o.c c;

        /* renamed from: d  reason: collision with root package name */
        private static final com.google.firebase.o.c f2731d;

        /* renamed from: e  reason: collision with root package name */
        private static final com.google.firebase.o.c f2732e;

        /* renamed from: f  reason: collision with root package name */
        private static final com.google.firebase.o.c f2733f;

        /* renamed from: g  reason: collision with root package name */
        private static final com.google.firebase.o.c f2734g;

        /* renamed from: h  reason: collision with root package name */
        private static final com.google.firebase.o.c f2735h;

        /* renamed from: i  reason: collision with root package name */
        private static final com.google.firebase.o.c f2736i;

        /* renamed from: j  reason: collision with root package name */
        private static final com.google.firebase.o.c f2737j;

        /* renamed from: k  reason: collision with root package name */
        private static final com.google.firebase.o.c f2738k;

        /* renamed from: l  reason: collision with root package name */
        private static final com.google.firebase.o.c f2739l;

        /* renamed from: m  reason: collision with root package name */
        private static final com.google.firebase.o.c f2740m;

        /* renamed from: n  reason: collision with root package name */
        private static final com.google.firebase.o.c f2741n;

        /* renamed from: o  reason: collision with root package name */
        private static final com.google.firebase.o.c f2742o;

        /* renamed from: p  reason: collision with root package name */
        private static final com.google.firebase.o.c f2743p;

        static {
            c.b a2 = com.google.firebase.o.c.a("projectNumber");
            com.google.firebase.o.j.c b2 = com.google.firebase.o.j.c.b();
            b2.c(1);
            a2.b(b2.a());
            b = a2.a();
            c.b a3 = com.google.firebase.o.c.a("messageId");
            com.google.firebase.o.j.c b3 = com.google.firebase.o.j.c.b();
            b3.c(2);
            a3.b(b3.a());
            c = a3.a();
            c.b a4 = com.google.firebase.o.c.a("instanceId");
            com.google.firebase.o.j.c b4 = com.google.firebase.o.j.c.b();
            b4.c(3);
            a4.b(b4.a());
            f2731d = a4.a();
            c.b a5 = com.google.firebase.o.c.a("messageType");
            com.google.firebase.o.j.c b5 = com.google.firebase.o.j.c.b();
            b5.c(4);
            a5.b(b5.a());
            f2732e = a5.a();
            c.b a6 = com.google.firebase.o.c.a("sdkPlatform");
            com.google.firebase.o.j.c b6 = com.google.firebase.o.j.c.b();
            b6.c(5);
            a6.b(b6.a());
            f2733f = a6.a();
            c.b a7 = com.google.firebase.o.c.a("packageName");
            com.google.firebase.o.j.c b7 = com.google.firebase.o.j.c.b();
            b7.c(6);
            a7.b(b7.a());
            f2734g = a7.a();
            c.b a8 = com.google.firebase.o.c.a("collapseKey");
            com.google.firebase.o.j.c b8 = com.google.firebase.o.j.c.b();
            b8.c(7);
            a8.b(b8.a());
            f2735h = a8.a();
            c.b a9 = com.google.firebase.o.c.a("priority");
            com.google.firebase.o.j.c b9 = com.google.firebase.o.j.c.b();
            b9.c(8);
            a9.b(b9.a());
            f2736i = a9.a();
            c.b a10 = com.google.firebase.o.c.a("ttl");
            com.google.firebase.o.j.c b10 = com.google.firebase.o.j.c.b();
            b10.c(9);
            a10.b(b10.a());
            f2737j = a10.a();
            c.b a11 = com.google.firebase.o.c.a("topic");
            com.google.firebase.o.j.c b11 = com.google.firebase.o.j.c.b();
            b11.c(10);
            a11.b(b11.a());
            f2738k = a11.a();
            c.b a12 = com.google.firebase.o.c.a("bulkId");
            com.google.firebase.o.j.c b12 = com.google.firebase.o.j.c.b();
            b12.c(11);
            a12.b(b12.a());
            f2739l = a12.a();
            c.b a13 = com.google.firebase.o.c.a("event");
            com.google.firebase.o.j.c b13 = com.google.firebase.o.j.c.b();
            b13.c(12);
            a13.b(b13.a());
            f2740m = a13.a();
            c.b a14 = com.google.firebase.o.c.a("analyticsLabel");
            com.google.firebase.o.j.c b14 = com.google.firebase.o.j.c.b();
            b14.c(13);
            a14.b(b14.a());
            f2741n = a14.a();
            c.b a15 = com.google.firebase.o.c.a("campaignId");
            com.google.firebase.o.j.c b15 = com.google.firebase.o.j.c.b();
            b15.c(14);
            a15.b(b15.a());
            f2742o = a15.a();
            c.b a16 = com.google.firebase.o.c.a("composerLabel");
            com.google.firebase.o.j.c b16 = com.google.firebase.o.j.c.b();
            b16.c(15);
            a16.b(b16.a());
            f2743p = a16.a();
        }

        private a() {
        }

        /* renamed from: b */
        public void a(com.google.firebase.messaging.l1.a aVar, e eVar) {
            eVar.a(b, aVar.l());
            eVar.e(c, aVar.h());
            eVar.e(f2731d, aVar.g());
            eVar.e(f2732e, aVar.i());
            eVar.e(f2733f, aVar.m());
            eVar.e(f2734g, aVar.j());
            eVar.e(f2735h, aVar.d());
            eVar.b(f2736i, aVar.k());
            eVar.b(f2737j, aVar.o());
            eVar.e(f2738k, aVar.n());
            eVar.a(f2739l, aVar.b());
            eVar.e(f2740m, aVar.f());
            eVar.e(f2741n, aVar.a());
            eVar.a(f2742o, aVar.c());
            eVar.e(f2743p, aVar.e());
        }
    }

    private static final class b implements d<com.google.firebase.messaging.l1.b> {
        static final b a = new b();
        private static final com.google.firebase.o.c b;

        static {
            c.b a2 = com.google.firebase.o.c.a("messagingClientEvent");
            com.google.firebase.o.j.c b2 = com.google.firebase.o.j.c.b();
            b2.c(1);
            a2.b(b2.a());
            b = a2.a();
        }

        private b() {
        }

        /* renamed from: b */
        public void a(com.google.firebase.messaging.l1.b bVar, e eVar) {
            eVar.e(b, bVar.a());
        }
    }

    private static final class c implements d<t0> {
        static final c a = new c();
        private static final com.google.firebase.o.c b = com.google.firebase.o.c.d("messagingClientEventExtension");

        private c() {
        }

        /* renamed from: b */
        public void a(t0 t0Var, e eVar) {
            eVar.e(b, t0Var.b());
        }
    }

    private f0() {
    }

    public void a(com.google.firebase.o.h.b<?> bVar) {
        bVar.a(t0.class, c.a);
        bVar.a(com.google.firebase.messaging.l1.b.class, b.a);
        bVar.a(com.google.firebase.messaging.l1.a.class, a.a);
    }
}
