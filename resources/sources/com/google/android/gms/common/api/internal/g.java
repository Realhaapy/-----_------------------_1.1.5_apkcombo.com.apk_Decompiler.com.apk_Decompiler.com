package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

public interface g {
    void a(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T b(String str, Class<T> cls);

    Activity c();

    void startActivityForResult(Intent intent, int i2);
}
