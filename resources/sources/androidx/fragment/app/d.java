package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import androidx.lifecycle.x;

public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: e  reason: collision with root package name */
    private Handler f1029e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1030f = new a();

    /* renamed from: g  reason: collision with root package name */
    private DialogInterface.OnCancelListener f1031g = new b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public DialogInterface.OnDismissListener f1032h = new c();

    /* renamed from: i  reason: collision with root package name */
    private int f1033i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f1034j = 0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1035k = true;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f1036l = true;

    /* renamed from: m  reason: collision with root package name */
    private int f1037m = -1;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1038n;

    /* renamed from: o  reason: collision with root package name */
    private n<h> f1039o = new C0019d();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Dialog f1040p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1041q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1042r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1043s;
    private boolean t = false;

    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.f1032h.onDismiss(d.this.f1040p);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f1040p != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f1040p);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f1040p != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f1040p);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    class C0019d implements n<h> {
        C0019d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(h hVar) {
            if (hVar != null && d.this.f1036l) {
                View requireView = d.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.f1040p != null) {
                    if (n.F0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f1040p);
                    }
                    d.this.f1040p.setContentView(requireView);
                }
            }
        }
    }

    class e extends g {
        final /* synthetic */ g a;

        e(g gVar) {
            this.a = gVar;
        }

        public View c(int i2) {
            return this.a.d() ? this.a.c(i2) : d.this.k(i2);
        }

        public boolean d() {
            return this.a.d() || d.this.l();
        }
    }

    private void g(boolean z, boolean z2) {
        if (!this.f1042r) {
            this.f1042r = true;
            this.f1043s = false;
            Dialog dialog = this.f1040p;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1040p.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f1029e.getLooper()) {
                        onDismiss(this.f1040p);
                    } else {
                        this.f1029e.post(this.f1030f);
                    }
                }
            }
            this.f1041q = true;
            if (this.f1037m >= 0) {
                getParentFragmentManager().W0(this.f1037m, 1);
                this.f1037m = -1;
                return;
            }
            w m2 = getParentFragmentManager().m();
            m2.k(this);
            if (z) {
                m2.g();
            } else {
                m2.f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void m(Bundle bundle) {
        if (this.f1036l && !this.t) {
            try {
                this.f1038n = true;
                Dialog j2 = j(bundle);
                this.f1040p = j2;
                if (this.f1036l) {
                    o(j2, this.f1033i);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f1040p.setOwnerActivity((Activity) context);
                    }
                    this.f1040p.setCancelable(this.f1035k);
                    this.f1040p.setOnCancelListener(this.f1031g);
                    this.f1040p.setOnDismissListener(this.f1032h);
                    this.t = true;
                } else {
                    this.f1040p = null;
                }
                this.f1038n = false;
            } catch (Throwable th) {
                this.f1038n = false;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public g createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public Dialog h() {
        return this.f1040p;
    }

    public int i() {
        return this.f1034j;
    }

    public Dialog j(Bundle bundle) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), i());
    }

    /* access modifiers changed from: package-private */
    public View k(int i2) {
        Dialog dialog = this.f1040p;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.t;
    }

    public void n(boolean z) {
        this.f1036l = z;
    }

    public void o(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.f1039o);
        if (!this.f1043s) {
            this.f1042r = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1029e = new Handler();
        this.f1036l = this.mContainerId == 0;
        if (bundle != null) {
            this.f1033i = bundle.getInt("android:style", 0);
            this.f1034j = bundle.getInt("android:theme", 0);
            this.f1035k = bundle.getBoolean("android:cancelable", true);
            this.f1036l = bundle.getBoolean("android:showsDialog", this.f1036l);
            this.f1037m = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f1040p;
        if (dialog != null) {
            this.f1041q = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1040p.dismiss();
            if (!this.f1042r) {
                onDismiss(this.f1040p);
            }
            this.f1040p = null;
            this.t = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f1043s && !this.f1042r) {
            this.f1042r = true;
        }
        getViewLifecycleOwnerLiveData().i(this.f1039o);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1041q) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            g(true, true);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f1036l || this.f1038n) {
            if (n.F0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f1036l) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return onGetLayoutInflater;
        }
        m(bundle);
        if (n.F0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1040p;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f1040p;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f1033i;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f1034j;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.f1035k;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1036l;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.f1037m;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f1040p;
        if (dialog != null) {
            this.f1041q = false;
            dialog.show();
            View decorView = this.f1040p.getWindow().getDecorView();
            w.a(decorView, this);
            x.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f1040p;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f1040p != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1040p.onRestoreInstanceState(bundle2);
        }
    }

    public void p(n nVar, String str) {
        this.f1042r = false;
        this.f1043s = true;
        w m2 = nVar.m();
        m2.d(this, str);
        m2.f();
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f1040p != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1040p.onRestoreInstanceState(bundle2);
        }
    }
}
