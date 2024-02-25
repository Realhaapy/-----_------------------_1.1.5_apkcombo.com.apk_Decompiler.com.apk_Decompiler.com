package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import e.a.j;
import e.f.r.y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class a0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f508l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f509m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f510n = new ConcurrentHashMap<>();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f511d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f512e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f513f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f514g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f515h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f516i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f517j;

    /* renamed from: k  reason: collision with root package name */
    private final c f518k;

    private static class a extends c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) a0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    a0(TextView textView) {
        this.f516i = textView;
        this.f517j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.f518k = i2 >= 29 ? new b() : i2 >= 23 ? new a() : new c();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f513f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int[] iArr = this.f513f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f514g = z;
        if (z) {
            this.a = 1;
            this.f511d = (float) iArr[0];
            this.f512e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    private boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f516i.getText();
        TransformationMethod transformationMethod = this.f516i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f516i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f516i.getMaxLines() : -1;
        q(i2);
        StaticLayout e2 = e(text, (Layout.Alignment) r(this.f516i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e2.getLineCount() <= maxLines && e2.getLineEnd(e2.getLineCount() - 1) == text.length())) && ((float) e2.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f516i instanceof k);
    }

    private void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.f511d = f2;
            this.f512e = f3;
            this.c = f4;
            this.f514g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field o2 = o(str);
            return o2 == null ? t : o2.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private int[] c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.a = 0;
        this.f511d = -1.0f;
        this.f512e = -1.0f;
        this.c = -1.0f;
        this.f513f = new int[0];
        this.b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f515h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f516i.getLineSpacingExtra(), this.f516i.getLineSpacingMultiplier()).setIncludePad(this.f516i.getIncludeFontPadding()).setBreakStrategy(this.f516i.getBreakStrategy()).setHyphenationFrequency(this.f516i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f518k.a(obtain, this.f516i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f515h, i2, alignment, ((Float) a(this.f516i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f516i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f516i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f515h, i2, alignment, this.f516i.getLineSpacingMultiplier(), this.f516i.getLineSpacingExtra(), this.f516i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f513f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (C(this.f513f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f513f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Field o(String str) {
        try {
            Field field = f510n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f510n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f509m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f509m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t) {
        try {
            return p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void x(float f2) {
        if (f2 != this.f516i.getPaint().getTextSize()) {
            this.f516i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f516i.isInLayout() : false;
            if (this.f516i.getLayout() != null) {
                this.b = false;
                try {
                    Method p2 = p("nullLayouts");
                    if (p2 != null) {
                        p2.invoke(this.f516i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f516i.requestLayout();
                } else {
                    this.f516i.forceLayout();
                }
                this.f516i.invalidate();
            }
        }
    }

    private boolean z() {
        if (!D() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.f514g || this.f513f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f512e - this.f511d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f511d + (((float) i2) * this.c));
                }
                this.f513f = c(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (s()) {
            if (this.b) {
                if (this.f516i.getMeasuredHeight() > 0 && this.f516i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f518k.b(this.f516i) ? 1048576 : (this.f516i.getMeasuredWidth() - this.f516i.getTotalPaddingLeft()) - this.f516i.getTotalPaddingRight();
                    int height = (this.f516i.getHeight() - this.f516i.getCompoundPaddingBottom()) - this.f516i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f508l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float i2 = (float) i(rectF);
                            if (i2 != this.f516i.getTextSize()) {
                                y(0, i2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? f(charSequence, alignment, i2, i3) : i4 >= 16 ? h(charSequence, alignment, i2) : g(charSequence, alignment, i2);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f512e);
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f511d);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.c);
    }

    /* access modifiers changed from: package-private */
    public int[] m() {
        return this.f513f;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        TextPaint textPaint = this.f515h;
        if (textPaint == null) {
            this.f515h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f515h.set(this.f516i.getPaint());
        this.f515h.setTextSize((float) i2);
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.a != 0;
    }

    /* access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.f517j;
        int[] iArr = j.d0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f516i;
        y.Q(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = j.i0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.a = obtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = j.h0;
        float dimension = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = j.f0;
        float dimension2 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = j.e0;
        float dimension3 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = j.g0;
        if (obtainStyledAttributes.hasValue(i7) && (resourceId = obtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.a = 0;
        } else if (this.a == 1) {
            if (!this.f514g) {
                DisplayMetrics displayMetrics = this.f517j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i2, int i3, int i4, int i5) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f517j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int[] iArr, int i2) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f517j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f513f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f514g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i2) {
        if (!D()) {
            return;
        }
        if (i2 == 0) {
            d();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.f517j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i2, float f2) {
        Context context = this.f517j;
        x(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
