package com.google.android.gms.common.util;

public class h {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i2 = 0;
        while (i2 < length && (!z || i2 != length - 1 || (bArr[i2] & 255) != 0)) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
            i2++;
        }
        return sb.toString();
    }
}
