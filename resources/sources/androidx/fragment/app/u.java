package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c0;
import androidx.lifecycle.e;
import androidx.lifecycle.v;
import e.f.r.y;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

class u {
    private final m a;
    private final v b;
    private final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1117d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f1118e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f1119e;

        a(u uVar, View view) {
            this.f1119e = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f1119e.removeOnAttachStateChangeListener(this);
            y.P(this.f1119e);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.e$c[] r0 = androidx.lifecycle.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.lifecycle.e$c r1 = androidx.lifecycle.e.c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.e.c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.e.c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.e.c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b.<clinit>():void");
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = tVar.f1116q;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.a = mVar;
        this.b = vVar;
        Fragment a2 = jVar.a(classLoader, tVar.f1104e);
        this.c = a2;
        Bundle bundle = tVar.f1113n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(tVar.f1113n);
        a2.mWho = tVar.f1105f;
        a2.mFromLayout = tVar.f1106g;
        a2.mRestored = true;
        a2.mFragmentId = tVar.f1107h;
        a2.mContainerId = tVar.f1108i;
        a2.mTag = tVar.f1109j;
        a2.mRetainInstance = tVar.f1110k;
        a2.mRemoving = tVar.f1111l;
        a2.mDetached = tVar.f1112m;
        a2.mHidden = tVar.f1114o;
        a2.mMaxState = e.c.values()[tVar.f1115p];
        Bundle bundle2 = tVar.f1116q;
        a2.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (n.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    private boolean l(View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.mView != null) {
            s();
        }
        if (this.c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
        }
        if (this.c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        if (!this.c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        m mVar = this.a;
        Fragment fragment2 = this.c;
        mVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j2 = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.mContainer.addView(fragment.mView, j2);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        u uVar = null;
        if (fragment2 != null) {
            u m2 = this.b.m(fragment2.mWho);
            if (m2 != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                uVar = m2;
            } else {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (uVar = this.b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().mState < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.mHost = fragment4.mFragmentManager.t0();
        Fragment fragment5 = this.c;
        fragment5.mParentFragment = fragment5.mFragmentManager.w0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i2 = this.f1118e;
        int i3 = b.a[fragment2.mMaxState.ordinal()];
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(i2, -1) : Math.min(i2, 0) : Math.min(i2, 1) : Math.min(i2, 5);
        }
        Fragment fragment3 = this.c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i2 = Math.max(this.f1118e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f1118e < 4 ? Math.min(i2, fragment3.mState) : Math.min(i2, 1);
            }
        }
        if (!this.c.mAdded) {
            i2 = Math.min(i2, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = fragment.mContainer) != null) {
            bVar = c0.n(viewGroup, (fragment = this.c).getParentFragmentManager()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.mRemoving) {
                i2 = fragment4.isInBackStack() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + this.c);
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            m mVar = this.a;
            Fragment fragment3 = this.c;
            mVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.c.mFromLayout) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment = this.c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i2 = fragment2.mContainerId;
                if (i2 != 0) {
                    if (i2 != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.o0().c(this.c.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.mContainerId) + " (" + str + ") for fragment " + this.c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.c;
                fragment5.mView.setTag(e.j.b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (y.C(this.c.mView)) {
                    y.P(this.c.mView);
                } else {
                    View view2 = this.c.mView;
                    view2.addOnAttachStateChangeListener(new a(this, view2));
                }
                this.c.performViewCreated();
                m mVar = this.a;
                Fragment fragment7 = this.c;
                mVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.c.mView.getVisibility();
                float alpha = this.c.mView.getAlpha();
                if (n.P) {
                    this.c.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.c;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.c.setFocusedView(findFocus);
                            if (n.F0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                            }
                        }
                        this.c.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.c;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z = true;
                    }
                    fragment9.mIsNewlyAdded = z;
                }
            }
            this.c.mState = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment f2;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.b.o().p(this.c)) {
            k<?> kVar = this.c.mHost;
            if (kVar instanceof v) {
                z = this.b.o().m();
            } else if (kVar.f() instanceof Activity) {
                z = true ^ ((Activity) kVar.f()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.b.o().g(this.c);
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            for (u next : this.b.k()) {
                if (next != null) {
                    Fragment k2 = next.k();
                    if (this.c.mWho.equals(k2.mTargetWho)) {
                        k2.mTarget = this.c;
                        k2.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.b.f(str);
            }
            this.b.q(this);
            return;
        }
        String str2 = this.c.mTargetWho;
        if (!(str2 == null || (f2 = this.b.f(str2)) == null || !f2.mRetainInstance)) {
            this.c.mTarget = f2;
        }
        this.c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.j(null);
        this.c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.performDetach();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.b.o().p(this.c)) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(e.j.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                m mVar = this.a;
                Fragment fragment5 = this.c;
                mVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f1117d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d2 = d();
                    Fragment fragment = this.c;
                    int i2 = fragment.mState;
                    if (d2 != i2) {
                        if (d2 <= i2) {
                            switch (i2 - 1) {
                                case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.c.mState = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (n.F0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                    }
                                    Fragment fragment2 = this.c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        s();
                                    }
                                    Fragment fragment3 = this.c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        c0.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                    }
                                    this.c.mState = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        c0.n(viewGroup3, fragment.getParentFragmentManager()).b(c0.e.c.c(this.c.mView.getVisibility()), this);
                                    }
                                    this.c.mState = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (n.P && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                c0 n2 = c0.n(viewGroup, fragment.getParentFragmentManager());
                                if (this.c.mHidden) {
                                    n2.c(this);
                                } else {
                                    n2.e(this);
                                }
                            }
                            Fragment fragment4 = this.c;
                            n nVar = fragment4.mFragmentManager;
                            if (nVar != null) {
                                nVar.D0(fragment4);
                            }
                            Fragment fragment5 = this.c;
                            fragment5.mHiddenChanged = z;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f1117d = z;
                        return;
                    }
                }
            } finally {
                this.f1117d = z;
            }
        } else if (n.F0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.setFocusedView((View) null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.c);
        Fragment fragment = this.c;
        if (fragment.mState <= -1 || tVar.f1116q != null) {
            tVar.f1116q = fragment.mSavedFragmentState;
        } else {
            Bundle q2 = q();
            tVar.f1116q = q2;
            if (this.c.mTargetWho != null) {
                if (q2 == null) {
                    tVar.f1116q = new Bundle();
                }
                tVar.f1116q.putString("android:target_state", this.c.mTargetWho);
                int i2 = this.c.mTargetRequestCode;
                if (i2 != 0) {
                    tVar.f1116q.putInt("android:target_req_state", i2);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i2) {
        this.f1118e = i2;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }
}
