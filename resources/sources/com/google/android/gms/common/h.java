package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.n;

public class h {
    private static h a;

    public h(Context context) {
        context.getApplicationContext();
    }

    public static h a(Context context) {
        n.h(context);
        synchronized (h.class) {
            if (a == null) {
                x.a(context);
                a = new h(context);
            }
        }
        return a;
    }

    static final t b(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < tVarArr.length; i2++) {
            if (tVarArr[i2].equals(uVar)) {
                return tVarArr[i2];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        t tVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                tVar = b(packageInfo, w.a);
            } else {
                tVar = b(packageInfo, w.a[0]);
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }
}
