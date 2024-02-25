package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.c0;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.i0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.login.x;
import com.facebook.m0;
import com.facebook.u;
import com.facebook.x;
import com.facebook.y;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import m.d0.d;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b0 implements Parcelable {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1579g = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f1580e;

    /* renamed from: f  reason: collision with root package name */
    public x f1581f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final u a(Bundle bundle, x xVar, String str) {
            String string;
            Bundle bundle2 = bundle;
            l.d(bundle, "bundle");
            l.d(str, "applicationId");
            o0 o0Var = o0.a;
            Date u = o0.u(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date u2 = o0.u(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
            if (string2 != null) {
                boolean z = true;
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (string.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        return new u(string2, str, string, stringArrayList, (Collection<String>) null, (Collection<String>) null, xVar, u, new Date(), u2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.u b(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, com.facebook.x r22, java.lang.String r23) {
            /*
                r19 = this;
                r0 = r21
                java.lang.String r1 = "bundle"
                m.y.d.l.d(r0, r1)
                java.lang.String r1 = "applicationId"
                r4 = r23
                m.y.d.l.d(r4, r1)
                com.facebook.internal.o0 r1 = com.facebook.internal.o0.a
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                java.lang.String r2 = "expires_in"
                java.util.Date r10 = com.facebook.internal.o0.u(r0, r2, r1)
                java.lang.String r1 = "access_token"
                java.lang.String r3 = r0.getString(r1)
                r1 = 0
                if (r3 != 0) goto L_0x0025
                return r1
            L_0x0025:
                java.util.Date r2 = new java.util.Date
                r5 = 0
                r2.<init>(r5)
                java.lang.String r5 = "data_access_expiration_time"
                java.util.Date r12 = com.facebook.internal.o0.u(r0, r5, r2)
                java.lang.String r2 = "granted_scopes"
                java.lang.String r13 = r0.getString(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.lang.String r5 = ","
                r6 = 1
                r7 = 0
                if (r13 == 0) goto L_0x006f
                int r8 = r13.length()
                if (r8 <= 0) goto L_0x0048
                r8 = 1
                goto L_0x0049
            L_0x0048:
                r8 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x006f
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r8 = m.d0.q.U(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r9 = new java.lang.String[r7]
                java.lang.Object[] r8 = r8.toArray(r9)
                java.util.Objects.requireNonNull(r8, r2)
                java.lang.String[] r8 = (java.lang.String[]) r8
                int r9 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
                java.util.ArrayList r8 = m.t.j.c(r8)
                goto L_0x0071
            L_0x006f:
                r8 = r20
            L_0x0071:
                java.lang.String r9 = "denied_scopes"
                java.lang.String r13 = r0.getString(r9)
                if (r13 == 0) goto L_0x00a8
                int r9 = r13.length()
                if (r9 <= 0) goto L_0x0081
                r9 = 1
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                if (r9 == 0) goto L_0x00a8
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r9 = m.d0.q.U(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r11 = new java.lang.String[r7]
                java.lang.Object[] r9 = r9.toArray(r11)
                java.util.Objects.requireNonNull(r9, r2)
                java.lang.String[] r9 = (java.lang.String[]) r9
                int r11 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)
                java.util.ArrayList r9 = m.t.j.c(r9)
                goto L_0x00a9
            L_0x00a8:
                r9 = r1
            L_0x00a9:
                java.lang.String r11 = "expired_scopes"
                java.lang.String r13 = r0.getString(r11)
                if (r13 == 0) goto L_0x00e0
                int r11 = r13.length()
                if (r11 <= 0) goto L_0x00b8
                goto L_0x00b9
            L_0x00b8:
                r6 = 0
            L_0x00b9:
                if (r6 == 0) goto L_0x00e0
                java.lang.String[] r14 = new java.lang.String[]{r5}
                r15 = 0
                r16 = 0
                r17 = 6
                r18 = 0
                java.util.List r5 = m.d0.q.U(r13, r14, r15, r16, r17, r18)
                java.lang.String[] r6 = new java.lang.String[r7]
                java.lang.Object[] r5 = r5.toArray(r6)
                java.util.Objects.requireNonNull(r5, r2)
                java.lang.String[] r5 = (java.lang.String[]) r5
                int r2 = r5.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
                java.util.ArrayList r2 = m.t.j.c(r2)
                r11 = r2
                goto L_0x00e1
            L_0x00e0:
                r11 = r1
            L_0x00e1:
                boolean r2 = com.facebook.internal.o0.V(r3)
                if (r2 == 0) goto L_0x00e8
                return r1
            L_0x00e8:
                java.lang.String r1 = "graph_domain"
                java.lang.String r13 = r0.getString(r1)
                java.lang.String r1 = "signed_request"
                java.lang.String r0 = r0.getString(r1)
                r1 = r19
                java.lang.String r5 = r1.e(r0)
                com.facebook.u r0 = new com.facebook.u
                java.util.Date r14 = new java.util.Date
                r14.<init>()
                r2 = r0
                r4 = r23
                r6 = r8
                r7 = r9
                r8 = r11
                r9 = r22
                r11 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.b0.a.b(java.util.Collection, android.os.Bundle, com.facebook.x, java.lang.String):com.facebook.u");
        }

        public final y c(Bundle bundle, String str) {
            l.d(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                boolean z = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            return new y(string, str);
                        } catch (Exception e2) {
                            throw new c0(e2.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final y d(Bundle bundle, String str) {
            l.d(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            return new y(string, str);
                        } catch (Exception e2) {
                            throw new c0(e2.getMessage(), e2);
                        }
                    }
                }
            }
            return null;
        }

        public final String e(String str) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        Object[] array = q.U(str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length == 2) {
                                byte[] decode = Base64.decode(strArr[1], 0);
                                l.c(decode, "data");
                                String string = new JSONObject(new String(decode, d.a)).getString("user_id");
                                l.c(string, "jsonObject.getString(\"user_id\")");
                                return string;
                            }
                            throw new c0("Failed to retrieve user_id from signed_request");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                }
            }
            throw new c0("Authorization response does not contain the signed_request");
        }
    }

    protected b0(Parcel parcel) {
        l.d(parcel, "source");
        o0 o0Var = o0.a;
        Map<String, String> o0 = o0.o0(parcel);
        this.f1580e = o0 == null ? null : a0.n(o0);
    }

    public b0(x xVar) {
        l.d(xVar, "loginClient");
        m(xVar);
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.f1580e == null) {
            this.f1580e = new HashMap();
        }
        Map<String, String> map = this.f1580e;
        if (map != null) {
            String put = map.put(str, obj == null ? null : obj.toString());
        }
    }

    public void b() {
    }

    /* access modifiers changed from: protected */
    public String c(String str) {
        l.d(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            l(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", l.j("Error creating client state json: ", e2.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        l.c(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final x d() {
        x xVar = this.f1581f;
        if (xVar != null) {
            return xVar;
        }
        l.n("loginClient");
        throw null;
    }

    public final Map<String, String> e() {
        return this.f1580e;
    }

    public abstract String f();

    /* access modifiers changed from: protected */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        g0 g0Var = g0.a;
        sb.append(g0.d());
        sb.append("://authorize/");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void h(String str) {
        x.e o2 = d().o();
        String a2 = o2 == null ? null : o2.a();
        if (a2 == null) {
            g0 g0Var = g0.a;
            a2 = g0.d();
        }
        com.facebook.y0.g0 g0Var2 = new com.facebook.y0.g0(d().i(), a2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a2);
        g0Var2.h("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int i2, int i3, Intent intent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public Bundle k(x.e eVar, Bundle bundle) {
        j0 j0Var;
        l.d(eVar, "request");
        l.d(bundle, "values");
        String string = bundle.getString("code");
        o0 o0Var = o0.a;
        if (!o0.V(string)) {
            String str = null;
            if (string == null) {
                j0Var = null;
            } else {
                e0 e0Var = e0.a;
                String g2 = g();
                String f2 = eVar.f();
                if (f2 == null) {
                    f2 = "";
                }
                j0Var = e0.a(string, g2, f2);
            }
            if (j0Var != null) {
                m0 j2 = j0Var.j();
                f0 b = j2.b();
                if (b == null) {
                    try {
                        JSONObject c = j2.c();
                        if (c != null) {
                            str = c.getString("access_token");
                        }
                        if (c == null || o0.V(str)) {
                            throw new c0("No access token found from result");
                        }
                        bundle.putString("access_token", str);
                        if (c.has("id_token")) {
                            bundle.putString("id_token", c.getString("id_token"));
                        }
                        return bundle;
                    } catch (JSONException e2) {
                        throw new c0(l.j("Fail to process code exchange response: ", e2.getMessage()));
                    }
                } else {
                    throw new i0(b, b.c());
                }
            } else {
                throw new c0("Failed to create code exchange request");
            }
        } else {
            throw new c0("No code param found from the request");
        }
    }

    public void l(JSONObject jSONObject) {
        l.d(jSONObject, "param");
    }

    public final void m(x xVar) {
        l.d(xVar, "<set-?>");
        this.f1581f = xVar;
    }

    public boolean n() {
        return false;
    }

    public abstract int o(x.e eVar);

    public void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "dest");
        o0 o0Var = o0.a;
        o0.C0(parcel, this.f1580e);
    }
}
