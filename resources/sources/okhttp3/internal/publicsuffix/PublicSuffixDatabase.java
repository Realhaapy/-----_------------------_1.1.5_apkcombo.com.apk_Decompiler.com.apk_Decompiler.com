package okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p.e0.c;
import q.e;
import q.j;
import q.l;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f5070e = {42};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f5071f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f5072g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    private static final PublicSuffixDatabase f5073h = new PublicSuffixDatabase();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final CountDownLatch b = new CountDownLatch(1);
    private byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f5074d;

    private static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        byte b2;
        int i4;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr3[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i3 = i7 + i8;
                if (bArr3[i3] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i3 - i7;
            int i10 = i2;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b2 = 46;
                    z = false;
                } else {
                    z = z2;
                    b2 = bArr4[i10][i11] & 255;
                }
                i4 = b2 - (bArr3[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, c.f5131d);
                        }
                    }
                }
                i5 = i3 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    private String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i2 = 0;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            f();
        }
        synchronized (this) {
            if (this.c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            bArr[i3] = strArr[i3].getBytes(c.f5131d);
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.c, bArr, i4);
            if (str2 != null) {
                break;
            }
            i4++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i5 = 0;
            while (true) {
                if (i5 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i5] = f5070e;
                str3 = a(this.c, bArr2, i5);
                if (str3 != null) {
                    break;
                }
                i5++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i2 >= length - 1) {
                    break;
                }
                String a2 = a(this.f5074d, bArr, i2);
                if (a2 != null) {
                    str = a2;
                    break;
                }
                i2++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f5072g;
        } else {
            String[] split = str2 != null ? str2.split("\\.") : f5071f;
            String[] split2 = str3 != null ? str3.split("\\.") : f5071f;
            return split.length > split2.length ? split : split2;
        }
    }

    public static PublicSuffixDatabase c() {
        return f5073h;
    }

    private void e() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            e b2 = l.b(new j(l.g(resourceAsStream)));
            try {
                byte[] bArr = new byte[b2.readInt()];
                b2.readFully(bArr);
                byte[] bArr2 = new byte[b2.readInt()];
                b2.readFully(bArr2);
                synchronized (this) {
                    this.c = bArr;
                    this.f5074d = bArr2;
                }
                this.b.countDown();
            } finally {
                c.e(b2);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.e()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            p.e0.j.g r2 = p.e0.j.g.l()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.s(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.f():void");
    }

    public String d(String str) {
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] b2 = b(split);
        if (split.length == b2.length && b2[0].charAt(0) != '!') {
            return null;
        }
        char charAt = b2[0].charAt(0);
        int length = split.length;
        int length2 = b2.length;
        if (charAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i2 = length - length2; i2 < split2.length; i2++) {
            sb.append(split2[i2]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
