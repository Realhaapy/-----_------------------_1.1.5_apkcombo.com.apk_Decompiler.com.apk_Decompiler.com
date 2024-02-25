package com.facebook.y0.m0.n;

import android.util.Log;
import java.lang.reflect.Method;
import m.y.d.l;

public final class e {
    public static final e a = new e();
    private static final String b = "com.facebook.y0.m0.n.e";
    private static Class<?> c;

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class<?> b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        l.c(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (c == null) {
                c = a.b();
            }
            Class<?> cls2 = c;
            if (cls2 != null) {
                Method method = cls2.getMethod("UnitySendMessage", new Class[]{cls, cls, cls});
                l.c(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
                Class<?> cls3 = c;
                if (cls3 != null) {
                    method.invoke(cls3, new Object[]{str, str2, str3});
                    return;
                }
                l.n("unityPlayer");
                throw null;
            }
            l.n("unityPlayer");
            throw null;
        } catch (Exception e2) {
            Log.e(b, "Failed to send message to Unity", e2);
        }
    }
}
