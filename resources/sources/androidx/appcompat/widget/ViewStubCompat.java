package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.a.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: e  reason: collision with root package name */
    private int f495e;

    /* renamed from: f  reason: collision with root package name */
    private int f496f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f497g;

    /* renamed from: h  reason: collision with root package name */
    private LayoutInflater f498h;

    /* renamed from: i  reason: collision with root package name */
    private a f499i;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f495e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.p3, i2, 0);
        this.f496f = obtainStyledAttributes.getResourceId(j.s3, -1);
        this.f495e = obtainStyledAttributes.getResourceId(j.r3, 0);
        setId(obtainStyledAttributes.getResourceId(j.q3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f495e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f498h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f495e, viewGroup, false);
            int i2 = this.f496f;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f497g = new WeakReference<>(inflate);
            a aVar = this.f499i;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f496f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f498h;
    }

    public int getLayoutResource() {
        return this.f495e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f496f = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f498h = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f495e = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f499i = aVar;
    }

    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f497g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }
}
