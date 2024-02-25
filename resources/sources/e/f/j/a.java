package e.f.j;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import e.f.j.f.j;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {
    private static final Object a = new Object();
    private static final Object b = new Object();
    private static TypedValue c;

    /* renamed from: e.f.j.a$a  reason: collision with other inner class name */
    static class C0069a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class d {
        static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class e {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class f {
        static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class g {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        e.f.q.c.d(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File c(java.io.File r4) {
        /*
            java.lang.Object r0 = b
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.j.a.c(java.io.File):java.io.File");
    }

    public static int d(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i2) : context.getResources().getColor(i2);
    }

    public static ColorStateList e(Context context, int i2) {
        return j.c(context.getResources(), i2, context.getTheme());
    }

    public static Drawable f(Context context, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return c.b(context, i2);
        }
        if (i3 < 16) {
            synchronized (a) {
                if (c == null) {
                    c = new TypedValue();
                }
                context.getResources().getValue(i2, c, true);
                i2 = c.resourceId;
            }
        }
        return context.getResources().getDrawable(i2);
    }

    public static File[] g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor i(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : e.f.n.d.a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.c(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        c(file);
        return file;
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0069a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0069a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void m(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
