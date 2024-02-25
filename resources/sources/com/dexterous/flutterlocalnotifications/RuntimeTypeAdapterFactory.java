package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.l;
import f.e.d.o;
import f.e.d.p;
import f.e.d.q;
import f.e.d.v;
import f.e.d.w;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
public final class RuntimeTypeAdapterFactory<T> implements w {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    class a extends v<R> {
        final /* synthetic */ Map a;
        final /* synthetic */ Map b;

        a(Map map, Map map2) {
            this.a = map;
            this.b = map2;
        }

        public R c(f.e.d.a0.a aVar) {
            l a2 = f.e.d.y.l.a(aVar);
            l s2 = a2.i().s(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (s2 != null) {
                String k2 = s2.k();
                v vVar = (v) this.a.get(k2);
                if (vVar != null) {
                    return vVar.a(a2);
                }
                throw new p("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + k2 + "; did you forget to register a subtype?");
            }
            throw new p("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
        }

        public void e(c cVar, R r2) {
            Class<?> cls = r2.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            v vVar = (v) this.b.get(cls);
            if (vVar != null) {
                o i2 = vVar.d(r2).i();
                if (!i2.r(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    o oVar = new o();
                    oVar.p(RuntimeTypeAdapterFactory.this.typeFieldName, new q(str));
                    for (Map.Entry next : i2.q()) {
                        oVar.p((String) next.getKey(), (l) next.getValue());
                    }
                    f.e.d.y.l.b(oVar, cVar);
                    return;
                }
                throw new p("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            throw new p("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> v<R> create(f fVar, f.e.d.z.a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            v l2 = fVar.l(this, f.e.d.z.a.a((Class) next.getValue()));
            linkedHashMap.put(next.getKey(), l2);
            linkedHashMap2.put(next.getValue(), l2);
        }
        return new a(linkedHashMap, linkedHashMap2).b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }
}
