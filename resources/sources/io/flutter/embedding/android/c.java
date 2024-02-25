package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardMap;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ KeyEmbedderResponder f4685e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ KeyboardMap.KeyPair f4686f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f4687g;

    public /* synthetic */ c(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, KeyEvent keyEvent) {
        this.f4685e = keyEmbedderResponder;
        this.f4686f = keyPair;
        this.f4687g = keyEvent;
    }

    public final void run() {
        this.f4685e.e(this.f4686f, this.f4687g);
    }
}
