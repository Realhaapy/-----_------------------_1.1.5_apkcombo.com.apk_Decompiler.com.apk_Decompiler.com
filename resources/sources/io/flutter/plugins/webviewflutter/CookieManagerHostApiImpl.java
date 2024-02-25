package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

class CookieManagerHostApiImpl implements GeneratedAndroidWebView.CookieManagerHostApi {
    CookieManagerHostApiImpl() {
    }

    public void clearCookies(GeneratedAndroidWebView.Result<Boolean> result) {
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            Objects.requireNonNull(result);
            instance.removeAllCookies(new i2(result));
            return;
        }
        boolean hasCookies = instance.hasCookies();
        if (hasCookies) {
            instance.removeAllCookie();
        }
        result.success(Boolean.valueOf(hasCookies));
    }

    public void setCookie(String str, String str2) {
        CookieManager.getInstance().setCookie(str, str2);
    }
}
