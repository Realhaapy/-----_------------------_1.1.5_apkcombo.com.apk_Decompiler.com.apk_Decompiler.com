package f.e.a.c.e.b;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.n;

public class a extends g<g> implements f.e.a.c.e.g {
    public static final /* synthetic */ int D = 0;
    private final d A;
    private final Bundle B;
    private final Integer C;
    private final boolean z = true;

    public a(Context context, Looper looper, boolean z2, d dVar, Bundle bundle, f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, 44, dVar, fVar, gVar);
        this.A = dVar;
        this.B = bundle;
        this.C = dVar.g();
    }

    public static Bundle j0(d dVar) {
        dVar.f();
        Integer g2 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g2.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void g(f fVar) {
        n.i(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.A.b();
            GoogleSignInAccount b2 = "<<default account>>".equals(b.name) ? com.google.android.gms.auth.api.signin.a.a.a(x()).b() : null;
            Integer num = this.C;
            n.h(num);
            ((g) C()).d0(new j(1, new j0(b, num.intValue(), b2)), fVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.B(new l(1, new com.google.android.gms.common.a(8, (PendingIntent) null), (l0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public final int h() {
        return com.google.android.gms.common.g.a;
    }

    public final boolean o() {
        return this.z;
    }

    public final void p() {
        m(new c.d());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        if (!x().getPackageName().equals(this.A.d())) {
            this.B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.A.d());
        }
        return this.B;
    }
}
