package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.l.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest b;
        PackageInfo d2 = c.a(context).d(str, 64);
        Signature[] signatureArr = d2.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = b("SHA1")) == null) {
            return null;
        }
        return b.digest(d2.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
