package f.e.d.a0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class c implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f4291n = new String[128];

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f4292o;

    /* renamed from: e  reason: collision with root package name */
    private final Writer f4293e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f4294f = new int[32];

    /* renamed from: g  reason: collision with root package name */
    private int f4295g = 0;

    /* renamed from: h  reason: collision with root package name */
    private String f4296h;

    /* renamed from: i  reason: collision with root package name */
    private String f4297i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4298j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4299k;

    /* renamed from: l  reason: collision with root package name */
    private String f4300l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4301m;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f4291n[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f4291n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4292o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        V(6);
        this.f4297i = ":";
        this.f4301m = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4293e = writer;
    }

    private void P() {
        if (this.f4296h != null) {
            this.f4293e.write(10);
            int i2 = this.f4295g;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f4293e.write(this.f4296h);
            }
        }
    }

    private c T(int i2, char c) {
        c();
        V(i2);
        this.f4293e.write(c);
        return this;
    }

    private int U() {
        int i2 = this.f4295g;
        if (i2 != 0) {
            return this.f4294f[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void V(int i2) {
        int i3 = this.f4295g;
        int[] iArr = this.f4294f;
        if (i3 == iArr.length) {
            this.f4294f = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f4294f;
        int i4 = this.f4295g;
        this.f4295g = i4 + 1;
        iArr2[i4] = i2;
    }

    private void W(int i2) {
        this.f4294f[this.f4295g - 1] = i2;
    }

    private void a() {
        int U = U();
        if (U == 5) {
            this.f4293e.write(44);
        } else if (U != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        P();
        W(4);
    }

    private void b0(String str) {
        String str2;
        String[] strArr = this.f4299k ? f4292o : f4291n;
        this.f4293e.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f4293e.write(str, i2, i3 - i2);
            }
            this.f4293e.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f4293e.write(str, i2, length - i2);
        }
        this.f4293e.write(34);
    }

    private void c() {
        int U = U();
        if (U == 1) {
            W(2);
        } else if (U == 2) {
            this.f4293e.append(',');
        } else if (U != 4) {
            if (U != 6) {
                if (U != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4298j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            W(7);
            return;
        } else {
            this.f4293e.append(this.f4297i);
            W(5);
            return;
        }
        P();
    }

    private void h0() {
        if (this.f4300l != null) {
            a();
            b0(this.f4300l);
            this.f4300l = null;
        }
    }

    private c v(int i2, int i3, char c) {
        int U = U();
        if (U != i3 && U != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f4300l == null) {
            this.f4295g--;
            if (U == i3) {
                P();
            }
            this.f4293e.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f4300l);
        }
    }

    public c B() {
        v(3, 5, '}');
        return this;
    }

    public final boolean E() {
        return this.f4301m;
    }

    public final boolean J() {
        return this.f4299k;
    }

    public boolean L() {
        return this.f4298j;
    }

    public c O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4300l != null) {
            throw new IllegalStateException();
        } else if (this.f4295g != 0) {
            this.f4300l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c S() {
        if (this.f4300l != null) {
            if (this.f4301m) {
                h0();
            } else {
                this.f4300l = null;
                return this;
            }
        }
        c();
        this.f4293e.write("null");
        return this;
    }

    public final void X(boolean z) {
        this.f4299k = z;
    }

    public final void Y(String str) {
        String str2;
        if (str.length() == 0) {
            this.f4296h = null;
            str2 = ":";
        } else {
            this.f4296h = str;
            str2 = ": ";
        }
        this.f4297i = str2;
    }

    public final void Z(boolean z) {
        this.f4298j = z;
    }

    public final void a0(boolean z) {
        this.f4301m = z;
    }

    public c c0(long j2) {
        h0();
        c();
        this.f4293e.write(Long.toString(j2));
        return this;
    }

    public void close() {
        this.f4293e.close();
        int i2 = this.f4295g;
        if (i2 > 1 || (i2 == 1 && this.f4294f[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4295g = 0;
    }

    public c d0(Boolean bool) {
        if (bool == null) {
            return S();
        }
        h0();
        c();
        this.f4293e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c e0(Number number) {
        if (number == null) {
            return S();
        }
        h0();
        String obj = number.toString();
        if (this.f4298j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            c();
            this.f4293e.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c f0(String str) {
        if (str == null) {
            return S();
        }
        h0();
        c();
        b0(str);
        return this;
    }

    public void flush() {
        if (this.f4295g != 0) {
            this.f4293e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        h0();
        T(1, '[');
        return this;
    }

    public c g0(boolean z) {
        h0();
        c();
        this.f4293e.write(z ? "true" : "false");
        return this;
    }

    public c o() {
        h0();
        T(3, '{');
        return this;
    }

    public c z() {
        v(1, 2, ']');
        return this;
    }
}
