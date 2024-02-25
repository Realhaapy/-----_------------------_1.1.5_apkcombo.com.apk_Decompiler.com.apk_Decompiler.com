package com.facebook.y0.q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.g0;
import m.y.d.g;

public final class o {
    public static final a c = new a((g) null);
    private final String a;
    private final boolean b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a() {
            g0 g0Var = g0.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(g0.c()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final o b() {
            g0 g0Var = g0.a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g0.c());
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), (g) null);
        }
    }

    private o(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ o(String str, boolean z, g gVar) {
        this(str, z);
    }

    public final void a() {
        g0 g0Var = g0.a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(g0.c()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        edit.apply();
    }

    public String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        if (this.a == null) {
            return str;
        }
        return str + '(' + this.a + ')';
    }
}
