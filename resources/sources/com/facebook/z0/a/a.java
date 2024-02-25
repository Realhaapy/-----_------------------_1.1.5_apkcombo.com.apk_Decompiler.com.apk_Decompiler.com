package com.facebook.z0.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.g0;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.n0;
import com.facebook.internal.o0;
import f.e.e.c;
import f.e.e.e;
import f.e.e.h;
import f.e.e.j.b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import m.y.d.l;
import org.json.JSONObject;

public final class a {
    public static final a a = new a();
    private static final String b = "com.facebook.z0.a.a";
    private static final HashMap<String, NsdManager.RegistrationListener> c = new HashMap<>();

    /* renamed from: com.facebook.z0.a.a$a  reason: collision with other inner class name */
    public static final class C0035a implements NsdManager.RegistrationListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        C0035a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            l.d(nsdServiceInfo, "serviceInfo");
            a aVar = a.a;
            a.a(this.b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            l.d(nsdServiceInfo, "NsdServiceInfo");
            if (!l.a(this.a, nsdServiceInfo.getServiceName())) {
                a aVar = a.a;
                a.a(this.b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            l.d(nsdServiceInfo, "serviceInfo");
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            l.d(nsdServiceInfo, "serviceInfo");
        }
    }

    private a() {
    }

    public static final void a(String str) {
        Class<a> cls = a.class;
        if (!com.facebook.internal.s0.n.a.d(cls)) {
            try {
                a.b(str);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
            }
        }
    }

    @TargetApi(16)
    private final void b(String str) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = c.get(str);
                if (registrationListener != null) {
                    g0 g0Var = g0.a;
                    Object systemService = g0.c().getSystemService("servicediscovery");
                    if (systemService != null) {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                        c.remove(str);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
            } catch (IllegalArgumentException e2) {
                o0 o0Var = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public static final Bitmap c(String str) {
        Class<a> cls = a.class;
        Bitmap bitmap = null;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b a2 = new e().a(str, f.e.e.a.QR_CODE, 200, 200, enumMap);
                int h2 = a2.h();
                int i2 = a2.i();
                int[] iArr = new int[(h2 * i2)];
                if (h2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        int i5 = i3 * i2;
                        if (i2 > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                iArr[i5 + i6] = a2.f(i6, i3) ? -16777216 : -1;
                                if (i7 >= i2) {
                                    break;
                                }
                                i6 = i7;
                            }
                        }
                        if (i4 >= h2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(i2, h2, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, h2);
                    return createBitmap;
                } catch (h unused) {
                    bitmap = createBitmap;
                }
            } catch (h unused2) {
                return bitmap;
            }
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    public static final String d(Map<String, String> map) {
        Class<a> cls = a.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, cls);
                return null;
            }
        }
        String str = Build.DEVICE;
        l.c(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        l.c(str2, "MODEL");
        map.put("model", str2);
        String jSONObject = new JSONObject(map).toString();
        l.c(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        Class<a> cls = a.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            d0 d0Var = d0.a;
            g0 g0Var = g0.a;
            c0 c2 = d0.c(g0.d());
            return Build.VERSION.SDK_INT >= 16 && c2 != null && c2.j().contains(n0.Enabled);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final boolean f(String str) {
        Class<a> cls = a.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            a aVar = a;
            if (e()) {
                return aVar.g(str);
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    @TargetApi(16)
    private final boolean g(String str) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            g0 g0Var = g0.a;
            String str2 = "fbsdk_" + l.j("android-", p.q(g0.r(), '.', '|', false, 4, (Object) null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = g0.c().getSystemService("servicediscovery");
            if (systemService != null) {
                C0035a aVar = new C0035a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return false;
        }
    }
}
