package e.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import d.a.a.a;

public class c {
    private final d.a.a.b a;
    private final ComponentName b;

    static class a extends e {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        public final void a(ComponentName componentName, c cVar) {
            cVar.f(0);
            this.b.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends a.C0056a {
        private Handler a = new Handler(Looper.getMainLooper());
        final /* synthetic */ b b;

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f3211e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f3212f;

            a(int i2, Bundle bundle) {
                this.f3211e = i2;
                this.f3212f = bundle;
            }

            public void run() {
                b.this.b.d(this.f3211e, this.f3212f);
                throw null;
            }
        }

        /* renamed from: e.c.b.c$b$b  reason: collision with other inner class name */
        class C0066b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f3214e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f3215f;

            C0066b(String str, Bundle bundle) {
                this.f3214e = str;
                this.f3215f = bundle;
            }

            public void run() {
                b.this.b.a(this.f3214e, this.f3215f);
                throw null;
            }
        }

        /* renamed from: e.c.b.c$b$c  reason: collision with other inner class name */
        class C0067c implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Bundle f3217e;

            C0067c(Bundle bundle) {
                this.f3217e = bundle;
            }

            public void run() {
                b.this.b.c(this.f3217e);
                throw null;
            }
        }

        class d implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f3219e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f3220f;

            d(String str, Bundle bundle) {
                this.f3219e = str;
                this.f3220f = bundle;
            }

            public void run() {
                b.this.b.e(this.f3219e, this.f3220f);
                throw null;
            }
        }

        class e implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f3222e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Uri f3223f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ boolean f3224g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Bundle f3225h;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f3222e = i2;
                this.f3223f = uri;
                this.f3224g = z;
                this.f3225h = bundle;
            }

            public void run() {
                b.this.b.f(this.f3222e, this.f3223f, this.f3224g, this.f3225h);
                throw null;
            }
        }

        b(c cVar, b bVar) {
        }

        public void E(int i2, Bundle bundle) {
            if (this.b != null) {
                this.a.post(new a(i2, bundle));
            }
        }

        public Bundle J(String str, Bundle bundle) {
            b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            bVar.b(str, bundle);
            throw null;
        }

        public void O(String str, Bundle bundle) {
            if (this.b != null) {
                this.a.post(new d(str, bundle));
            }
        }

        public void S(Bundle bundle) {
            if (this.b != null) {
                this.a.post(new C0067c(bundle));
            }
        }

        public void V(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.b != null) {
                this.a.post(new e(i2, uri, z, bundle));
            }
        }

        public void w(String str, Bundle bundle) {
            if (this.b != null) {
                this.a.post(new C0066b(str, bundle));
            }
        }
    }

    c(d.a.a.b bVar, ComponentName componentName, Context context) {
        this.a = bVar;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private a.C0056a c(b bVar) {
        return new b(this, bVar);
    }

    private f e(b bVar, PendingIntent pendingIntent) {
        boolean z;
        a.C0056a c = c(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z = this.a.t(c, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z = this.a.p(c);
        }
        if (!z) {
            return null;
        }
        return new f(this.a, c, this.b, pendingIntent);
    }

    public f d(b bVar) {
        return e(bVar, (PendingIntent) null);
    }

    public boolean f(long j2) {
        try {
            return this.a.T(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
