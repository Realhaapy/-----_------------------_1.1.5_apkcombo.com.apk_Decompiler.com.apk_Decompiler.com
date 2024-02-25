package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.activity.result.e;
import androidx.activity.result.f.a;
import androidx.core.app.i;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends i implements h, v, androidx.savedstate.c, c, d {
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final androidx.activity.d.a mContextAwareHelper;
    private t.b mDefaultFactory;
    private final androidx.lifecycle.i mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final androidx.savedstate.b mSavedStateRegistryController;
    private u mViewModelStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f62e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a.C0007a f63f;

            a(int i2, a.C0007a aVar) {
                this.f62e = i2;
                this.f63f = aVar;
            }

            public void run() {
                b.this.c(this.f62e, this.f63f.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class C0005b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f65e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f66f;

            C0005b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f65e = i2;
                this.f66f = sendIntentException;
            }

            public void run() {
                b.this.b(this.f65e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f66f));
            }
        }

        b() {
        }

        public <I, O> void f(int i2, androidx.activity.result.f.a<I, O> aVar, I i3, androidx.core.app.d dVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0007a<O> b = aVar.b(componentActivity, i3);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else if (dVar == null) {
                bundle = null;
            } else {
                dVar.a();
                throw null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.c.s(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                e eVar = (e) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.c.x(componentActivity, eVar.d(), i2, eVar.a(), eVar.b(), eVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new C0005b(i2, e2));
                }
            } else {
                androidx.core.app.c.w(componentActivity, a2, i2, bundle);
            }
        }
    }

    static final class c {
        Object a;
        u b;

        c() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new androidx.activity.d.a();
        this.mLifecycleRegistry = new androidx.lifecycle.i(this);
        this.mSavedStateRegistryController = androidx.savedstate.b.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                getLifecycle().a(new f() {
                    public void a(h hVar, e.b bVar) {
                        if (bVar == e.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new f() {
                public void a(h hVar, e.b bVar) {
                    if (bVar == e.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new f() {
                public void a(h hVar, e.b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (19 <= i2 && i2 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    private void initViewTreeOwners() {
        w.a(getWindow().getDecorView(), this);
        x.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(androidx.activity.d.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new u();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public t.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new r(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public androidx.lifecycle.e getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public u getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.mActivityResultRegistry.b(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.g(bundle);
        p.f(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        u uVar = this.mViewModelStore;
        if (uVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            uVar = cVar.b;
        }
        if (uVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = onRetainCustomNonConfigurationInstance;
        cVar2.b = uVar;
        return cVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.e lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.i) {
            ((androidx.lifecycle.i) lifecycle).o(e.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        this.mActivityResultRegistry.h(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(androidx.activity.result.f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(androidx.activity.result.f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public final void removeOnContextAvailableListener(androidx.activity.d.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public void reportFullyDrawn() {
        try {
            if (e.p.a.d()) {
                e.p.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19 || (i2 == 19 && e.f.j.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            e.p.a.b();
        }
    }

    public void setContentView(int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
