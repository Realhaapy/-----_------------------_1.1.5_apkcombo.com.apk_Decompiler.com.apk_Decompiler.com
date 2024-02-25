package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import e.a.l.a.c;
import e.f.r.c0;
import java.lang.reflect.Field;

class f0 extends ListView {

    /* renamed from: e  reason: collision with root package name */
    private final Rect f547e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f548f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f549g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f550h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f551i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f552j;

    /* renamed from: k  reason: collision with root package name */
    private Field f553k;

    /* renamed from: l  reason: collision with root package name */
    private a f554l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f555m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f556n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f557o;

    /* renamed from: p  reason: collision with root package name */
    private c0 f558p;

    /* renamed from: q  reason: collision with root package name */
    private f f559q;

    /* renamed from: r  reason: collision with root package name */
    b f560r;

    private static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        private boolean f561f = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z) {
            this.f561f = z;
        }

        public void draw(Canvas canvas) {
            if (this.f561f) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f2, float f3) {
            if (this.f561f) {
                super.setHotspot(f2, f3);
            }
        }

        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f561f) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f561f) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f561f) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.f560r = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.f560r = null;
            f0Var.drawableStateChanged();
        }
    }

    f0(Context context, boolean z) {
        super(context, (AttributeSet) null, e.a.a.dropDownListViewStyle);
        this.f556n = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f553k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.f557o = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f552j - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        c0 c0Var = this.f558p;
        if (c0Var != null) {
            c0Var.b();
            this.f558p = null;
        }
    }

    private void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f547e.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f547e);
            selector.draw(canvas);
        }
    }

    private void f(int i2, View view) {
        Rect rect = this.f547e;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f548f;
        rect.top -= this.f549g;
        rect.right += this.f550h;
        rect.bottom += this.f551i;
        try {
            boolean z = this.f553k.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f553k.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void g(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z2) {
            Rect rect = this.f547e;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.j(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i2, View view, float f2, float f3) {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            androidx.core.graphics.drawable.a.j(selector, f2, f3);
        }
    }

    private void i(View view, int i2, float f2, float f3) {
        View childAt;
        this.f557o = true;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f552j;
        if (!(i4 == -1 || (childAt = getChildAt(i4 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f552j = i2;
        float left = f2 - ((float) view.getLeft());
        float top = f3 - ((float) view.getTop());
        if (i3 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f557o;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f554l;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i2, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || i7 == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f560r == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f559q
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f559q = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f559q
            r9.m(r2)
            androidx.core.widget.f r9 = r7.f559q
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f559q
            if (r8 == 0) goto L_0x006c
            r8.m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f556n || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f556n || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f556n || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f556n && this.f555m) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f560r = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f560r == null) {
            b bVar = new b();
            this.f560r = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f552j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f560r;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f555m = z;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f554l = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f548f = rect.left;
        this.f549g = rect.top;
        this.f550h = rect.right;
        this.f551i = rect.bottom;
    }
}
