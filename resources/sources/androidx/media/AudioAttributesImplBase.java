package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1231d = -1;

    static class a implements AudioAttributesImpl.a {
        private int a = 0;
        private int b = 0;
        private int c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f1232d = -1;

        a() {
        }

        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.f1232d);
        }

        public /* bridge */ /* synthetic */ AudioAttributesImpl.a b(int i2) {
            c(i2);
            return this;
        }

        public a c(int i2) {
            if (i2 != 10) {
                this.f1232d = i2;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    AudioAttributesImplBase() {
    }

    AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.b = i2;
        this.c = i3;
        this.a = i4;
        this.f1231d = i5;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        int i2 = this.c;
        int c2 = c();
        if (c2 == 6) {
            i2 |= 4;
        } else if (c2 == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f1231d;
        return i2 != -1 ? i2 : AudioAttributesCompat.a(false, this.c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.b == audioAttributesImplBase.a() && this.c == audioAttributesImplBase.b() && this.a == audioAttributesImplBase.d() && this.f1231d == audioAttributesImplBase.f1231d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.f1231d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1231d != -1) {
            sb.append(" stream=");
            sb.append(this.f1231d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
