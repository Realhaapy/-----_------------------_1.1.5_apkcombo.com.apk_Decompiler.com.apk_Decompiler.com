package f.c.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

final class j {

    @FunctionalInterface
    interface a {
        void a(boolean z);
    }

    j() {
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, a aVar, k kVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            kVar.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.a(true);
        } catch (Exception unused) {
            aVar.a(false);
        }
    }
}
