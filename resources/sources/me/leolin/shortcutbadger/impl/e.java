package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import n.a.a.a;
import n.a.a.d.b;

public class e implements a {
    private static final String[] b = {"_id", "class"};
    private DefaultBadger a;

    public e() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new DefaultBadger();
        }
    }

    private ContentValues c(ComponentName componentName, int i2, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i2));
        return contentValues;
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        DefaultBadger defaultBadger = this.a;
        if (defaultBadger == null || !defaultBadger.c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        int i3 = cursor.getInt(0);
                        contentResolver.update(parse, c(componentName, i2, false), "_id=?", new String[]{String.valueOf(i3)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, c(componentName, i2, true));
                    }
                }
            } finally {
                b.a(cursor);
            }
        } else {
            this.a.b(context, componentName, i2);
        }
    }
}
