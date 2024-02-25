package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;
import java.nio.ByteBuffer;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DartMessenger f4694e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f4695f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.HandlerInfo f4696g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f4697h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4698i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4699j;

    public /* synthetic */ c(DartMessenger dartMessenger, String str, DartMessenger.HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i2, long j2) {
        this.f4694e = dartMessenger;
        this.f4695f = str;
        this.f4696g = handlerInfo;
        this.f4697h = byteBuffer;
        this.f4698i = i2;
        this.f4699j = j2;
    }

    public final void run() {
        this.f4694e.b(this.f4695f, this.f4696g, this.f4697h, this.f4698i, this.f4699j);
    }
}
