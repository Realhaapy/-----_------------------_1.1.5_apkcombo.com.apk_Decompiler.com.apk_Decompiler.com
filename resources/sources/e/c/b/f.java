package e.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import d.a.a.a;
import d.a.a.b;
import java.util.List;

public final class f {
    private final b a;
    private final a b;
    private final ComponentName c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f3231d;

    f(b bVar, a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = bVar;
        this.b = aVar;
        this.c = componentName;
        this.f3231d = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f3231d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public IBinder c() {
        return this.b.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f3231d;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.a.n(this.b, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
