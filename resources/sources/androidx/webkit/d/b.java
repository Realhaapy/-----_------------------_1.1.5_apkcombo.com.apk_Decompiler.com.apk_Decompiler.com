package androidx.webkit.d;

import android.annotation.SuppressLint;
import android.webkit.SafeBrowsingResponse;
import androidx.webkit.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

public class b extends a {
    private SafeBrowsingResponse a;
    private SafeBrowsingResponseBoundaryInterface b;

    public b(SafeBrowsingResponse safeBrowsingResponse) {
        this.a = safeBrowsingResponse;
    }

    public b(InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.b == null) {
            this.b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(SafeBrowsingResponseBoundaryInterface.class, e.c().b(this.a));
        }
        return this.b;
    }

    private SafeBrowsingResponse c() {
        if (this.a == null) {
            this.a = e.c().a(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    @SuppressLint({"NewApi"})
    public void a(boolean z) {
        d a2 = d.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        if (a2.d()) {
            c().showInterstitial(z);
        } else if (a2.f()) {
            b().showInterstitial(z);
        } else {
            throw d.c();
        }
    }
}
