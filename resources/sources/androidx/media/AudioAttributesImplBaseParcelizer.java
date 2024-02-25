package androidx.media;

import androidx.versionedparcelable.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bVar.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bVar.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.f1231d = bVar.p(audioAttributesImplBase.f1231d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.x(false, false);
        bVar.F(audioAttributesImplBase.a, 1);
        bVar.F(audioAttributesImplBase.b, 2);
        bVar.F(audioAttributesImplBase.c, 3);
        bVar.F(audioAttributesImplBase.f1231d, 4);
    }
}
