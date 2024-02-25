package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

public final /* synthetic */ class m implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseAppHostApi a;

    public /* synthetic */ m(GeneratedAndroidFirebaseCore.FirebaseAppHostApi firebaseAppHostApi) {
        this.a = firebaseAppHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        q.d(this.a, obj, reply);
    }
}
