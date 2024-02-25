package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import e.f.r.g0;
import e.f.r.y;
import e.j.c;
import java.util.ArrayList;

public final class h extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<View> f1057e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<View> f1058f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f1059g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1060h = true;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f3487e);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f3488f) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f3489g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h0 = nVar.h0(id);
        if (classAttribute != null && h0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = nVar.q0().a(context.getClassLoader(), classAttribute);
            a.onInflate(context, attributeSet, (Bundle) null);
            w m2 = nVar.m();
            m2.l(true);
            m2.c(this, a, string);
            m2.h();
        }
        nVar.U0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f1058f;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1057e == null) {
                this.f1057e = new ArrayList<>();
            }
            this.f1057e.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (n.z0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (n.z0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        g0 u = g0.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1059g;
        g0 u2 = onApplyWindowInsetsListener != null ? g0.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : y.J(this, u);
        if (!u2.n()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                y.f(getChildAt(i2), u2);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f1060h && this.f1057e != null) {
            for (int i2 = 0; i2 < this.f1057e.size(); i2++) {
                super.drawChild(canvas, this.f1057e.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f1060h || (arrayList = this.f1057e) == null || arrayList.size() <= 0 || !this.f1057e.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1058f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1057e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1060h = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1060h = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1059g = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1058f == null) {
                this.f1058f = new ArrayList<>();
            }
            this.f1058f.add(view);
        }
        super.startViewTransition(view);
    }
}
