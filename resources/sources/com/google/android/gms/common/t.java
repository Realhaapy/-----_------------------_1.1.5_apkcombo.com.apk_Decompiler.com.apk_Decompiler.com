package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.m1;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n1;
import f.e.a.c.c.a;
import f.e.a.c.c.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class t extends m1 {
    private final int a;

    protected t(byte[] bArr) {
        n.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int Z() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] c();

    public final boolean equals(Object obj) {
        a s2;
        if (obj != null && (obj instanceof n1)) {
            try {
                n1 n1Var = (n1) obj;
                if (n1Var.Z() != this.a || (s2 = n1Var.s()) == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) b.b(s2));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final a s() {
        return b.c(c());
    }
}
