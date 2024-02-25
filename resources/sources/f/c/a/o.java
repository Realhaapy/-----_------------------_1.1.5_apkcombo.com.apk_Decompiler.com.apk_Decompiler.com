package f.c.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.c;
import e.a.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class o {
    private static String a(Context context, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && d(context, (ArrayList<String>) null, str)) {
            return str;
        }
        if (i2 < 29) {
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (i2 < 29 || !d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d2, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01de, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f2, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x021d, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x021f, code lost:
        r1.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0234, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0237, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r6 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r6 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        r1.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0142, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014e, code lost:
        if (d(r6, r1, r7) != false) goto L_0x021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<java.lang.String> b(android.content.Context r6, int r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 23
            r3 = 0
            r4 = 33
            r5 = 29
            switch(r7) {
                case 0: goto L_0x0223;
                case 1: goto L_0x0217;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01d6;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d5;
                case 7: goto L_0x01cc;
                case 8: goto L_0x0152;
                case 9: goto L_0x0146;
                case 10: goto L_0x0011;
                case 11: goto L_0x01d5;
                case 12: goto L_0x0138;
                case 13: goto L_0x00fc;
                case 14: goto L_0x01cc;
                case 15: goto L_0x00db;
                case 16: goto L_0x00ce;
                case 17: goto L_0x00c1;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00a5;
                case 20: goto L_0x01d5;
                case 21: goto L_0x009b;
                case 22: goto L_0x008c;
                case 23: goto L_0x0082;
                case 24: goto L_0x0075;
                case 25: goto L_0x0011;
                case 26: goto L_0x0011;
                case 27: goto L_0x0068;
                case 28: goto L_0x005b;
                case 29: goto L_0x0052;
                case 30: goto L_0x0049;
                case 31: goto L_0x003c;
                case 32: goto L_0x002f;
                case 33: goto L_0x0022;
                case 34: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0237
        L_0x0013:
            r7 = 31
            if (r0 < r7) goto L_0x0237
            java.lang.String r7 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.SCHEDULE_EXACT_ALARM"
            goto L_0x0063
        L_0x0022:
            if (r0 < r4) goto L_0x0237
            java.lang.String r7 = "android.permission.READ_MEDIA_AUDIO"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.READ_MEDIA_AUDIO"
            goto L_0x0063
        L_0x002f:
            if (r0 < r4) goto L_0x0237
            java.lang.String r7 = "android.permission.READ_MEDIA_VIDEO"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.READ_MEDIA_VIDEO"
            goto L_0x0063
        L_0x003c:
            if (r0 < r4) goto L_0x0237
            java.lang.String r7 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.NEARBY_WIFI_DEVICES"
            goto L_0x0063
        L_0x0049:
            java.lang.String r7 = "android.permission.BLUETOOTH_CONNECT"
            java.lang.String r6 = a(r6, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x005a
        L_0x0052:
            java.lang.String r7 = "android.permission.BLUETOOTH_ADVERTISE"
            java.lang.String r6 = a(r6, r7)
            if (r6 == 0) goto L_0x0237
        L_0x005a:
            goto L_0x0063
        L_0x005b:
            java.lang.String r7 = "android.permission.BLUETOOTH_SCAN"
            java.lang.String r6 = a(r6, r7)
            if (r6 == 0) goto L_0x0237
        L_0x0063:
            r1.add(r6)
            goto L_0x0237
        L_0x0068:
            if (r0 < r2) goto L_0x0237
            java.lang.String r7 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            goto L_0x0063
        L_0x0075:
            if (r0 < r2) goto L_0x0237
            java.lang.String r7 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.REQUEST_INSTALL_PACKAGES"
            goto L_0x0063
        L_0x0082:
            java.lang.String r7 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x008c:
            r7 = 30
            if (r0 < r7) goto L_0x0237
            java.lang.String r7 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            goto L_0x0063
        L_0x009b:
            java.lang.String r7 = "android.permission.BLUETOOTH"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x00a5:
            if (r0 >= r5) goto L_0x00a8
            return r3
        L_0x00a8:
            java.lang.String r7 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.ACTIVITY_RECOGNITION"
            goto L_0x0063
        L_0x00b3:
            if (r0 >= r5) goto L_0x00b6
            return r3
        L_0x00b6:
            java.lang.String r7 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.ACCESS_MEDIA_LOCATION"
            goto L_0x0063
        L_0x00c1:
            if (r0 < r4) goto L_0x0237
            java.lang.String r7 = "android.permission.POST_NOTIFICATIONS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.POST_NOTIFICATIONS"
            goto L_0x0063
        L_0x00ce:
            if (r0 < r2) goto L_0x0237
            java.lang.String r7 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            goto L_0x0063
        L_0x00db:
            java.lang.String r7 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r2 = d(r6, r1, r7)
            if (r2 == 0) goto L_0x00e6
            r1.add(r7)
        L_0x00e6:
            if (r0 < r5) goto L_0x00f0
            if (r0 != r5) goto L_0x0237
            boolean r7 = android.os.Environment.isExternalStorageLegacy()
            if (r7 == 0) goto L_0x0237
        L_0x00f0:
            java.lang.String r7 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x0063
        L_0x00fc:
            java.lang.String r7 = "android.permission.SEND_SMS"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x0107
            r1.add(r7)
        L_0x0107:
            java.lang.String r7 = "android.permission.RECEIVE_SMS"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x0112
            r1.add(r7)
        L_0x0112:
            java.lang.String r7 = "android.permission.READ_SMS"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = "android.permission.READ_SMS"
            r1.add(r7)
        L_0x011f:
            java.lang.String r7 = "android.permission.RECEIVE_WAP_PUSH"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x012c
            java.lang.String r7 = "android.permission.RECEIVE_WAP_PUSH"
            r1.add(r7)
        L_0x012c:
            java.lang.String r7 = "android.permission.RECEIVE_MMS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.RECEIVE_MMS"
            goto L_0x0063
        L_0x0138:
            r7 = 20
            if (r0 < r7) goto L_0x0237
            java.lang.String r7 = "android.permission.BODY_SENSORS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x0146:
            if (r0 < r4) goto L_0x0237
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x0152:
            java.lang.String r7 = "android.permission.READ_PHONE_STATE"
            boolean r2 = d(r6, r1, r7)
            if (r2 == 0) goto L_0x015d
            r1.add(r7)
        L_0x015d:
            if (r0 <= r5) goto L_0x016c
            java.lang.String r7 = "android.permission.READ_PHONE_NUMBERS"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x016c
            java.lang.String r7 = "android.permission.READ_PHONE_NUMBERS"
            r1.add(r7)
        L_0x016c:
            java.lang.String r7 = "android.permission.CALL_PHONE"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x0179
            java.lang.String r7 = "android.permission.CALL_PHONE"
            r1.add(r7)
        L_0x0179:
            java.lang.String r7 = "android.permission.READ_CALL_LOG"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x0186
            java.lang.String r7 = "android.permission.READ_CALL_LOG"
            r1.add(r7)
        L_0x0186:
            java.lang.String r7 = "android.permission.WRITE_CALL_LOG"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x0193
            java.lang.String r7 = "android.permission.WRITE_CALL_LOG"
            r1.add(r7)
        L_0x0193:
            java.lang.String r7 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x01a0
            java.lang.String r7 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            r1.add(r7)
        L_0x01a0:
            java.lang.String r7 = "android.permission.USE_SIP"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x01ad
            java.lang.String r7 = "android.permission.USE_SIP"
            r1.add(r7)
        L_0x01ad:
            if (r0 < r5) goto L_0x01bc
            java.lang.String r7 = "android.permission.BIND_CALL_REDIRECTION_SERVICE"
            boolean r7 = d(r6, r1, r7)
            if (r7 == 0) goto L_0x01bc
            java.lang.String r7 = "android.permission.BIND_CALL_REDIRECTION_SERVICE"
            r1.add(r7)
        L_0x01bc:
            r7 = 26
            if (r0 < r7) goto L_0x0237
            java.lang.String r7 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.ANSWER_PHONE_CALLS"
            goto L_0x0063
        L_0x01cc:
            java.lang.String r7 = "android.permission.RECORD_AUDIO"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x01d5:
            return r3
        L_0x01d6:
            if (r0 < r5) goto L_0x01e1
            java.lang.String r7 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x01e1:
            java.lang.String r7 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x01ec
            r1.add(r7)
        L_0x01ec:
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x01f5:
            java.lang.String r7 = "android.permission.READ_CONTACTS"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x0200
            r1.add(r7)
        L_0x0200:
            java.lang.String r7 = "android.permission.WRITE_CONTACTS"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x020b
            r1.add(r7)
        L_0x020b:
            java.lang.String r7 = "android.permission.GET_ACCOUNTS"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = "android.permission.GET_ACCOUNTS"
            goto L_0x0063
        L_0x0217:
            java.lang.String r7 = "android.permission.CAMERA"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
        L_0x021f:
            r1.add(r7)
            goto L_0x0237
        L_0x0223:
            java.lang.String r7 = "android.permission.READ_CALENDAR"
            boolean r0 = d(r6, r1, r7)
            if (r0 == 0) goto L_0x022e
            r1.add(r7)
        L_0x022e:
            java.lang.String r7 = "android.permission.WRITE_CALENDAR"
            boolean r6 = d(r6, r1, r7)
            if (r6 == 0) goto L_0x0237
            goto L_0x021f
        L_0x0237:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.a.o.b(android.content.Context, int):java.util.List");
    }

    private static PackageInfo c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        return i2 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : packageManager.getPackageInfo(packageName, 4096);
    }

    private static boolean d(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e2);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo c = c(context);
        if (c == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(c.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !c.v(activity, str);
    }

    static int f(String str) {
        String str2 = str;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str2.equals("android.permission.READ_SMS")) {
                    c = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str2.equals("android.permission.READ_CALENDAR")) {
                    c = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str2.equals("android.permission.POST_NOTIFICATIONS")) {
                    c = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str2.equals("android.permission.READ_CALL_LOG")) {
                    c = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str2.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str2.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str2.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str2.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c = 8;
                    break;
                }
                break;
            case -1238066820:
                if (str2.equals("android.permission.BODY_SENSORS")) {
                    c = 9;
                    break;
                }
                break;
            case -1164582768:
                if (str2.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c = 10;
                    break;
                }
                break;
            case -909527021:
                if (str2.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c = 11;
                    break;
                }
                break;
            case -901151997:
                if (str2.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    c = 12;
                    break;
                }
                break;
            case -895679497:
                if (str2.equals("android.permission.RECEIVE_MMS")) {
                    c = 13;
                    break;
                }
                break;
            case -895673731:
                if (str2.equals("android.permission.RECEIVE_SMS")) {
                    c = 14;
                    break;
                }
                break;
            case -798669607:
                if (str2.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c = 15;
                    break;
                }
                break;
            case -406040016:
                if (str2.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c = 16;
                    break;
                }
                break;
            case -63024214:
                if (str2.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c = 17;
                    break;
                }
                break;
            case -5573545:
                if (str2.equals("android.permission.READ_PHONE_STATE")) {
                    c = 18;
                    break;
                }
                break;
            case 52602690:
                if (str2.equals("android.permission.SEND_SMS")) {
                    c = 19;
                    break;
                }
                break;
            case 112197485:
                if (str2.equals("android.permission.CALL_PHONE")) {
                    c = 20;
                    break;
                }
                break;
            case 175802396:
                if (str2.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c = 21;
                    break;
                }
                break;
            case 214526995:
                if (str2.equals("android.permission.WRITE_CONTACTS")) {
                    c = 22;
                    break;
                }
                break;
            case 463403621:
                if (str2.equals("android.permission.CAMERA")) {
                    c = 23;
                    break;
                }
                break;
            case 603653886:
                if (str2.equals("android.permission.WRITE_CALENDAR")) {
                    c = 24;
                    break;
                }
                break;
            case 610633091:
                if (str2.equals("android.permission.WRITE_CALL_LOG")) {
                    c = 25;
                    break;
                }
                break;
            case 691260818:
                if (str2.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c = 26;
                    break;
                }
                break;
            case 710297143:
                if (str2.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c = 27;
                    break;
                }
                break;
            case 784519842:
                if (str2.equals("android.permission.USE_SIP")) {
                    c = 28;
                    break;
                }
                break;
            case 970694249:
                if (str2.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c = 29;
                    break;
                }
                break;
            case 1166454870:
                if (str2.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c = 30;
                    break;
                }
                break;
            case 1271781903:
                if (str2.equals("android.permission.GET_ACCOUNTS")) {
                    c = 31;
                    break;
                }
                break;
            case 1365911975:
                if (str2.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c = ' ';
                    break;
                }
                break;
            case 1777263169:
                if (str2.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c = '!';
                    break;
                }
                break;
            case 1780337063:
                if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c = '\"';
                    break;
                }
                break;
            case 1831139720:
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    c = '#';
                    break;
                }
                break;
            case 1977429404:
                if (str2.equals("android.permission.READ_CONTACTS")) {
                    c = '$';
                    break;
                }
                break;
            case 2024715147:
                if (str2.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c = '%';
                    break;
                }
                break;
            case 2062356686:
                if (str2.equals("android.permission.BLUETOOTH_SCAN")) {
                    c = '&';
                    break;
                }
                break;
            case 2114579147:
                if (str2.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c = '\'';
                    break;
                }
                break;
            case 2133799037:
                if (str2.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c = '(';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 8:
            case 13:
            case 14:
            case 19:
                return 13;
            case 1:
            case j.c3:
                return 0;
            case 2:
                return 17;
            case 3:
            case 10:
            case 12:
            case 18:
            case 20:
            case 25:
            case 28:
            case '(':
                return 8;
            case 4:
            case 17:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case 9:
                return 12;
            case 11:
                return 31;
            case 15:
                return 30;
            case 16:
            case ' ':
                return 15;
            case 21:
                return 9;
            case 22:
            case 31:
            case '$':
                return 2;
            case j.b3:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case j.h3:
                return 34;
            case 30:
                return 29;
            case '!':
                return 24;
            case '\"':
                return 19;
            case '#':
                return 7;
            case '%':
                return 4;
            case '&':
                return 28;
            case '\'':
                return 18;
            default:
                return 20;
        }
    }

    static int g(Activity activity, String str, int i2) {
        if (i2 == -1) {
            return (Build.VERSION.SDK_INT < 23 || !e(activity, str)) ? 0 : 4;
        }
        return 1;
    }

    static void h(Activity activity, int i2) {
        List<String> b;
        if (!(activity == null || (b = b(activity, i2)) == null || !b.isEmpty())) {
        }
    }
}
