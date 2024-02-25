package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.facebook.login.x;
import com.facebook.u;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m.y.d.g;
import m.y.d.l;

public class r extends b0 {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final b f1636i = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f1637j;

    /* renamed from: h  reason: collision with root package name */
    private final String f1638h = "device_auth";

    public static final class a implements Parcelable.Creator<r> {
        a() {
        }

        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new r(parcel);
        }

        /* renamed from: b */
        public r[] newArray(int i2) {
            return new r[i2];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor p2;
            if (r.f1637j == null) {
                r.f1637j = new ScheduledThreadPoolExecutor(1);
            }
            p2 = r.f1637j;
            if (p2 == null) {
                l.n("backgroundExecutor");
                throw null;
            }
            return p2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected r(Parcel parcel) {
        super(parcel);
        l.d(parcel, "parcel");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(x xVar) {
        super(xVar);
        l.d(xVar, "loginClient");
    }

    private final void v(x.e eVar) {
        e i2 = d().i();
        if (i2 != null && !i2.isFinishing()) {
            q r2 = r();
            r2.p(i2.getSupportFragmentManager(), "login_with_facebook");
            r2.R(eVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f1638h;
    }

    public int o(x.e eVar) {
        l.d(eVar, "request");
        v(eVar);
        return 1;
    }

    /* access modifiers changed from: protected */
    public q r() {
        return new q();
    }

    public void s() {
        d().g(x.f.f1686m.a(d().o(), "User canceled log in."));
    }

    public void t(Exception exc) {
        l.d(exc, "ex");
        d().g(x.f.c.d(x.f.f1686m, d().o(), (String) null, exc.getMessage(), (String) null, 8, (Object) null));
    }

    public void u(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, com.facebook.x xVar, Date date, Date date2, Date date3) {
        String str4 = str;
        l.d(str4, "accessToken");
        String str5 = str2;
        l.d(str5, "applicationId");
        String str6 = str3;
        l.d(str6, "userId");
        d().g(x.f.f1686m.e(d().o(), new u(str4, str5, str6, collection, collection2, collection3, xVar, date, date2, date3, (String) null, 1024, (g) null)));
    }
}
