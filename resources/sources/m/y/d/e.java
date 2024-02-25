package m.y.d;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.b0.c;
import m.y.c.b;
import m.y.c.d;
import m.y.c.f;
import m.y.c.g;
import m.y.c.h;
import m.y.c.i;
import m.y.c.j;
import m.y.c.k;
import m.y.c.l;
import m.y.c.m;
import m.y.c.n;
import m.y.c.o;
import m.y.c.p;
import m.y.c.q;
import m.y.c.r;
import m.y.c.s;
import m.y.c.t;
import m.y.c.u;
import m.y.c.v;
import m.y.c.w;

public final class e implements c<Object>, d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f5053f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Class<? extends m.c<?>>, Integer> f5054g;

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String> f5055h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String> f5056i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String> f5057j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, String> f5058k;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f5059e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            String str2;
            l.d(cls, "jClass");
            String str3 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod == null) {
                        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                        l.c(simpleName, "name");
                        if (enclosingConstructor == null) {
                            return q.a0(simpleName, '$', (String) null, 2, (Object) null);
                        }
                        str2 = enclosingConstructor.getName();
                    } else {
                        l.c(simpleName, "name");
                        str2 = enclosingMethod.getName();
                    }
                    return q.b0(simpleName, l.j(str2, "$"), (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f5058k.get(componentType.getName())) != null) {
                        str3 = l.j(str, "Array");
                    }
                    if (str3 == null) {
                        return "Array";
                    }
                } else {
                    String str4 = (String) e.f5058k.get(cls.getName());
                    return str4 == null ? cls.getSimpleName() : str4;
                }
            }
            return str3;
        }
    }

    static {
        int i2 = 0;
        List g2 = j.g(m.y.c.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, m.y.c.c.class, d.class, m.y.c.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(k.j(g2, 10));
        for (Object next : g2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(m.p.a((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                m.t.h.i();
                throw null;
            }
        }
        f5054g = a0.j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f5055h = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f5056i = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.c(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.c(str, "kotlinName");
            sb.append(q.d0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            m.l a2 = m.p.a(sb.toString(), l.j(str, ".Companion"));
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry next2 : f5054g.entrySet()) {
            hashMap3.put(((Class) next2.getKey()).getName(), l.j("kotlin.Function", Integer.valueOf(((Number) next2.getValue()).intValue())));
        }
        f5057j = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), q.d0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f5058k = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.d(cls, "jClass");
        this.f5059e = cls;
    }

    public String a() {
        return f5053f.a(b());
    }

    public Class<?> b() {
        return this.f5059e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(m.y.a.a(this), m.y.a.a((c) obj));
    }

    public int hashCode() {
        return m.y.a.a(this).hashCode();
    }

    public String toString() {
        return l.j(b().toString(), " (Kotlin reflection is not available)");
    }
}
