package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.h;
import com.android.billingclient.api.k;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class a implements k {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.a = result;
    }

    public final void a(h hVar) {
        this.a.success(Translator.fromBillingResult(hVar));
    }
}
