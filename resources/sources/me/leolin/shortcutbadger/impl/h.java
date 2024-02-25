package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import n.a.a.a;

public class h implements a {
    private final Uri a = Uri.parse("content://com.android.badge/badge");

    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    public void b(Context context, ComponentName componentName, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i2);
        context.getContentResolver().call(this.a, "setAppBadgeCount", (String) null, bundle);
    }
}
