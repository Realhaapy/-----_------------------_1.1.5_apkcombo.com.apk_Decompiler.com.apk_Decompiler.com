package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.f;
import com.google.android.gms.common.i;
import com.google.android.gms.common.l.c;
import e.e.g;
import f.e.a.c.a.b;
import java.util.Locale;

public final class b0 {
    private static final g<String, String> a = new g<>();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(b.f3833g);
    }

    public static String c(Context context, int i2) {
        return context.getResources().getString(i2 != 1 ? i2 != 2 ? i2 != 3 ? 17039370 : b.a : b.f3836j : b.f3830d);
    }

    public static String d(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(b.f3831e, new Object[]{a2});
        } else if (i2 != 2) {
            if (i2 == 3) {
                return resources.getString(b.b, new Object[]{a2});
            } else if (i2 == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                if (i2 == 7) {
                    return h(context, "common_google_play_services_network_error_text", a2);
                }
                if (i2 == 9) {
                    return resources.getString(b.f3835i, new Object[]{a2});
                } else if (i2 == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a2);
                } else {
                    switch (i2) {
                        case 16:
                            return h(context, "common_google_play_services_api_unavailable_text", a2);
                        case 17:
                            return h(context, "common_google_play_services_sign_in_failed_text", a2);
                        case 18:
                            return resources.getString(b.f3839m, new Object[]{a2});
                        default:
                            return resources.getString(i.a, new Object[]{a2});
                    }
                }
            }
        } else if (com.google.android.gms.common.util.g.c(context)) {
            return resources.getString(b.f3840n);
        } else {
            return resources.getString(b.f3837k, new Object[]{a2});
        }
    }

    public static String e(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i2);
    }

    public static String f(Context context, int i2) {
        String i3 = i2 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i2);
        return i3 == null ? context.getResources().getString(b.f3834h) : i3;
    }

    public static String g(Context context, int i2) {
        String str;
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(b.f3832f);
            case 2:
                return resources.getString(b.f3838l);
            case 3:
                return resources.getString(b.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i2 = i(context, str);
        if (i2 == null) {
            i2 = resources.getString(i.a);
        }
        return String.format(resources.getConfiguration().locale, i2, new Object[]{str2});
    }

    private static String i(Context context, String str) {
        g<String, String> gVar = a;
        synchronized (gVar) {
            Locale c = e.f.n.c.a(context.getResources().getConfiguration()).c(0);
            if (!c.equals(b)) {
                gVar.clear();
                b = c;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b2 = f.b(context);
            if (b2 == null) {
                return null;
            }
            int identifier = b2.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = b2.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
