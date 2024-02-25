package f.d.a.b;

import android.content.Context;
import f.d.a.g.a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.Objects;
import m.y.d.l;

public final class e extends g {

    /* renamed from: f  reason: collision with root package name */
    private final MethodCall f3744f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(MethodCall methodCall, MethodChannel.Result result) {
        super(result);
        l.d(methodCall, "call");
        l.d(result, "result");
        this.f3744f = methodCall;
    }

    /* access modifiers changed from: private */
    public static final void f(e eVar, Context context) {
        int i2;
        e eVar2 = eVar;
        l.d(eVar2, "this$0");
        l.d(context, "$context");
        Object obj = eVar2.f3744f.arguments;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int i3 = 0;
        String str = (String) list.get(0);
        int intValue = ((Integer) list.get(1)).intValue();
        int intValue2 = ((Integer) list.get(2)).intValue();
        int intValue3 = ((Integer) list.get(3)).intValue();
        int intValue4 = ((Integer) list.get(4)).intValue();
        boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
        int intValue5 = ((Integer) list.get(6)).intValue();
        boolean booleanValue2 = ((Boolean) list.get(7)).booleanValue();
        int intValue6 = ((Integer) list.get(8)).intValue();
        int intValue7 = ((Integer) list.get(9)).intValue();
        a a = f.d.a.f.a.a.a(intValue5);
        if (a == null) {
            f.d.a.h.a.a("No support format.");
            eVar2.c((Object) null);
            return;
        }
        if (booleanValue) {
            i3 = f.d.a.d.a.a.b(f.a(new File(str)));
        }
        if (i3 == 90 || i3 == 270) {
            i2 = intValue;
        } else {
            i2 = intValue2;
            intValue2 = intValue;
        }
        int i4 = intValue4 + i3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(context, str, byteArrayOutputStream, intValue2, i2, intValue3, i4, booleanValue2, intValue6, intValue7);
            eVar2.c(byteArrayOutputStream.toByteArray());
        } catch (Exception e2) {
            if (f.d.a.a.f3732g.a()) {
                e2.printStackTrace();
            }
            eVar2.c((Object) null);
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
        byteArrayOutputStream.close();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef A[Catch:{ all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(f.d.a.b.e r17, android.content.Context r18) {
        /*
            r1 = r17
            java.lang.String r0 = "this$0"
            m.y.d.l.d(r1, r0)
            java.lang.String r0 = "$context"
            r3 = r18
            m.y.d.l.d(r3, r0)
            io.flutter.plugin.common.MethodCall r0 = r1.f3744f
            java.lang.Object r0 = r0.arguments
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            java.util.Objects.requireNonNull(r0, r2)
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            java.lang.Object r4 = r0.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 2
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 3
            java.lang.Object r7 = r0.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            r7 = 4
            java.lang.Object r7 = r0.get(r7)
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            r7 = 5
            java.lang.Object r7 = r0.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 6
            java.lang.Object r9 = r0.get(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0070
            java.io.File r2 = new java.io.File
            r2.<init>(r4)
            byte[] r2 = m.x.f.a(r2)
            f.d.a.d.a r9 = f.d.a.d.a.a
            int r2 = r9.b(r2)
        L_0x0070:
            r9 = 7
            java.lang.Object r9 = r0.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = 8
            java.lang.Object r10 = r0.get(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = 9
            java.lang.Object r11 = r0.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = 10
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r12 = r0.intValue()
            f.d.a.f.a r0 = f.d.a.f.a.a
            f.d.a.g.a r0 = r0.a(r9)
            r14 = 0
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "No support format."
            f.d.a.h.a.a(r0)
            r1.c(r14)
            return
        L_0x00b1:
            r9 = 90
            if (r2 == r9) goto L_0x00bc
            r9 = 270(0x10e, float:3.78E-43)
            if (r2 == r9) goto L_0x00bc
            r9 = r6
            r6 = r5
            goto L_0x00bd
        L_0x00bc:
            r9 = r5
        L_0x00bd:
            int r15 = r7 + r2
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            r2 = r0
            r3 = r18
            r5 = r7
            r16 = r7
            r7 = r9
            r9 = r15
            r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00df, all -> 0x00db }
            r1.c(r13)     // Catch:{ Exception -> 0x00df, all -> 0x00db }
            r16.close()
            goto L_0x00fb
        L_0x00db:
            r0 = move-exception
            r14 = r16
            goto L_0x00fe
        L_0x00df:
            r0 = move-exception
            r7 = r16
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            goto L_0x00fe
        L_0x00e5:
            r0 = move-exception
            r7 = r14
        L_0x00e7:
            f.d.a.a$a r2 = f.d.a.a.f3732g     // Catch:{ all -> 0x00fc }
            boolean r2 = r2.a()     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x00f2
            r0.printStackTrace()     // Catch:{ all -> 0x00fc }
        L_0x00f2:
            r1.c(r14)     // Catch:{ all -> 0x00fc }
            if (r7 != 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r7.close()
        L_0x00fb:
            return
        L_0x00fc:
            r0 = move-exception
            r14 = r7
        L_0x00fe:
            if (r14 != 0) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            r14.close()
        L_0x0104:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.a.b.e.h(f.d.a.b.e, android.content.Context):void");
    }

    public final void e(Context context) {
        l.d(context, "context");
        g.c.a().execute(new b(this, context));
    }

    public final void g(Context context) {
        l.d(context, "context");
        g.c.a().execute(new a(this, context));
    }
}
