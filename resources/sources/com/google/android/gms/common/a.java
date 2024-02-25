package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.v.c;
import e.a.j;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public final class a extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<a> CREATOR = new n();

    /* renamed from: i  reason: collision with root package name */
    public static final a f2366i = new a(0);

    /* renamed from: e  reason: collision with root package name */
    final int f2367e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2368f;

    /* renamed from: g  reason: collision with root package name */
    private final PendingIntent f2369g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2370h;

    public a(int i2) {
        this(i2, (PendingIntent) null, (String) null);
    }

    a(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f2367e = i2;
        this.f2368f = i3;
        this.f2369g = pendingIntent;
        this.f2370h = str;
    }

    public a(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, (String) null);
    }

    public a(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    static String g(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case j.b3 /*23*/:
                        return "API_DISABLED";
                    case j.c3 /*24*/:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public int b() {
        return this.f2368f;
    }

    public String c() {
        return this.f2370h;
    }

    public PendingIntent d() {
        return this.f2369g;
    }

    public boolean e() {
        return (this.f2368f == 0 || this.f2369g == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2368f == aVar.f2368f && m.a(this.f2369g, aVar.f2369g) && m.a(this.f2370h, aVar.f2370h);
    }

    public boolean f() {
        return this.f2368f == 0;
    }

    public int hashCode() {
        return m.b(Integer.valueOf(this.f2368f), this.f2369g, this.f2370h);
    }

    public String toString() {
        m.a c = m.c(this);
        c.a("statusCode", g(this.f2368f));
        c.a("resolution", this.f2369g);
        c.a("message", this.f2370h);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.f(parcel, 1, this.f2367e);
        c.f(parcel, 2, b());
        c.i(parcel, 3, d(), i2, false);
        c.j(parcel, 4, c(), false);
        c.b(parcel, a);
    }
}
