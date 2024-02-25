package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import m.y.d.l;

public final class y {
    public static final y a = new y();
    private static final HashSet<String> b = e0.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private y() {
    }

    public static final boolean a(Context context, String str) {
        l.d(context, "context");
        l.d(str, "packageName");
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        l.c(str2, "brand");
        if (p.t(str2, "generic", false, 2, (Object) null) && (i2 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            l.c(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            l.c(signatureArr2, "packageInfo.signatures");
            for (Signature byteArray : signatureArr2) {
                HashSet<String> hashSet = b;
                o0 o0Var = o0.a;
                byte[] byteArray2 = byteArray.toByteArray();
                l.c(byteArray2, "it.toByteArray()");
                if (!r.n(hashSet, o0.z0(byteArray2))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
