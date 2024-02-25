package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import n.a.a.a;
import n.a.a.b;

public class d implements a {
    private int a = -1;

    private void c(Context context, ComponentName componentName, int i2) {
        if (i2 == 0) {
            i2 = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i2);
        intent.putExtra("upgradeNumber", i2);
        n.a.a.d.a.c(context, intent);
    }

    @TargetApi(11)
    private void d(Context context, int i2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i2);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new b("Unable to execute Badge By Content Provider");
        }
    }

    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    public void b(Context context, ComponentName componentName, int i2) {
        if (this.a != i2) {
            this.a = i2;
            if (Build.VERSION.SDK_INT >= 11) {
                d(context, i2);
            } else {
                c(context, componentName, i2);
            }
        }
    }
}
