package e.i.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import e.i.a.b;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
    private static final byte[] A = {102, 116, 121, 112};
    private static final byte[] B = {109, 105, 102, 49};
    private static final byte[] C = {104, 101, 105, 99};
    private static final byte[] D = {79, 76, 89, 77, 80, 0};
    private static final byte[] E = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] F = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] G = {101, 88, 73, 102};
    private static final byte[] H = {73, 72, 68, 82};
    private static final byte[] I = {73, 69, 78, 68};
    private static final byte[] J = {82, 73, 70, 70};
    private static final byte[] K = {87, 69, 66, 80};
    private static final byte[] L = {69, 88, 73, 70};
    private static final byte[] M = {-99, 1, 42};
    private static final byte[] N = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] O = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANMF".getBytes(Charset.defaultCharset());
    private static SimpleDateFormat S;
    private static SimpleDateFormat T;
    static final String[] U = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] V = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] W = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final e[] X;
    private static final e[] Y;
    private static final e[] Z;
    private static final e[] a0;
    private static final e[] b0;
    private static final e c0 = new e("StripOffsets", 273, 3);
    private static final e[] d0;
    private static final e[] e0;
    private static final e[] f0;
    private static final e[] g0;
    static final e[][] h0;
    private static final e[] i0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap<Integer, e>[] j0;
    private static final HashMap<String, e>[] k0;
    private static final HashSet<String> l0 = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap<Integer, Integer> m0 = new HashMap<>();
    static final Charset n0;
    static final byte[] o0;
    private static final byte[] p0;
    private static final Pattern q0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern r0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern s0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final boolean u = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> v = Arrays.asList(new Integer[]{1, 6, 3, 8});
    private static final List<Integer> w = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final int[] x = {8, 8, 8};
    public static final int[] y = {8};
    static final byte[] z = {-1, -40, -1};
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;

    /* renamed from: d  reason: collision with root package name */
    private int f3458d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3459e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d>[] f3460f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f3461g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f3462h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3463i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3464j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3465k;

    /* renamed from: l  reason: collision with root package name */
    private int f3466l;

    /* renamed from: m  reason: collision with root package name */
    private int f3467m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f3468n;

    /* renamed from: o  reason: collision with root package name */
    private int f3469o;

    /* renamed from: p  reason: collision with root package name */
    private int f3470p;

    /* renamed from: q  reason: collision with root package name */
    private int f3471q;

    /* renamed from: r  reason: collision with root package name */
    private int f3472r;

    /* renamed from: s  reason: collision with root package name */
    private int f3473s;
    private boolean t;

    /* renamed from: e.i.a.a$a  reason: collision with other inner class name */
    class C0086a extends MediaDataSource {

        /* renamed from: e  reason: collision with root package name */
        long f3474e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f3475f;

        C0086a(a aVar, g gVar) {
            this.f3475f = gVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j2, byte[] bArr, int i2, int i3) {
            if (i3 == 0) {
                return 0;
            }
            if (j2 < 0) {
                return -1;
            }
            try {
                long j3 = this.f3474e;
                if (j3 != j2) {
                    if (j3 >= 0 && j2 >= j3 + ((long) this.f3475f.available())) {
                        return -1;
                    }
                    this.f3475f.v(j2);
                    this.f3474e = j2;
                }
                if (i3 > this.f3475f.available()) {
                    i3 = this.f3475f.available();
                }
                int read = this.f3475f.read(bArr, i2, i3);
                if (read >= 0) {
                    this.f3474e += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3474e = -1;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: i  reason: collision with root package name */
        private static final ByteOrder f3476i = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: j  reason: collision with root package name */
        private static final ByteOrder f3477j = ByteOrder.BIG_ENDIAN;

        /* renamed from: e  reason: collision with root package name */
        final DataInputStream f3478e;

        /* renamed from: f  reason: collision with root package name */
        private ByteOrder f3479f;

        /* renamed from: g  reason: collision with root package name */
        int f3480g;

        /* renamed from: h  reason: collision with root package name */
        private byte[] f3481h;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f3479f = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3478e = dataInputStream;
            dataInputStream.mark(0);
            this.f3480g = 0;
            this.f3479f = byteOrder;
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f3480g;
        }

        public int available() {
            return this.f3478e.available();
        }

        public long c() {
            return ((long) readInt()) & KeyboardMap.kValueMask;
        }

        public void g(ByteOrder byteOrder) {
            this.f3479f = byteOrder;
        }

        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void o(int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int skip = (int) this.f3478e.skip((long) i4);
                if (skip <= 0) {
                    if (this.f3481h == null) {
                        this.f3481h = new byte[8192];
                    }
                    skip = this.f3478e.read(this.f3481h, 0, Math.min(8192, i4));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                    }
                }
                i3 += skip;
            }
            this.f3480g += i3;
        }

        public int read() {
            this.f3480g++;
            return this.f3478e.read();
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.f3478e.read(bArr, i2, i3);
            this.f3480g += read;
            return read;
        }

        public boolean readBoolean() {
            this.f3480g++;
            return this.f3478e.readBoolean();
        }

        public byte readByte() {
            this.f3480g++;
            int read = this.f3478e.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f3480g += 2;
            return this.f3478e.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            this.f3480g += bArr.length;
            this.f3478e.readFully(bArr);
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            this.f3480g += i3;
            this.f3478e.readFully(bArr, i2, i3);
        }

        public int readInt() {
            this.f3480g += 4;
            int read = this.f3478e.read();
            int read2 = this.f3478e.read();
            int read3 = this.f3478e.read();
            int read4 = this.f3478e.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f3479f;
                if (byteOrder == f3476i) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3477j) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f3479f);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f3480g += 8;
            int read = this.f3478e.read();
            int read2 = this.f3478e.read();
            int read3 = this.f3478e.read();
            int read4 = this.f3478e.read();
            int read5 = this.f3478e.read();
            int read6 = this.f3478e.read();
            int read7 = this.f3478e.read();
            int read8 = this.f3478e.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f3479f;
                if (byteOrder == f3476i) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == f3477j) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f3479f);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f3480g += 2;
            int read = this.f3478e.read();
            int read2 = this.f3478e.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3479f;
                if (byteOrder == f3476i) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f3477j) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f3479f);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f3480g += 2;
            return this.f3478e.readUTF();
        }

        public int readUnsignedByte() {
            this.f3480g++;
            return this.f3478e.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f3480g += 2;
            int read = this.f3478e.read();
            int read2 = this.f3478e.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3479f;
                if (byteOrder == f3476i) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f3477j) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f3479f);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    private static class c extends FilterOutputStream {

        /* renamed from: e  reason: collision with root package name */
        final OutputStream f3482e;

        /* renamed from: f  reason: collision with root package name */
        private ByteOrder f3483f;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f3482e = outputStream;
            this.f3483f = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f3483f = byteOrder;
        }

        public void c(int i2) {
            this.f3482e.write(i2);
        }

        public void g(int i2) {
            OutputStream outputStream;
            int i3;
            ByteOrder byteOrder = this.f3483f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3482e.write((i2 >>> 0) & 255);
                this.f3482e.write((i2 >>> 8) & 255);
                this.f3482e.write((i2 >>> 16) & 255);
                outputStream = this.f3482e;
                i3 = i2 >>> 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3482e.write((i2 >>> 24) & 255);
                this.f3482e.write((i2 >>> 16) & 255);
                this.f3482e.write((i2 >>> 8) & 255);
                outputStream = this.f3482e;
                i3 = i2 >>> 0;
            } else {
                return;
            }
            outputStream.write(i3 & 255);
        }

        public void o(short s2) {
            OutputStream outputStream;
            int i2;
            ByteOrder byteOrder = this.f3483f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3482e.write((s2 >>> 0) & 255);
                outputStream = this.f3482e;
                i2 = s2 >>> 8;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3482e.write((s2 >>> 8) & 255);
                outputStream = this.f3482e;
                i2 = s2 >>> 0;
            } else {
                return;
            }
            outputStream.write(i2 & 255);
        }

        public void v(long j2) {
            g((int) j2);
        }

        public void write(byte[] bArr) {
            this.f3482e.write(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            this.f3482e.write(bArr, i2, i3);
        }

        public void z(int i2) {
            o((short) i2);
        }
    }

    private static class d {
        public final int a;
        public final int b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f3484d;

        d(int i2, int i3, long j2, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.c = j2;
            this.f3484d = bArr;
        }

        d(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.n0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + 0).getBytes(a.n0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j2, ByteOrder byteOrder) {
            return g(new long[]{j2}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j2 : jArr) {
                wrap.putInt((int) j2);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i2, ByteOrder byteOrder) {
            return k(new int[]{i2}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.V[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i2 : iArr) {
                wrap.putShort((short) i2);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o2 = o(byteOrder);
            if (o2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o2 instanceof String) {
                return Double.parseDouble((String) o2);
            } else {
                if (o2 instanceof long[]) {
                    long[] jArr = (long[]) o2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o2 instanceof int[]) {
                    int[] iArr = (int[]) o2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o2 instanceof double[]) {
                    double[] dArr = (double[]) o2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o2 instanceof f[]) {
                    f[] fVarArr = (f[]) o2;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o2 = o(byteOrder);
            if (o2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o2 instanceof String) {
                return Integer.parseInt((String) o2);
            } else {
                if (o2 instanceof long[]) {
                    long[] jArr = (long[]) o2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o2 instanceof int[]) {
                    int[] iArr = (int[]) o2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o2 = o(byteOrder);
            if (o2 == null) {
                return null;
            }
            if (o2 instanceof String) {
                return (String) o2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (o2 instanceof long[]) {
                long[] jArr = (long[]) o2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o2 instanceof int[]) {
                int[] iArr = (int[]) o2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o2 instanceof double[]) {
                double[] dArr = (double[]) o2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(o2 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o2;
                while (i2 < fVarArr.length) {
                    sb.append(fVarArr[i2].a);
                    sb.append('/');
                    sb.append(fVarArr[i2].b);
                    i2++;
                    if (i2 != fVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a3 A[SYNTHETIC, Splitter:B:164:0x01a3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                e.i.a.a$b r3 = new e.i.a.a$b     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r4 = r10.f3484d     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.g(r11)     // Catch:{ IOException -> 0x0189 }
                int r11 = r10.a     // Catch:{ IOException -> 0x0189 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0189 }
            L_0x0016:
                goto L_0x0180
            L_0x0018:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x001c:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0036:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0189 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                e.i.a.a$f[] r11 = new e.i.a.a.f[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0051:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0189 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0189 }
                e.i.a.a$f r4 = new e.i.a.a$f     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0076:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0090:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                e.i.a.a$f[] r11 = new e.i.a.a.f[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00aa:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.c()     // Catch:{ IOException -> 0x0189 }
                long r8 = r3.c()     // Catch:{ IOException -> 0x0189 }
                e.i.a.a$f r4 = new e.i.a.a$f     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00cd:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.c()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00e7:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.b     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = e.i.a.a.W     // Catch:{ IOException -> 0x0189 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = e.i.a.a.W     // Catch:{ IOException -> 0x0189 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f3484d     // Catch:{ IOException -> 0x0189 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0189 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0189 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0189 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189 }
                r11.<init>()     // Catch:{ IOException -> 0x0189 }
            L_0x011f:
                int r4 = r10.b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f3484d     // Catch:{ IOException -> 0x0189 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0189 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0189 }
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f3484d     // Catch:{ IOException -> 0x0189 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0189 }
                if (r6 != r4) goto L_0x016e
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r6 < 0) goto L_0x016e
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r11 > r4) goto L_0x016e
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = r10.f3484d     // Catch:{ IOException -> 0x0189 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0189 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0189 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0169 }
                goto L_0x016d
            L_0x0169:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016d:
                return r11
            L_0x016e:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                byte[] r4 = r10.f3484d     // Catch:{ IOException -> 0x0189 }
                java.nio.charset.Charset r5 = e.i.a.a.n0     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x017b }
                goto L_0x017f
            L_0x017b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017f:
                return r11
            L_0x0180:
                r3.close()     // Catch:{ IOException -> 0x0184 }
                goto L_0x0188
            L_0x0184:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0188:
                return r2
            L_0x0189:
                r11 = move-exception
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                goto L_0x01a1
            L_0x018d:
                r11 = move-exception
                r3 = r2
            L_0x018f:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x019e
                r3.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019e:
                return r2
            L_0x019f:
                r11 = move-exception
                r2 = r3
            L_0x01a1:
                if (r2 == 0) goto L_0x01ab
                r2.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01ab
            L_0x01a7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ab:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.V[this.a] * this.b;
        }

        public String toString() {
            return "(" + a.U[this.a] + ", data length:" + this.f3484d.length + ")";
        }
    }

    static class e {
        public final int a;
        public final String b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3485d;

        e(String str, int i2, int i3) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f3485d = -1;
        }

        e(String str, int i2, int i3, int i4) {
            this.b = str;
            this.a = i2;
            this.c = i3;
            this.f3485d = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2) {
            int i3;
            int i4 = this.c;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.f3485d) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i4 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i4 == 12 || i3 == 12) && i2 == 11;
        }
    }

    private static class f {
        public final long a;
        public final long b;

        f(double d2) {
            this((long) (d2 * 10000.0d), 10000);
        }

        f(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j2;
            this.b = j3;
        }

        public double a() {
            return ((double) this.a) / ((double) this.b);
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    private static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f3478e.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }

        g(byte[] bArr) {
            super(bArr);
            this.f3478e.mark(Integer.MAX_VALUE);
        }

        public void v(long j2) {
            int i2 = this.f3480g;
            if (((long) i2) > j2) {
                this.f3480g = 0;
                this.f3478e.reset();
            } else {
                j2 -= (long) i2;
            }
            o((int) j2);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        X = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        Y = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        Z = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        a0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Xmp", 700, 1), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        b0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        d0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        e0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        g0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        h0 = eVarArr10;
        j0 = new HashMap[eVarArr10.length];
        k0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        n0 = forName;
        o0 = "Exif\u0000\u0000".getBytes(forName);
        p0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        S = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        T = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            e[][] eVarArr11 = h0;
            if (i2 < eVarArr11.length) {
                j0[i2] = new HashMap<>();
                k0[i2] = new HashMap<>();
                for (e eVar : eVarArr11[i2]) {
                    j0[i2].put(Integer.valueOf(eVar.a), eVar);
                    k0[i2].put(eVar.b, eVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = m0;
                e[] eVarArr12 = i0;
                hashMap.put(Integer.valueOf(eVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.io.FileDescriptor r6) {
        /*
            r5 = this;
            r5.<init>()
            e.i.a.a$e[][] r0 = h0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r5.f3460f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r5.f3461g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r5.f3462h = r0
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.util.Objects.requireNonNull(r6, r0)
            r0 = 0
            r5.c = r0
            r5.a = r0
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x003e
            boolean r2 = E(r6)
            if (r2 == 0) goto L_0x003e
            r5.b = r6
            java.io.FileDescriptor r6 = e.i.a.b.a.b(r6)     // Catch:{ Exception -> 0x0035 }
            r1 = 1
            goto L_0x0040
        L_0x0035:
            r6 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r6)
            throw r0
        L_0x003e:
            r5.b = r0
        L_0x0040:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0053 }
            r2.<init>(r6)     // Catch:{ all -> 0x0053 }
            r5.J(r2)     // Catch:{ all -> 0x0051 }
            e.i.a.b.c(r2)
            if (r1 == 0) goto L_0x0050
            e.i.a.b.b(r6)
        L_0x0050:
            return
        L_0x0051:
            r0 = move-exception
            goto L_0x0057
        L_0x0053:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
        L_0x0057:
            e.i.a.b.c(r2)
            if (r1 == 0) goto L_0x005f
            e.i.a.b.b(r6)
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.<init>(java.io.FileDescriptor):void");
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i2) {
        e[][] eVarArr = h0;
        this.f3460f = new HashMap[eVarArr.length];
        this.f3461g = new HashSet(eVarArr.length);
        this.f3462h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.a = null;
        if (i2 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, o0.length);
            if (!x(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f3459e = true;
            this.c = null;
            this.b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (E(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
            }
            this.b = null;
        }
        J(inputStream);
    }

    public a(String str) {
        e[][] eVarArr = h0;
        this.f3460f = new HashMap[eVarArr.length];
        this.f3461g = new HashSet(eVarArr.length);
        this.f3462h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        w(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            e.i.a.a$b r2 = new e.i.a.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.M(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f3462h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.g(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.A(byte[]):boolean");
    }

    private boolean B(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = F;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean C(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean D(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            e.i.a.a$b r2 = new e.i.a.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.M(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f3462h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.g(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.D(byte[]):boolean");
    }

    private static boolean E(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                b.a.c(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (u) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    private boolean F(HashMap hashMap) {
        d dVar;
        int m2;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f3462h);
            int[] iArr2 = x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3458d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m2 = dVar.m(this.f3462h)) == 1 && Arrays.equals(iArr, y)) || (m2 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean G(int i2) {
        return i2 == 4 || i2 == 13 || i2 == 14 || i2 == 3 || i2 == 0;
    }

    private boolean H(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f3462h) <= 512 && dVar2.m(this.f3462h) <= 512;
    }

    private boolean I(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = J;
            if (i2 >= bArr2.length) {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = K;
                    if (i3 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[J.length + i3 + 4] != bArr3[i3]) {
                        return false;
                    }
                    i3++;
                }
            } else if (bArr[i2] != bArr2[i2]) {
                return false;
            } else {
                i2++;
            }
        }
    }

    private void J(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i2 = 0;
        while (i2 < h0.length) {
            try {
                this.f3460f[i2] = new HashMap<>();
                i2++;
            } catch (IOException | UnsupportedOperationException e2) {
                boolean z2 = u;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                a();
                if (!z2) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (u) {
                    L();
                }
                throw th;
            }
        }
        if (!this.f3459e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3458d = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (Y(this.f3458d)) {
            g gVar = new g(inputStream);
            if (this.f3459e) {
                p(gVar);
            } else {
                int i3 = this.f3458d;
                if (i3 == 12) {
                    g(gVar);
                } else if (i3 == 7) {
                    j(gVar);
                } else if (i3 == 10) {
                    o(gVar);
                } else {
                    m(gVar);
                }
            }
            gVar.v((long) this.f3470p);
            X(gVar);
        } else {
            b bVar = new b(inputStream);
            int i4 = this.f3458d;
            if (i4 == 4) {
                h(bVar, 0, 0);
            } else if (i4 == 13) {
                k(bVar);
            } else if (i4 == 9) {
                l(bVar);
            } else if (i4 == 14) {
                s(bVar);
            }
        }
        a();
        if (!u) {
            return;
        }
        L();
    }

    private void K(b bVar) {
        ByteOrder M2 = M(bVar);
        this.f3462h = M2;
        bVar.g(M2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f3458d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    bVar.o(i3);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void L() {
        for (int i2 = 0; i2 < this.f3460f.length; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.f3460f[i2].size());
            for (Map.Entry next : this.f3460f[i2].entrySet()) {
                d dVar = (d) next.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f3462h) + "'");
            }
        }
    }

    private ByteOrder M(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void N(byte[] bArr, int i2) {
        g gVar = new g(bArr);
        K(gVar);
        O(gVar, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(e.i.a.a.g r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.f3461g
            int r4 = r1.f3480g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = u
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002f:
            if (r3 > 0) goto L_0x0032
            return
        L_0x0032:
            r4 = 0
            r6 = 0
        L_0x0034:
            r7 = 5
            if (r6 >= r3) goto L_0x0317
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.a()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, e.i.a.a$e>[] r14 = j0
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            e.i.a.a$e r11 = (e.i.a.a.e) r11
            boolean r14 = u
            r10 = 3
            if (r14 == 0) goto L_0x0090
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r21 = 1
            r7[r21] = r23
            if (r11 == 0) goto L_0x0074
            java.lang.String r4 = r11.b
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            r22 = 2
            r7[r22] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L_0x0090:
            r4 = 7
            if (r11 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r7.append(r10)
            r7.append(r12)
        L_0x00a2:
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x00a9:
            r10 = r5
            r25 = r6
            goto L_0x0127
        L_0x00ae:
            if (r13 <= 0) goto L_0x010e
            int[] r7 = V
            int r10 = r7.length
            if (r13 < r10) goto L_0x00b6
            goto L_0x010e
        L_0x00b6:
            boolean r10 = r11.a(r13)
            if (r10 != 0) goto L_0x00da
            if (r14 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r7.append(r10)
            java.lang.String[] r10 = U
            r10 = r10[r13]
            r7.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r7.append(r10)
            java.lang.String r10 = r11.b
            r7.append(r10)
            goto L_0x00a2
        L_0x00da:
            if (r13 != r4) goto L_0x00de
            int r13 = r11.c
        L_0x00de:
            r10 = r5
            long r4 = (long) r15
            r7 = r7[r13]
            r25 = r6
            long r6 = (long) r7
            long r4 = r4 * r6
            r6 = 0
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 < 0) goto L_0x00f7
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 <= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 1
            goto L_0x012a
        L_0x00f7:
            if (r14 == 0) goto L_0x0129
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r10, r6)
            goto L_0x0129
        L_0x010e:
            r10 = r5
            r25 = r6
            if (r14 == 0) goto L_0x0127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r10, r4)
        L_0x0127:
            r4 = 0
        L_0x0129:
            r6 = 0
        L_0x012a:
            if (r6 != 0) goto L_0x0134
            r1.v(r8)
            r26 = r3
            r8 = r10
            goto L_0x030e
        L_0x0134:
            java.lang.String r6 = "Compression"
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x01be
            int r7 = r30.readInt()
            r26 = r3
            if (r14 == 0) goto L_0x0159
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r27 = r8
            java.lang.String r8 = "seek to data offset: "
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r10, r3)
            goto L_0x015b
        L_0x0159:
            r27 = r8
        L_0x015b:
            int r3 = r0.f3458d
            r8 = 7
            if (r3 != r8) goto L_0x01b5
            java.lang.String r3 = r11.b
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x016d
            r0.f3471q = r7
            goto L_0x01b5
        L_0x016d:
            r3 = 6
            if (r2 != r3) goto L_0x01b5
            java.lang.String r8 = r11.b
            java.lang.String r9 = "ThumbnailImage"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01b5
            r0.f3472r = r7
            r0.f3473s = r15
            java.nio.ByteOrder r8 = r0.f3462h
            e.i.a.a$d r3 = e.i.a.a.d.j(r3, r8)
            int r8 = r0.f3472r
            long r8 = (long) r8
            r18 = r15
            java.nio.ByteOrder r15 = r0.f3462h
            e.i.a.a$d r8 = e.i.a.a.d.f(r8, r15)
            int r9 = r0.f3473s
            r24 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r15 = r0.f3462h
            e.i.a.a$d r9 = e.i.a.a.d.f(r9, r15)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r10 = r0.f3460f
            r15 = 4
            r10 = r10[r15]
            r10.put(r6, r3)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r15]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r3.put(r10, r8)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r15]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r3.put(r8, r9)
            goto L_0x01b9
        L_0x01b5:
            r24 = r10
            r18 = r15
        L_0x01b9:
            long r7 = (long) r7
            r1.v(r7)
            goto L_0x01c6
        L_0x01be:
            r26 = r3
            r27 = r8
            r24 = r10
            r18 = r15
        L_0x01c6:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = m0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x01f3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r8 = r24
            android.util.Log.d(r8, r7)
            goto L_0x01f5
        L_0x01f3:
            r8 = r24
        L_0x01f5:
            r7 = 8
            if (r3 == 0) goto L_0x0296
            r4 = -1
            r6 = 3
            if (r13 == r6) goto L_0x021b
            r6 = 4
            if (r13 == r6) goto L_0x0216
            if (r13 == r7) goto L_0x0211
            r6 = 9
            if (r13 == r6) goto L_0x020c
            r6 = 13
            if (r13 == r6) goto L_0x020c
            goto L_0x0220
        L_0x020c:
            int r4 = r30.readInt()
            goto L_0x021f
        L_0x0211:
            short r4 = r30.readShort()
            goto L_0x021f
        L_0x0216:
            long r4 = r30.c()
            goto L_0x0220
        L_0x021b:
            int r4 = r30.readUnsignedShort()
        L_0x021f:
            long r4 = (long) r4
        L_0x0220:
            if (r14 == 0) goto L_0x023a
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r9 = 0
            r6[r9] = r7
            java.lang.String r7 = r11.b
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r8, r6)
        L_0x023a:
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0279
            java.util.Set<java.lang.Integer> r6 = r0.f3461g
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0258
            r1.v(r4)
            int r3 = r3.intValue()
            r0.O(r1, r3)
            goto L_0x028f
        L_0x0258:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto L_0x028c
        L_0x0279:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x028c:
            android.util.Log.d(r8, r3)
        L_0x028f:
            r9 = r27
        L_0x0291:
            r1.v(r9)
            goto L_0x030e
        L_0x0296:
            r9 = r27
            int r3 = r30.a()
            int r12 = r0.f3470p
            int r3 = r3 + r12
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r1.readFully(r4)
            e.i.a.a$d r5 = new e.i.a.a$d
            long r14 = (long) r3
            r19 = r14
            r14 = r5
            r3 = r18
            r15 = r13
            r16 = r3
            r17 = r19
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r2]
            java.lang.String r4 = r11.b
            r3.put(r4, r5)
            java.lang.String r3 = r11.b
            java.lang.String r4 = "DNGVersion"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02cd
            r3 = 3
            r0.f3458d = r3
        L_0x02cd:
            java.lang.String r3 = r11.b
            java.lang.String r4 = "Make"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02e1
            java.lang.String r3 = r11.b
            java.lang.String r4 = "Model"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02ef
        L_0x02e1:
            java.nio.ByteOrder r3 = r0.f3462h
            java.lang.String r3 = r5.n(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0302
        L_0x02ef:
            java.lang.String r3 = r11.b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0304
            java.nio.ByteOrder r3 = r0.f3462h
            int r3 = r5.m(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x0304
        L_0x0302:
            r0.f3458d = r7
        L_0x0304:
            int r3 = r30.a()
            long r3 = (long) r3
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x030e
            goto L_0x0291
        L_0x030e:
            int r6 = r25 + 1
            short r6 = (short) r6
            r5 = r8
            r3 = r26
            r4 = 0
            goto L_0x0034
        L_0x0317:
            r8 = r5
            int r2 = r30.readInt()
            boolean r3 = u
            if (r3 == 0) goto L_0x0333
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r8, r4)
        L_0x0333:
            long r4 = (long) r2
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0370
            java.util.Set<java.lang.Integer> r6 = r0.f3461g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x0366
            r1.v(r4)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r2 = r0.f3460f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0358
            r0.O(r1, r3)
            goto L_0x0386
        L_0x0358:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r2 = r0.f3460f
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0386
            r0.O(r1, r7)
            goto L_0x0386
        L_0x0366:
            if (r3 == 0) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0379
        L_0x0370:
            if (r3 == 0) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0379:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.O(e.i.a.a$g, int):void");
    }

    private void P(String str) {
        for (int i2 = 0; i2 < h0.length; i2++) {
            this.f3460f[i2].remove(str);
        }
    }

    private void Q(int i2, String str, String str2) {
        if (!this.f3460f[i2].isEmpty() && this.f3460f[i2].get(str) != null) {
            HashMap<String, d>[] hashMapArr = this.f3460f;
            hashMapArr[i2].put(str2, hashMapArr[i2].get(str));
            this.f3460f[i2].remove(str);
        }
    }

    private void R(g gVar, int i2) {
        d dVar = this.f3460f[i2].get("ImageLength");
        d dVar2 = this.f3460f[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f3460f[i2].get("JPEGInterchangeFormat");
            d dVar4 = this.f3460f[i2].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m2 = dVar3.m(this.f3462h);
                int m3 = dVar3.m(this.f3462h);
                gVar.v((long) m2);
                byte[] bArr = new byte[m3];
                gVar.read(bArr);
                h(new b(bArr), m2, i2);
            }
        }
    }

    private void T(InputStream inputStream, OutputStream outputStream) {
        if (u) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.c(-1);
            if (bVar.readByte() == -40) {
                cVar.c(-40);
                d dVar = null;
                if (d("Xmp") != null && this.t) {
                    dVar = this.f3460f[0].remove("Xmp");
                }
                cVar.c(-1);
                cVar.c(-31);
                c0(cVar);
                if (dVar != null) {
                    this.f3460f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.c(-1);
                        cVar.c(readByte);
                        b.e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.c(-1);
                        cVar.c(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.z(readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, o0)) {
                                    bVar.o(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.c(-1);
                            cVar.c(readByte);
                            cVar.z(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void U(InputStream inputStream, OutputStream outputStream) {
        if (u) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = F;
        b.f(bVar, cVar, bArr.length);
        int i2 = this.f3470p;
        if (i2 == 0) {
            int readInt = bVar.readInt();
            cVar.g(readInt);
            b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            b.f(bVar, cVar, ((i2 - bArr.length) - 4) - 4);
            bVar.o(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                c0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f3482e).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.g((int) crc32.getValue());
                b.c(byteArrayOutputStream2);
                b.e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            b.c(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a3 A[Catch:{ Exception -> 0x01e5, all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01af A[Catch:{ Exception -> 0x01e5, all -> 0x01e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void V(java.io.InputStream r21, java.io.OutputStream r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            boolean r3 = u
            if (r3 == 0) goto L_0x002d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveWebpAttributes starting with (inputStream: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", outputStream: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ExifInterface"
            android.util.Log.d(r4, r3)
        L_0x002d:
            e.i.a.a$b r3 = new e.i.a.a$b
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.<init>(r0, r4)
            e.i.a.a$c r5 = new e.i.a.a$c
            r5.<init>(r2, r4)
            byte[] r2 = J
            int r6 = r2.length
            e.i.a.b.f(r3, r5, r6)
            byte[] r6 = K
            int r7 = r6.length
            r8 = 4
            int r7 = r7 + r8
            r3.o(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01ea }
            r9.<init>()     // Catch:{ Exception -> 0x01ea }
            e.i.a.a$c r10 = new e.i.a.a$c     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.<init>(r9, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r4 = r1.f3470p     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 == 0) goto L_0x006f
            int r0 = r2.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r8
            int r2 = r6.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r2
            int r4 = r4 - r0
            int r4 = r4 - r8
            int r4 = r4 - r8
            e.i.a.b.f(r3, r10, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.o(r8)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.o(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x006a:
            r1.c0(r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01c2
        L_0x006f:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r4 = r3.read(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 != r8) goto L_0x01da
            byte[] r4 = N     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r11 = 8
            r12 = 1
            r13 = 0
            if (r6 == 0) goto L_0x00cc
            int r2 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r6 = r2 % 2
            if (r6 != r12) goto L_0x008e
            int r6 = r2 + 1
            goto L_0x008f
        L_0x008e:
            r6 = r2
        L_0x008f:
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r3.read(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r14 = r6[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r11 = r11 | r14
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r6[r13] = r11     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r11 = r6[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r11 = r11 >> r12
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.g(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r12 == 0) goto L_0x00c4
            byte[] r2 = Q     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r1.b(r3, r10, r2, r7)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x00b2:
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r0.read(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r4 = R     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r4 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r4 != 0) goto L_0x00c0
            goto L_0x006a
        L_0x00c0:
            r1.c(r3, r10, r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x00b2
        L_0x00c4:
            byte[] r0 = P     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r2 = O     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r1.b(r3, r10, r0, r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x006a
        L_0x00cc:
            byte[] r0 = P     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r6 != 0) goto L_0x00dc
            byte[] r6 = O     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r6 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r6 == 0) goto L_0x01c2
        L_0x00dc:
            int r6 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r7 = r6 % 2
            if (r7 != r12) goto L_0x00e7
            int r7 = r6 + 1
            goto L_0x00e8
        L_0x00e7:
            r7 = r6
        L_0x00e8:
            r14 = 3
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r16 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 47
            if (r16 == 0) goto L_0x011d
            r3.read(r15)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r12 = new byte[r14]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r11 = r3.read(r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 != r14) goto L_0x0115
            byte[] r11 = M     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r11 = java.util.Arrays.equals(r11, r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 == 0) goto L_0x0115
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r12 = r11 << 18
            int r12 = r12 >> 18
            int r14 = r11 << 2
            int r14 = r14 >> 18
            int r7 = r7 + -10
            goto L_0x014f
        L_0x0115:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered error while checking VP8 signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x011d:
            byte[] r11 = O     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r11 = java.util.Arrays.equals(r2, r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 == 0) goto L_0x014c
            byte r11 = r3.readByte()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r11 != r8) goto L_0x0144
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r14 = r11 << 18
            int r14 = r14 >> 18
            int r14 = r14 + r12
            int r17 = r11 << 4
            int r17 = r17 >> 18
            int r12 = r17 + 1
            r17 = r11 & 8
            int r7 = r7 + -5
            r19 = r14
            r14 = r12
            r12 = r19
            goto L_0x0151
        L_0x0144:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered error while checking VP8L signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x014c:
            r11 = 0
            r12 = 0
            r14 = 0
        L_0x014f:
            r17 = 0
        L_0x0151:
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4 = 10
            r10.g(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r18 = r4[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r16 = 8
            r8 = r18 | 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r13] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte r8 = r4[r13]     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r18 = 4
            int r17 = r17 << 4
            r8 = r8 | r17
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r13] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r12 = r12 + -1
            int r14 = r14 + -1
            byte r8 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r18] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 5
            int r13 = r12 >> 8
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r13     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 6
            int r12 = r12 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 7
            byte r12 = (byte) r14     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r8 = r14 >> 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r12 = 8
            r4[r12] = r8     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r8 = 9
            int r12 = r14 >> 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r4[r8] = r12     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.g(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r0 == 0) goto L_0x01af
            r10.write(r15)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r0 = M     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r10.write(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x01ab:
            r10.g(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01bd
        L_0x01af:
            byte[] r0 = O     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            if (r0 == 0) goto L_0x01bd
            r0 = 47
            r10.write(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x01ab
        L_0x01bd:
            e.i.a.b.f(r3, r10, r7)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            goto L_0x006a
        L_0x01c2:
            e.i.a.b.e(r3, r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            byte[] r2 = K     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r3 = r2.length     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            int r0 = r0 + r3
            r5.g(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r5.write(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r9.writeTo(r5)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            e.i.a.b.c(r9)
            return
        L_0x01da:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r2 = "Encountered invalid length while parsing WebP chunk type"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            throw r0     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r7 = r9
            goto L_0x01f3
        L_0x01e5:
            r0 = move-exception
            r7 = r9
            goto L_0x01eb
        L_0x01e8:
            r0 = move-exception
            goto L_0x01f3
        L_0x01ea:
            r0 = move-exception
        L_0x01eb:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x01e8 }
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01e8 }
            throw r2     // Catch:{ all -> 0x01e8 }
        L_0x01f3:
            e.i.a.b.c(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.V(java.io.InputStream, java.io.OutputStream):void");
    }

    private void X(b bVar) {
        HashMap<String, d> hashMap = this.f3460f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m2 = dVar.m(this.f3462h);
            this.f3469o = m2;
            if (m2 != 1) {
                if (m2 != 6) {
                    if (m2 != 7) {
                        return;
                    }
                }
            }
            if (F(hashMap)) {
                v(bVar, hashMap);
                return;
            }
            return;
        }
        this.f3469o = 6;
        u(bVar, hashMap);
    }

    private static boolean Y(int i2) {
        return (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) ? false : true;
    }

    private void Z(int i2, int i3) {
        String str;
        if (!this.f3460f[i2].isEmpty() && !this.f3460f[i3].isEmpty()) {
            d dVar = this.f3460f[i2].get("ImageLength");
            d dVar2 = this.f3460f[i2].get("ImageWidth");
            d dVar3 = this.f3460f[i3].get("ImageLength");
            d dVar4 = this.f3460f[i3].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (u) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m2 = dVar.m(this.f3462h);
                int m3 = dVar2.m(this.f3462h);
                int m4 = dVar3.m(this.f3462h);
                int m5 = dVar4.m(this.f3462h);
                if (m2 < m4 && m3 < m5) {
                    HashMap<String, d>[] hashMapArr = this.f3460f;
                    HashMap<String, d> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                    return;
                }
                return;
            } else if (u) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void a() {
        String d2 = d("DateTimeOriginal");
        if (d2 != null && d("DateTime") == null) {
            this.f3460f[0].put("DateTime", d.e(d2));
        }
        if (d("ImageWidth") == null) {
            this.f3460f[0].put("ImageWidth", d.f(0, this.f3462h));
        }
        if (d("ImageLength") == null) {
            this.f3460f[0].put("ImageLength", d.f(0, this.f3462h));
        }
        if (d("Orientation") == null) {
            this.f3460f[0].put("Orientation", d.f(0, this.f3462h));
        }
        if (d("LightSource") == null) {
            this.f3460f[1].put("LightSource", d.f(0, this.f3462h));
        }
    }

    private void a0(g gVar, int i2) {
        d dVar;
        d dVar2;
        StringBuilder sb;
        String arrays;
        d dVar3 = this.f3460f[i2].get("DefaultCropSize");
        d dVar4 = this.f3460f[i2].get("SensorTopBorder");
        d dVar5 = this.f3460f[i2].get("SensorLeftBorder");
        d dVar6 = this.f3460f[i2].get("SensorBottomBorder");
        d dVar7 = this.f3460f[i2].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f3462h);
                if (fVarArr == null || fVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(fVarArr);
                } else {
                    dVar2 = d.h(fVarArr[0], this.f3462h);
                    dVar = d.h(fVarArr[1], this.f3462h);
                    this.f3460f[i2].put("ImageWidth", dVar2);
                    this.f3460f[i2].put("ImageLength", dVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar3.o(this.f3462h);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    dVar2 = d.j(iArr[0], this.f3462h);
                    dVar = d.j(iArr[1], this.f3462h);
                    this.f3460f[i2].put("ImageWidth", dVar2);
                    this.f3460f[i2].put("ImageLength", dVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            R(gVar, i2);
        } else {
            int m2 = dVar4.m(this.f3462h);
            int m3 = dVar6.m(this.f3462h);
            int m4 = dVar7.m(this.f3462h);
            int m5 = dVar5.m(this.f3462h);
            if (m3 > m2 && m4 > m5) {
                d j2 = d.j(m3 - m2, this.f3462h);
                d j3 = d.j(m4 - m5, this.f3462h);
                this.f3460f[i2].put("ImageLength", j2);
                this.f3460f[i2].put("ImageWidth", j3);
            }
        }
    }

    private void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = n0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void b0() {
        Z(0, 5);
        Z(0, 4);
        Z(5, 4);
        d dVar = this.f3460f[1].get("PixelXDimension");
        d dVar2 = this.f3460f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f3460f[0].put("ImageWidth", dVar);
            this.f3460f[0].put("ImageLength", dVar2);
        }
        if (this.f3460f[4].isEmpty() && H(this.f3460f[5])) {
            HashMap<String, d>[] hashMapArr = this.f3460f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!H(this.f3460f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        Q(0, "ThumbnailOrientation", "Orientation");
        Q(0, "ThumbnailImageLength", "ImageLength");
        Q(0, "ThumbnailImageWidth", "ImageWidth");
        Q(5, "ThumbnailOrientation", "Orientation");
        Q(5, "ThumbnailImageLength", "ImageLength");
        Q(5, "ThumbnailImageWidth", "ImageWidth");
        Q(4, "Orientation", "ThumbnailOrientation");
        Q(4, "ImageLength", "ThumbnailImageLength");
        Q(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void c(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.g(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        b.f(bVar, cVar, readInt);
    }

    private int c0(c cVar) {
        c cVar2 = cVar;
        e[][] eVarArr = h0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : i0) {
            P(eVar.b);
        }
        if (this.f3463i) {
            if (this.f3464j) {
                P("StripOffsets");
                P("StripByteCounts");
            } else {
                P("JPEGInterchangeFormat");
                P("JPEGInterchangeFormatLength");
            }
        }
        for (int i2 = 0; i2 < h0.length; i2++) {
            for (Object obj : this.f3460f[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f3460f[i2].remove(entry.getKey());
                }
            }
        }
        if (!this.f3460f[1].isEmpty()) {
            this.f3460f[0].put(i0[1].b, d.f(0, this.f3462h));
        }
        if (!this.f3460f[2].isEmpty()) {
            this.f3460f[0].put(i0[2].b, d.f(0, this.f3462h));
        }
        if (!this.f3460f[3].isEmpty()) {
            this.f3460f[1].put(i0[3].b, d.f(0, this.f3462h));
        }
        if (this.f3463i) {
            if (this.f3464j) {
                this.f3460f[4].put("StripOffsets", d.j(0, this.f3462h));
                this.f3460f[4].put("StripByteCounts", d.j(this.f3467m, this.f3462h));
            } else {
                this.f3460f[4].put("JPEGInterchangeFormat", d.f(0, this.f3462h));
                this.f3460f[4].put("JPEGInterchangeFormatLength", d.f((long) this.f3467m, this.f3462h));
            }
        }
        for (int i3 = 0; i3 < h0.length; i3++) {
            int i4 = 0;
            for (Map.Entry<String, d> value : this.f3460f[i3].entrySet()) {
                int p2 = ((d) value.getValue()).p();
                if (p2 > 4) {
                    i4 += p2;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int i5 = 8;
        for (int i6 = 0; i6 < h0.length; i6++) {
            if (!this.f3460f[i6].isEmpty()) {
                iArr[i6] = i5;
                i5 += (this.f3460f[i6].size() * 12) + 2 + 4 + iArr2[i6];
            }
        }
        if (this.f3463i) {
            if (this.f3464j) {
                this.f3460f[4].put("StripOffsets", d.j(i5, this.f3462h));
            } else {
                this.f3460f[4].put("JPEGInterchangeFormat", d.f((long) i5, this.f3462h));
            }
            this.f3466l = i5;
            i5 += this.f3467m;
        }
        if (this.f3458d == 4) {
            i5 += 8;
        }
        if (u) {
            for (int i7 = 0; i7 < h0.length; i7++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i7), Integer.valueOf(iArr[i7]), Integer.valueOf(this.f3460f[i7].size()), Integer.valueOf(iArr2[i7]), Integer.valueOf(i5)}));
            }
        }
        if (!this.f3460f[1].isEmpty()) {
            this.f3460f[0].put(i0[1].b, d.f((long) iArr[1], this.f3462h));
        }
        if (!this.f3460f[2].isEmpty()) {
            this.f3460f[0].put(i0[2].b, d.f((long) iArr[2], this.f3462h));
        }
        if (!this.f3460f[3].isEmpty()) {
            this.f3460f[1].put(i0[3].b, d.f((long) iArr[3], this.f3462h));
        }
        int i8 = this.f3458d;
        if (i8 == 4) {
            cVar2.z(i5);
            cVar2.write(o0);
        } else if (i8 == 13) {
            cVar2.g(i5);
            cVar2.write(G);
        } else if (i8 == 14) {
            cVar2.write(L);
            cVar2.g(i5);
        }
        cVar2.o(this.f3462h == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar2.a(this.f3462h);
        cVar2.z(42);
        cVar2.v(8);
        for (int i9 = 0; i9 < h0.length; i9++) {
            if (!this.f3460f[i9].isEmpty()) {
                cVar2.z(this.f3460f[i9].size());
                int size = iArr[i9] + 2 + (this.f3460f[i9].size() * 12) + 4;
                for (Map.Entry next : this.f3460f[i9].entrySet()) {
                    int i10 = k0[i9].get(next.getKey()).a;
                    d dVar = (d) next.getValue();
                    int p3 = dVar.p();
                    cVar2.z(i10);
                    cVar2.z(dVar.a);
                    cVar2.g(dVar.b);
                    if (p3 > 4) {
                        cVar2.v((long) size);
                        size += p3;
                    } else {
                        cVar2.write(dVar.f3484d);
                        if (p3 < 4) {
                            while (p3 < 4) {
                                cVar2.c(0);
                                p3++;
                            }
                        }
                    }
                }
                if (i9 != 0 || this.f3460f[4].isEmpty()) {
                    cVar2.v(0);
                } else {
                    cVar2.v((long) iArr[4]);
                }
                for (Map.Entry<String, d> value2 : this.f3460f[i9].entrySet()) {
                    byte[] bArr = ((d) value2.getValue()).f3484d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f3463i) {
            cVar2.write(r());
        }
        if (this.f3458d == 14 && i5 % 2 == 1) {
            cVar2.c(0);
        }
        cVar2.a(ByteOrder.BIG_ENDIAN);
        return i5;
    }

    private d f(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < h0.length; i2++) {
            d dVar = this.f3460f[i2].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(e.i.a.a.g r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0146
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            e.i.a.a$a r2 = new e.i.a.a$a     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>(r12, r13)     // Catch:{ RuntimeException -> 0x013a }
            e.i.a.b.C0087b.a(r1, r2)     // Catch:{ RuntimeException -> 0x013a }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x013a }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x013a }
            r6 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0047:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x0060
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0060:
            r0 = r6
            r4 = r0
        L_0x0062:
            r5 = 0
            if (r6 == 0) goto L_0x0078
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r12.f3460f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f3462h     // Catch:{ RuntimeException -> 0x013a }
            e.i.a.a$d r9 = e.i.a.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r12.f3460f     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f3462h     // Catch:{ RuntimeException -> 0x013a }
            e.i.a.a$d r9 = e.i.a.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x008d:
            r7 = 6
            if (r4 == 0) goto L_0x00b7
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x013a }
            r10 = 90
            if (r9 == r10) goto L_0x00a7
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto L_0x00a5
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r8 = 8
            goto L_0x00a8
        L_0x00a5:
            r8 = 3
            goto L_0x00a8
        L_0x00a7:
            r8 = 6
        L_0x00a8:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r9 = r12.f3460f     // Catch:{ RuntimeException -> 0x013a }
            r9 = r9[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f3462h     // Catch:{ RuntimeException -> 0x013a }
            e.i.a.a$d r8 = e.i.a.a.d.j(r8, r11)     // Catch:{ RuntimeException -> 0x013a }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x013a }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x013a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x013a }
            if (r3 <= r7) goto L_0x0102
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x013a }
            r13.v(r8)     // Catch:{ RuntimeException -> 0x013a }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x013a }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x013a }
            if (r9 != r7) goto L_0x00fa
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = o0     // Catch:{ RuntimeException -> 0x013a }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r7 == 0) goto L_0x00f2
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x013a }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r13 != r3) goto L_0x00ea
            r12.f3470p = r2     // Catch:{ RuntimeException -> 0x013a }
            r12.N(r7, r5)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00f2:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00fa:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x0102:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x010a:
            boolean r13 = u     // Catch:{ RuntimeException -> 0x013a }
            if (r13 == 0) goto L_0x0134
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>()     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x013a }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0134:
            r1.release()
            return
        L_0x0138:
            r13 = move-exception
            goto L_0x0142
        L_0x013a:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r13     // Catch:{ all -> 0x0138 }
        L_0x0142:
            r1.release()
            throw r13
        L_0x0146:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.g(e.i.a.a$g):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184 A[LOOP:0: B:8:0x0038->B:60:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(e.i.a.a.b r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = u
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.g(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01d8
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01bd
            r3 = 2
            r5 = 2
        L_0x0038:
            byte r7 = r22.readByte()
            if (r7 != r6) goto L_0x01a0
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r22.readByte()
            boolean r9 = u
            if (r9 == 0) goto L_0x0062
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L_0x0062:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L_0x019a
            r10 = -38
            if (r8 != r10) goto L_0x006d
            goto L_0x019a
        L_0x006d:
            int r10 = r22.readUnsignedShort()
            int r10 = r10 - r3
            int r5 = r5 + r3
            if (r9 == 0) goto L_0x009e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x009e:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L_0x0194
            r11 = -31
            r12 = 0
            if (r8 == r11) goto L_0x0121
            r11 = -2
            if (r8 == r11) goto L_0x00f3
            switch(r8) {
                case -64: goto L_0x00ba;
                case -63: goto L_0x00ba;
                case -62: goto L_0x00ba;
                case -61: goto L_0x00ba;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r8) {
                case -59: goto L_0x00ba;
                case -58: goto L_0x00ba;
                case -57: goto L_0x00ba;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r8) {
                case -55: goto L_0x00ba;
                case -54: goto L_0x00ba;
                case -53: goto L_0x00ba;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r8) {
                case -51: goto L_0x00ba;
                case -50: goto L_0x00ba;
                case -49: goto L_0x00ba;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r20 = r4
            goto L_0x0182
        L_0x00ba:
            r1.o(r7)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r0.f3460f
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto L_0x00c7
            java.lang.String r11 = "ImageLength"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r11 = "ThumbnailImageLength"
        L_0x00c9:
            int r12 = r22.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f3462h
            e.i.a.a$d r12 = e.i.a.a.d.f(r12, r14)
            r7.put(r11, r12)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r0.f3460f
            r7 = r7[r2]
            if (r2 == r8) goto L_0x00e0
            java.lang.String r8 = "ImageWidth"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00e2:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f3462h
            e.i.a.a$d r11 = e.i.a.a.d.f(r11, r13)
            r7.put(r8, r11)
            int r10 = r10 + -5
            goto L_0x00b6
        L_0x00f3:
            byte[] r8 = new byte[r10]
            int r11 = r1.read(r8)
            if (r11 != r10) goto L_0x0119
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.d(r10)
            if (r11 != 0) goto L_0x0115
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r11 = r0.f3460f
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r13 = n0
            r11.<init>(r8, r13)
            e.i.a.a$d r8 = e.i.a.a.d.e(r11)
            r7.put(r10, r8)
        L_0x0115:
            r20 = r4
            goto L_0x0181
        L_0x0119:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r13 = o0
            boolean r14 = e.i.a.b.g(r8, r13)
            if (r14 == 0) goto L_0x0147
            int r7 = r13.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r23 + r5
            int r8 = r13.length
            int r5 = r5 + r8
            r0.f3470p = r5
            r0.N(r7, r2)
            e.i.a.a$b r5 = new e.i.a.a$b
            r5.<init>((byte[]) r7)
            r0.X(r5)
            goto L_0x017e
        L_0x0147:
            byte[] r13 = p0
            boolean r14 = e.i.a.b.g(r8, r13)
            if (r14 == 0) goto L_0x017e
            int r14 = r13.length
            int r5 = r5 + r14
            int r13 = r13.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r13, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r13 = r0.d(r10)
            if (r13 != 0) goto L_0x017e
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r13 = r0.f3460f
            r13 = r13[r12]
            e.i.a.a$d r15 = new e.i.a.a$d
            r16 = 1
            int r14 = r8.length
            r20 = r4
            long r3 = (long) r5
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r5
            r17 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r19)
            r13.put(r10, r6)
            r0.t = r7
            goto L_0x0180
        L_0x017e:
            r20 = r4
        L_0x0180:
            r5 = r11
        L_0x0181:
            r10 = 0
        L_0x0182:
            if (r10 < 0) goto L_0x018e
            r1.o(r10)
            int r5 = r5 + r10
            r4 = r20
            r3 = 2
            r6 = -1
            goto L_0x0038
        L_0x018e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x0194:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x019a:
            java.nio.ByteOrder r2 = r0.f3462h
            r1.g(r2)
            return
        L_0x01a0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.h(e.i.a.a$b, int, int):void");
    }

    private int i(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (z(bArr)) {
            return 4;
        }
        if (C(bArr)) {
            return 9;
        }
        if (y(bArr)) {
            return 12;
        }
        if (A(bArr)) {
            return 7;
        }
        if (D(bArr)) {
            return 10;
        }
        if (B(bArr)) {
            return 13;
        }
        return I(bArr) ? 14 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(e.i.a.a.g r7) {
        /*
            r6 = this;
            r6.m(r7)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r6.f3460f
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            e.i.a.a$d r7 = (e.i.a.a.d) r7
            if (r7 == 0) goto L_0x00f5
            e.i.a.a$g r1 = new e.i.a.a$g
            byte[] r7 = r7.f3484d
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f3462h
            r1.g(r7)
            byte[] r7 = D
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.v(r3)
            byte[] r3 = E
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.v(r2)
            goto L_0x0048
        L_0x003f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r7 = 6
            r6.O(r1, r7)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r6.f3460f
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            e.i.a.a$d r7 = (e.i.a.a.d) r7
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r2 = r6.f3460f
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            e.i.a.a$d r1 = (e.i.a.a.d) r1
            if (r7 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r2 = r6.f3460f
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r6.f3460f
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007c:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r6.f3460f
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            e.i.a.a$d r7 = (e.i.a.a.d) r7
            if (r7 == 0) goto L_0x00f5
            java.nio.ByteOrder r1 = r6.f3462h
            java.lang.Object r7 = r7.o(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00db
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00db
        L_0x009b:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f5
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f5
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00bc
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00bc:
            java.nio.ByteOrder r7 = r6.f3462h
            e.i.a.a$d r7 = e.i.a.a.d.j(r1, r7)
            java.nio.ByteOrder r0 = r6.f3462h
            e.i.a.a$d r0 = e.i.a.a.d.j(r2, r0)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r1 = r6.f3460f
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r7 = r6.f3460f
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f5
        L_0x00db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.j(e.i.a.a$g):void");
    }

    private void k(b bVar) {
        if (u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.BIG_ENDIAN);
        byte[] bArr = F;
        bVar.o(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i3 = i2 + 4;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, H)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, I)) {
                        if (Arrays.equals(bArr2, G)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f3470p = i3;
                                    N(bArr3, 0);
                                    b0();
                                    X(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i4 = readInt + 4;
                        bVar.o(i4);
                        length = i3 + i4;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void l(b bVar) {
        boolean z2 = u;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.o(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        bVar.o(i2 - bVar.a());
        bVar.read(bArr4);
        h(new b(bArr4), i2, 5);
        bVar.o(i4 - bVar.a());
        bVar.g(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == c0.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j2 = d.j(readShort, this.f3462h);
                d j3 = d.j(readShort2, this.f3462h);
                this.f3460f[0].put("ImageLength", j2);
                this.f3460f[0].put("ImageWidth", j3);
                if (u) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.o(readUnsignedShort2);
        }
    }

    private void m(g gVar) {
        d dVar;
        K(gVar);
        O(gVar, 0);
        a0(gVar, 0);
        a0(gVar, 5);
        a0(gVar, 4);
        b0();
        if (this.f3458d == 8 && (dVar = this.f3460f[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f3484d);
            gVar2.g(this.f3462h);
            gVar2.o(6);
            O(gVar2, 9);
            d dVar2 = this.f3460f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f3460f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void o(g gVar) {
        if (u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        d dVar = this.f3460f[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f3484d), (int) dVar.c, 5);
        }
        d dVar2 = this.f3460f[0].get("ISO");
        d dVar3 = this.f3460f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f3460f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    private void p(g gVar) {
        byte[] bArr = o0;
        gVar.o(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f3470p = bArr.length;
        N(bArr2, 0);
    }

    private void s(b bVar) {
        if (u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.LITTLE_ENDIAN);
        bVar.o(J.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = K;
        bVar.o(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i2 = length + 4 + 4;
                    if (Arrays.equals(L, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f3470p = i2;
                            N(bArr3, 0);
                            X(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i2 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.o(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> t(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = t(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = t(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.t(java.lang.String):android.util.Pair");
    }

    private void u(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m2 = dVar.m(this.f3462h);
            int m3 = dVar2.m(this.f3462h);
            if (this.f3458d == 7) {
                m2 += this.f3471q;
            }
            if (m2 > 0 && m3 > 0) {
                this.f3463i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[m3];
                    bVar.skip((long) m2);
                    bVar.read(bArr);
                    this.f3468n = bArr;
                }
                this.f3466l = m2;
                this.f3467m = m3;
            }
            if (u) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m2 + ", length: " + m3);
            }
        }
    }

    private void v(b bVar, HashMap hashMap) {
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        d dVar = (d) hashMap2.get("StripOffsets");
        d dVar2 = (d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d2 = b.d(dVar.o(this.f3462h));
            long[] d3 = b.d(dVar2.o(this.f3462h));
            if (d2 == null || d2.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d3 == null || d3.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d2.length != d3.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j2 = 0;
                for (long j3 : d3) {
                    j2 += j3;
                }
                int i2 = (int) j2;
                byte[] bArr = new byte[i2];
                int i3 = 1;
                this.f3465k = true;
                this.f3464j = true;
                this.f3463i = true;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < d2.length) {
                    int i7 = (int) d2[i4];
                    int i8 = (int) d3[i4];
                    if (i4 < d2.length - i3 && ((long) (i7 + i8)) != d2[i4 + 1]) {
                        this.f3465k = false;
                    }
                    int i9 = i7 - i5;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j4 = (long) i9;
                    if (bVar2.skip(j4) != j4) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                    int i10 = i5 + i9;
                    byte[] bArr2 = new byte[i8];
                    if (bVar2.read(bArr2) != i8) {
                        Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                        return;
                    }
                    i5 = i10 + i8;
                    System.arraycopy(bArr2, 0, bArr, i6, i8);
                    i6 += i8;
                    i4++;
                    i3 = 1;
                }
                this.f3468n = bArr;
                if (this.f3465k) {
                    this.f3466l = (int) d2[0];
                    this.f3467m = i2;
                }
            }
        }
    }

    private void w(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (E(fileInputStream2.getFD())) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                J(fileInputStream2);
                b.c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            b.c(fileInputStream);
            throw th;
        }
    }

    private static boolean x(BufferedInputStream bufferedInputStream) {
        byte[] bArr = o0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr3 = o0;
            if (i2 >= bArr3.length) {
                return true;
            }
            if (bArr2[i2] != bArr3[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean y(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            e.i.a.a$b r2 = new e.i.a.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = A     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = B     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = C     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = u     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.y(byte[]):boolean");
    }

    private static boolean z(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = z;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015d, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e1, code lost:
        r10 = null;
        r1 = r7;
        r7 = r9;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e6, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e7, code lost:
        r9 = null;
        r10 = null;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00eb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fd, code lost:
        if (r0 >= 21) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ff, code lost:
        e.i.a.b.a.c(r14.b, 0, android.system.OsConstants.SEEK_SET);
        r0 = new java.io.FileOutputStream(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010e, code lost:
        r0 = new java.io.FileOutputStream(r14.a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:29:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fd A[Catch:{ Exception -> 0x012a, all -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010e A[Catch:{ Exception -> 0x012a, all -> 0x0127 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S() {
        /*
            r14 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r14.f3458d
            boolean r1 = G(r1)
            if (r1 == 0) goto L_0x0182
            java.io.FileDescriptor r1 = r14.b
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = r14.a
            if (r1 == 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x001b:
            boolean r1 = r14.f3463i
            if (r1 == 0) goto L_0x0030
            boolean r1 = r14.f3464j
            if (r1 == 0) goto L_0x0030
            boolean r1 = r14.f3465k
            if (r1 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            byte[] r1 = r14.q()
            r14.f3468n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            java.lang.String r3 = r14.a     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            r4 = 0
            r6 = 21
            if (r3 == 0) goto L_0x004f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            java.lang.String r7 = r14.a     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            goto L_0x0061
        L_0x004f:
            if (r0 < r6) goto L_0x0060
            java.io.FileDescriptor r3 = r14.b     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            e.i.a.b.a.c(r3, r4, r7)     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            java.io.FileDescriptor r7 = r14.b     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0170, all -> 0x016d }
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0169, all -> 0x0165 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0169, all -> 0x0165 }
            e.i.a.b.e(r3, r7)     // Catch:{ Exception -> 0x0163, all -> 0x0161 }
            e.i.a.b.c(r3)
            e.i.a.b.c(r7)
            r3 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ef, all -> 0x00eb }
            r7.<init>(r2)     // Catch:{ Exception -> 0x00ef, all -> 0x00eb }
            java.lang.String r8 = r14.a     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            if (r8 == 0) goto L_0x0081
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            java.lang.String r9 = r14.a     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            goto L_0x0093
        L_0x0081:
            if (r0 < r6) goto L_0x0092
            java.io.FileDescriptor r8 = r14.b     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            int r9 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            e.i.a.b.a.c(r8, r4, r9)     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            java.io.FileDescriptor r9 = r14.b     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00e6, all -> 0x00eb }
            goto L_0x0093
        L_0x0092:
            r8 = r1
        L_0x0093:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e0, all -> 0x00eb }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00eb }
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            r10.<init>(r8)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            int r11 = r14.f3458d     // Catch:{ Exception -> 0x00d1 }
            r12 = 4
            if (r11 != r12) goto L_0x00a6
            r14.T(r9, r10)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00c5
        L_0x00a6:
            r12 = 13
            if (r11 != r12) goto L_0x00ae
            r14.U(r9, r10)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00c5
        L_0x00ae:
            r12 = 14
            if (r11 != r12) goto L_0x00b6
            r14.V(r9, r10)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00c5
        L_0x00b6:
            r12 = 3
            if (r11 == r12) goto L_0x00bb
            if (r11 != 0) goto L_0x00c5
        L_0x00bb:
            e.i.a.a$c r11 = new e.i.a.a$c     // Catch:{ Exception -> 0x00d1 }
            java.nio.ByteOrder r12 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x00d1 }
            r11.<init>(r10, r12)     // Catch:{ Exception -> 0x00d1 }
            r14.c0(r11)     // Catch:{ Exception -> 0x00d1 }
        L_0x00c5:
            e.i.a.b.c(r9)
            e.i.a.b.c(r10)
            r2.delete()
            r14.f3468n = r1
            return
        L_0x00d1:
            r1 = move-exception
            r13 = r7
            r7 = r1
            r1 = r13
            goto L_0x00f4
        L_0x00d6:
            r0 = move-exception
            r10 = r1
            goto L_0x0154
        L_0x00da:
            r10 = move-exception
            r13 = r10
            r10 = r1
            r1 = r7
            r7 = r13
            goto L_0x00f4
        L_0x00e0:
            r9 = move-exception
            r10 = r1
            r1 = r7
            r7 = r9
            r9 = r10
            goto L_0x00f4
        L_0x00e6:
            r8 = move-exception
            r9 = r1
            r10 = r9
            r1 = r7
            goto L_0x00f2
        L_0x00eb:
            r0 = move-exception
            r10 = r1
            goto L_0x0155
        L_0x00ef:
            r8 = move-exception
            r9 = r1
            r10 = r9
        L_0x00f2:
            r7 = r8
            r8 = r10
        L_0x00f4:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x012f }
            r11.<init>(r2)     // Catch:{ Exception -> 0x012f }
            java.lang.String r1 = r14.a     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            if (r1 != 0) goto L_0x010e
            if (r0 < r6) goto L_0x0116
            java.io.FileDescriptor r0 = r14.b     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            int r1 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            e.i.a.b.a.c(r0, r4, r1)     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            java.io.FileDescriptor r1 = r14.b     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            goto L_0x0115
        L_0x010e:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            java.lang.String r1 = r14.a     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
        L_0x0115:
            r8 = r0
        L_0x0116:
            e.i.a.b.e(r11, r8)     // Catch:{ Exception -> 0x012a, all -> 0x0127 }
            e.i.a.b.c(r11)     // Catch:{ all -> 0x0153 }
            e.i.a.b.c(r8)     // Catch:{ all -> 0x0153 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0127:
            r0 = move-exception
            r1 = r11
            goto L_0x014c
        L_0x012a:
            r0 = move-exception
            r1 = r11
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            goto L_0x014c
        L_0x012f:
            r0 = move-exception
        L_0x0130:
            r3 = 1
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r5.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r6 = "Failed to save new file. Original file is stored in "
            r5.append(r6)     // Catch:{ all -> 0x012d }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ all -> 0x012d }
            r5.append(r6)     // Catch:{ all -> 0x012d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x012d }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x012d }
            throw r4     // Catch:{ all -> 0x012d }
        L_0x014c:
            e.i.a.b.c(r1)     // Catch:{ all -> 0x0153 }
            e.i.a.b.c(r8)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
        L_0x0154:
            r1 = r9
        L_0x0155:
            e.i.a.b.c(r1)
            e.i.a.b.c(r10)
            if (r3 != 0) goto L_0x0160
            r2.delete()
        L_0x0160:
            throw r0
        L_0x0161:
            r0 = move-exception
            goto L_0x0167
        L_0x0163:
            r0 = move-exception
            goto L_0x016b
        L_0x0165:
            r0 = move-exception
            r7 = r1
        L_0x0167:
            r1 = r3
            goto L_0x017b
        L_0x0169:
            r0 = move-exception
            r7 = r1
        L_0x016b:
            r1 = r3
            goto L_0x0172
        L_0x016d:
            r0 = move-exception
            r7 = r1
            goto L_0x017b
        L_0x0170:
            r0 = move-exception
            r7 = r1
        L_0x0172:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x017a }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x017a }
            throw r2     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
        L_0x017b:
            e.i.a.b.c(r1)
            e.i.a.b.c(r7)
            throw r0
        L_0x0182:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.S():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0328, code lost:
        r3.put(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0292, code lost:
        r3.put(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            java.lang.String r6 = "ExifInterface"
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0070
        L_0x0029:
            if (r2 == 0) goto L_0x0070
            java.util.regex.Pattern r3 = r0
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r7 = s0
            java.util.regex.Matcher r7 = r7.matcher(r2)
            boolean r7 = r7.find()
            int r8 = r19.length()
            r9 = 19
            if (r8 != r9) goto L_0x0057
            if (r3 != 0) goto L_0x004c
            if (r7 != 0) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r7 == 0) goto L_0x0070
            java.lang.String r3 = "-"
            java.lang.String r7 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r7)
            goto L_0x0070
        L_0x0057:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x005c:
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x0070:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0083
            boolean r1 = u
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r6, r1)
        L_0x0081:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0083:
            r3 = 2
            r7 = 1
            if (r2 == 0) goto L_0x00f7
            java.util.HashSet<java.lang.String> r8 = l0
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00e2
            java.util.regex.Pattern r8 = q0
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r9 = r8.find()
            if (r9 != 0) goto L_0x00a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x005c
        L_0x00a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.group(r7)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1,"
            r2.append(r4)
            java.lang.String r5 = r8.group(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            r2.append(r4)
            r4 = 3
            java.lang.String r4 = r8.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x00f7
        L_0x00e2:
            double r8 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00f0 }
            e.i.a.a$f r10 = new e.i.a.a$f     // Catch:{ NumberFormatException -> 0x00f0 }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x00f0 }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x00f0 }
            goto L_0x00f7
        L_0x00f0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x005c
        L_0x00f7:
            r4 = 0
            r5 = 0
        L_0x00f9:
            e.i.a.a$e[][] r8 = h0
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0334
            r8 = 4
            if (r5 != r8) goto L_0x0107
            boolean r8 = r0.f3463i
            if (r8 != 0) goto L_0x0107
            goto L_0x032c
        L_0x0107:
            java.util.HashMap<java.lang.String, e.i.a.a$e>[] r8 = k0
            r8 = r8[r5]
            java.lang.Object r8 = r8.get(r1)
            e.i.a.a$e r8 = (e.i.a.a.e) r8
            if (r8 == 0) goto L_0x032c
            if (r2 != 0) goto L_0x011e
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r8 = r0.f3460f
            r8 = r8[r5]
            r8.remove(r1)
            goto L_0x032c
        L_0x011e:
            android.util.Pair r9 = t(r2)
            int r10 = r8.c
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x01ee
            int r10 = r8.c
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x013d
            goto L_0x01ee
        L_0x013d:
            int r10 = r8.f3485d
            if (r10 == r12) goto L_0x015b
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x0157
            int r10 = r8.f3485d
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x015b
        L_0x0157:
            int r8 = r8.f3485d
            goto L_0x01f0
        L_0x015b:
            int r10 = r8.c
            if (r10 == r7) goto L_0x01ec
            r11 = 7
            if (r10 == r11) goto L_0x01ec
            if (r10 != r3) goto L_0x0166
            goto L_0x01ec
        L_0x0166:
            boolean r10 = u
            if (r10 == 0) goto L_0x032c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Given tag ("
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ") value didn't match with one of expected formats: "
            r10.append(r11)
            java.lang.String[] r11 = U
            int r13 = r8.c
            r13 = r11[r13]
            r10.append(r13)
            int r13 = r8.f3485d
            java.lang.String r14 = ""
            java.lang.String r15 = ", "
            if (r13 != r12) goto L_0x018f
            r8 = r14
            goto L_0x01a2
        L_0x018f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            int r8 = r8.f3485d
            r8 = r11[r8]
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x01a2:
            r10.append(r8)
            java.lang.String r8 = " (guess: "
            r10.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r11[r8]
            r10.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x01c2
            goto L_0x01db
        L_0x01c2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r11[r9]
            r8.append(r9)
            java.lang.String r14 = r8.toString()
        L_0x01db:
            r10.append(r14)
            java.lang.String r8 = ")"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.d(r6, r8)
            goto L_0x032c
        L_0x01ec:
            r8 = r10
            goto L_0x01f0
        L_0x01ee:
            int r8 = r8.c
        L_0x01f0:
            java.lang.String r9 = "/"
            java.lang.String r10 = ","
            switch(r8) {
                case 1: goto L_0x031f;
                case 2: goto L_0x0315;
                case 3: goto L_0x02f2;
                case 4: goto L_0x02cf;
                case 5: goto L_0x0297;
                case 6: goto L_0x01f7;
                case 7: goto L_0x0315;
                case 8: goto L_0x01f7;
                case 9: goto L_0x0272;
                case 10: goto L_0x0237;
                case 11: goto L_0x01f7;
                case 12: goto L_0x0212;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            r15 = 1
            boolean r3 = u
            if (r3 == 0) goto L_0x032d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
            goto L_0x032d
        L_0x0212:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r10 = 0
        L_0x021a:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x0228
            r11 = r8[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x021a
        L_0x0228:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r8 = r0.f3460f
            r8 = r8[r5]
            java.nio.ByteOrder r10 = r0.f3462h
            e.i.a.a$d r9 = e.i.a.a.d.b(r9, r10)
            r8.put(r1, r9)
            goto L_0x032c
        L_0x0237:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r10 = r8.length
            e.i.a.a$f[] r10 = new e.i.a.a.f[r10]
            r11 = 0
        L_0x023f:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x0267
            r13 = r8[r11]
            java.lang.String[] r13 = r13.split(r9, r12)
            e.i.a.a$f r14 = new e.i.a.a$f
            r15 = r13[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r13 = r13[r7]
            r16 = r8
            double r7 = java.lang.Double.parseDouble(r13)
            long r7 = (long) r7
            r14.<init>(r3, r7)
            r10[r11] = r14
            int r11 = r11 + 1
            r8 = r16
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x023f
        L_0x0267:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            java.nio.ByteOrder r4 = r0.f3462h
            e.i.a.a$d r4 = e.i.a.a.d.d(r10, r4)
            goto L_0x0292
        L_0x0272:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x027a:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0288
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x027a
        L_0x0288:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f3462h
            e.i.a.a$d r4 = e.i.a.a.d.c(r4, r7)
        L_0x0292:
            r3.put(r1, r4)
            goto L_0x032c
        L_0x0297:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            e.i.a.a$f[] r4 = new e.i.a.a.f[r4]
            r7 = 0
        L_0x029f:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02c3
            r8 = r3[r7]
            java.lang.String[] r8 = r8.split(r9, r12)
            e.i.a.a$f r10 = new e.i.a.a$f
            r11 = 0
            r13 = r8[r11]
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = (long) r13
            r15 = 1
            r8 = r8[r15]
            double r11 = java.lang.Double.parseDouble(r8)
            long r11 = (long) r11
            r10.<init>(r13, r11)
            r4[r7] = r10
            int r7 = r7 + 1
            r12 = -1
            goto L_0x029f
        L_0x02c3:
            r15 = 1
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f3462h
            e.i.a.a$d r4 = e.i.a.a.d.i(r4, r7)
            goto L_0x0328
        L_0x02cf:
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r7 = 0
        L_0x02d9:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02e7
            r8 = r3[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02d9
        L_0x02e7:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f3462h
            e.i.a.a$d r4 = e.i.a.a.d.g(r4, r7)
            goto L_0x0328
        L_0x02f2:
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x02fc:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x030a
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02fc
        L_0x030a:
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f3462h
            e.i.a.a$d r4 = e.i.a.a.d.k(r4, r7)
            goto L_0x0328
        L_0x0315:
            r15 = 1
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            e.i.a.a$d r4 = e.i.a.a.d.e(r2)
            goto L_0x0328
        L_0x031f:
            r15 = 1
            java.util.HashMap<java.lang.String, e.i.a.a$d>[] r3 = r0.f3460f
            r3 = r3[r5]
            e.i.a.a$d r4 = e.i.a.a.d.a(r2)
        L_0x0328:
            r3.put(r1, r4)
            goto L_0x032d
        L_0x032c:
            r15 = 1
        L_0x032d:
            int r5 = r5 + 1
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x00f9
        L_0x0334:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.W(java.lang.String, java.lang.String):void");
    }

    public String d(String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        d f2 = f(str);
        if (f2 != null) {
            if (!l0.contains(str)) {
                return f2.n(this.f3462h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = f2.a;
                if (i2 == 5 || i2 == 10) {
                    f[] fVarArr = (f[]) f2.o(this.f3462h);
                    if (fVarArr == null || fVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVarArr[0].a) / ((float) fVarArr[0].b))), Integer.valueOf((int) (((float) fVarArr[1].a) / ((float) fVarArr[1].b))), Integer.valueOf((int) (((float) fVarArr[2].a) / ((float) fVarArr[2].b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + f2.a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(f2.l(this.f3462h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i2) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d f2 = f(str);
        if (f2 == null) {
            return i2;
        }
        try {
            return f2.m(this.f3462h);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public int n() {
        switch (e("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] q() {
        int i2 = this.f3469o;
        if (i2 == 6 || i2 == 7) {
            return r();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063 A[SYNTHETIC, Splitter:B:38:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] r() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f3463i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r11.f3468n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r11.c     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
        L_0x001a:
            r3 = r2
            goto L_0x0061
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            e.i.a.b.c(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00ba
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00ab
        L_0x002e:
            java.lang.String r1 = r11.a     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.lang.String r3 = r11.a     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            goto L_0x001a
        L_0x003a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r3 = 21
            if (r1 < r3) goto L_0x005f
            java.io.FileDescriptor r1 = r11.b     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            java.io.FileDescriptor r1 = e.i.a.b.a.b(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            e.i.a.b.a.c(r1, r3, r5)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r10 = r3
            r3 = r1
            r1 = r10
            goto L_0x0061
        L_0x0056:
            r0 = move-exception
            r3 = r1
            goto L_0x00bb
        L_0x005a:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x00ab
        L_0x005f:
            r1 = r2
            r3 = r1
        L_0x0061:
            if (r1 == 0) goto L_0x009e
            int r4 = r11.f3466l     // Catch:{ Exception -> 0x009c }
            int r5 = r11.f3470p     // Catch:{ Exception -> 0x009c }
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch:{ Exception -> 0x009c }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x009c }
            int r6 = r11.f3466l     // Catch:{ Exception -> 0x009c }
            int r7 = r11.f3470p     // Catch:{ Exception -> 0x009c }
            int r6 = r6 + r7
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0096
            int r4 = r11.f3467m     // Catch:{ Exception -> 0x009c }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x009c }
            int r5 = r1.read(r4)     // Catch:{ Exception -> 0x009c }
            int r6 = r11.f3467m     // Catch:{ Exception -> 0x009c }
            if (r5 != r6) goto L_0x0090
            r11.f3468n = r4     // Catch:{ Exception -> 0x009c }
            e.i.a.b.c(r1)
            if (r3 == 0) goto L_0x008f
            e.i.a.b.b(r3)
        L_0x008f:
            return r4
        L_0x0090:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x009c }
            r4.<init>(r8)     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x0096:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x009c }
            r4.<init>(r8)     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            r4 = move-exception
            goto L_0x00ab
        L_0x009e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x009c }
            r4.<init>()     // Catch:{ Exception -> 0x009c }
            throw r4     // Catch:{ Exception -> 0x009c }
        L_0x00a4:
            r0 = move-exception
            r3 = r2
            goto L_0x00bb
        L_0x00a7:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x00ab:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00b9 }
            e.i.a.b.c(r1)
            if (r3 == 0) goto L_0x00b8
            e.i.a.b.b(r3)
        L_0x00b8:
            return r2
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            r2 = r1
        L_0x00bb:
            e.i.a.b.c(r2)
            if (r3 == 0) goto L_0x00c3
            e.i.a.b.b(r3)
        L_0x00c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.r():byte[]");
    }
}
