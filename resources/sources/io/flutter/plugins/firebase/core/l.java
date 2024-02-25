package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

public final /* synthetic */ class l implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseAppHostApi a;

    public /* synthetic */ l(GeneratedAndroidFirebaseCore.FirebaseAppHostApi firebaseAppHostApi) {
        this.a = firebaseAppHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        q.c(this.a, obj, reply);
    }
}
