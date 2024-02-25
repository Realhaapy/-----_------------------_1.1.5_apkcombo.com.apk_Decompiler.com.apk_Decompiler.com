package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.j;
import f.e.a.c.a.a;
import f.e.a.c.a.b;

public class d extends e {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final d f2496d = new d();
    private String b;

    public static d k() {
        return f2496d;
    }

    public Intent a(Context context, int i2, String str) {
        return super.a(context, i2, str);
    }

    public PendingIntent b(Context context, int i2, int i3) {
        return super.b(context, i2, i3);
    }

    public final String d(int i2) {
        return super.d(i2);
    }

    public int e(Context context) {
        return super.e(context);
    }

    public int f(Context context, int i2) {
        return super.f(context, i2);
    }

    public final boolean h(int i2) {
        return super.h(i2);
    }

    public Dialog i(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return n(activity, i2, e0.b(activity, a(activity, i2, "d"), i3), onCancelListener);
    }

    public PendingIntent j(Context context, a aVar) {
        return aVar.e() ? aVar.d() : b(context, aVar.b(), 0);
    }

    public boolean l(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog i4 = i(activity, i2, i3, onCancelListener);
        if (i4 == null) {
            return false;
        }
        q(activity, i4, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void m(Context context, int i2) {
        r(context, i2, (String) null, c(context, i2, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final Dialog n(Context context, int i2, e0 e0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(b0.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = b0.c(context, i2);
        if (c2 != null) {
            builder.setPositiveButton(c2, e0Var);
        }
        String g2 = b0.g(context, i2);
        if (g2 != null) {
            builder.setTitle(g2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i2)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog o(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(b0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        q(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final f0 p(Context context, com.google.android.gms.common.api.internal.e0 e0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        f0 f0Var = new f0(e0Var);
        context.registerReceiver(f0Var, intentFilter);
        f0Var.a(context);
        if (g(context, "com.google.android.gms")) {
            return f0Var;
        }
        e0Var.a();
        f0Var.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e) {
                j.q(dialog, onCancelListener).p(((e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    public final void r(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i2), null}), new IllegalArgumentException());
        if (i2 == 18) {
            s(context);
        } else if (pendingIntent != null) {
            String f2 = b0.f(context, i2);
            String e2 = b0.e(context, i2);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            n.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            l.e eVar = new l.e(context);
            eVar.C(true);
            eVar.l(true);
            eVar.s(f2);
            l.c cVar = new l.c();
            cVar.x(e2);
            eVar.M(cVar);
            if (g.b(context)) {
                n.j(j.d());
                eVar.K(context.getApplicationInfo().icon);
                eVar.G(2);
                if (g.c(context)) {
                    eVar.a(a.a, resources.getString(b.f3841o), pendingIntent);
                } else {
                    eVar.q(pendingIntent);
                }
            } else {
                eVar.K(17301642);
                eVar.O(resources.getString(b.f3834h));
                eVar.T(System.currentTimeMillis());
                eVar.q(pendingIntent);
                eVar.r(e2);
            }
            if (j.g()) {
                n.j(j.g());
                synchronized (c) {
                    str2 = this.b;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b2 = b0.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, b2, 4);
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.n(str2);
            }
            Notification b3 = eVar.b();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                g.b.set(false);
                i3 = 10436;
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, b3);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean t(Activity activity, com.google.android.gms.common.api.internal.g gVar, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n2 = n(activity, i2, e0.c(gVar, a(activity, i2, "d"), 2), onCancelListener);
        if (n2 == null) {
            return false;
        }
        q(activity, n2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean u(Context context, a aVar, int i2) {
        PendingIntent j2;
        if (com.google.android.gms.common.l.a.a(context) || (j2 = j(context, aVar)) == null) {
            return false;
        }
        r(context, aVar.b(), (String) null, f.e.a.c.d.a.e.a(context, 0, GoogleApiActivity.a(context, j2, i2, true), f.e.a.c.d.a.e.a | 134217728));
        return true;
    }
}
