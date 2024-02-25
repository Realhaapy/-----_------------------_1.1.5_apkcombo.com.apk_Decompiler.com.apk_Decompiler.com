package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.login.x;
import m.s;
import m.y.c.l;
import m.y.d.m;

public class y extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    private String f1700e;

    /* renamed from: f  reason: collision with root package name */
    private x.e f1701f;

    /* renamed from: g  reason: collision with root package name */
    private x f1702g;

    /* renamed from: h  reason: collision with root package name */
    private c<Intent> f1703h;

    /* renamed from: i  reason: collision with root package name */
    private View f1704i;

    static final class a extends m implements l<androidx.activity.result.a, s> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ y f1705e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f1706f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar, e eVar) {
            super(1);
            this.f1705e = yVar;
            this.f1706f = eVar;
        }

        public final void a(androidx.activity.result.a aVar) {
            m.y.d.l.d(aVar, "result");
            if (aVar.b() == -1) {
                this.f1705e.i().u(x.f1658q.b(), aVar.b(), aVar.a());
            } else {
                this.f1706f.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.activity.result.a) obj);
            return s.a;
        }
    }

    public static final class b implements x.a {
        final /* synthetic */ y a;

        b(y yVar) {
            this.a = yVar;
        }

        public void a() {
            this.a.t();
        }

        public void b() {
            this.a.k();
        }
    }

    private final l<androidx.activity.result.a, s> j(e eVar) {
        return new a(this, eVar);
    }

    /* access modifiers changed from: private */
    public final void k() {
        View view = this.f1704i;
        if (view != null) {
            view.setVisibility(8);
            r();
            return;
        }
        m.y.d.l.n("progressBar");
        throw null;
    }

    private final void l(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f1700e = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    public static final void o(y yVar, x.f fVar) {
        m.y.d.l.d(yVar, "this$0");
        m.y.d.l.d(fVar, "outcome");
        yVar.q(fVar);
    }

    /* access modifiers changed from: private */
    public static final void p(l lVar, androidx.activity.result.a aVar) {
        m.y.d.l.d(lVar, "$tmp0");
        lVar.invoke(aVar);
    }

    private final void q(x.f fVar) {
        this.f1701f = null;
        int i2 = fVar.f1687e == x.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        e activity = getActivity();
        if (isAdded() && activity != null) {
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public final void t() {
        View view = this.f1704i;
        if (view != null) {
            view.setVisibility(0);
            s();
            return;
        }
        m.y.d.l.n("progressBar");
        throw null;
    }

    /* access modifiers changed from: protected */
    public x f() {
        return new x((Fragment) this);
    }

    public final c<Intent> g() {
        c<Intent> cVar = this.f1703h;
        if (cVar != null) {
            return cVar;
        }
        m.y.d.l.n("launcher");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int h() {
        return com.facebook.common.c.com_facebook_login_fragment;
    }

    public final x i() {
        x xVar = this.f1702g;
        if (xVar != null) {
            return xVar;
        }
        m.y.d.l.n("loginClient");
        throw null;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        i().u(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        x xVar = bundle == null ? null : (x) bundle.getParcelable("loginClient");
        if (xVar != null) {
            xVar.w(this);
        } else {
            xVar = f();
        }
        this.f1702g = xVar;
        i().x(new j(this));
        e activity = getActivity();
        if (activity != null) {
            l(activity);
            Intent intent = activity.getIntent();
            if (!(intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null)) {
                this.f1701f = (x.e) bundleExtra.getParcelable("request");
            }
            c<Intent> registerForActivityResult = registerForActivityResult(new androidx.activity.result.f.c(), new k(j(activity)));
            m.y.d.l.c(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
            this.f1703h = registerForActivityResult;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.y.d.l.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(h(), viewGroup, false);
        View findViewById = inflate.findViewById(com.facebook.common.b.com_facebook_login_fragment_progress_bar);
        m.y.d.l.c(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f1704i = findViewById;
        i().v(new b(this));
        return inflate;
    }

    public void onDestroy() {
        i().c();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(com.facebook.common.b.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f1700e == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        i().y(this.f1701f);
    }

    public void onSaveInstanceState(Bundle bundle) {
        m.y.d.l.d(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", i());
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: protected */
    public void s() {
    }
}
