package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class b0 extends Writer {

    /* renamed from: e  reason: collision with root package name */
    private final String f988e;

    /* renamed from: f  reason: collision with root package name */
    private StringBuilder f989f = new StringBuilder(128);

    b0(String str) {
        this.f988e = str;
    }

    private void a() {
        if (this.f989f.length() > 0) {
            Log.d(this.f988e, this.f989f.toString());
            StringBuilder sb = this.f989f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == 10) {
                a();
            } else {
                this.f989f.append(c);
            }
        }
    }
}
