package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class o {
    private static final Map<String, o> c = new HashMap();
    private final Context a;
    private final String b;

    private o(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static synchronized o c(Context context, String str) {
        o oVar;
        synchronized (o.class) {
            Map<String, o> map = c;
            if (!map.containsKey(str)) {
                map.put(str, new o(context, str));
            }
            oVar = map.get(str);
        }
        return oVar;
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[SYNTHETIC, Splitter:B:15:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.k d() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.a     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            java.lang.String r2 = r6.b     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            com.google.firebase.remoteconfig.internal.k r0 = com.google.firebase.remoteconfig.internal.k.b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x0029:
            monitor-exit(r6)
            return r0
        L_0x002b:
            r0 = move-exception
            goto L_0x0031
        L_0x002d:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0037:
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0041:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.o.d():com.google.firebase.remoteconfig.internal.k");
    }

    public synchronized Void e(k kVar) {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
        try {
            openFileOutput.write(kVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
