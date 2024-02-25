package n.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.a;
import me.leolin.shortcutbadger.impl.b;
import me.leolin.shortcutbadger.impl.d;
import me.leolin.shortcutbadger.impl.e;
import me.leolin.shortcutbadger.impl.f;
import me.leolin.shortcutbadger.impl.g;
import me.leolin.shortcutbadger.impl.h;

public final class c {
    private static final List<Class<? extends a>> a;
    private static volatile Boolean b;
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static a f5067d;

    /* renamed from: e  reason: collision with root package name */
    private static ComponentName f5068e;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(a.class);
        linkedList.add(me.leolin.shortcutbadger.impl.c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(b.class);
    }

    public static boolean a(Context context, int i2) {
        try {
            b(context, i2);
            return true;
        } catch (b e2) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e2);
            return false;
        }
    }

    public static void b(Context context, int i2) {
        if (f5067d != null || c(context)) {
            try {
                f5067d.b(context, f5068e, i2);
            } catch (Exception e2) {
                throw new b("Unable to execute badge", e2);
            }
        } else {
            throw new b("No default launcher available");
        }
    }

    private static boolean c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f5068e = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends a>> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = null;
                try {
                    aVar = (a) it.next().newInstance();
                } catch (Exception unused) {
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f5067d = aVar;
                    break;
                }
            }
            if (f5067d != null) {
                break;
            }
        }
        if (f5067d != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f5067d = str2.equalsIgnoreCase("ZUK") ? new h() : str2.equalsIgnoreCase("OPPO") ? new d() : str2.equalsIgnoreCase("VIVO") ? new f() : str2.equalsIgnoreCase("ZTE") ? new g() : new DefaultBadger();
        return true;
    }

    public static boolean d(Context context) {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    String str = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 3) {
                            break;
                        }
                        try {
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", new Object[]{Integer.valueOf(i2 + 1), 3}));
                            if (c(context)) {
                                f5067d.b(context, f5068e, 0);
                                b = Boolean.TRUE;
                                Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                                break;
                            }
                            str = "Failed to initialize the badge counter.";
                            i2++;
                        } catch (Exception e2) {
                            str = e2.getMessage();
                        }
                    }
                    if (b == null) {
                        Log.w("ShortcutBadger", "Badge counter seems not supported for this platform: " + str);
                        b = Boolean.FALSE;
                    }
                }
            }
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        return a(context, 0);
    }
}
