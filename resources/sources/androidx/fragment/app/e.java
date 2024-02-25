package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.core.app.c;
import androidx.core.app.r;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e extends ComponentActivity implements c.e, c.g {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final i mFragmentLifecycleRegistry = new i(this);
    final i mFragments = i.b(new c());
    boolean mResumed;
    boolean mStopped = true;

    class a implements SavedStateRegistry.b {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.markFragmentsCreated();
            e.this.mFragmentLifecycleRegistry.h(e.b.ON_STOP);
            Parcelable x = e.this.mFragments.x();
            if (x != null) {
                bundle.putParcelable(e.FRAGMENTS_TAG, x);
            }
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        public void a(Context context) {
            e.this.mFragments.a((Fragment) null);
            Bundle a2 = e.this.getSavedStateRegistry().a(e.FRAGMENTS_TAG);
            if (a2 != null) {
                e.this.mFragments.w(a2.getParcelable(e.FRAGMENTS_TAG));
            }
        }
    }

    class c extends k<e> implements v, androidx.activity.c, d, r {
        public c() {
            super(e.this);
        }

        public void a(n nVar, Fragment fragment) {
            e.this.onAttachFragment(fragment);
        }

        public View c(int i2) {
            return e.this.findViewById(i2);
        }

        public boolean d() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return e.this.getActivityResultRegistry();
        }

        public androidx.lifecycle.e getLifecycle() {
            return e.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return e.this.getOnBackPressedDispatcher();
        }

        public u getViewModelStore() {
            return e.this.getViewModelStore();
        }

        public LayoutInflater i() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        public boolean k(Fragment fragment) {
            return !e.this.isFinishing();
        }

        public boolean l(String str) {
            return androidx.core.app.c.v(e.this, str);
        }

        public void o() {
            e.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: p */
        public e h() {
            return e.this;
        }
    }

    public e() {
        init();
    }

    public e(int i2) {
        super(i2);
        init();
    }

    private void init() {
        getSavedStateRegistry().d(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(n nVar, e.c cVar) {
        boolean z = false;
        for (Fragment next : nVar.s0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), cVar);
                }
                a0 a0Var = next.mViewLifecycleOwner;
                if (a0Var != null && a0Var.getLifecycle().b().a(e.c.STARTED)) {
                    next.mViewLifecycleOwner.f(cVar);
                    z = true;
                }
                if (next.mLifecycleRegistry.b().a(e.c.STARTED)) {
                    next.mLifecycleRegistry.o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            e.m.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().X(str, fileDescriptor, printWriter, strArr);
    }

    public n getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public e.m.a.a getSupportLoaderManager() {
        return e.m.a.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), e.c.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i2, i3, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.u();
        this.mFragments.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(e.b.ON_CREATE);
        this.mFragments.f();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.mFragments.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.h(e.b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.u();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.h(e.b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.u();
        this.mFragments.s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(e.b.ON_RESUME);
        this.mFragments.p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.u();
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.h(e.b.ON_START);
        this.mFragments.q();
    }

    public void onStateNotSaved() {
        this.mFragments.u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.h(e.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(r rVar) {
        androidx.core.app.c.t(this, rVar);
    }

    public void setExitSharedElementCallback(r rVar) {
        androidx.core.app.c.u(this, rVar);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            androidx.core.app.c.w(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i2, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 == -1) {
            androidx.core.app.c.x(this, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.c.o(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.c.q(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.c.y(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }
}
