package androidx.webkit.d;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public class e {

    private static class a {
        static final h a = new h(e.d().getWebkitToCompatConverter());
    }

    private static class b {
        static final f a = e.a();
    }

    static f a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new a();
        }
        try {
            return new g((WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static h c() {
        return a.a;
    }

    public static f d() {
        return b.a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }
}
