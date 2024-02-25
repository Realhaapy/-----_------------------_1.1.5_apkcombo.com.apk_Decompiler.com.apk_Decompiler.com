package g.a.a.a;

import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class b implements MethodChannel.MethodCallHandler {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f4644f = new String[0];

    /* renamed from: e  reason: collision with root package name */
    private final PackageManager f4645e;

    b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f4645e = packageManager;
    }

    private String[] a() {
        FeatureInfo[] systemAvailableFeatures = this.f4645e.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return f4644f;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i2 = 0; i2 < systemAvailableFeatures.length; i2++) {
            strArr[i2] = systemAvailableFeatures[i2].name;
        }
        return strArr;
    }

    private boolean b() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        return str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator");
                    }
                }
            }
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List list;
        if (methodCall.method.equals("getAndroidDeviceInfo")) {
            HashMap hashMap = new HashMap();
            hashMap.put("board", Build.BOARD);
            hashMap.put("bootloader", Build.BOOTLOADER);
            hashMap.put("brand", Build.BRAND);
            hashMap.put("device", Build.DEVICE);
            hashMap.put("display", Build.DISPLAY);
            hashMap.put("fingerprint", Build.FINGERPRINT);
            hashMap.put("hardware", Build.HARDWARE);
            hashMap.put("host", Build.HOST);
            hashMap.put("id", Build.ID);
            hashMap.put("manufacturer", Build.MANUFACTURER);
            hashMap.put("model", Build.MODEL);
            hashMap.put("product", Build.PRODUCT);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
                hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
                list = Arrays.asList(Build.SUPPORTED_ABIS);
            } else {
                String[] strArr = f4644f;
                hashMap.put("supported32BitAbis", Arrays.asList(strArr));
                hashMap.put("supported64BitAbis", Arrays.asList(strArr));
                list = Arrays.asList(strArr);
            }
            hashMap.put("supportedAbis", list);
            hashMap.put("tags", Build.TAGS);
            hashMap.put("type", Build.TYPE);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
            hashMap.put("systemFeatures", Arrays.asList(a()));
            HashMap hashMap2 = new HashMap();
            if (i2 >= 23) {
                hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
            }
            hashMap2.put("codename", Build.VERSION.CODENAME);
            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
            hashMap2.put("release", Build.VERSION.RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(i2));
            hashMap.put("version", hashMap2);
            result.success(hashMap);
            return;
        }
        result.notImplemented();
    }
}
