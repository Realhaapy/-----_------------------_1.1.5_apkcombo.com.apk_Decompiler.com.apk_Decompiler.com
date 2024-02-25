package e.f.k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import e.e.e;
import e.f.j.f.g;
import e.f.j.f.j;
import e.f.o.g;

public class d {
    private static final j a;
    private static final e<String, Typeface> b = new e<>(16);

    public static class a extends g.c {
        private j.e a;

        public a(j.e eVar) {
            this.a = eVar;
        }

        public void a(int i2) {
            j.e eVar = this.a;
            if (eVar != null) {
                eVar.d(i2);
            }
        }

        public void b(Typeface typeface) {
            j.e eVar = this.a;
            if (eVar != null) {
                eVar.f(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.m()) ? i2 >= 21 ? new e() : new j() : new f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = g(r2, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = g(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.k.d.a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        return a.c(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface c(Context context, g.b bVar, Resources resources, int i2, String str, int i3, int i4, j.e eVar, Handler handler, boolean z) {
        Typeface typeface;
        g.b bVar2 = bVar;
        j.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof g.e) {
            g.e eVar3 = (g.e) bVar2;
            Typeface h2 = h(eVar3.c());
            if (h2 != null) {
                if (eVar2 != null) {
                    eVar2.b(h2, handler2);
                }
                return h2;
            }
            typeface = e.f.o.g.a(context, eVar3.b(), i4, !z ? eVar2 == null : eVar3.a() == 0, z ? eVar3.d() : -1, j.e.c(handler), new a(eVar2));
            Resources resources2 = resources;
            int i5 = i4;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = a.b(context, (g.c) bVar2, resources, i4);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.b(typeface, handler2);
                } else {
                    eVar2.a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            b.d(e(resources, i2, str, i3, i4), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface e2 = a.e(context, resources, i2, str, i4);
        if (e2 != null) {
            b.d(e(resources, i2, str, i3, i4), e2);
        }
        return e2;
    }

    private static String e(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }

    public static Typeface f(Resources resources, int i2, String str, int i3, int i4) {
        return b.c(e(resources, i2, str, i3, i4));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) {
        j jVar = a;
        g.c i3 = jVar.i(typeface);
        if (i3 == null) {
            return null;
        }
        return jVar.b(context, i3, context.getResources(), i2);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
