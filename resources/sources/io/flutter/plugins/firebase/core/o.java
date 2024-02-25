package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

public final /* synthetic */ class o implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseCoreHostApi a;

    public /* synthetic */ o(GeneratedAndroidFirebaseCore.FirebaseCoreHostApi firebaseCoreHostApi) {
        this.a = firebaseCoreHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        s.d(this.a, obj, reply);
    }
}
