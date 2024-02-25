package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import e.a.j;
import e.f.r.c0;
import e.f.r.d0;
import e.f.r.y;

abstract class a extends ViewGroup {

    /* renamed from: e  reason: collision with root package name */
    protected final C0011a f500e;

    /* renamed from: f  reason: collision with root package name */
    protected final Context f501f;

    /* renamed from: g  reason: collision with root package name */
    protected ActionMenuView f502g;

    /* renamed from: h  reason: collision with root package name */
    protected c f503h;

    /* renamed from: i  reason: collision with root package name */
    protected int f504i;

    /* renamed from: j  reason: collision with root package name */
    protected c0 f505j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f506k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f507l;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0011a implements d0 {
        private boolean a = false;
        int b;

        protected C0011a() {
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f505j = null;
                a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0011a d(c0 c0Var, int i2) {
            a.this.f505j = c0Var;
            this.b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f500e = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f501f = context;
        } else {
            this.f501f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public c0 f(int i2, long j2) {
        c0 c0Var = this.f505j;
        if (c0Var != null) {
            c0Var.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            c0 b = y.b(this);
            b.a(1.0f);
            b.e(j2);
            C0011a aVar = this.f500e;
            aVar.d(b, i2);
            b.g(aVar);
            return b;
        }
        c0 b2 = y.b(this);
        b2.a(0.0f);
        b2.e(j2);
        C0011a aVar2 = this.f500e;
        aVar2.d(b2, i2);
        b2.g(aVar2);
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f505j != null ? this.f500e.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f504i;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.a, e.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f3107j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f503h;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f507l = false;
        }
        if (!this.f507l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f507l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f507l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f506k = false;
        }
        if (!this.f506k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f506k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f506k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            c0 c0Var = this.f505j;
            if (c0Var != null) {
                c0Var.b();
            }
            super.setVisibility(i2);
        }
    }
}
