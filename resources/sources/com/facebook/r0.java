package com.facebook;

import android.content.SharedPreferences;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class r0 {
    private final SharedPreferences a;

    public r0() {
        g0 g0Var = g0.a;
        SharedPreferences sharedPreferences = g0.c().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        l.c(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final q0 b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new q0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(q0 q0Var) {
        l.d(q0Var, "profile");
        JSONObject b = q0Var.b();
        if (b != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", b.toString()).apply();
        }
    }
}
