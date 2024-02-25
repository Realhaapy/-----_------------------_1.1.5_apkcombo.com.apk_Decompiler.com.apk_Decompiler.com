package io.flutter.embedding.android;

import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;

public final /* synthetic */ class b implements KeyEventChannel.EventResponseHandler {
    public final /* synthetic */ KeyboardManager.Responder.OnKeyEventHandledCallback a;

    public /* synthetic */ b(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.a = onKeyEventHandledCallback;
    }

    public final void onFrameworkResponse(boolean z) {
        this.a.onKeyEventHandled(z);
    }
}
