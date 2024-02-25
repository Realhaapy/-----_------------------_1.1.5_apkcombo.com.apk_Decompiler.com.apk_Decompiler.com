package androidx.webkit.d;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class h {
    private final WebkitToCompatConverterBoundaryInterface a;

    public h(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.a = webkitToCompatConverterBoundaryInterface;
    }

    /* access modifiers changed from: package-private */
    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.a.convertSafeBrowsingResponse(invocationHandler);
    }

    /* access modifiers changed from: package-private */
    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    /* access modifiers changed from: package-private */
    public WebResourceError c(InvocationHandler invocationHandler) {
        return (WebResourceError) this.a.convertWebResourceError(invocationHandler);
    }

    /* access modifiers changed from: package-private */
    public InvocationHandler d(WebResourceError webResourceError) {
        return this.a.convertWebResourceError((Object) webResourceError);
    }
}
