package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.facebook.FacebookActivity;
import com.facebook.c0;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.internal.d0;
import com.facebook.internal.o0;
import com.facebook.internal.p0;
import com.facebook.j0;
import com.facebook.k0;
import com.facebook.login.x;
import com.facebook.m0;
import com.facebook.n0;
import com.facebook.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m.y.d.g;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class q extends androidx.fragment.app.d {
    public static final a F = new a((g) null);
    private static final String G = "device/login";
    private static final String H = "device/login_status";
    private static final int I = 1349174;
    private volatile ScheduledFuture<?> A;
    private volatile c B;
    private boolean C;
    private boolean D;
    private x.e E;
    private View u;
    private TextView v;
    private TextView w;
    private r x;
    private final AtomicBoolean y = new AtomicBoolean();
    private volatile k0 z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    String optString2 = optJSONObject.optString("permission");
                    l.c(optString2, "permission");
                    if (!(optString2.length() == 0) && !l.a(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    private static final class b {
        private List<String> a;
        private List<String> b;
        private List<String> c;

        public b(List<String> list, List<String> list2, List<String> list3) {
            l.d(list, "grantedPermissions");
            l.d(list2, "declinedPermissions");
            l.d(list3, "expiredPermissions");
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final List<String> a() {
            return this.b;
        }

        public final List<String> b() {
            return this.c;
        }

        public final List<String> c() {
            return this.a;
        }
    }

    private static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private String f1630e;

        /* renamed from: f  reason: collision with root package name */
        private String f1631f;

        /* renamed from: g  reason: collision with root package name */
        private String f1632g;

        /* renamed from: h  reason: collision with root package name */
        private long f1633h;

        /* renamed from: i  reason: collision with root package name */
        private long f1634i;

        public static final class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                l.d(parcel, "parcel");
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c() {
        }

        protected c(Parcel parcel) {
            l.d(parcel, "parcel");
            this.f1630e = parcel.readString();
            this.f1631f = parcel.readString();
            this.f1632g = parcel.readString();
            this.f1633h = parcel.readLong();
            this.f1634i = parcel.readLong();
        }

        public final String a() {
            return this.f1630e;
        }

        public final long b() {
            return this.f1633h;
        }

        public final String c() {
            return this.f1632g;
        }

        public final String d() {
            return this.f1631f;
        }

        public int describeContents() {
            return 0;
        }

        public final void e(long j2) {
            this.f1633h = j2;
        }

        public final void f(long j2) {
            this.f1634i = j2;
        }

        public final void g(String str) {
            this.f1632g = str;
        }

        public final void h(String str) {
            this.f1631f = str;
            s sVar = s.a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            l.c(format, "java.lang.String.format(locale, format, *args)");
            this.f1630e = format;
        }

        public final boolean i() {
            return this.f1634i != 0 && (new Date().getTime() - this.f1634i) - (this.f1633h * 1000) < 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "dest");
            parcel.writeString(this.f1630e);
            parcel.writeString(this.f1631f);
            parcel.writeString(this.f1632g);
            parcel.writeLong(this.f1633h);
            parcel.writeLong(this.f1634i);
        }
    }

    public static final class d extends Dialog {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f1635e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(q qVar, e eVar, int i2) {
            super(eVar, i2);
            this.f1635e = qVar;
        }

        public void onBackPressed() {
            if (this.f1635e.F()) {
                super.onBackPressed();
            }
        }
    }

    private final void I(String str, long j2, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = j2 != 0 ? new Date(new Date().getTime() + (j2 * 1000)) : null;
        if ((l2 == null || l2.longValue() != 0) && l2 != null) {
            date = new Date(l2.longValue() * 1000);
        }
        g0 g0Var = g0.a;
        j0 x2 = j0.f1546n.x(new u(str, g0.d(), "0", (Collection) null, (Collection) null, (Collection) null, (com.facebook.x) null, date2, (Date) null, date, (String) null, 1024, (g) null), "me", new b(this, str, date2, date));
        x2.F(n0.GET);
        x2.G(bundle);
        x2.k();
    }

    /* access modifiers changed from: private */
    public static final void J(q qVar, String str, Date date, Date date2, m0 m0Var) {
        EnumSet<com.facebook.internal.n0> j2;
        l.d(qVar, "this$0");
        l.d(str, "$accessToken");
        l.d(m0Var, "response");
        if (!qVar.y.get()) {
            f0 b2 = m0Var.b();
            if (b2 != null) {
                c0 e2 = b2.e();
                if (e2 == null) {
                    e2 = new c0();
                }
                qVar.H(e2);
                return;
            }
            try {
                JSONObject c2 = m0Var.c();
                if (c2 == null) {
                    c2 = new JSONObject();
                }
                String string = c2.getString("id");
                l.c(string, "jsonObject.getString(\"id\")");
                b a2 = F.b(c2);
                String string2 = c2.getString("name");
                l.c(string2, "jsonObject.getString(\"name\")");
                c cVar = qVar.B;
                if (cVar != null) {
                    com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
                    com.facebook.z0.a.a.a(cVar.d());
                }
                d0 d0Var = d0.a;
                g0 g0Var = g0.a;
                com.facebook.internal.c0 c3 = d0.c(g0.d());
                Boolean bool = null;
                if (!(c3 == null || (j2 = c3.j()) == null)) {
                    bool = Boolean.valueOf(j2.contains(com.facebook.internal.n0.RequireConfirm));
                }
                if (!l.a(bool, Boolean.TRUE) || qVar.D) {
                    qVar.s(string, a2, str, date, date2);
                    return;
                }
                qVar.D = true;
                qVar.L(string, a2, str, string2, date, date2);
            } catch (JSONException e3) {
                qVar.H(new c0((Throwable) e3));
            }
        }
    }

    private final void K() {
        c cVar = this.B;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.z = v().k();
    }

    private final void L(String str, b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_title);
        l.c(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_continue_as);
        l.c(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_cancel);
        l.c(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        s sVar = s.a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new e(this, str, bVar, str2, date, date2)).setPositiveButton(string3, new g(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    public static final void M(q qVar, String str, b bVar, String str2, Date date, Date date2, DialogInterface dialogInterface, int i2) {
        l.d(qVar, "this$0");
        l.d(str, "$userId");
        l.d(bVar, "$permissions");
        l.d(str2, "$accessToken");
        qVar.s(str, bVar, str2, date, date2);
    }

    /* access modifiers changed from: private */
    public static final void N(q qVar, DialogInterface dialogInterface, int i2) {
        l.d(qVar, "this$0");
        View w2 = qVar.w(false);
        Dialog h2 = qVar.h();
        if (h2 != null) {
            h2.setContentView(w2);
        }
        x.e eVar = qVar.E;
        if (eVar != null) {
            qVar.R(eVar);
        }
    }

    private final void O() {
        c cVar = this.B;
        Long valueOf = cVar == null ? null : Long.valueOf(cVar.b());
        if (valueOf != null) {
            this.A = r.f1636i.a().schedule(new h(this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    public static final void P(q qVar) {
        l.d(qVar, "this$0");
        qVar.K();
    }

    private final void Q(c cVar) {
        this.B = cVar;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(cVar.d());
            com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), com.facebook.z0.a.a.c(cVar.a()));
            TextView textView2 = this.w;
            if (textView2 != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
                TextView textView3 = this.v;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    View view = this.u;
                    if (view != null) {
                        view.setVisibility(8);
                        if (!this.D && com.facebook.z0.a.a.f(cVar.d())) {
                            new com.facebook.y0.g0(getContext()).f("fb_smart_login_service");
                        }
                        if (cVar.i()) {
                            O();
                        } else {
                            K();
                        }
                    } else {
                        l.n("progressBar");
                        throw null;
                    }
                } else {
                    l.n("confirmationCode");
                    throw null;
                }
            } else {
                l.n("instructions");
                throw null;
            }
        } else {
            l.n("confirmationCode");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final void S(q qVar, m0 m0Var) {
        l.d(qVar, "this$0");
        l.d(m0Var, "response");
        if (!qVar.C) {
            if (m0Var.b() != null) {
                f0 b2 = m0Var.b();
                c0 e2 = b2 == null ? null : b2.e();
                if (e2 == null) {
                    e2 = new c0();
                }
                qVar.H(e2);
                return;
            }
            JSONObject c2 = m0Var.c();
            if (c2 == null) {
                c2 = new JSONObject();
            }
            c cVar = new c();
            try {
                cVar.h(c2.getString("user_code"));
                cVar.g(c2.getString("code"));
                cVar.e(c2.getLong("interval"));
                qVar.Q(cVar);
            } catch (JSONException e3) {
                qVar.H(new c0((Throwable) e3));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void q(q qVar, m0 m0Var) {
        l.d(qVar, "this$0");
        l.d(m0Var, "response");
        if (!qVar.y.get()) {
            f0 b2 = m0Var.b();
            if (b2 != null) {
                int g2 = b2.g();
                boolean z2 = true;
                if (!(g2 == I || g2 == 1349172)) {
                    z2 = false;
                }
                if (z2) {
                    qVar.O();
                    return;
                }
                if (g2 == 1349152) {
                    c cVar = qVar.B;
                    if (cVar != null) {
                        com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
                        com.facebook.z0.a.a.a(cVar.d());
                    }
                    x.e eVar = qVar.E;
                    if (eVar != null) {
                        qVar.R(eVar);
                        return;
                    }
                } else if (g2 != 1349173) {
                    f0 b3 = m0Var.b();
                    c0 e2 = b3 == null ? null : b3.e();
                    if (e2 == null) {
                        e2 = new c0();
                    }
                    qVar.H(e2);
                    return;
                }
                qVar.G();
                return;
            }
            try {
                JSONObject c2 = m0Var.c();
                if (c2 == null) {
                    c2 = new JSONObject();
                }
                String string = c2.getString("access_token");
                l.c(string, "resultObject.getString(\"access_token\")");
                qVar.I(string, c2.getLong("expires_in"), Long.valueOf(c2.optLong("data_access_expiration_time")));
            } catch (JSONException e3) {
                qVar.H(new c0((Throwable) e3));
            }
        }
    }

    private final void s(String str, b bVar, String str2, Date date, Date date2) {
        r rVar = this.x;
        if (rVar != null) {
            g0 g0Var = g0.a;
            rVar.u(str2, g0.d(), str, bVar.c(), bVar.a(), bVar.b(), com.facebook.x.DEVICE_AUTH, date, (Date) null, date2);
        }
        Dialog h2 = h();
        if (h2 != null) {
            h2.dismiss();
        }
    }

    private final j0 v() {
        Bundle bundle = new Bundle();
        c cVar = this.B;
        bundle.putString("code", cVar == null ? null : cVar.c());
        bundle.putString("access_token", t());
        return j0.f1546n.B((u) null, H, bundle, new d(this));
    }

    /* access modifiers changed from: private */
    public static final void x(q qVar, View view) {
        l.d(qVar, "this$0");
        qVar.G();
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void G() {
        if (this.y.compareAndSet(false, true)) {
            c cVar = this.B;
            if (cVar != null) {
                com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
                com.facebook.z0.a.a.a(cVar.d());
            }
            r rVar = this.x;
            if (rVar != null) {
                rVar.s();
            }
            Dialog h2 = h();
            if (h2 != null) {
                h2.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void H(c0 c0Var) {
        l.d(c0Var, "ex");
        if (this.y.compareAndSet(false, true)) {
            c cVar = this.B;
            if (cVar != null) {
                com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
                com.facebook.z0.a.a.a(cVar.d());
            }
            r rVar = this.x;
            if (rVar != null) {
                rVar.t(c0Var);
            }
            Dialog h2 = h();
            if (h2 != null) {
                h2.dismiss();
            }
        }
    }

    public void R(x.e eVar) {
        l.d(eVar, "request");
        this.E = eVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", eVar.n()));
        o0 o0Var = o0.a;
        o0.l0(bundle, "redirect_uri", eVar.i());
        o0.l0(bundle, "target_user_id", eVar.h());
        bundle.putString("access_token", t());
        com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
        Map<String, String> r2 = r();
        bundle.putString("device_info", com.facebook.z0.a.a.d(r2 == null ? null : a0.n(r2)));
        j0.f1546n.B((u) null, G, bundle, new c(this)).k();
    }

    public Dialog j(Bundle bundle) {
        d dVar = new d(this, requireActivity(), com.facebook.common.e.com_facebook_auth_dialog);
        com.facebook.z0.a.a aVar = com.facebook.z0.a.a.a;
        dVar.setContentView(w(com.facebook.z0.a.a.e() && !this.D));
        return dVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        x i2;
        l.d(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        y yVar = (y) ((FacebookActivity) requireActivity()).e();
        b0 b0Var = null;
        if (!(yVar == null || (i2 = yVar.i()) == null)) {
            b0Var = i2.j();
        }
        this.x = (r) b0Var;
        if (!(bundle == null || (cVar = (c) bundle.getParcelable("request_state")) == null)) {
            Q(cVar);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.C = true;
        this.y.set(true);
        super.onDestroyView();
        k0 k0Var = this.z;
        if (k0Var != null) {
            k0Var.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        l.d(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.C) {
            G();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.B != null) {
            bundle.putParcelable("request_state", this.B);
        }
    }

    public Map<String, String> r() {
        return null;
    }

    public String t() {
        StringBuilder sb = new StringBuilder();
        p0 p0Var = p0.a;
        sb.append(p0.b());
        sb.append('|');
        sb.append(p0.c());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public int u(boolean z2) {
        return z2 ? com.facebook.common.c.com_facebook_smart_device_dialog_fragment : com.facebook.common.c.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    public View w(boolean z2) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        l.c(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(u(z2), (ViewGroup) null);
        l.c(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(com.facebook.common.b.progress_bar);
        l.c(findViewById, "view.findViewById(R.id.progress_bar)");
        this.u = findViewById;
        View findViewById2 = inflate.findViewById(com.facebook.common.b.confirmation_code);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.v = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(com.facebook.common.b.cancel_button);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new f(this));
        View findViewById4 = inflate.findViewById(com.facebook.common.b.com_facebook_device_auth_instructions);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        this.w = textView;
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(com.facebook.common.d.com_facebook_device_auth_instructions)));
            return inflate;
        }
        l.n("instructions");
        throw null;
    }
}
