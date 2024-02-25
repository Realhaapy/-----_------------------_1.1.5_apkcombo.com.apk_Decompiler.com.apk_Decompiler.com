package f.e.d.y.n;

import f.e.d.f;
import f.e.d.v;
import f.e.d.w;
import f.e.d.x.b;
import f.e.d.y.c;
import f.e.d.z.a;

public final class d implements w {

    /* renamed from: e  reason: collision with root package name */
    private final c f4379e;

    public d(c cVar) {
        this.f4379e = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: f.e.d.y.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: f.e.d.v<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: f.e.d.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: f.e.d.y.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: f.e.d.y.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: f.e.d.y.n.l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.e.d.v<?> a(f.e.d.y.c r9, f.e.d.f r10, f.e.d.z.a<?> r11, f.e.d.x.b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            f.e.d.z.a r0 = f.e.d.z.a.a(r0)
            f.e.d.y.i r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof f.e.d.v
            if (r0 == 0) goto L_0x0017
            f.e.d.v r9 = (f.e.d.v) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof f.e.d.w
            if (r0 == 0) goto L_0x0022
            f.e.d.w r9 = (f.e.d.w) r9
            f.e.d.v r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof f.e.d.s
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof f.e.d.k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            f.e.d.s r0 = (f.e.d.s) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof f.e.d.k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            f.e.d.k r1 = (f.e.d.k) r1
        L_0x006b:
            r4 = r1
            f.e.d.y.n.l r9 = new f.e.d.y.n.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            f.e.d.v r9 = r9.b()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.d.y.n.d.a(f.e.d.y.c, f.e.d.f, f.e.d.z.a, f.e.d.x.b):f.e.d.v");
    }

    public <T> v<T> create(f fVar, a<T> aVar) {
        b bVar = (b) aVar.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f4379e, fVar, aVar, bVar);
    }
}
