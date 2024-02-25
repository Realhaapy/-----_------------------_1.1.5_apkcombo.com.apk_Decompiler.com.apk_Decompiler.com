package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

public final /* synthetic */ class a implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ long a;

    public /* synthetic */ a(long j2) {
        this.a = j2;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.a(this.a, imageDecoder, imageInfo, source);
    }
}
