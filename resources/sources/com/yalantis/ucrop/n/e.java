package com.yalantis.ucrop.n;

public class e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r8, android.net.Uri r9, android.net.Uri r10) {
        /*
            boolean r0 = r9.equals(r10)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x004f }
            java.io.InputStream r9 = r1.openInputStream(r9)     // Catch:{ all -> 0x004f }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x004a }
            java.io.OutputStream r0 = r8.openOutputStream(r10)     // Catch:{ all -> 0x004a }
            boolean r8 = r9 instanceof java.io.FileInputStream     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x0042
            boolean r8 = r0 instanceof java.io.FileOutputStream     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x0042
            r8 = r9
            java.io.FileInputStream r8 = (java.io.FileInputStream) r8     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x004a }
            r8 = r0
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel r6 = r8.getChannel()     // Catch:{ all -> 0x004a }
            r2 = 0
            long r4 = r1.size()     // Catch:{ all -> 0x004a }
            r1.transferTo(r2, r4, r6)     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x003c
            r9.close()
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()
        L_0x0041:
            return
        L_0x0042:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004a }
            java.lang.String r10 = "The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly."
            r8.<init>(r10)     // Catch:{ all -> 0x004a }
            throw r8     // Catch:{ all -> 0x004a }
        L_0x004a:
            r8 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x0051
        L_0x004f:
            r8 = move-exception
            r9 = r0
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r0.close()
        L_0x0056:
            if (r9 == 0) goto L_0x005b
            r9.close()
        L_0x005b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.n.e.a(android.content.Context, android.net.Uri, android.net.Uri):void");
    }
}
