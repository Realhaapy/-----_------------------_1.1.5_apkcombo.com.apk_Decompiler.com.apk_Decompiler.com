package r.a.a.a.b;

import java.io.Serializable;
import java.io.Writer;

public class a extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f5513e;

    public a(int i2) {
        this.f5513e = new StringBuilder(i2);
    }

    public Writer append(char c) {
        this.f5513e.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.f5513e.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        this.f5513e.append(charSequence, i2, i3);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.f5513e.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.f5513e.append(str);
        }
    }

    public void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.f5513e.append(cArr, i2, i3);
        }
    }
}
