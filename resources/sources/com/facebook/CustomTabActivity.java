package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import m.y.d.l;

public final class CustomTabActivity extends Activity {

    /* renamed from: f  reason: collision with root package name */
    public static final String f1337f = l.j(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    /* renamed from: g  reason: collision with root package name */
    public static final String f1338g = l.j(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    /* renamed from: e  reason: collision with root package name */
    private BroadcastReceiver f1339e;

    public static final class a extends BroadcastReceiver {
        final /* synthetic */ CustomTabActivity a;

        a(CustomTabActivity customTabActivity) {
            this.a = customTabActivity;
        }

        public void onReceive(Context context, Intent intent) {
            l.d(context, "context");
            l.d(intent, "intent");
            this.a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0) {
            Intent intent2 = new Intent(f1337f);
            intent2.putExtra(CustomTabMainActivity.f1344k, getIntent().getDataString());
            e.n.a.a.b(this).d(intent2);
            a aVar = new a(this);
            e.n.a.a.b(this).c(aVar, new IntentFilter(f1338g));
            this.f1339e = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f1337f);
        intent.putExtra(CustomTabMainActivity.f1344k, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f1339e;
        if (broadcastReceiver != null) {
            e.n.a.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
