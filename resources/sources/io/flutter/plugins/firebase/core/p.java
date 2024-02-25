package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

public final /* synthetic */ class p implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseCoreHostApi a;

    public /* synthetic */ p(GeneratedAndroidFirebaseCore.FirebaseCoreHostApi firebaseCoreHostApi) {
        this.a = firebaseCoreHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        s.b(this.a, obj, reply);
    }
}
