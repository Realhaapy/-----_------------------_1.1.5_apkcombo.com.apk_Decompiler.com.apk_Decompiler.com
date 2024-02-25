package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.f.j.f.j;

public class w0 {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private w0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static w0 s(Context context, int i2, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static w0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.b.getColor(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = e.a.k.a.a.c(r2.a, (r0 = r2.b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.a
            android.content.res.ColorStateList r0 = e.a.k.a.a.c(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.c(int):android.content.res.ColorStateList");
    }

    public int d(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.a
            android.graphics.drawable.Drawable r3 = e.a.k.a.a.d(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.f(int):android.graphics.drawable.Drawable");
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, j.e eVar) {
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return j.e(this.a, resourceId, this.c, i3, eVar);
    }

    public int j(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.b.getTextArray(i2);
    }

    public TypedArray q() {
        return this.b;
    }

    public boolean r(int i2) {
        return this.b.hasValue(i2);
    }

    public void v() {
        this.b.recycle();
    }
}
