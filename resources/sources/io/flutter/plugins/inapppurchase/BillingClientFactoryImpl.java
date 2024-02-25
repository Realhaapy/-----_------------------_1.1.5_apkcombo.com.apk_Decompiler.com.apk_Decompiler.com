package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.d;
import io.flutter.plugin.common.MethodChannel;

final class BillingClientFactoryImpl implements BillingClientFactory {
    BillingClientFactoryImpl() {
    }

    public d createBillingClient(Context context, MethodChannel methodChannel) {
        d.a i2 = d.i(context);
        i2.b();
        i2.c(new PluginPurchaseListener(methodChannel));
        return i2.a();
    }
}
