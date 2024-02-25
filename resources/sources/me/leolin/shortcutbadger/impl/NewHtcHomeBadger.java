package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;
import n.a.a.a;
import n.a.a.b;

public class NewHtcHomeBadger implements a {
    public List<String> a() {
        return Collections.singletonList("com.htc.launcher");
    }

    public void b(Context context, ComponentName componentName, int i2) {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i2);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i2);
        boolean z2 = false;
        try {
            n.a.a.d.a.c(context, intent);
            z = true;
        } catch (b unused) {
            z = false;
        }
        try {
            n.a.a.d.a.c(context, intent2);
            z2 = true;
        } catch (b unused2) {
        }
        if (!z && !z2) {
            throw new b("unable to resolve intent: " + intent2.toString());
        }
    }
}
