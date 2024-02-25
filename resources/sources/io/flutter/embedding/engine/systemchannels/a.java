package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class a implements BasicMessageChannel.Reply {
    public final /* synthetic */ KeyEventChannel.EventResponseHandler a;

    public /* synthetic */ a(KeyEventChannel.EventResponseHandler eventResponseHandler) {
        this.a = eventResponseHandler;
    }

    public final void reply(Object obj) {
        KeyEventChannel.a(this.a, obj);
    }
}
