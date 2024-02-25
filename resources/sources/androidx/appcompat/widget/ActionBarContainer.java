package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import e.a.f;
import e.a.j;
import e.f.r.y;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private boolean f402e;

    /* renamed from: f  reason: collision with root package name */
    private View f403f;

    /* renamed from: g  reason: collision with root package name */
    private View f404g;

    /* renamed from: h  reason: collision with root package name */
    private View f405h;

    /* renamed from: i  reason: collision with root package name */
    Drawable f406i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f407j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f408k;

    /* renamed from: l  reason: collision with root package name */
    boolean f409l;

    /* renamed from: m  reason: collision with root package name */
    boolean f410m;

    /* renamed from: n  reason: collision with root package name */
    private int f411n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y.T(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a);
        this.f406i = obtainStyledAttributes.getDrawable(j.b);
        this.f407j = obtainStyledAttributes.getDrawable(j.f3101d);
        this.f411n = obtainStyledAttributes.getDimensionPixelSize(j.f3107j, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.f409l = true;
            this.f408k = obtainStyledAttributes.getDrawable(j.c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f409l ? !(this.f406i == null && this.f407j == null) : this.f408k != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f406i;
        if (drawable != null && drawable.isStateful()) {
            this.f406i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f407j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f407j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f408k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f408k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f403f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f406i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f407j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f408k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f404g = findViewById(f.action_bar);
        this.f405h = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f402e || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f403f;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f409l) {
            Drawable drawable3 = this.f408k;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f406i != null) {
                if (this.f404g.getVisibility() == 0) {
                    drawable2 = this.f406i;
                    left = this.f404g.getLeft();
                    top = this.f404g.getTop();
                    right = this.f404g.getRight();
                    view = this.f404g;
                } else {
                    View view3 = this.f405h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f406i.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f406i;
                        left = this.f405h.getLeft();
                        top = this.f405h.getTop();
                        right = this.f405h.getRight();
                        view = this.f405h;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f410m = z4;
            if (!z4 || (drawable = this.f407j) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f404g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f411n
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f404g
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f403f
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f404g
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f404g
        L_0x0042:
            int r0 = r3.a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f405h
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f405h
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f403f
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f406i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f406i);
        }
        this.f406i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f404g;
            if (view != null) {
                this.f406i.setBounds(view.getLeft(), this.f404g.getTop(), this.f404g.getRight(), this.f404g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f409l ? !(this.f406i == null && this.f407j == null) : this.f408k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f408k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f408k);
        }
        this.f408k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f409l && (drawable2 = this.f408k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f409l ? this.f406i == null && this.f407j == null : this.f408k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f407j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f407j);
        }
        this.f407j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f410m && (drawable2 = this.f407j) != null) {
                drawable2.setBounds(this.f403f.getLeft(), this.f403f.getTop(), this.f403f.getRight(), this.f403f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f409l ? !(this.f406i == null && this.f407j == null) : this.f408k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f403f;
        if (view != null) {
            removeView(view);
        }
        this.f403f = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f402e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f406i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f407j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f408k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f406i && !this.f409l) || (drawable == this.f407j && this.f410m) || ((drawable == this.f408k && this.f409l) || super.verifyDrawable(drawable));
    }
}
