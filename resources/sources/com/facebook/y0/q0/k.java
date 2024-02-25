package com.facebook.y0.q0;

import android.os.AsyncTask;
import java.io.File;
import m.y.d.l;

public final class k extends AsyncTask<String, Void, Boolean> {
    private final String a;
    private final File b;
    private final a c;

    public interface a {
        void a(File file);
    }

    public k(String str, File file, a aVar) {
        l.d(str, "uriStr");
        l.d(file, "destFile");
        l.d(aVar, "onSuccess");
        this.a = str;
        this.b = file;
        this.c = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "args"
            m.y.d.l.d(r5, r0)     // Catch:{ all -> 0x0048 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = r4.a     // Catch:{ Exception -> 0x0045 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0045 }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x0045 }
            int r0 = r0.getContentLength()     // Catch:{ Exception -> 0x0045 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0045 }
            java.io.InputStream r5 = r5.openStream()     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0045 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0045 }
            r2.close()     // Catch:{ Exception -> 0x0045 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0045 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0045 }
            java.io.File r3 = r4.b     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0045 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0045 }
            r0.write(r5)     // Catch:{ Exception -> 0x0045 }
            r0.flush()     // Catch:{ Exception -> 0x0045 }
            r0.close()     // Catch:{ Exception -> 0x0045 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0045 }
            return r5
        L_0x0045:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0048 }
            return r5
        L_0x0048:
            r5 = move-exception
            com.facebook.internal.s0.n.a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.q0.k.a(java.lang.String[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    public void b(boolean z) {
        if (!com.facebook.internal.s0.n.a.d(this) && z) {
            try {
                this.c.a(this.b);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                b(((Boolean) obj).booleanValue());
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
