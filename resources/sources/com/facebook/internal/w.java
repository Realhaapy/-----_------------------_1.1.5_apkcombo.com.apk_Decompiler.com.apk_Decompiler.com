package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.facebook.c0;
import java.util.Objects;
import m.y.d.l;

public final class w extends d {
    private Dialog u;

    /* access modifiers changed from: private */
    public static final void r(w wVar, Bundle bundle, c0 c0Var) {
        l.d(wVar, "this$0");
        wVar.v(bundle, c0Var);
    }

    /* access modifiers changed from: private */
    public static final void s(w wVar, Bundle bundle, c0 c0Var) {
        l.d(wVar, "this$0");
        wVar.w(bundle);
    }

    private final void v(Bundle bundle, c0 c0Var) {
        e activity = getActivity();
        if (activity != null) {
            j0 j0Var = j0.a;
            Intent intent = activity.getIntent();
            l.c(intent, "fragmentActivity.intent");
            activity.setResult(c0Var == null ? -1 : 0, j0.l(intent, bundle, c0Var));
            activity.finish();
        }
    }

    private final void w(Bundle bundle) {
        e activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public Dialog j(Bundle bundle) {
        Dialog dialog = this.u;
        if (dialog == null) {
            v((Bundle) null, (c0) null);
            n(false);
            Dialog j2 = super.j(bundle);
            l.c(j2, "super.onCreateDialog(savedInstanceState)");
            return j2;
        }
        Objects.requireNonNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
        return dialog;
    }

    public void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.u instanceof q0) && isResumed()) {
            Dialog dialog = this.u;
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((q0) dialog).x();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q();
    }

    public void onDestroyView() {
        Dialog h2 = h();
        if (h2 != null && getRetainInstance()) {
            h2.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.u;
        if (dialog instanceof q0) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((q0) dialog).x();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r7 = this;
            android.app.Dialog r0 = r7.u
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.fragment.app.e r0 = r7.getActivity()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Intent r1 = r0.getIntent()
            com.facebook.internal.j0 r2 = com.facebook.internal.j0.a
            java.lang.String r2 = "intent"
            m.y.d.l.c(r1, r2)
            android.os.Bundle r1 = com.facebook.internal.j0.t(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0026
        L_0x0020:
            java.lang.String r3 = "is_fallback"
            boolean r3 = r1.getBoolean(r3, r2)
        L_0x0026:
            java.lang.String r4 = "FacebookDialogFragment"
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            r6 = 0
            if (r3 != 0) goto L_0x0066
            if (r1 != 0) goto L_0x0031
            r2 = r6
            goto L_0x0037
        L_0x0031:
            java.lang.String r2 = "action"
            java.lang.String r2 = r1.getString(r2)
        L_0x0037:
            if (r1 != 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            java.lang.String r3 = "params"
            android.os.Bundle r6 = r1.getBundle(r3)
        L_0x0040:
            com.facebook.internal.o0 r1 = com.facebook.internal.o0.a
            boolean r1 = com.facebook.internal.o0.V(r2)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = "Cannot start a WebDialog with an empty/missing 'actionName'"
        L_0x004a:
            com.facebook.internal.o0.e0(r4, r1)
            r0.finish()
            return
        L_0x0051:
            com.facebook.internal.q0$a r1 = new com.facebook.internal.q0$a
            java.util.Objects.requireNonNull(r2, r5)
            r1.<init>(r0, r2, r6)
            com.facebook.internal.a r0 = new com.facebook.internal.a
            r0.<init>(r7)
            r1.h(r0)
            com.facebook.internal.q0 r0 = r1.a()
            goto L_0x00a7
        L_0x0066:
            if (r1 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            java.lang.String r3 = "url"
            java.lang.String r6 = r1.getString(r3)
        L_0x006f:
            com.facebook.internal.o0 r1 = com.facebook.internal.o0.a
            boolean r1 = com.facebook.internal.o0.V(r6)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "Cannot start a fallback WebDialog with an empty/missing 'url'"
            goto L_0x004a
        L_0x007a:
            m.y.d.s r1 = m.y.d.s.a
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.facebook.g0 r4 = com.facebook.g0.a
            java.lang.String r4 = com.facebook.g0.d()
            r3[r2] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = "fb%s://bridge/"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            m.y.d.l.c(r1, r2)
            com.facebook.internal.z$a r2 = com.facebook.internal.z.v
            java.util.Objects.requireNonNull(r6, r5)
            com.facebook.internal.z r0 = r2.a(r0, r6, r1)
            com.facebook.internal.b r1 = new com.facebook.internal.b
            r1.<init>(r7)
            r0.B(r1)
        L_0x00a7:
            r7.u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.w.q():void");
    }

    public final void x(Dialog dialog) {
        this.u = dialog;
    }
}
