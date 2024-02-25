package e.c.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.h;
import e.c.b.a;
import java.util.ArrayList;

public final class d {
    public final Intent a;
    public final Bundle b;

    public static final class a {
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final a.C0065a b = new a.C0065a();
        private ArrayList<Bundle> c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f3227d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f3228e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3229f = true;

        /* renamed from: g  reason: collision with root package name */
        private SparseArray<Bundle> f3230g;

        public a() {
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            h.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public d a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f3228e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3229f);
            this.a.putExtras(this.b.a().a());
            if (this.f3230g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f3230g);
                this.a.putExtras(bundle);
            }
            return new d(this.a, this.f3227d);
        }

        public a b(f fVar) {
            this.a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        e.f.j.a.l(context, this.a, this.b);
    }
}
