package g.a.a.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.util.HashMap;
import m.y.d.l;

public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: e  reason: collision with root package name */
    private Context f4646e;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f4647f;

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            byte b = bArr[i2] & 255;
            int i4 = i2 * 2;
            cArr2[i4] = cArr[b >>> 4];
            cArr2[i4 + 1] = cArr[b & 15];
            i2 = i3;
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if ((r5.length == 0) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 28
            if (r1 < r2) goto L_0x005c
            android.content.Context r1 = r4.f4646e     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            m.y.d.l.b(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r5 != 0) goto L_0x001b
            return r0
        L_0x001b:
            boolean r1 = r5.hasMultipleSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = m.t.f.j(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x003e:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = m.t.f.j(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
        L_0x005a:
            r0 = r5
            goto L_0x00a1
        L_0x005c:
            android.content.Context r1 = r4.f4646e     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            m.y.d.l.b(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0079
            int r3 = r5.length     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r3 != 0) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            if (r3 == 0) goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "packageInfo.signatures"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r1 = m.t.f.j(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 != 0) goto L_0x0088
            goto L_0x00a1
        L_0x0088:
            java.lang.String r1 = "signatures"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = m.t.f.j(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signatures.first().toByteArray()"
            m.y.d.l.c(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.b.a.b(android.content.pm.PackageManager):java.lang.String");
    }

    private final long c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }

    private final String d(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA1");
        instance.update(bArr);
        byte[] digest = instance.digest();
        l.c(digest, "hashText");
        return a(digest);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        this.f4646e = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f4647f = methodChannel;
        l.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        this.f4646e = null;
        MethodChannel methodChannel = this.f4647f;
        l.b(methodChannel);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4647f = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        l.d(methodCall, "call");
        l.d(result, "result");
        try {
            if (l.a(methodCall.method, "getAll")) {
                Context context = this.f4646e;
                l.b(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.f4646e;
                l.b(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                l.c(packageManager, "packageManager");
                String b = b(packageManager);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context3 = this.f4646e;
                l.b(context3);
                hashMap.put("packageName", context3.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                l.c(packageInfo, "info");
                hashMap.put("buildNumber", String.valueOf(c(packageInfo)));
                if (b != null) {
                    hashMap.put("buildSignature", b);
                }
                result.success(hashMap);
                return;
            }
            result.notImplemented();
        } catch (PackageManager.NameNotFoundException e2) {
            result.error("Name not found", e2.getMessage(), (Object) null);
        }
    }
}
