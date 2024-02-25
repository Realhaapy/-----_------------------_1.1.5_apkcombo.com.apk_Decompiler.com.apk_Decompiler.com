package com.google.firebase.messaging.l1;

import com.google.firebase.o.j.e;
import com.google.firebase.o.j.f;

public final class a {
    private final long a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2768d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2769e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2770f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2771g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2772h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2773i;

    /* renamed from: j  reason: collision with root package name */
    private final String f2774j;

    /* renamed from: k  reason: collision with root package name */
    private final long f2775k;

    /* renamed from: l  reason: collision with root package name */
    private final b f2776l;

    /* renamed from: m  reason: collision with root package name */
    private final String f2777m;

    /* renamed from: n  reason: collision with root package name */
    private final long f2778n;

    /* renamed from: o  reason: collision with root package name */
    private final String f2779o;

    /* renamed from: com.google.firebase.messaging.l1.a$a  reason: collision with other inner class name */
    public static final class C0048a {
        private long a = 0;
        private String b = "";
        private String c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f2780d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f2781e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f2782f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f2783g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f2784h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f2785i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f2786j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f2787k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f2788l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f2789m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f2790n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f2791o = "";

        C0048a() {
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.f2780d, this.f2781e, this.f2782f, this.f2783g, this.f2784h, this.f2785i, this.f2786j, this.f2787k, this.f2788l, this.f2789m, this.f2790n, this.f2791o);
        }

        public C0048a b(String str) {
            this.f2789m = str;
            return this;
        }

        public C0048a c(String str) {
            this.f2783g = str;
            return this;
        }

        public C0048a d(String str) {
            this.f2791o = str;
            return this;
        }

        public C0048a e(b bVar) {
            this.f2788l = bVar;
            return this;
        }

        public C0048a f(String str) {
            this.c = str;
            return this;
        }

        public C0048a g(String str) {
            this.b = str;
            return this;
        }

        public C0048a h(c cVar) {
            this.f2780d = cVar;
            return this;
        }

        public C0048a i(String str) {
            this.f2782f = str;
            return this;
        }

        public C0048a j(long j2) {
            this.a = j2;
            return this;
        }

        public C0048a k(d dVar) {
            this.f2781e = dVar;
            return this;
        }

        public C0048a l(String str) {
            this.f2786j = str;
            return this;
        }

        public C0048a m(int i2) {
            this.f2785i = i2;
            return this;
        }
    }

    public enum b implements e {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2796e;

        private b(int i2) {
            this.f2796e = i2;
        }

        public int b() {
            return this.f2796e;
        }
    }

    public enum c implements e {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2802e;

        private c(int i2) {
            this.f2802e = i2;
        }

        public int b() {
            return this.f2802e;
        }
    }

    public enum d implements e {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2808e;

        private d(int i2) {
            this.f2808e = i2;
        }

        public int b() {
            return this.f2808e;
        }
    }

    static {
        new C0048a().a();
    }

    a(long j2, String str, String str2, c cVar, d dVar, String str3, String str4, int i2, int i3, String str5, long j3, b bVar, String str6, long j4, String str7) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.f2768d = cVar;
        this.f2769e = dVar;
        this.f2770f = str3;
        this.f2771g = str4;
        this.f2772h = i2;
        this.f2773i = i3;
        this.f2774j = str5;
        this.f2775k = j3;
        this.f2776l = bVar;
        this.f2777m = str6;
        this.f2778n = j4;
        this.f2779o = str7;
    }

    public static C0048a p() {
        return new C0048a();
    }

    @f(tag = 13)
    public String a() {
        return this.f2777m;
    }

    @f(tag = 11)
    public long b() {
        return this.f2775k;
    }

    @f(tag = 14)
    public long c() {
        return this.f2778n;
    }

    @f(tag = 7)
    public String d() {
        return this.f2771g;
    }

    @f(tag = 15)
    public String e() {
        return this.f2779o;
    }

    @f(tag = 12)
    public b f() {
        return this.f2776l;
    }

    @f(tag = 3)
    public String g() {
        return this.c;
    }

    @f(tag = 2)
    public String h() {
        return this.b;
    }

    @f(tag = 4)
    public c i() {
        return this.f2768d;
    }

    @f(tag = 6)
    public String j() {
        return this.f2770f;
    }

    @f(tag = 8)
    public int k() {
        return this.f2772h;
    }

    @f(tag = 1)
    public long l() {
        return this.a;
    }

    @f(tag = 5)
    public d m() {
        return this.f2769e;
    }

    @f(tag = 10)
    public String n() {
        return this.f2774j;
    }

    @f(tag = 9)
    public int o() {
        return this.f2773i;
    }
}
