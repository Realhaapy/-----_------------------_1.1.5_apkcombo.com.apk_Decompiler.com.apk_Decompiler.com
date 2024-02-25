package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

class UrlLauncher {
    private static final String TAG = "UrlLauncher";
    private Activity activity;
    private final Context applicationContext;

    enum LaunchStatus {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    UrlLauncher(Context context, Activity activity2) {
        this.applicationContext = context;
        this.activity = activity2;
    }

    /* access modifiers changed from: package-private */
    public boolean canLaunch(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.applicationContext.getPackageManager());
        if (resolveActivity == null) {
            Log.i(TAG, "component name for " + str + " is null");
            return false;
        }
        Log.i(TAG, "component name for " + str + " is " + resolveActivity.toShortString());
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    /* access modifiers changed from: package-private */
    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    /* access modifiers changed from: package-private */
    public LaunchStatus launch(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return LaunchStatus.NO_ACTIVITY;
        }
        try {
            this.activity.startActivity(z ? WebViewActivity.createIntent(activity2, str, z2, z3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return LaunchStatus.OK;
        } catch (ActivityNotFoundException unused) {
            return LaunchStatus.ACTIVITY_NOT_FOUND;
        }
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }
}
