package androidx.webkit.d;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;
import androidx.webkit.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.a.a;

public class c extends b {
    private WebResourceError a;
    private WebResourceErrorBoundaryInterface b;

    public c(WebResourceError webResourceError) {
        this.a = webResourceError;
    }

    public c(InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.b == null) {
            this.b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, e.c().d(this.a));
        }
        return this.b;
    }

    private WebResourceError d() {
        if (this.a == null) {
            this.a = e.c().c(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    @SuppressLint({"NewApi"})
    public CharSequence a() {
        d a2 = d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        if (a2.d()) {
            return d().getDescription();
        }
        if (a2.f()) {
            return c().getDescription();
        }
        throw d.c();
    }

    @SuppressLint({"NewApi"})
    public int b() {
        d a2 = d.a("WEB_RESOURCE_ERROR_GET_CODE");
        if (a2.d()) {
            return d().getErrorCode();
        }
        if (a2.f()) {
            return c().getErrorCode();
        }
        throw d.c();
    }
}
