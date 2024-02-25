package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f861d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f862e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f863f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static d f864g;
    private final Context a;
    private final NotificationManager b;

    private static class a implements e {
        final String a;
        final int b;
        final String c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f865d;

        a(String str) {
            this.a = str;
            this.b = 0;
            this.c = null;
            this.f865d = true;
        }

        a(String str, int i2, String str2) {
            this.a = str;
            this.b = i2;
            this.c = str2;
            this.f865d = false;
        }

        public void a(android.support.v4.app.a aVar) {
            if (this.f865d) {
                aVar.F(this.a);
            } else {
                aVar.j(this.a, this.b, this.c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + ", all:" + this.f865d + "]";
        }
    }

    private static class b implements e {
        final String a;
        final int b;
        final String c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f866d;

        b(String str, int i2, String str2, Notification notification) {
            this.a = str;
            this.b = i2;
            this.c = str2;
            this.f866d = notification;
        }

        public void a(android.support.v4.app.a aVar) {
            aVar.U(this.a, this.b, this.c, this.f866d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
        }
    }

    private static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {
        private final Context a;
        private final HandlerThread b;
        private final Handler c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f867d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f868e = new HashSet();

        private static class a {
            final ComponentName a;
            boolean b = false;
            android.support.v4.app.a c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f869d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f870e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean bindService = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
            aVar.b = bindService;
            if (bindService) {
                aVar.f870e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.a);
                this.a.unbindService(this);
            }
            return aVar.b;
        }

        private void b(a aVar) {
            if (aVar.b) {
                this.a.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void c(e eVar) {
            j();
            for (a next : this.f867d.values()) {
                next.f869d.add(eVar);
                g(next);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f867d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f867d.get(componentName);
            if (aVar != null) {
                aVar.c = a.C0000a.a(iBinder);
                aVar.f870e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f867d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.a + ", " + aVar.f869d.size() + " queued tasks");
            }
            if (!aVar.f869d.isEmpty()) {
                if (!a(aVar) || aVar.c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    e peek = aVar.f869d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.c);
                        aVar.f869d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.a);
                        }
                    } catch (RemoteException e2) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.a, e2);
                    }
                }
                if (!aVar.f869d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                int i2 = aVar.f870e + 1;
                aVar.f870e = i2;
                if (i2 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f869d.size() + " tasks to " + aVar.a + " after " + aVar.f870e + " retries");
                    aVar.f869d.clear();
                    return;
                }
                int i3 = (1 << (i2 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i3);
            }
        }

        private void j() {
            Set<String> f2 = o.f(this.a);
            if (!f2.equals(this.f868e)) {
                this.f868e = f2;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (f2.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f867d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f867d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.f867d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        b((a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(e eVar) {
            this.c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c((e) message.obj);
                return true;
            } else if (i2 == 1) {
                c cVar = (c) message.obj;
                e(cVar.a, cVar.b);
                return true;
            } else if (i2 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i2 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(android.support.v4.app.a aVar);
    }

    private o(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static o e(Context context) {
        return new o(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                if (!string.equals(f861d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f862e = hashSet;
                    f861d = string;
                }
            }
            set = f862e;
        }
        return set;
    }

    private void j(e eVar) {
        synchronized (f863f) {
            if (f864g == null) {
                f864g = new d(this.a.getApplicationContext());
            }
            f864g.h(eVar);
        }
    }

    private static boolean k(Notification notification) {
        Bundle a2 = l.a(notification);
        return a2 != null && a2.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return this.b.areNotificationsEnabled();
        }
        if (i2 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i3), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i2) {
        c((String) null, i2);
    }

    public void c(String str, int i2) {
        this.b.cancel(str, i2);
        if (Build.VERSION.SDK_INT <= 19) {
            j(new a(this.a.getPackageName(), i2, str));
        }
    }

    public void d() {
        this.b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            j(new a(this.a.getPackageName()));
        }
    }

    public List<NotificationChannel> g() {
        return Build.VERSION.SDK_INT >= 26 ? this.b.getNotificationChannels() : Collections.emptyList();
    }

    public void h(int i2, Notification notification) {
        i((String) null, i2, notification);
    }

    public void i(String str, int i2, Notification notification) {
        if (k(notification)) {
            j(new b(this.a.getPackageName(), i2, str, notification));
            this.b.cancel(str, i2);
            return;
        }
        this.b.notify(str, i2, notification);
    }
}
