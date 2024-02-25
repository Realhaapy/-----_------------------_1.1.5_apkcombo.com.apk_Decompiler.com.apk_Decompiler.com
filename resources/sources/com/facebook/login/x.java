package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.c0;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.internal.t;
import com.facebook.u;
import com.facebook.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new b();

    /* renamed from: q  reason: collision with root package name */
    public static final c f1658q = new c((g) null);

    /* renamed from: e  reason: collision with root package name */
    private b0[] f1659e;

    /* renamed from: f  reason: collision with root package name */
    private int f1660f = -1;

    /* renamed from: g  reason: collision with root package name */
    private Fragment f1661g;

    /* renamed from: h  reason: collision with root package name */
    private d f1662h;

    /* renamed from: i  reason: collision with root package name */
    private a f1663i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1664j;

    /* renamed from: k  reason: collision with root package name */
    private e f1665k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f1666l;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, String> f1667m;

    /* renamed from: n  reason: collision with root package name */
    private z f1668n;

    /* renamed from: o  reason: collision with root package name */
    private int f1669o;

    /* renamed from: p  reason: collision with root package name */
    private int f1670p;

    public interface a {
        void a();

        void b();
    }

    public static final class b implements Parcelable.Creator<x> {
        b() {
        }

        /* renamed from: a */
        public x createFromParcel(Parcel parcel) {
            l.d(parcel, "source");
            return new x(parcel);
        }

        /* renamed from: b */
        public x[] newArray(int i2) {
            return new x[i2];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            l.c(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return t.Login.c();
        }
    }

    public interface d {
        void a(f fVar);
    }

    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private final w f1671e;

        /* renamed from: f  reason: collision with root package name */
        private Set<String> f1672f;

        /* renamed from: g  reason: collision with root package name */
        private final p f1673g;

        /* renamed from: h  reason: collision with root package name */
        private final String f1674h;

        /* renamed from: i  reason: collision with root package name */
        private String f1675i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1676j;

        /* renamed from: k  reason: collision with root package name */
        private String f1677k;

        /* renamed from: l  reason: collision with root package name */
        private String f1678l;

        /* renamed from: m  reason: collision with root package name */
        private String f1679m;

        /* renamed from: n  reason: collision with root package name */
        private String f1680n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f1681o;

        /* renamed from: p  reason: collision with root package name */
        private final c0 f1682p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f1683q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f1684r;

        /* renamed from: s  reason: collision with root package name */
        private final String f1685s;
        private final String t;
        private final String u;
        private final m v;

        public static final class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                l.d(parcel, "source");
                return new e(parcel, (g) null);
            }

            /* renamed from: b */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        private e(Parcel parcel) {
            p0 p0Var = p0.a;
            String readString = parcel.readString();
            p0.k(readString, "loginBehavior");
            this.f1671e = w.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f1672f = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f1673g = readString2 != null ? p.valueOf(readString2) : p.NONE;
            String readString3 = parcel.readString();
            p0.k(readString3, "applicationId");
            this.f1674h = readString3;
            String readString4 = parcel.readString();
            p0.k(readString4, "authId");
            this.f1675i = readString4;
            boolean z = true;
            this.f1676j = parcel.readByte() != 0;
            this.f1677k = parcel.readString();
            String readString5 = parcel.readString();
            p0.k(readString5, "authType");
            this.f1678l = readString5;
            this.f1679m = parcel.readString();
            this.f1680n = parcel.readString();
            this.f1681o = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            this.f1682p = readString6 != null ? c0.valueOf(readString6) : c0.FACEBOOK;
            this.f1683q = parcel.readByte() != 0;
            this.f1684r = parcel.readByte() == 0 ? false : z;
            String readString7 = parcel.readString();
            p0.k(readString7, "nonce");
            this.f1685s = readString7;
            this.t = parcel.readString();
            this.u = parcel.readString();
            String readString8 = parcel.readString();
            this.v = readString8 == null ? null : m.valueOf(readString8);
        }

        public /* synthetic */ e(Parcel parcel, g gVar) {
            this(parcel);
        }

        public final String a() {
            return this.f1674h;
        }

        public final String b() {
            return this.f1675i;
        }

        public final String c() {
            return this.f1678l;
        }

        public final String d() {
            return this.u;
        }

        public int describeContents() {
            return 0;
        }

        public final m e() {
            return this.v;
        }

        public final String f() {
            return this.t;
        }

        public final p g() {
            return this.f1673g;
        }

        public final String h() {
            return this.f1679m;
        }

        public final String i() {
            return this.f1677k;
        }

        public final w j() {
            return this.f1671e;
        }

        public final c0 k() {
            return this.f1682p;
        }

        public final String l() {
            return this.f1680n;
        }

        public final String m() {
            return this.f1685s;
        }

        public final Set<String> n() {
            return this.f1672f;
        }

        public final boolean o() {
            return this.f1681o;
        }

        public final boolean p() {
            for (String c : this.f1672f) {
                if (a0.a.c(c)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean q() {
            return this.f1683q;
        }

        public final boolean r() {
            return this.f1682p == c0.INSTAGRAM;
        }

        public final boolean s() {
            return this.f1676j;
        }

        public final void t(Set<String> set) {
            l.d(set, "<set-?>");
            this.f1672f = set;
        }

        public final boolean u() {
            return this.f1684r;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "dest");
            parcel.writeString(this.f1671e.name());
            parcel.writeStringList(new ArrayList(this.f1672f));
            parcel.writeString(this.f1673g.name());
            parcel.writeString(this.f1674h);
            parcel.writeString(this.f1675i);
            parcel.writeByte(this.f1676j ? (byte) 1 : 0);
            parcel.writeString(this.f1677k);
            parcel.writeString(this.f1678l);
            parcel.writeString(this.f1679m);
            parcel.writeString(this.f1680n);
            parcel.writeByte(this.f1681o ? (byte) 1 : 0);
            parcel.writeString(this.f1682p.name());
            parcel.writeByte(this.f1683q ? (byte) 1 : 0);
            parcel.writeByte(this.f1684r ? (byte) 1 : 0);
            parcel.writeString(this.f1685s);
            parcel.writeString(this.t);
            parcel.writeString(this.u);
            m mVar = this.v;
            parcel.writeString(mVar == null ? null : mVar.name());
        }
    }

    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* renamed from: m  reason: collision with root package name */
        public static final c f1686m = new c((g) null);

        /* renamed from: e  reason: collision with root package name */
        public final a f1687e;

        /* renamed from: f  reason: collision with root package name */
        public final u f1688f;

        /* renamed from: g  reason: collision with root package name */
        public final y f1689g;

        /* renamed from: h  reason: collision with root package name */
        public final String f1690h;

        /* renamed from: i  reason: collision with root package name */
        public final String f1691i;

        /* renamed from: j  reason: collision with root package name */
        public final e f1692j;

        /* renamed from: k  reason: collision with root package name */
        public Map<String, String> f1693k;

        /* renamed from: l  reason: collision with root package name */
        public Map<String, String> f1694l;

        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: e  reason: collision with root package name */
            private final String f1699e;

            private a(String str) {
                this.f1699e = str;
            }

            public final String c() {
                return this.f1699e;
            }
        }

        public static final class b implements Parcelable.Creator<f> {
            b() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                l.d(parcel, "source");
                return new f(parcel, (g) null);
            }

            /* renamed from: b */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        public static final class c {
            private c() {
            }

            public /* synthetic */ c(g gVar) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, (u) null, str, (String) null);
            }

            public final f b(e eVar, u uVar, y yVar) {
                return new f(eVar, a.SUCCESS, uVar, yVar, (String) null, (String) null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, (u) null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, u uVar) {
                l.d(uVar, "token");
                return new f(eVar, a.SUCCESS, uVar, (String) null, (String) null);
            }
        }

        private f(Parcel parcel) {
            String readString = parcel.readString();
            this.f1687e = a.valueOf(readString == null ? "error" : readString);
            this.f1688f = (u) parcel.readParcelable(u.class.getClassLoader());
            this.f1689g = (y) parcel.readParcelable(y.class.getClassLoader());
            this.f1690h = parcel.readString();
            this.f1691i = parcel.readString();
            this.f1692j = (e) parcel.readParcelable(e.class.getClassLoader());
            o0 o0Var = o0.a;
            this.f1693k = o0.m0(parcel);
            this.f1694l = o0.m0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, g gVar) {
            this(parcel);
        }

        public f(e eVar, a aVar, u uVar, y yVar, String str, String str2) {
            l.d(aVar, "code");
            this.f1692j = eVar;
            this.f1688f = uVar;
            this.f1689g = yVar;
            this.f1690h = str;
            this.f1687e = aVar;
            this.f1691i = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public f(e eVar, a aVar, u uVar, String str, String str2) {
            this(eVar, aVar, uVar, (y) null, str, str2);
            l.d(aVar, "code");
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "dest");
            parcel.writeString(this.f1687e.name());
            parcel.writeParcelable(this.f1688f, i2);
            parcel.writeParcelable(this.f1689g, i2);
            parcel.writeString(this.f1690h);
            parcel.writeString(this.f1691i);
            parcel.writeParcelable(this.f1692j, i2);
            o0 o0Var = o0.a;
            o0.B0(parcel, this.f1693k);
            o0.B0(parcel, this.f1694l);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARNING: type inference failed for: r5v3, types: [com.facebook.login.b0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            m.y.d.l.d(r9, r0)
            r8.<init>()
            r0 = -1
            r8.f1660f = r0
            java.lang.Class<com.facebook.login.b0> r0 = com.facebook.login.b0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r9.readParcelableArray(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            android.os.Parcelable[] r0 = new android.os.Parcelable[r1]
        L_0x001a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0021:
            r5 = 0
            if (r4 >= r3) goto L_0x003b
            r6 = r0[r4]
            boolean r7 = r6 instanceof com.facebook.login.b0
            if (r7 == 0) goto L_0x002d
            r5 = r6
            com.facebook.login.b0 r5 = (com.facebook.login.b0) r5
        L_0x002d:
            if (r5 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r5.m(r8)
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r2.add(r5)
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x003b:
            com.facebook.login.b0[] r0 = new com.facebook.login.b0[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r1)
            com.facebook.login.b0[] r0 = (com.facebook.login.b0[]) r0
            r8.f1659e = r0
            int r0 = r9.readInt()
            r8.f1660f = r0
            java.lang.Class<com.facebook.login.x$e> r0 = com.facebook.login.x.e.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            com.facebook.login.x$e r0 = (com.facebook.login.x.e) r0
            r8.f1665k = r0
            com.facebook.internal.o0 r0 = com.facebook.internal.o0.a
            java.util.Map r0 = com.facebook.internal.o0.m0(r9)
            if (r0 != 0) goto L_0x0068
            r0 = r5
            goto L_0x006c
        L_0x0068:
            java.util.Map r0 = m.t.a0.n(r0)
        L_0x006c:
            r8.f1666l = r0
            java.util.Map r9 = com.facebook.internal.o0.m0(r9)
            if (r9 != 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            java.util.Map r5 = m.t.a0.n(r9)
        L_0x0079:
            r8.f1667m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.x.<init>(android.os.Parcel):void");
    }

    public x(Fragment fragment) {
        l.d(fragment, "fragment");
        w(fragment);
    }

    private final void a(String str, String str2, boolean z) {
        Map<String, String> map = this.f1666l;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f1666l == null) {
            this.f1666l = map;
        }
        if (map.containsKey(str) && z) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void h() {
        f(f.c.d(f.f1686m, this.f1665k, "Login attempt failed.", (String) null, (String) null, 8, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (m.y.d.l.a(r1, r2 == null ? null : r2.a()) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.login.z n() {
        /*
            r3 = this;
            com.facebook.login.z r0 = r3.f1668n
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.a()
            com.facebook.login.x$e r2 = r3.f1665k
            if (r2 != 0) goto L_0x000e
            r2 = 0
            goto L_0x0012
        L_0x000e:
            java.lang.String r2 = r2.a()
        L_0x0012:
            boolean r1 = m.y.d.l.a(r1, r2)
            if (r1 != 0) goto L_0x003a
        L_0x0018:
            com.facebook.login.z r0 = new com.facebook.login.z
            androidx.fragment.app.e r1 = r3.i()
            if (r1 != 0) goto L_0x0026
            com.facebook.g0 r1 = com.facebook.g0.a
            android.content.Context r1 = com.facebook.g0.c()
        L_0x0026:
            com.facebook.login.x$e r2 = r3.f1665k
            if (r2 != 0) goto L_0x0031
            com.facebook.g0 r2 = com.facebook.g0.a
            java.lang.String r2 = com.facebook.g0.d()
            goto L_0x0035
        L_0x0031:
            java.lang.String r2 = r2.a()
        L_0x0035:
            r0.<init>(r1, r2)
            r3.f1668n = r0
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.x.n():com.facebook.login.z");
    }

    private final void p(String str, f fVar, Map<String, String> map) {
        q(str, fVar.f1687e.c(), fVar.f1690h, fVar.f1691i, map);
    }

    private final void q(String str, String str2, String str3, String str4, Map<String, String> map) {
        e eVar = this.f1665k;
        String str5 = "fb_mobile_login_method_complete";
        if (eVar == null) {
            n().e(str5, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        z n2 = n();
        String b2 = eVar.b();
        if (eVar.q()) {
            str5 = "foa_mobile_login_method_complete";
        }
        n2.b(b2, str, str2, str3, str4, map, str5);
    }

    private final void t(f fVar) {
        d dVar = this.f1662h;
        if (dVar != null) {
            dVar.a(fVar);
        }
    }

    public final void A() {
        b0 j2 = j();
        if (j2 != null) {
            q(j2.f(), "skipped", (String) null, (String) null, j2.e());
        }
        b0[] b0VarArr = this.f1659e;
        while (b0VarArr != null) {
            int i2 = this.f1660f;
            if (i2 >= b0VarArr.length - 1) {
                break;
            }
            this.f1660f = i2 + 1;
            if (z()) {
                return;
            }
        }
        if (this.f1665k != null) {
            h();
        }
    }

    public final void B(f fVar) {
        f fVar2;
        l.d(fVar, "pendingResult");
        if (fVar.f1688f != null) {
            u e2 = u.f1749p.e();
            u uVar = fVar.f1688f;
            if (e2 != null) {
                try {
                    if (l.a(e2.m(), uVar.m())) {
                        fVar2 = f.f1686m.b(this.f1665k, fVar.f1688f, fVar.f1689g);
                        f(fVar2);
                        return;
                    }
                } catch (Exception e3) {
                    f(f.c.d(f.f1686m, this.f1665k, "Caught exception", e3.getMessage(), (String) null, 8, (Object) null));
                    return;
                }
            }
            fVar2 = f.c.d(f.f1686m, this.f1665k, "User logged in as different Facebook user.", (String) null, (String) null, 8, (Object) null);
            f(fVar2);
            return;
        }
        throw new c0("Can't validate without a token");
    }

    public final void b(e eVar) {
        if (eVar != null) {
            if (this.f1665k != null) {
                throw new c0("Attempted to authorize while a request is pending.");
            } else if (!u.f1749p.g() || d()) {
                this.f1665k = eVar;
                this.f1659e = l(eVar);
                A();
            }
        }
    }

    public final void c() {
        b0 j2 = j();
        if (j2 != null) {
            j2.b();
        }
    }

    public final boolean d() {
        if (this.f1664j) {
            return true;
        }
        if (e("android.permission.INTERNET") != 0) {
            androidx.fragment.app.e i2 = i();
            String str = null;
            String string = i2 == null ? null : i2.getString(com.facebook.common.d.com_facebook_internet_permission_error_title);
            if (i2 != null) {
                str = i2.getString(com.facebook.common.d.com_facebook_internet_permission_error_message);
            }
            f(f.c.d(f.f1686m, this.f1665k, string, str, (String) null, 8, (Object) null));
            return false;
        }
        this.f1664j = true;
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public final int e(String str) {
        l.d(str, "permission");
        androidx.fragment.app.e i2 = i();
        if (i2 == null) {
            return -1;
        }
        return i2.checkCallingOrSelfPermission(str);
    }

    public final void f(f fVar) {
        l.d(fVar, "outcome");
        b0 j2 = j();
        if (j2 != null) {
            p(j2.f(), fVar, j2.e());
        }
        Map<String, String> map = this.f1666l;
        if (map != null) {
            fVar.f1693k = map;
        }
        Map<String, String> map2 = this.f1667m;
        if (map2 != null) {
            fVar.f1694l = map2;
        }
        this.f1659e = null;
        this.f1660f = -1;
        this.f1665k = null;
        this.f1666l = null;
        this.f1669o = 0;
        this.f1670p = 0;
        t(fVar);
    }

    public final void g(f fVar) {
        l.d(fVar, "outcome");
        if (fVar.f1688f == null || !u.f1749p.g()) {
            f(fVar);
        } else {
            B(fVar);
        }
    }

    public final androidx.fragment.app.e i() {
        Fragment fragment = this.f1661g;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final b0 j() {
        b0[] b0VarArr;
        int i2 = this.f1660f;
        if (i2 < 0 || (b0VarArr = this.f1659e) == null) {
            return null;
        }
        return b0VarArr[i2];
    }

    public final Fragment k() {
        return this.f1661g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.login.b0[] l(com.facebook.login.x.e r4) {
        /*
            r3 = this;
            java.lang.String r0 = "request"
            m.y.d.l.d(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.facebook.login.w r1 = r4.j()
            boolean r2 = r4.r()
            if (r2 == 0) goto L_0x0027
            boolean r2 = com.facebook.g0.f1396r
            if (r2 != 0) goto L_0x0045
            boolean r2 = r1.g()
            if (r2 == 0) goto L_0x0045
            com.facebook.login.u r2 = new com.facebook.login.u
            r2.<init>((com.facebook.login.x) r3)
        L_0x0023:
            r0.add(r2)
            goto L_0x0045
        L_0x0027:
            boolean r2 = r1.f()
            if (r2 == 0) goto L_0x0035
            com.facebook.login.t r2 = new com.facebook.login.t
            r2.<init>((com.facebook.login.x) r3)
            r0.add(r2)
        L_0x0035:
            boolean r2 = com.facebook.g0.f1396r
            if (r2 != 0) goto L_0x0045
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x0045
            com.facebook.login.v r2 = new com.facebook.login.v
            r2.<init>((com.facebook.login.x) r3)
            goto L_0x0023
        L_0x0045:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0053
            com.facebook.login.n r2 = new com.facebook.login.n
            r2.<init>((com.facebook.login.x) r3)
            r0.add(r2)
        L_0x0053:
            boolean r2 = r1.j()
            if (r2 == 0) goto L_0x0061
            com.facebook.login.g0 r2 = new com.facebook.login.g0
            r2.<init>((com.facebook.login.x) r3)
            r0.add(r2)
        L_0x0061:
            boolean r4 = r4.r()
            if (r4 != 0) goto L_0x0075
            boolean r4 = r1.d()
            if (r4 == 0) goto L_0x0075
            com.facebook.login.r r4 = new com.facebook.login.r
            r4.<init>((com.facebook.login.x) r3)
            r0.add(r4)
        L_0x0075:
            r4 = 0
            com.facebook.login.b0[] r4 = new com.facebook.login.b0[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r4, r0)
            com.facebook.login.b0[] r4 = (com.facebook.login.b0[]) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.x.l(com.facebook.login.x$e):com.facebook.login.b0[]");
    }

    public final boolean m() {
        return this.f1665k != null && this.f1660f >= 0;
    }

    public final e o() {
        return this.f1665k;
    }

    public final void r() {
        a aVar = this.f1663i;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void s() {
        a aVar = this.f1663i;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean u(int i2, int i3, Intent intent) {
        this.f1669o++;
        if (this.f1665k != null) {
            if (intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f1347n, false)) {
                b0 j2 = j();
                if (j2 != null && (!j2.n() || intent != null || this.f1669o >= this.f1670p)) {
                    return j2.j(i2, i3, intent);
                }
            } else {
                A();
                return false;
            }
        }
        return false;
    }

    public final void v(a aVar) {
        this.f1663i = aVar;
    }

    public final void w(Fragment fragment) {
        if (this.f1661g == null) {
            this.f1661g = fragment;
            return;
        }
        throw new c0("Can't set fragment once it is already set.");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        parcel.writeParcelableArray(this.f1659e, i2);
        parcel.writeInt(this.f1660f);
        parcel.writeParcelable(this.f1665k, i2);
        o0 o0Var = o0.a;
        o0.B0(parcel, this.f1666l);
        o0.B0(parcel, this.f1667m);
    }

    public final void x(d dVar) {
        this.f1662h = dVar;
    }

    public final void y(e eVar) {
        if (!m()) {
            b(eVar);
        }
    }

    public final boolean z() {
        b0 j2 = j();
        if (j2 == null) {
            return false;
        }
        if (!j2.i() || d()) {
            e eVar = this.f1665k;
            if (eVar == null) {
                return false;
            }
            int o2 = j2.o(eVar);
            this.f1669o = 0;
            z n2 = n();
            String b2 = eVar.b();
            if (o2 > 0) {
                n2.d(b2, j2.f(), eVar.q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
                this.f1670p = o2;
            } else {
                n2.c(b2, j2.f(), eVar.q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
                a("not_tried", j2.f(), true);
            }
            return o2 > 0;
        }
        a("no_internet_permission", "1", false);
        return false;
    }
}
