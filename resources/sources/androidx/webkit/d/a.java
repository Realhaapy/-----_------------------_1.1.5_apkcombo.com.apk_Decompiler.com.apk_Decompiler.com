package androidx.webkit.d;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class a implements f {
    private static final String[] a = new String[0];

    public String[] a() {
        return a;
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
