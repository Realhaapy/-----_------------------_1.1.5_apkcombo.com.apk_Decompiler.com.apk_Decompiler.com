package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.d;
import io.flutter.plugin.common.MethodChannel;

interface BillingClientFactory {
    d createBillingClient(Context context, MethodChannel methodChannel);
}
