package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.g0;
import m.y.d.l;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: e  reason: collision with root package name */
    private static final String f1399e;

    static {
        String simpleName = FacebookInitProvider.class.getSimpleName();
        l.c(simpleName, "FacebookInitProvider::class.java.simpleName");
        f1399e = simpleName;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        l.d(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        l.d(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        l.d(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                g0 g0Var = g0.a;
                g0.L(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception e2) {
            Log.i(f1399e, "Failed to auto initialize the Facebook SDK", e2);
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.d(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.d(uri, "uri");
        return 0;
    }
}
