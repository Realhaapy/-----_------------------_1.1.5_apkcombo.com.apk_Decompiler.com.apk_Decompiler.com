package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import f.e.a.b.a.a;
import java.util.List;

class a extends InstallReferrerClient {
    /* access modifiers changed from: private */
    public int a = 0;
    private final Context b;
    /* access modifiers changed from: private */
    public f.e.a.b.a.a c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f1333d;

    private final class b implements ServiceConnection {
        private final InstallReferrerStateListener a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.b.a.a.a.a("InstallReferrerClient", "Install Referrer service connected.");
            f.e.a.b.a.a unused = a.this.c = a.C0104a.a(iBinder);
            int unused2 = a.this.a = 2;
            this.a.a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f.b.a.a.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            f.e.a.b.a.a unused = a.this.c = null;
            int unused2 = a.this.a = 0;
            this.a.b();
        }
    }

    public a(Context context) {
        this.b = context.getApplicationContext();
    }

    private boolean f() {
        try {
            return this.b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public ReferrerDetails a() {
        if (g()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.b.getPackageName());
            try {
                return new ReferrerDetails(this.c.N(bundle));
            } catch (RemoteException e2) {
                f.b.a.a.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw e2;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public void c(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (g()) {
            f.b.a.a.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i2 = this.a;
        if (i2 == 1) {
            f.b.a.a.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
        } else if (i2 == 3) {
            f.b.a.a.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
        } else {
            f.b.a.a.a.a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f1333d = new b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.a = 0;
                f.b.a.a.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !f()) {
                f.b.a.a.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.a = 0;
                installReferrerStateListener.a(2);
                return;
            }
            if (this.b.bindService(new Intent(intent), this.f1333d, 1)) {
                f.b.a.a.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            f.b.a.a.a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.a = 0;
            installReferrerStateListener.a(1);
        }
    }

    public boolean g() {
        return (this.a != 2 || this.c == null || this.f1333d == null) ? false : true;
    }
}
