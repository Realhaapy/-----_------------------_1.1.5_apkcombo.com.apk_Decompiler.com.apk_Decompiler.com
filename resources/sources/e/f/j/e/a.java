package e.f.j.e;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

public final class a {

    /* renamed from: e.f.j.e.a$a  reason: collision with other inner class name */
    private static class C0071a {
        static Signature[] a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        static Signature[] c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static boolean d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static boolean e(PackageManager packageManager, String str, byte[] bArr, int i2) {
            return packageManager.hasSigningCertificate(str, bArr, i2);
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0071a.b(packageInfo) : (long) packageInfo.versionCode;
    }
}
