package f.e.e.l;

public final class b extends n {
    private static final char[] a;
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', '.'};

    /* renamed from: d  reason: collision with root package name */
    private static final char f4514d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        a = cArr;
        f4514d = cArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] c(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 >= r3) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x000e:
            char r3 = f4514d
            r0.append(r3)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
            goto L_0x0079
        L_0x001e:
            char r0 = r11.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r3 = r11.length()
            int r3 = r3 - r2
            char r3 = r11.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = a
            boolean r5 = f.e.e.l.a.a(r4, r0)
            boolean r4 = f.e.e.l.a.a(r4, r3)
            char[] r6 = b
            boolean r0 = f.e.e.l.a.a(r6, r0)
            boolean r3 = f.e.e.l.a.a(r6, r3)
            java.lang.String r6 = "Invalid start/end guards: "
            if (r5 == 0) goto L_0x005c
            if (r4 == 0) goto L_0x004e
            goto L_0x0079
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x005c:
            if (r0 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x006f:
            if (r4 != 0) goto L_0x014a
            if (r3 != 0) goto L_0x014a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x000e
        L_0x0079:
            r0 = 20
            r3 = 1
        L_0x007c:
            int r4 = r11.length()
            int r4 = r4 - r2
            if (r3 >= r4) goto L_0x00cf
            char r4 = r11.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x00ca
            char r4 = r11.charAt(r3)
            r5 = 45
            if (r4 == r5) goto L_0x00ca
            char r4 = r11.charAt(r3)
            r5 = 36
            if (r4 != r5) goto L_0x009e
            goto L_0x00ca
        L_0x009e:
            char[] r4 = c
            char r5 = r11.charAt(r3)
            boolean r4 = f.e.e.l.a.a(r4, r5)
            if (r4 == 0) goto L_0x00ad
            int r0 = r0 + 10
            goto L_0x00cc
        L_0x00ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot encode : '"
            r1.<init>(r2)
            char r11 = r11.charAt(r3)
            r1.append(r11)
            r11 = 39
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00ca:
            int r0 = r0 + 9
        L_0x00cc:
            int r3 = r3 + 1
            goto L_0x007c
        L_0x00cf:
            int r3 = r11.length()
            int r3 = r3 - r2
            int r0 = r0 + r3
            boolean[] r0 = new boolean[r0]
            r3 = 0
            r4 = 0
        L_0x00d9:
            int r5 = r11.length()
            if (r3 >= r5) goto L_0x0149
            char r5 = r11.charAt(r3)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r3 == 0) goto L_0x00f0
            int r6 = r11.length()
            int r6 = r6 - r2
            if (r3 != r6) goto L_0x010c
        L_0x00f0:
            r6 = 42
            if (r5 == r6) goto L_0x010a
            r6 = 69
            if (r5 == r6) goto L_0x0107
            r6 = 78
            if (r5 == r6) goto L_0x0104
            r6 = 84
            if (r5 == r6) goto L_0x0101
            goto L_0x010c
        L_0x0101:
            r5 = 65
            goto L_0x010c
        L_0x0104:
            r5 = 66
            goto L_0x010c
        L_0x0107:
            r5 = 68
            goto L_0x010c
        L_0x010a:
            r5 = 67
        L_0x010c:
            r6 = 0
        L_0x010d:
            char[] r7 = f.e.e.l.a.a
            int r8 = r7.length
            if (r6 >= r8) goto L_0x011e
            char r7 = r7[r6]
            if (r5 != r7) goto L_0x011b
            int[] r5 = f.e.e.l.a.b
            r5 = r5[r6]
            goto L_0x011f
        L_0x011b:
            int r6 = r6 + 1
            goto L_0x010d
        L_0x011e:
            r5 = 0
        L_0x011f:
            r6 = 0
            r7 = 1
        L_0x0121:
            r8 = 0
        L_0x0122:
            r9 = 7
            if (r6 >= r9) goto L_0x013b
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r2
            if (r9 == 0) goto L_0x0136
            if (r8 != r2) goto L_0x0133
            goto L_0x0136
        L_0x0133:
            int r8 = r8 + 1
            goto L_0x0122
        L_0x0136:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L_0x0121
        L_0x013b:
            int r5 = r11.length()
            int r5 = r5 - r2
            if (r3 >= r5) goto L_0x0146
            r0[r4] = r1
            int r4 = r4 + 1
        L_0x0146:
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x0149:
            return r0
        L_0x014a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.e.l.b.c(java.lang.String):boolean[]");
    }
}
