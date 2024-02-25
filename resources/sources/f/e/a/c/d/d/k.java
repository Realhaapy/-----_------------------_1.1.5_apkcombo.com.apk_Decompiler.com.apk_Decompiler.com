package f.e.a.c.d.d;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.b;
import com.android.billingclient.api.e1;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public final class k {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return o(intent.getExtras(), "ProxyBillingActivity");
        }
        m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                concat = "Unexpected type for bundle response code: ".concat(String.valueOf(obj.getClass().getName()));
            }
        }
        m(str, concat);
        return 6;
    }

    public static Bundle c(b bVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle d(i iVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle e(int i2, boolean z, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i2 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i2 >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i2 >= 14) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < size; i3++) {
                e1 e1Var = (e1) arrayList.get(i3);
                arrayList2.add((Object) null);
                z2 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList3.add((Object) null);
                z3 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle f(g gVar, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (gVar.b() != 0) {
            bundle.putInt("prorationMode", gVar.b());
        }
        if (!TextUtils.isEmpty(gVar.c())) {
            bundle.putString("accountId", gVar.c());
        }
        if (!TextUtils.isEmpty(gVar.d())) {
            bundle.putString("obfuscatedProfileId", gVar.d());
        }
        if (gVar.o()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{null})));
        }
        if (!TextUtils.isEmpty(gVar.e())) {
            bundle.putString("oldSkuPurchaseToken", gVar.e());
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("oldSkuPurchaseId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("originalExternalTransactionId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("paymentsPurchaseParams", (String) null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    public static Bundle g(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static h h(Intent intent, String str) {
        if (intent == null) {
            m("BillingHelper", "Got null intent!");
            h.a c = h.c();
            c.c(6);
            c.b("An internal error occurred.");
            return c.a();
        }
        h.a c2 = h.c();
        c2.c(b(intent.getExtras(), str));
        c2.b(i(intent.getExtras(), str));
        return c2.a();
    }

    public static String i(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            m(str, "Unexpected type for debug message: ".concat(String.valueOf(obj.getClass().getName())));
            return "";
        }
    }

    public static String j(int i2) {
        return a.a(i2).toString();
    }

    public static List k(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase p2 = p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (p2 == null) {
                l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(p2);
        } else {
            int size = stringArrayList.size();
            l("BillingHelper", "Found purchase list of " + size + " items");
            int i2 = 0;
            while (i2 < stringArrayList.size() && i2 < stringArrayList2.size()) {
                Purchase p3 = p(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (p3 != null) {
                    arrayList.add(p3);
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static void l(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i2 = 40000;
            while (!str2.isEmpty() && i2 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i2));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i2 -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    public static void m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase p(String str, String str2) {
        if (str == null || str2 == null) {
            l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
            return null;
        }
    }
}
