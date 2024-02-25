package n.a.a.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import n.a.a.b;

public class a {
    public static List<ResolveInfo> a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    public static void b(Context context, Intent intent) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                c(context, intent2);
                z = true;
            } catch (b unused) {
            }
        }
        if (!z) {
            c(context, intent);
        }
    }

    public static void c(Context context, Intent intent) {
        List<ResolveInfo> a = a(context, intent);
        if (a.size() != 0) {
            for (ResolveInfo next : a) {
                Intent intent2 = new Intent(intent);
                if (next != null) {
                    intent2.setPackage(next.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }
}
