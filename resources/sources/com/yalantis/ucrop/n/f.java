package com.yalantis.ucrop.n;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class f {
    private static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    private final b a;

    private static class a {
        private final ByteBuffer a;

        public a(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            return this.a.getShort(i2);
        }

        public int b(int i2) {
            return this.a.getInt(i2);
        }

        public int c() {
            return this.a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    private interface b {
        int a(byte[] bArr, int i2);

        short b();

        int c();

        long skip(long j2);
    }

    private static class c implements b {
        private final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a(byte[] bArr, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                int read = this.a.read(bArr, i2 - i3, i3);
                if (read == -1) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }

        public short b() {
            return (short) (this.a.read() & 255);
        }

        public int c() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        public long skip(long j2) {
            if (j2 < 0) {
                return 0;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }
    }

    public f(InputStream inputStream) {
        this.a = new c(inputStream);
    }

    private static int a(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058 A[SYNTHETIC, Splitter:B:28:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066 A[SYNTHETIC, Splitter:B:33:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076 A[SYNTHETIC, Splitter:B:39:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[SYNTHETIC, Splitter:B:44:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto L_0x000a
            java.lang.String r4 = "context is null"
            android.util.Log.d(r0, r4)
            return
        L_0x000a:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            e.i.a.a r2 = new e.i.a.a     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            r2.<init>((java.io.InputStream) r7)     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            e.i.a.a r4 = new e.i.a.a     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            r4.<init>((java.io.FileDescriptor) r8)     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            f(r2, r4, r5, r6)     // Catch:{ IOException -> 0x0046, all -> 0x0042 }
            if (r7 == 0) goto L_0x003c
            r7.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L_0x003c:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0072
        L_0x0042:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L_0x0074
        L_0x0046:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L_0x004f
        L_0x004a:
            r4 = move-exception
            r5 = r1
            goto L_0x0074
        L_0x004d:
            r4 = move-exception
            r5 = r1
        L_0x004f:
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x0073 }
            android.util.Log.d(r0, r6, r4)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0064
        L_0x005c:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            android.util.Log.d(r0, r6, r4)
        L_0x0064:
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0072
        L_0x006a:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L_0x0072:
            return
        L_0x0073:
            r4 = move-exception
        L_0x0074:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x0082
        L_0x007a:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            android.util.Log.d(r0, r7, r6)
        L_0x0082:
            if (r5 == 0) goto L_0x0090
            r5.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x0090
        L_0x0088:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            android.util.Log.d(r0, r6, r5)
        L_0x0090:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.n.f.b(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    public static void c(Context context, int i2, int i3, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            f(new e.i.a.a(inputStream), new e.i.a.a(str), i2, i3);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    Log.d("ImageHeaderParser", e2.getMessage(), e2);
                }
            }
        } catch (IOException e3) {
            Log.d("ImageHeaderParser", e3.getMessage(), e3);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.d("ImageHeaderParser", e4.getMessage(), e4);
                }
            }
            throw th;
        }
    }

    public static void d(Context context, e.i.a.a aVar, int i2, int i3, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
            f(aVar, new e.i.a.a(parcelFileDescriptor.getFileDescriptor()), i2, i3);
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e2) {
                    Log.d("ImageHeaderParser", e2.getMessage(), e2);
                }
            }
        } catch (IOException e3) {
            Log.d("ImageHeaderParser", e3.getMessage());
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e4) {
                    Log.d("ImageHeaderParser", e4.getMessage(), e4);
                }
            }
            throw th;
        }
    }

    public static void e(e.i.a.a aVar, int i2, int i3, String str) {
        try {
            f(aVar, new e.i.a.a(str), i2, i3);
        } catch (IOException e2) {
            Log.d("ImageHeaderParser", e2.getMessage());
        }
    }

    private static void f(e.i.a.a aVar, e.i.a.a aVar2, int i2, int i3) {
        e.i.a.a aVar3 = aVar2;
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i4 = 0; i4 < 22; i4++) {
            String str = strArr[i4];
            String d2 = aVar.d(str);
            if (!TextUtils.isEmpty(d2)) {
                aVar3.W(str, d2);
            }
        }
        aVar3.W("ImageWidth", String.valueOf(i2));
        aVar3.W("ImageLength", String.valueOf(i3));
        aVar3.W("Orientation", "0");
        aVar2.S();
    }

    private static boolean h(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    private boolean i(byte[] bArr, int i2) {
        boolean z = bArr != null && i2 > b.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = b;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    return false;
                } else {
                    i3++;
                }
            }
        }
        return z;
    }

    private int j() {
        short b2;
        int c2;
        long j2;
        long skip;
        do {
            short b3 = this.a.b();
            if (b3 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + b3);
                }
                return -1;
            }
            b2 = this.a.b();
            if (b2 == 218) {
                return -1;
            }
            if (b2 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c2 = this.a.c() - 2;
            if (b2 == 225) {
                return c2;
            }
            j2 = (long) c2;
            skip = this.a.skip(j2);
        } while (skip == j2);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + b2 + ", wanted to skip: " + c2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(com.yalantis.ucrop.n.f.a r12) {
        /*
            r0 = 6
            short r1 = r12.a(r0)
            r2 = 3
            java.lang.String r3 = "ImageHeaderParser"
            r4 = 19789(0x4d4d, float:2.773E-41)
            if (r1 != r4) goto L_0x000f
        L_0x000c:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L_0x0031
        L_0x000f:
            r4 = 18761(0x4949, float:2.629E-41)
            if (r1 != r4) goto L_0x0016
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L_0x0031
        L_0x0016:
            boolean r4 = android.util.Log.isLoggable(r3, r2)
            if (r4 == 0) goto L_0x000c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown endianness = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.d(r3, r1)
            goto L_0x000c
        L_0x0031:
            r12.d(r1)
            r1 = 10
            int r1 = r12.b(r1)
            int r1 = r1 + r0
            short r0 = r12.a(r1)
            r4 = 0
        L_0x0040:
            if (r4 >= r0) goto L_0x0123
            int r5 = a(r1, r4)
            short r6 = r12.a(r5)
            r7 = 274(0x112, float:3.84E-43)
            if (r6 == r7) goto L_0x0050
            goto L_0x011f
        L_0x0050:
            int r7 = r5 + 2
            short r7 = r12.a(r7)
            r8 = 1
            if (r7 < r8) goto L_0x0105
            r8 = 12
            if (r7 <= r8) goto L_0x005f
            goto L_0x0105
        L_0x005f:
            int r8 = r5 + 4
            int r8 = r12.b(r8)
            if (r8 >= 0) goto L_0x0071
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.String r5 = "Negative tiff component count"
            goto L_0x011c
        L_0x0071:
            boolean r9 = android.util.Log.isLoggable(r3, r2)
            java.lang.String r10 = " tagType="
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Got tagIndex="
            r9.append(r11)
            r9.append(r4)
            r9.append(r10)
            r9.append(r6)
            java.lang.String r11 = " formatCode="
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = " componentCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r3, r9)
        L_0x00a3:
            int[] r9 = c
            r9 = r9[r7]
            int r8 = r8 + r9
            r9 = 4
            if (r8 <= r9) goto L_0x00b9
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got byte count > 4, not orientation, continuing, formatCode="
            goto L_0x0112
        L_0x00b9:
            int r5 = r5 + 8
            if (r5 < 0) goto L_0x00e7
            int r7 = r12.c()
            if (r5 <= r7) goto L_0x00c4
            goto L_0x00e7
        L_0x00c4:
            if (r8 < 0) goto L_0x00d3
            int r8 = r8 + r5
            int r7 = r12.c()
            if (r8 <= r7) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            short r12 = r12.a(r5)
            return r12
        L_0x00d3:
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Illegal number of bytes for TI tag data tagType="
            r5.append(r7)
            r5.append(r6)
            goto L_0x0118
        L_0x00e7:
            boolean r7 = android.util.Log.isLoggable(r3, r2)
            if (r7 == 0) goto L_0x011f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal tagValueOffset="
            r7.append(r8)
            r7.append(r5)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            goto L_0x011c
        L_0x0105:
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got invalid format code = "
        L_0x0112:
            r5.append(r6)
            r5.append(r7)
        L_0x0118:
            java.lang.String r5 = r5.toString()
        L_0x011c:
            android.util.Log.d(r3, r5)
        L_0x011f:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x0123:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.n.f.k(com.yalantis.ucrop.n.f$a):int");
    }

    private int l(byte[] bArr, int i2) {
        int a2 = this.a.a(bArr, i2);
        if (a2 != i2) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + a2);
            }
            return -1;
        } else if (i(bArr, i2)) {
            return k(new a(bArr, i2));
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    public int g() {
        int c2 = this.a.c();
        if (!h(c2)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + c2);
            }
            return -1;
        }
        int j2 = j();
        if (j2 != -1) {
            return l(new byte[j2], j2);
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
        }
        return -1;
    }
}
