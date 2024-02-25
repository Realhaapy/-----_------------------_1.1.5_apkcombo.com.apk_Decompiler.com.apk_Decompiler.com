package m.x;

class f extends e {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        m.x.b.a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            m.y.d.l.d(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x00a5 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0083
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x00a5 }
            r3 = 0
            r4 = r2
            r6 = 0
        L_0x001d:
            if (r4 <= 0) goto L_0x0029
            int r7 = r0.read(r1, r6, r4)     // Catch:{ all -> 0x00a5 }
            if (r7 >= 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0029:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r4 <= 0) goto L_0x0036
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ all -> 0x00a5 }
            m.y.d.l.c(r1, r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x0065
        L_0x0036:
            int r4 = r0.read()     // Catch:{ all -> 0x00a5 }
            r6 = -1
            if (r4 != r6) goto L_0x003e
            goto L_0x0065
        L_0x003e:
            m.x.c r6 = new m.x.c     // Catch:{ all -> 0x00a5 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x00a5 }
            r6.write(r4)     // Catch:{ all -> 0x00a5 }
            r4 = 2
            m.x.a.b(r0, r6, r3, r4, r8)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + r2
            if (r4 < 0) goto L_0x0069
            byte[] r10 = r6.a()     // Catch:{ all -> 0x00a5 }
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ all -> 0x00a5 }
            m.y.d.l.c(r1, r7)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            byte[] unused = m.t.e.b(r10, r1, r2, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x0065:
            m.x.b.a(r0, r8)
            return r1
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            r2.append(r5)     // Catch:{ all -> 0x00a5 }
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r4.<init>()     // Catch:{ all -> 0x00a5 }
            r4.append(r5)     // Catch:{ all -> 0x00a5 }
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big ("
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            r4.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " bytes) to fit in memory."
            r4.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00a5 }
            r3.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            m.x.b.a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.x.f.a(java.io.File):byte[]");
    }
}
