package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.e0;
import com.facebook.internal.j0;
import com.facebook.internal.o0;
import com.facebook.internal.u;
import com.facebook.login.c0;
import m.y.d.g;
import m.y.d.l;

public final class CustomTabMainActivity extends Activity {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1340g = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    public static final String f1341h = l.j(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: i  reason: collision with root package name */
    public static final String f1342i = l.j(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: j  reason: collision with root package name */
    public static final String f1343j = l.j(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: k  reason: collision with root package name */
    public static final String f1344k = l.j(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: l  reason: collision with root package name */
    public static final String f1345l = l.j(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: m  reason: collision with root package name */
    public static final String f1346m = l.j(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: n  reason: collision with root package name */
    public static final String f1347n = l.j(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: e  reason: collision with root package name */
    private boolean f1348e = true;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f1349f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            o0 o0Var = o0.a;
            Bundle j0 = o0.j0(parse.getQuery());
            j0.putAll(o0.j0(parse.getFragment()));
            return j0;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c0.values().length];
            iArr[c0.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        final /* synthetic */ CustomTabMainActivity a;

        c(CustomTabMainActivity customTabMainActivity) {
            this.a = customTabMainActivity;
        }

        public void onReceive(Context context, Intent intent) {
            l.d(context, "context");
            l.d(intent, "intent");
            Intent intent2 = new Intent(this.a, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f1346m);
            String str = CustomTabMainActivity.f1344k;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            this.a.startActivity(intent2);
        }
    }

    private final void a(int i2, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f1349f;
        if (broadcastReceiver != null) {
            e.n.a.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f1344k);
            Bundle a2 = stringExtra != null ? f1340g.b(stringExtra) : new Bundle();
            j0 j0Var = j0.a;
            Intent intent2 = getIntent();
            l.c(intent2, "intent");
            Intent l2 = j0.l(intent2, a2, (c0) null);
            if (l2 != null) {
                intent = l2;
            }
        } else {
            j0 j0Var2 = j0.a;
            Intent intent3 = getIntent();
            l.c(intent3, "intent");
            intent = j0.l(intent3, (Bundle) null, (c0) null);
        }
        setResult(i2, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f1337f;
        if (l.a(str, getIntent().getAction())) {
            setResult(0);
        } else if (bundle == null && (stringExtra = getIntent().getStringExtra(f1341h)) != null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f1342i);
            boolean a2 = (b.a[c0.f1582f.a(getIntent().getStringExtra(f1345l)).ordinal()] == 1 ? new e0(stringExtra, bundleExtra) : new u(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f1343j));
            this.f1348e = false;
            if (!a2) {
                setResult(0, getIntent().putExtra(f1347n, true));
            } else {
                c cVar = new c(this);
                this.f1349f = cVar;
                e.n.a.a.b(this).c(cVar, new IntentFilter(str));
                return;
            }
        } else {
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        l.d(intent, "intent");
        super.onNewIntent(intent);
        if (l.a(f1346m, intent.getAction())) {
            e.n.a.a.b(this).d(new Intent(CustomTabActivity.f1338g));
        } else if (!l.a(CustomTabActivity.f1337f, intent.getAction())) {
            return;
        }
        a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f1348e) {
            a(0, (Intent) null);
        }
        this.f1348e = true;
    }
}
