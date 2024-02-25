package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import e.d.b;
import e.d.d;
import e.d.e;

public class CardView extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f757l = {16842801};

    /* renamed from: m  reason: collision with root package name */
    private static final e f758m;

    /* renamed from: e  reason: collision with root package name */
    private boolean f759e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f760f;

    /* renamed from: g  reason: collision with root package name */
    int f761g;

    /* renamed from: h  reason: collision with root package name */
    int f762h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f763i;

    /* renamed from: j  reason: collision with root package name */
    final Rect f764j;

    /* renamed from: k  reason: collision with root package name */
    private final d f765k;

    class a implements d {
        private Drawable a;

        a() {
        }

        public View a() {
            return CardView.this;
        }

        public void b(int i2, int i3, int i4, int i5) {
            CardView.this.f764j.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f763i;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        public void c(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f761g) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f762h) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        public void d(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean f() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable g() {
            return this.a;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f758m = i2 >= 21 ? new b() : i2 >= 17 ? new a() : new c();
        f758m.f();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.d.a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources;
        int i3;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f763i = rect;
        this.f764j = new Rect();
        a aVar = new a();
        this.f765k = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a, i2, d.CardView);
        int i4 = e.f3232d;
        if (obtainStyledAttributes.hasValue(i4)) {
            valueOf = obtainStyledAttributes.getColorStateList(i4);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f757l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = b.cardview_light_background;
            } else {
                resources = getResources();
                i3 = b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(e.f3233e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.f3234f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.f3235g, 0.0f);
        this.f759e = obtainStyledAttributes.getBoolean(e.f3237i, false);
        this.f760f = obtainStyledAttributes.getBoolean(e.f3236h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.f3238j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(e.f3240l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(e.f3242n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(e.f3241m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(e.f3239k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f761g = obtainStyledAttributes.getDimensionPixelSize(e.b, 0);
        this.f762h = obtainStyledAttributes.getDimensionPixelSize(e.c, 0);
        obtainStyledAttributes.recycle();
        f758m.c(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return f758m.b(this.f765k);
    }

    public float getCardElevation() {
        return f758m.e(this.f765k);
    }

    public int getContentPaddingBottom() {
        return this.f763i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f763i.left;
    }

    public int getContentPaddingRight() {
        return this.f763i.right;
    }

    public int getContentPaddingTop() {
        return this.f763i.top;
    }

    public float getMaxCardElevation() {
        return f758m.a(this.f765k);
    }

    public boolean getPreventCornerOverlap() {
        return this.f760f;
    }

    public float getRadius() {
        return f758m.g(this.f765k);
    }

    public boolean getUseCompatPadding() {
        return this.f759e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        e eVar = f758m;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.i(this.f765k)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.h(this.f765k)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f758m.m(this.f765k, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f758m.m(this.f765k, colorStateList);
    }

    public void setCardElevation(float f2) {
        f758m.k(this.f765k, f2);
    }

    public void setMaxCardElevation(float f2) {
        f758m.n(this.f765k, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f762h = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.f761g = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f760f) {
            this.f760f = z;
            f758m.l(this.f765k);
        }
    }

    public void setRadius(float f2) {
        f758m.d(this.f765k, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f759e != z) {
            this.f759e = z;
            f758m.j(this.f765k);
        }
    }
}
