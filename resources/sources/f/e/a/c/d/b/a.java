package f.e.a.c.d.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public final class a {
    public static final int a;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L_0x0029;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = 0
            r3 = 31
            if (r0 < r3) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            r3 = 30
            if (r0 < r3) goto L_0x0028
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L_0x0028
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L_0x0028
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.c.d.b.a.<clinit>():void");
    }

    public static PendingIntent a(Context context, int i2, Intent intent, int i3) {
        return PendingIntent.getBroadcast(context, 0, intent, i3);
    }
}