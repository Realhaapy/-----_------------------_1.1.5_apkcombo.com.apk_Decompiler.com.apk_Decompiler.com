package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardMap;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ KeyEmbedderResponder f4688e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ KeyboardMap.KeyPair f4689f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f4690g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f4691h;

    public /* synthetic */ e(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j2, KeyEvent keyEvent) {
        this.f4688e = keyEmbedderResponder;
        this.f4689f = keyPair;
        this.f4690g = j2;
        this.f4691h = keyEvent;
    }

    public final void run() {
        this.f4688e.c(this.f4689f, this.f4690g, this.f4691h);
    }
}
