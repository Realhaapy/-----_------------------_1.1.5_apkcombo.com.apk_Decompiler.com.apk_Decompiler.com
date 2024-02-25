package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f1268e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ WindowLayoutInfo f1269f;

    public /* synthetic */ b(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f1268e = windowLayoutChangeCallbackWrapper;
        this.f1269f = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m6accept$lambda0(this.f1268e, this.f1269f);
    }
}
