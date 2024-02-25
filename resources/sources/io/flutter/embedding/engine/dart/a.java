package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f4692e;

    public /* synthetic */ a(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f4692e = serialTaskQueue;
    }

    public final void run() {
        this.f4692e.b();
    }
}
