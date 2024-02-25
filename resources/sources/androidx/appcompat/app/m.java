package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import e.f.j.d;
import java.util.Calendar;

class m {

    /* renamed from: d  reason: collision with root package name */
    private static m f217d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    private static class a {
        boolean a;
        long b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        long f218d;

        /* renamed from: e  reason: collision with root package name */
        long f219e;

        /* renamed from: f  reason: collision with root package name */
        long f220f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static m a(Context context) {
        if (f217d == null) {
            Context applicationContext = context.getApplicationContext();
            f217d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f217d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = d.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (d.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.c.f220f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        l b2 = l.b();
        l lVar = b2;
        lVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b2.a;
        lVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.c == 1;
        long j4 = b2.b;
        long j5 = j3;
        long j6 = b2.a;
        long j7 = j4;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j8 = b2.b;
        if (j7 == -1 || j6 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j6 ? 0 + j8 : currentTimeMillis > j7 ? 0 + j6 : 0 + j7) + 60000;
        }
        aVar.a = z2;
        aVar.b = j5;
        aVar.c = j7;
        aVar.f218d = j6;
        aVar.f219e = j8;
        aVar.f220f = j2;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
