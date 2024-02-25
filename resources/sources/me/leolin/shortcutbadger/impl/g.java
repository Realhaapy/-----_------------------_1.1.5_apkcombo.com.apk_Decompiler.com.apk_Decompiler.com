package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import n.a.a.a;

public class g implements a {
    public List<String> a() {
        return new ArrayList(0);
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i2);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        if (Build.VERSION.SDK_INT >= 11) {
            context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
        }
    }
}
