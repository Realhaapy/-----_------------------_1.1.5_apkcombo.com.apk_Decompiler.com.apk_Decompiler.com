package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    static class a extends AudioAttributesImplApi21.a {
        a() {
        }

        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi26(this.a.build());
        }
    }

    AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
