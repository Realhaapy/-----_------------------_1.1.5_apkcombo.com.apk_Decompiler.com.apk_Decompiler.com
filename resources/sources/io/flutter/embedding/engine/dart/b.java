package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f4693e;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f4693e = serialTaskQueue;
    }

    public final void run() {
        this.f4693e.d();
    }
}
