package com.facebook.y0.k0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.m0.n.f;
import java.util.ArrayList;
import java.util.List;
import m.y.d.l;

public final class d {
    public static final d a = new d();

    private d() {
    }

    public static final List<String> a(View view) {
        Class<d> cls = d.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(view, "view");
            ArrayList arrayList = new ArrayList();
            f fVar = f.a;
            ViewGroup j2 = f.j(view);
            if (j2 != null) {
                for (View next : f.b(j2)) {
                    if (view != next) {
                        arrayList.addAll(a.c(next));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|(1:7)|8|(1:10)|11|12|13|(2:15|(2:17|(1:19))(2:20|21))|22|23|(5:26|(1:28)(1:29)|(1:(2:34|46)(3:42|35|36))|41|24)|43|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ all -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> b(android.view.View r8) {
        /*
            java.lang.Class<com.facebook.y0.k0.d> r0 = com.facebook.y0.k0.d.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            m.y.d.l.d(r8, r1)     // Catch:{ all -> 0x00b8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            com.facebook.y0.m0.n.f r3 = com.facebook.y0.m0.n.f.a     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = com.facebook.y0.m0.n.f.i(r8)     // Catch:{ all -> 0x00b8 }
            r1.add(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r3 = r8.getTag()     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b8 }
            r1.add(r3)     // Catch:{ all -> 0x00b8 }
        L_0x002a:
            java.lang.CharSequence r3 = r8.getContentDescription()     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b8 }
            r1.add(r3)     // Catch:{ all -> 0x00b8 }
        L_0x0037:
            r3 = 1
            r4 = 0
            int r5 = r8.getId()     // Catch:{ NotFoundException -> 0x0078 }
            r6 = -1
            if (r5 == r6) goto L_0x0078
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ NotFoundException -> 0x0078 }
            int r8 = r8.getId()     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r8 = r5.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "resourceName"
            m.y.d.l.c(r8, r5)     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "/"
            m.d0.f r6 = new m.d0.f     // Catch:{ NotFoundException -> 0x0078 }
            r6.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0078 }
            java.util.List r8 = r6.c(r8, r4)     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.Object[] r8 = r8.toArray(r5)     // Catch:{ NotFoundException -> 0x0078 }
            if (r8 == 0) goto L_0x0070
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ NotFoundException -> 0x0078 }
            int r5 = r8.length     // Catch:{ NotFoundException -> 0x0078 }
            r6 = 2
            if (r5 != r6) goto L_0x0078
            r8 = r8[r3]     // Catch:{ NotFoundException -> 0x0078 }
            r1.add(r8)     // Catch:{ NotFoundException -> 0x0078 }
            goto L_0x0078
        L_0x0070:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ NotFoundException -> 0x0078 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r5)     // Catch:{ NotFoundException -> 0x0078 }
            throw r8     // Catch:{ NotFoundException -> 0x0078 }
        L_0x0078:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00b8 }
            r8.<init>()     // Catch:{ all -> 0x00b8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b8 }
        L_0x0081:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00b8 }
            int r6 = r5.length()     // Catch:{ all -> 0x00b8 }
            if (r6 <= 0) goto L_0x0095
            r6 = 1
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            if (r6 == 0) goto L_0x0081
            int r6 = r5.length()     // Catch:{ all -> 0x00b8 }
            r7 = 100
            if (r6 > r7) goto L_0x0081
            if (r5 == 0) goto L_0x00af
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            m.y.d.l.c(r5, r6)     // Catch:{ all -> 0x00b8 }
            r8.add(r5)     // Catch:{ all -> 0x00b8 }
            goto L_0x0081
        L_0x00af:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r1)     // Catch:{ all -> 0x00b8 }
            throw r8     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            return r8
        L_0x00b8:
            r8 = move-exception
            com.facebook.internal.s0.n.a.b(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.k0.d.b(android.view.View):java.util.List");
    }

    private final List<String> c(View view) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if ((obj.length() > 0) && obj.length() < 100) {
                    if (obj != null) {
                        String lowerCase = obj.toLowerCase();
                        l.c(lowerCase, "(this as java.lang.String).toLowerCase()");
                        arrayList.add(lowerCase);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return arrayList;
            }
            f fVar = f.a;
            for (View c : f.b(view)) {
                arrayList.addAll(c(c));
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final boolean d(String str, List<String> list) {
        if (a.d(this)) {
            return false;
        }
        try {
            for (String w : list) {
                if (q.w(str, w, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    public static final boolean e(List<String> list, List<String> list2) {
        Class<d> cls = d.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            l.d(list, "indicators");
            l.d(list2, "keys");
            for (String d2 : list) {
                if (a.d(d2, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    public static final boolean f(String str, String str2) {
        Class<d> cls = d.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            l.d(str, "text");
            l.d(str2, "rule");
            return new m.d0.f(str2).a(str);
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }
}
