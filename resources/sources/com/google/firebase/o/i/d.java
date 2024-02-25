package com.google.firebase.o.i;

import com.google.firebase.o.e;
import com.google.firebase.o.f;
import com.google.firebase.o.g;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d implements com.google.firebase.o.h.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final com.google.firebase.o.d<Object> f2852e = a.a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f2853f = b.a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f2854g = c.a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f2855h = new b((a) null);
    /* access modifiers changed from: private */
    public final Map<Class<?>, com.google.firebase.o.d<?>> a = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, f<?>> b = new HashMap();
    /* access modifiers changed from: private */
    public com.google.firebase.o.d<Object> c = f2852e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f2856d = false;

    class a implements com.google.firebase.o.a {
        a() {
        }

        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.a, d.this.b, d.this.c, d.this.f2856d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    private static final class b implements f<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.c(a.format(date));
        }
    }

    public d() {
        m(String.class, f2853f);
        m(Boolean.class, f2854g);
        m(Date.class, f2855h);
    }

    static /* synthetic */ void i(Object obj, e eVar) {
        throw new com.google.firebase.o.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public /* bridge */ /* synthetic */ com.google.firebase.o.h.b a(Class cls, com.google.firebase.o.d dVar) {
        l(cls, dVar);
        return this;
    }

    public com.google.firebase.o.a f() {
        return new a();
    }

    public d g(com.google.firebase.o.h.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.f2856d = z;
        return this;
    }

    public <T> d l(Class<T> cls, com.google.firebase.o.d<? super T> dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, f<? super T> fVar) {
        this.b.put(cls, fVar);
        this.a.remove(cls);
        return this;
    }
}
