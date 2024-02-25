package io.flutter.embedding.android;

import io.flutter.embedding.android.KeyboardManager;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;

public final /* synthetic */ class d implements BinaryMessenger.BinaryReply {
    public final /* synthetic */ KeyboardManager.Responder.OnKeyEventHandledCallback a;

    public /* synthetic */ d(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.a = onKeyEventHandledCallback;
    }

    public final void reply(ByteBuffer byteBuffer) {
        KeyEmbedderResponder.a(this.a, byteBuffer);
    }
}
