package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import f.e.a.c.d.d.k;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* renamed from: e  reason: collision with root package name */
    private ResultReceiver f1270e;

    /* renamed from: f  reason: collision with root package name */
    private ResultReceiver f1271f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1272g;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r8 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r8 == null) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L_0x0083
            com.android.billingclient.api.h r6 = f.e.a.c.d.d.k.h(r8, r2)
            int r6 = r6.b()
            r3 = -1
            if (r7 != r3) goto L_0x001c
            if (r6 == 0) goto L_0x001a
            r7 = -1
            goto L_0x001c
        L_0x001a:
            r6 = 0
            goto L_0x0038
        L_0x001c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            f.e.a.c.d.d.k.m(r2, r7)
        L_0x0038:
            android.os.ResultReceiver r7 = r5.f1270e
            if (r7 == 0) goto L_0x003f
            if (r8 != 0) goto L_0x0092
            goto L_0x0096
        L_0x003f:
            if (r8 == 0) goto L_0x007b
            android.os.Bundle r6 = r8.getExtras()
            if (r6 == 0) goto L_0x0064
            android.os.Bundle r6 = r8.getExtras()
            java.lang.String r7 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L_0x0058
            android.content.Intent r6 = r5.a(r6)
            goto L_0x007f
        L_0x0058:
            android.content.Intent r6 = r5.b()
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L_0x007f
        L_0x0064:
            android.content.Intent r6 = r5.b()
            java.lang.String r7 = "Got null bundle!"
            f.e.a.c.d.d.k.m(r2, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
            goto L_0x007f
        L_0x007b:
            android.content.Intent r6 = r5.b()
        L_0x007f:
            r5.sendBroadcast(r6)
            goto L_0x00b3
        L_0x0083:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L_0x009a
            int r6 = f.e.a.c.d.d.k.a(r8, r2)
            android.os.ResultReceiver r7 = r5.f1271f
            if (r7 == 0) goto L_0x00b3
            if (r8 != 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            android.os.Bundle r0 = r8.getExtras()
        L_0x0096:
            r7.send(r6, r0)
            goto L_0x00b3
        L_0x009a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            f.e.a.c.d.d.k.m(r2, r6)
        L_0x00b3:
            r5.f1272g = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            k.l("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f1270e = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f1271f = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i2 = 101;
                this.f1272g = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
            } else {
                pendingIntent = null;
            }
            i2 = 100;
            try {
                this.f1272g = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                k.n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e2);
                ResultReceiver resultReceiver = this.f1270e;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.f1271f;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent b = b();
                        b.putExtra("RESPONSE_CODE", 6);
                        b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(b);
                    }
                }
                this.f1272g = false;
                finish();
            }
        } else {
            k.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f1272g = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f1270e = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f1271f = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f1272g) {
            Intent b = b();
            b.putExtra("RESPONSE_CODE", 1);
            b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(b);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f1270e;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f1271f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f1272g);
    }
}
