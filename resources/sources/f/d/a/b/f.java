package f.d.a.b;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import m.y.d.l;

public final class f extends g {

    /* renamed from: f  reason: collision with root package name */
    private final MethodCall f3745f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(MethodCall methodCall, MethodChannel.Result result) {
        super(result);
        l.d(methodCall, "call");
        l.d(result, "result");
        this.f3745f = methodCall;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        r13.c((java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(f.d.a.b.f r13, android.content.Context r14) {
        /*
            java.lang.String r0 = "this$0"
            m.y.d.l.d(r13, r0)
            java.lang.String r0 = "$context"
            m.y.d.l.d(r14, r0)
            io.flutter.plugin.common.MethodCall r0 = r13.f3745f
            java.lang.Object r0 = r0.arguments
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            r5 = r2
            byte[] r5 = (byte[]) r5
            r2 = 1
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 2
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 3
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r9 = r4.intValue()
            r4 = 4
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = 5
            java.lang.Object r6 = r0.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = 6
            java.lang.Object r7 = r0.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 7
            java.lang.Object r8 = r0.get(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r11 = r8.booleanValue()
            r8 = 8
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r12 = r0.intValue()
            if (r6 == 0) goto L_0x007e
            f.d.a.d.a r0 = f.d.a.d.a.a
            int r1 = r0.b(r5)
        L_0x007e:
            r0 = 90
            if (r1 == r0) goto L_0x0088
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0088
            r8 = r3
            goto L_0x008a
        L_0x0088:
            r8 = r2
            r2 = r3
        L_0x008a:
            f.d.a.f.a r0 = f.d.a.f.a.a
            f.d.a.g.a r3 = r0.a(r7)
            r0 = 0
            if (r3 != 0) goto L_0x009c
            java.lang.String r14 = "No support format."
            f.d.a.h.a.a(r14)
            r13.c(r0)
            return
        L_0x009c:
            int r10 = r4 + r1
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r4 = r14
            r6 = r1
            r7 = r2
            r3.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ a -> 0x00c6, Exception -> 0x00b6 }
            byte[] r14 = r1.toByteArray()     // Catch:{ a -> 0x00c6, Exception -> 0x00b6 }
            r13.c(r14)     // Catch:{ a -> 0x00c6, Exception -> 0x00b6 }
        L_0x00b0:
            r1.close()
            goto L_0x00da
        L_0x00b4:
            r13 = move-exception
            goto L_0x00db
        L_0x00b6:
            r14 = move-exception
            f.d.a.a$a r2 = f.d.a.a.f3732g     // Catch:{ all -> 0x00b4 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00c2
            r14.printStackTrace()     // Catch:{ all -> 0x00b4 }
        L_0x00c2:
            r13.c(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b0
        L_0x00c6:
            r14 = move-exception
            java.lang.String r2 = r14.getMessage()     // Catch:{ all -> 0x00b4 }
            f.d.a.h.a.a(r2)     // Catch:{ all -> 0x00b4 }
            f.d.a.a$a r2 = f.d.a.a.f3732g     // Catch:{ all -> 0x00b4 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00c2
            r14.printStackTrace()     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00da:
            return
        L_0x00db:
            r1.close()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.a.b.f.f(f.d.a.b.f, android.content.Context):void");
    }

    public final void e(Context context) {
        l.d(context, "context");
        g.c.a().execute(new c(this, context));
    }
}
