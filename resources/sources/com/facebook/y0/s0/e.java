package com.facebook.y0.s0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.a1.a.a;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.internal.y;
import com.facebook.y0.q0.g;
import com.facebook.y0.v;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import m.y.d.l;

public final class e {
    public static final e a = new e();
    private static final String b;
    private static Boolean c;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f2147e;

        private a(String str) {
            this.f2147e = str;
        }

        public String toString() {
            return this.f2147e;
        }
    }

    private static final class b implements ServiceConnection {
        private final CountDownLatch a = new CountDownLatch(1);
        private IBinder b;

        public final IBinder a() {
            this.a.await(5, TimeUnit.SECONDS);
            return this.b;
        }

        public void onNullBinding(ComponentName componentName) {
            l.d(componentName, "name");
            this.a.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.d(componentName, "name");
            l.d(iBinder, "serviceBinder");
            this.b = iBinder;
            this.a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.d(componentName, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        String simpleName = e.class.getSimpleName();
        l.c(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null) {
                    y yVar = y.a;
                    if (y.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    y yVar2 = y.a;
                    if (y.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final boolean b() {
        Class<e> cls = e.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return false;
        }
        try {
            if (c == null) {
                g0 g0Var = g0.a;
                c = Boolean.valueOf(a.a(g0.c()) != null);
            }
            Boolean bool = c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return false;
        }
    }

    public static final c c(String str, List<v> list) {
        Class<e> cls = e.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "applicationId");
            l.d(list, "appEvents");
            return a.d(a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }

    private final c d(a aVar, String str, List<v> list) {
        Context c2;
        b bVar;
        c cVar;
        String str2;
        if (com.facebook.internal.s0.n.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g gVar = g.a;
            g.b();
            g0 g0Var = g0.a;
            c2 = g0.c();
            Intent a2 = a(c2);
            if (a2 == null) {
                return cVar2;
            }
            bVar = new b();
            if (!c2.bindService(a2, bVar, 1)) {
                return c.SERVICE_ERROR;
            }
            try {
                IBinder a3 = bVar.a();
                if (a3 != null) {
                    com.facebook.a1.a.a a4 = a.C0023a.a(a3);
                    d dVar = d.a;
                    Bundle a5 = d.a(aVar, str, list);
                    if (a5 != null) {
                        a4.r(a5);
                        o0 o0Var = o0.a;
                        o0.e0(b, l.j("Successfully sent events to the remote service: ", a5));
                    }
                    cVar2 = c.OPERATION_SUCCESS;
                }
                c2.unbindService(bVar);
                o0 o0Var2 = o0.a;
                o0.e0(b, "Unbound from the remote service");
                return cVar2;
            } catch (InterruptedException e2) {
                cVar = c.SERVICE_ERROR;
                o0 o0Var3 = o0.a;
                str2 = b;
                o0.d0(str2, e2);
                c2.unbindService(bVar);
                o0.e0(str2, "Unbound from the remote service");
                return cVar;
            } catch (RemoteException e3) {
                cVar = c.SERVICE_ERROR;
                o0 o0Var4 = o0.a;
                str2 = b;
                o0.d0(str2, e3);
                c2.unbindService(bVar);
                o0.e0(str2, "Unbound from the remote service");
                return cVar;
            }
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, this);
            return null;
        }
    }

    public static final c e(String str) {
        Class<e> cls = e.class;
        if (com.facebook.internal.s0.n.a.d(cls)) {
            return null;
        }
        try {
            l.d(str, "applicationId");
            return a.d(a.MOBILE_APP_INSTALL, str, j.e());
        } catch (Throwable th) {
            com.facebook.internal.s0.n.a.b(th, cls);
            return null;
        }
    }
}
