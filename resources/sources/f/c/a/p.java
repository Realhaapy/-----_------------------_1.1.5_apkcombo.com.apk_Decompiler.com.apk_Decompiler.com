package f.c.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

final class p {

    @FunctionalInterface
    interface a {
        void a(int i2);
    }

    p() {
    }

    private List<ResolveInfo> b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
    }

    private boolean c(Context context) {
        return (Build.VERSION.SDK_INT < 18 ? BluetoothAdapter.getDefaultAdapter() : ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter()).isEnabled();
    }

    private static boolean d(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return false;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }

    private boolean e(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            return i2 >= 19 ? f(context) : d(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    private static boolean f(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Context context, a aVar, k kVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            kVar.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            aVar.a(e(context) ? 1 : 0);
        } else {
            if (i2 == 21) {
                aVar.a(c(context) ? 1 : 0);
            }
            int i3 = 1;
            if (i2 == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    aVar.a(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    aVar.a(2);
                } else if (b(packageManager).isEmpty()) {
                    aVar.a(2);
                } else if (telephonyManager.getSimState() != 5) {
                    aVar.a(0);
                } else {
                    aVar.a(1);
                }
            } else if (i2 == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i3 = 2;
                }
                aVar.a(i3);
            } else {
                aVar.a(2);
            }
        }
    }
}
