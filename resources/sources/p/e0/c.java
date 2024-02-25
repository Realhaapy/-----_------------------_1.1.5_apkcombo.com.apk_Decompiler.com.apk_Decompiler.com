package p.e0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p.b0;
import p.r;
import p.u;
import p.z;
import q.f;
import q.s;
import q.t;

public final class c {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final b0 c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f5131d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f5132e = TimeZone.getTimeZone("GMT");

    /* renamed from: f  reason: collision with root package name */
    public static final Comparator<String> f5133f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final Method f5134g;

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f5135h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    class b implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        Method method = null;
        c = b0.g((u) null, bArr);
        z.c((u) null, bArr);
        f.f("efbbbf");
        f.f("feff");
        f.f("fffe");
        f.f("0000ffff");
        f.f("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f5134g = method;
    }

    public static X509TrustManager A() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw b("No System TLS", e2);
        }
    }

    public static boolean B(s sVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = sVar.d().e() ? sVar.d().c() - nanoTime : Long.MAX_VALUE;
        sVar.d().d(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            q.c cVar = new q.c();
            while (sVar.F(cVar, 8192) != -1) {
                cVar.v();
            }
            int i3 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            t d2 = sVar.d();
            if (i3 == 0) {
                d2.a();
            } else {
                d2.d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i4 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            t d3 = sVar.d();
            if (i4 == 0) {
                d3.a();
            } else {
                d3.d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            int i5 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            t d4 = sVar.d();
            if (i5 == 0) {
                d4.a();
            } else {
                d4.d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int C(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int D(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory E(String str, boolean z) {
        return new b(str, z);
    }

    public static r F(List<p.e0.i.c> list) {
        r.a aVar = new r.a();
        for (p.e0.i.c next : list) {
            a.a.b(aVar, next.a.A(), next.b.A());
        }
        return aVar.d();
    }

    public static String G(String str, int i2, int i3) {
        int C = C(str, i2, i3);
        return str.substring(C, D(str, C, i3));
    }

    public static boolean H(String str) {
        return f5135h.matcher(str).matches();
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = f5134g;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static String c(String str) {
        if (str.contains(":")) {
            InetAddress k2 = (!str.startsWith("[") || !str.endsWith("]")) ? k(str, 0, str.length()) : k(str, 1, str.length() - 1);
            if (k2 == null) {
                return null;
            }
            byte[] address = k2.getAddress();
            if (address.length == 16) {
                return w(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !h(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void d(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!y(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                if (!"bio == null".equals(e3.getMessage())) {
                    throw e3;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String[] g(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    private static boolean h(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int i(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    private static boolean j(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char charAt = str.charAt(i6);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i6++;
                }
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    private static InetAddress k(String str, int i2, int i3) {
        byte[] bArr = new byte[16];
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            if (i2 >= i3) {
                break;
            } else if (i4 == 16) {
                return null;
            } else {
                int i7 = i2 + 2;
                if (i7 > i3 || !str.regionMatches(i2, "::", 0, 2)) {
                    if (i4 != 0) {
                        if (str.regionMatches(i2, ":", 0, 1)) {
                            i2++;
                        } else if (!str.regionMatches(i2, ".", 0, 1) || !j(str, i6, i3, bArr, i4 - 2)) {
                            return null;
                        } else {
                            i4 += 2;
                        }
                    }
                    i6 = i2;
                } else if (i5 != -1) {
                    return null;
                } else {
                    i4 += 2;
                    i5 = i4;
                    if (i7 == i3) {
                        break;
                    }
                    i6 = i7;
                }
                i2 = i6;
                int i8 = 0;
                while (i2 < i3) {
                    int i9 = i(str.charAt(i2));
                    if (i9 == -1) {
                        break;
                    }
                    i8 = (i8 << 4) + i9;
                    i2++;
                }
                int i10 = i2 - i6;
                if (i10 == 0 || i10 > 4) {
                    return null;
                }
                int i11 = i4 + 1;
                bArr[i4] = (byte) ((i8 >>> 8) & 255);
                i4 = i11 + 1;
                bArr[i11] = (byte) (i8 & 255);
            }
        }
        if (i4 != 16) {
            if (i5 == -1) {
                return null;
            }
            int i12 = i4 - i5;
            System.arraycopy(bArr, i5, bArr, 16 - i12, i12);
            Arrays.fill(bArr, i5, (16 - i4) + i5, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int l(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int m(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean n(s sVar, int i2, TimeUnit timeUnit) {
        try {
            return B(sVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String q(p.s sVar, boolean z) {
        String str;
        if (sVar.l().contains(":")) {
            str = "[" + sVar.l() + "]";
        } else {
            str = sVar.l();
        }
        if (!z && sVar.w() == p.s.d(sVar.B())) {
            return str;
        }
        return str + ":" + sVar.w();
    }

    public static <T> List<T> r(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> s(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> t(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int u(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int v(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    private static String w(byte[] bArr) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        q.c cVar = new q.c();
        while (i2 < bArr.length) {
            if (i2 == i3) {
                cVar.f0(58);
                i2 += i5;
                if (i2 == 16) {
                    cVar.f0(58);
                }
            } else {
                if (i2 > 0) {
                    cVar.f0(58);
                }
                cVar.g0((long) (((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255)));
                i2 += 2;
            }
        }
        return cVar.U();
    }

    public static String[] x(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean y(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean z(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
