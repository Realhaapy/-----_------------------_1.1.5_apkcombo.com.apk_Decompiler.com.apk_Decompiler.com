package io.flutter.plugins.webviewflutter;

public final /* synthetic */ class q1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JavaScriptChannel f4769e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f4770f;

    public /* synthetic */ q1(JavaScriptChannel javaScriptChannel, String str) {
        this.f4769e = javaScriptChannel;
        this.f4770f = str;
    }

    public final void run() {
        this.f4769e.c(this.f4770f);
    }
}
