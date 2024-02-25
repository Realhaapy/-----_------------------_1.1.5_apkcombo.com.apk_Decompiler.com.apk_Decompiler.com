package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    static class a implements AudioAttributesImpl.a {
        final AudioAttributes.Builder a = new AudioAttributes.Builder();

        a() {
        }

        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        public /* bridge */ /* synthetic */ AudioAttributesImpl.a b(int i2) {
            c(i2);
            return this;
        }

        public a c(int i2) {
            this.a.setLegacyStreamType(i2);
            return this;
        }
    }

    AudioAttributesImplApi21() {
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.b = -1;
        this.a = audioAttributes;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
