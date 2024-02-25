package f.c.a;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.o;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class n implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: e  reason: collision with root package name */
    private b f3728e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f3729f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, Integer> f3730g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3731h = false;

    @FunctionalInterface
    interface a {
        void a(int i2);
    }

    @FunctionalInterface
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    interface c {
        void a(boolean z);
    }

    n() {
    }

    private int a(Context context) {
        List<String> b2 = o.b(context, 21);
        if (!(b2 == null || b2.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b(Context context) {
        return Build.VERSION.SDK_INT < 33 ? o.e(context).a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    private int d(int i2, Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i2 == 17) {
            return b(context);
        }
        if (i2 == 21) {
            return a(context);
        }
        if ((i2 == 30 || i2 == 28 || i2 == 29) && i3 < 31) {
            return a(context);
        }
        List<String> b2 = o.b(context, i2);
        if (b2 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i2);
            return 1;
        } else if (b2.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b2 + i2);
            if (i2 == 16 && i3 < 23) {
                return 2;
            }
            if (i2 != 22 || i3 >= 30) {
                return i3 < 23 ? 1 : 0;
            }
            return 2;
        } else {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 23;
            for (String next : b2) {
                if (z) {
                    if (i2 == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (i3 >= 23) {
                            return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                        }
                        return 2;
                    } else if (i2 == 22) {
                        if (i3 < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i2 == 23 && i3 >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i2 == 24 && i3 >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i2 == 27 && i3 >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (e.f.j.a.a(context, next) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    private void e(String str, int i2) {
        String packageName = this.f3729f.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.f3729f.startActivityForResult(intent, i2);
    }

    private void f(String str, int i2) {
        this.f3729f.startActivityForResult(new Intent(str), i2);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, Context context, a aVar) {
        aVar.a(d(i2, context));
    }

    /* access modifiers changed from: package-private */
    public void g(List<Integer> list, Activity activity, b bVar, k kVar) {
        int i2;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5 = Build.VERSION.SDK_INT;
        if (this.f3731h) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        } else {
            this.f3728e = bVar;
            this.f3729f = activity;
            this.f3730g = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (true) {
                int i6 = 1;
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (d(next.intValue(), activity) != 1) {
                    List<String> b2 = o.b(activity, next.intValue());
                    if (b2 != null && !b2.isEmpty()) {
                        if (i5 >= 23 && next.intValue() == 16) {
                            i4 = 209;
                            str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                        } else if (i5 >= 30 && next.intValue() == 22) {
                            i4 = 210;
                            str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                        } else if (i5 >= 23 && next.intValue() == 23) {
                            i4 = 211;
                            str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                        } else if (i5 >= 26 && next.intValue() == 24) {
                            i4 = 212;
                            str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                        } else if (i5 < 23 || next.intValue() != 27) {
                            arrayList.addAll(b2);
                        } else {
                            f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        }
                        e(str, i4);
                    } else if (!this.f3730g.containsKey(next)) {
                        i6 = 2;
                        if (next.intValue() != 16 || i5 >= 23) {
                            map = this.f3730g;
                            i2 = 0;
                        } else {
                            map = this.f3730g;
                            i2 = 2;
                        }
                        map.put(next, i2);
                        if (next.intValue() != 22 || i5 >= 30) {
                            map2 = this.f3730g;
                            i3 = 0;
                            map2.put(next, i3);
                        }
                    }
                } else if (this.f3730g.containsKey(next)) {
                }
                map2 = this.f3730g;
                i3 = Integer.valueOf(i6);
                map2.put(next, i3);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (arrayList.size() > 0) {
                this.f3731h = true;
                androidx.core.app.c.s(activity, strArr, 24);
                return;
            }
            this.f3731h = false;
            if (this.f3730g.size() > 0) {
                bVar.a(this.f3730g);
                return;
            }
            return;
        }
        kVar.a("PermissionHandler.PermissionManager", str2);
    }

    /* access modifiers changed from: package-private */
    public void h(int i2, Activity activity, c cVar, k kVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            kVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b2 = o.b(activity, i2);
        if (b2 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i2);
            cVar.a(false);
        } else if (b2.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i2 + " no need to show request rationale");
            cVar.a(false);
        } else {
            cVar.a(androidx.core.app.c.v(activity, b2.get(0)));
        }
    }

    public boolean onActivityResult(int i2, int i3, Intent intent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i2 != 209 && i2 != 210 && i2 != 211 && i2 != 212 && i2 != 213) {
            return false;
        }
        boolean z = i3 == -1;
        int i5 = 23;
        if (i2 == 209) {
            i5 = 16;
        } else if (i2 == 210) {
            if (i4 < 30) {
                return false;
            }
            z = Environment.isExternalStorageManager();
            i5 = 22;
        } else if (i2 == 211) {
            if (i4 < 23) {
                return false;
            }
            z = Settings.canDrawOverlays(this.f3729f);
        } else if (i2 == 212) {
            if (i4 < 26) {
                return false;
            }
            z = this.f3729f.getPackageManager().canRequestPackageInstalls();
            i5 = 24;
        } else if (i2 != 213 || i4 < 23) {
            return false;
        } else {
            z = ((NotificationManager) this.f3729f.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i5 = 27;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(i5), Integer.valueOf(z ? 1 : 0));
        this.f3728e.a(hashMap);
        return true;
    }

    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3;
        Map<Integer, Integer> map;
        int i4;
        Map<Integer, Integer> map2;
        int valueOf;
        if (i2 != 24) {
            this.f3731h = false;
            return false;
        } else if (this.f3730g == null) {
            return false;
        } else {
            for (int i5 = 0; i5 < strArr.length; i5++) {
                String str = strArr[i5];
                int f2 = o.f(str);
                if (f2 != 20) {
                    int i6 = iArr[i5];
                    if (f2 == 7) {
                        if (!this.f3730g.containsKey(7)) {
                            this.f3730g.put(7, Integer.valueOf(o.g(this.f3729f, str, i6)));
                        }
                        if (!this.f3730g.containsKey(14)) {
                            map2 = this.f3730g;
                            valueOf = 14;
                        }
                        o.h(this.f3729f, f2);
                    } else {
                        if (f2 == 4) {
                            i4 = o.g(this.f3729f, str, i6);
                            if (!this.f3730g.containsKey(4)) {
                                map = this.f3730g;
                                i3 = 4;
                            }
                            o.h(this.f3729f, f2);
                        } else if (f2 == 3) {
                            i4 = o.g(this.f3729f, str, i6);
                            if (Build.VERSION.SDK_INT < 29 && !this.f3730g.containsKey(4)) {
                                this.f3730g.put(4, Integer.valueOf(i4));
                            }
                            if (!this.f3730g.containsKey(5)) {
                                this.f3730g.put(5, Integer.valueOf(i4));
                            }
                            map = this.f3730g;
                            i3 = Integer.valueOf(f2);
                        } else {
                            if (!this.f3730g.containsKey(Integer.valueOf(f2))) {
                                map2 = this.f3730g;
                                valueOf = Integer.valueOf(f2);
                            }
                            o.h(this.f3729f, f2);
                        }
                        map.put(i3, Integer.valueOf(i4));
                        o.h(this.f3729f, f2);
                    }
                    map2.put(valueOf, Integer.valueOf(o.g(this.f3729f, str, i6)));
                    o.h(this.f3729f, f2);
                }
            }
            this.f3728e.a(this.f3730g);
            this.f3731h = false;
            return true;
        }
    }
}
