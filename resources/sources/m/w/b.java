package m.w;

import m.y.d.l;

public final class b {
    public static final a a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: m.w.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: m.w.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<m.w.a> r0 = m.w.a.class
            int r1 = a()
            java.lang.String r2 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)"
            java.lang.String r3 = ", base type classloader: "
            java.lang.String r4 = "Instance classloader: "
            java.lang.String r5 = "forName(\"kotlin.internal…entations\").newInstance()"
            r6 = 65544(0x10008, float:9.1847E-41)
            if (r1 < r6) goto L_0x0094
            java.lang.String r6 = "m.w.e.a"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.Object r6 = r6.newInstance()     // Catch:{ ClassNotFoundException -> 0x0053 }
            m.y.d.l.c(r6, r5)     // Catch:{ ClassNotFoundException -> 0x0053 }
            m.w.a r6 = (m.w.a) r6     // Catch:{ ClassCastException -> 0x0024 }
            goto L_0x011e
        L_0x0024:
            r7 = move-exception
            java.lang.Class r6 = r6.getClass()     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0053 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0053 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0053 }
            r10.append(r6)     // Catch:{ ClassNotFoundException -> 0x0053 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x0053 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.String r6 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0053 }
            r9.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.Throwable r6 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x0053 }
            m.y.d.l.c(r6, r2)     // Catch:{ ClassNotFoundException -> 0x0053 }
            throw r6     // Catch:{ ClassNotFoundException -> 0x0053 }
        L_0x0053:
            java.lang.String r6 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.Object r6 = r6.newInstance()     // Catch:{ ClassNotFoundException -> 0x0093 }
            m.y.d.l.c(r6, r5)     // Catch:{ ClassNotFoundException -> 0x0093 }
            m.w.a r6 = (m.w.a) r6     // Catch:{ ClassCastException -> 0x0064 }
            goto L_0x011e
        L_0x0064:
            r7 = move-exception
            java.lang.Class r6 = r6.getClass()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r6)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.String r6 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0093 }
            r9.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.Throwable r6 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x0093 }
            m.y.d.l.c(r6, r2)     // Catch:{ ClassNotFoundException -> 0x0093 }
            throw r6     // Catch:{ ClassNotFoundException -> 0x0093 }
        L_0x0093:
        L_0x0094:
            r6 = 65543(0x10007, float:9.1845E-41)
            if (r1 < r6) goto L_0x0119
            java.lang.String r1 = "m.w.d.a"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            m.y.d.l.c(r1, r5)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r6 = r1
            m.w.a r6 = (m.w.a) r6     // Catch:{ ClassCastException -> 0x00aa }
            goto L_0x011e
        L_0x00aa:
            r6 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r9.append(r4)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r9.append(r1)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r9.append(r3)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r9.append(r7)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.String r1 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r8.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            java.lang.Throwable r1 = r8.initCause(r6)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            m.y.d.l.c(r1, r2)     // Catch:{ ClassNotFoundException -> 0x00d9 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00d9 }
        L_0x00d9:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0119 }
            m.y.d.l.c(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0119 }
            r6 = r1
            m.w.a r6 = (m.w.a) r6     // Catch:{ ClassCastException -> 0x00ea }
            goto L_0x011e
        L_0x00ea:
            r5 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0119 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0119 }
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x0119 }
            r7.append(r1)     // Catch:{ ClassNotFoundException -> 0x0119 }
            r7.append(r3)     // Catch:{ ClassNotFoundException -> 0x0119 }
            r7.append(r0)     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.String r0 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0119 }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0119 }
            java.lang.Throwable r0 = r6.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x0119 }
            m.y.d.l.c(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0119 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0119 }
        L_0x0119:
            m.w.a r6 = new m.w.a
            r6.<init>()
        L_0x011e:
            a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.w.b.<clinit>():void");
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int E = q.E(property, '.', 0, false, 6, (Object) null);
        if (E < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i2 = E + 1;
            int E2 = q.E(property, '.', i2, false, 4, (Object) null);
            if (E2 < 0) {
                E2 = property.length();
            }
            String substring = property.substring(0, E);
            l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i2, E2);
            l.c(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
