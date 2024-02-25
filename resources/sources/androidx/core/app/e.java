package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class e {
    protected static final Class<?> a;
    protected static final Field b = b();
    protected static final Field c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f797d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f798e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f799f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f800g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f801e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f802f;

        a(d dVar, Object obj) {
            this.f801e = dVar;
            this.f802f = obj;
        }

        public void run() {
            this.f801e.f807e = this.f802f;
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Application f803e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f804f;

        b(Application application, d dVar) {
            this.f803e = application;
            this.f804f = dVar;
        }

        public void run() {
            this.f803e.unregisterActivityLifecycleCallbacks(this.f804f);
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f805e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f806f;

        c(Object obj, Object obj2) {
            this.f805e = obj;
            this.f806f = obj2;
        }

        public void run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = e.f797d;
                if (method != null) {
                    method.invoke(this.f805e, new Object[]{this.f806f, bool, "AppCompat recreation"});
                    return;
                }
                e.f798e.invoke(this.f805e, new Object[]{this.f806f, bool});
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e  reason: collision with root package name */
        Object f807e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f808f;

        /* renamed from: g  reason: collision with root package name */
        private final int f809g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f810h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f811i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f812j = false;

        d(Activity activity) {
            this.f808f = activity;
            this.f809g = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f808f == activity) {
                this.f808f = null;
                this.f811i = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f811i && !this.f812j && !this.f810h && e.h(this.f807e, this.f809g, activity)) {
                this.f812j = true;
                this.f807e = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f808f == activity) {
                this.f810h = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a2 = a();
        a = a2;
        f797d = d(a2);
        f798e = c(a2);
        f799f = e(a2);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i2) {
                    f800g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f799f == null) {
            return false;
        } else {
            if (f798e == null && f797d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f800g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f799f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
