package f.d.a;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import m.y.d.g;
import m.y.d.l;

public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: g  reason: collision with root package name */
    public static final C0101a f3732g = new C0101a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3733h;

    /* renamed from: e  reason: collision with root package name */
    private Context f3734e;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f3735f;

    /* renamed from: f.d.a.a$a  reason: collision with other inner class name */
    public static final class C0101a {
        private C0101a() {
        }

        public /* synthetic */ C0101a(g gVar) {
            this();
        }

        public final boolean a() {
            return a.f3733h;
        }
    }

    public a() {
        f.d.a.f.a aVar = f.d.a.f.a.a;
        aVar.b(new f.d.a.g.b.a(0));
        aVar.b(new f.d.a.g.b.a(1));
        aVar.b(new f.d.a.g.c.a());
        aVar.b(new f.d.a.g.b.a(3));
    }

    private final int b(MethodCall methodCall) {
        f3733h = l.a((Boolean) methodCall.arguments(), Boolean.TRUE);
        return 1;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        l.c(applicationContext, "binding.applicationContext");
        this.f3734e = applicationContext;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_image_compress");
        this.f3735f = methodChannel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        l.d(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f3735f;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f3735f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r6.success(java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r5, io.flutter.plugin.common.MethodChannel.Result r6) {
        /*
            r4 = this;
            java.lang.String r0 = "call"
            m.y.d.l.d(r5, r0)
            java.lang.String r0 = "result"
            m.y.d.l.d(r6, r0)
            java.lang.String r0 = r5.method
            if (r0 == 0) goto L_0x008a
            int r1 = r0.hashCode()
            r2 = 0
            java.lang.String r3 = "context"
            switch(r1) {
                case -129880033: goto L_0x0070;
                case 86054116: goto L_0x0056;
                case 86233094: goto L_0x003c;
                case 1262746611: goto L_0x0029;
                case 2067272455: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x008a
        L_0x001a:
            java.lang.String r1 = "showLog"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            goto L_0x008a
        L_0x0024:
            int r5 = r4.b(r5)
            goto L_0x0034
        L_0x0029:
            java.lang.String r5 = "getSystemVersion"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0032
            goto L_0x008a
        L_0x0032:
            int r5 = android.os.Build.VERSION.SDK_INT
        L_0x0034:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.success(r5)
            goto L_0x008d
        L_0x003c:
            java.lang.String r1 = "compressWithList"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            goto L_0x008a
        L_0x0045:
            f.d.a.b.f r0 = new f.d.a.b.f
            r0.<init>(r5, r6)
            android.content.Context r5 = r4.f3734e
            if (r5 == 0) goto L_0x0052
            r0.e(r5)
            goto L_0x008d
        L_0x0052:
            m.y.d.l.n(r3)
            throw r2
        L_0x0056:
            java.lang.String r1 = "compressWithFile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x008a
        L_0x005f:
            f.d.a.b.e r0 = new f.d.a.b.e
            r0.<init>(r5, r6)
            android.content.Context r5 = r4.f3734e
            if (r5 == 0) goto L_0x006c
            r0.e(r5)
            goto L_0x008d
        L_0x006c:
            m.y.d.l.n(r3)
            throw r2
        L_0x0070:
            java.lang.String r1 = "compressWithFileAndGetFile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            f.d.a.b.e r0 = new f.d.a.b.e
            r0.<init>(r5, r6)
            android.content.Context r5 = r4.f3734e
            if (r5 == 0) goto L_0x0086
            r0.g(r5)
            goto L_0x008d
        L_0x0086:
            m.y.d.l.n(r3)
            throw r2
        L_0x008a:
            r6.notImplemented()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.a.a.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
