package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements n.a.a.a {
    private final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    private AsyncQueryHandler b;

    class a extends AsyncQueryHandler {
        a(SonyHomeBadger sonyHomeBadger, ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues c(int i2, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i2));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    private static void d(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i2));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i2 > 0);
        context.sendBroadcast(intent);
    }

    private void e(Context context, ComponentName componentName, int i2) {
        if (i2 >= 0) {
            ContentValues c = c(i2, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.b == null) {
                    this.b = new a(this, context.getApplicationContext().getContentResolver());
                }
                f(c);
                return;
            }
            g(context, c);
        }
    }

    private void f(ContentValues contentValues) {
        this.b.startInsert(0, (Object) null, this.a, contentValues);
    }

    private void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.a, contentValues);
    }

    private static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        if (h(context)) {
            e(context, componentName, i2);
        } else {
            d(context, componentName, i2);
        }
    }
}
