package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: e  reason: collision with root package name */
    Runnable f642e;

    /* renamed from: f  reason: collision with root package name */
    private c f643f;

    /* renamed from: g  reason: collision with root package name */
    i0 f644g;

    /* renamed from: h  reason: collision with root package name */
    private Spinner f645h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f646i;

    /* renamed from: j  reason: collision with root package name */
    int f647j;

    /* renamed from: k  reason: collision with root package name */
    int f648k;

    /* renamed from: l  reason: collision with root package name */
    private int f649l;

    /* renamed from: m  reason: collision with root package name */
    private int f650m;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f651e;

        a(View view) {
            this.f651e = view;
        }

        public void run() {
            p0.this.smoothScrollTo(this.f651e.getLeft() - ((p0.this.getWidth() - this.f651e.getWidth()) / 2), 0);
            p0.this.f642e = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return p0.this.f644g.getChildCount();
        }

        public Object getItem(int i2) {
            return ((d) p0.this.f644g.getChildAt(i2)).b();
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f644g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = p0.this.f644g.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: e  reason: collision with root package name */
        private final int[] f655e;

        /* renamed from: f  reason: collision with root package name */
        private a.c f656f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f657g;

        /* renamed from: h  reason: collision with root package name */
        private ImageView f658h;

        /* renamed from: i  reason: collision with root package name */
        private View f659i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.p0.this = r5
                int r5 = e.a.a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f655e = r1
                r4.f656f = r7
                androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.w0.u(r6, r0, r1, r5, r3)
                boolean r6 = r5.r(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.v()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.d.<init>(androidx.appcompat.widget.p0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f656f = cVar;
            c();
        }

        public a.c b() {
            return this.f656f;
        }

        public void c() {
            a.c cVar = this.f656f;
            View b = cVar.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f659i = b;
                TextView textView = this.f657g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f658h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f658h.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f659i;
            if (view != null) {
                removeView(view);
                this.f659i = null;
            }
            Drawable c = cVar.c();
            CharSequence d2 = cVar.d();
            if (c != null) {
                if (this.f658h == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f658h = appCompatImageView;
                }
                this.f658h.setImageDrawable(c);
                this.f658h.setVisibility(0);
            } else {
                ImageView imageView2 = this.f658h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f658h.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f657g == null) {
                    z zVar = new z(getContext(), (AttributeSet) null, e.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f657g = zVar;
                }
                this.f657g.setText(d2);
                this.f657g.setVisibility(0);
            } else {
                TextView textView2 = this.f657g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f657g.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f658h;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            y0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (p0.this.f647j > 0 && getMeasuredWidth() > (i4 = p0.this.f647j)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), (AttributeSet) null, e.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f645h;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f645h == null) {
                this.f645h = b();
            }
            removeView(this.f644g);
            addView(this.f645h, new ViewGroup.LayoutParams(-2, -1));
            if (this.f645h.getAdapter() == null) {
                this.f645h.setAdapter(new b());
            }
            Runnable runnable = this.f642e;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f642e = null;
            }
            this.f645h.setSelection(this.f650m);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f645h);
        addView(this.f644g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f645h.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f644g.getChildAt(i2);
        Runnable runnable = this.f642e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f642e = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f649l));
        } else {
            dVar.setFocusable(true);
            if (this.f643f == null) {
                this.f643f = new c();
            }
            dVar.setOnClickListener(this.f643f);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f642e;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e.a.n.a b2 = e.a.n.a.b(getContext());
        setContentHeight(b2.f());
        this.f648k = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f642e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f644g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f647j = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f647j = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f647j, this.f648k);
        }
        this.f647j = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f649l, 1073741824);
        if (z2 || !this.f646i) {
            z = false;
        }
        if (z) {
            this.f644g.measure(0, makeMeasureSpec);
            if (this.f644g.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f650m);
                    return;
                }
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f646i = z;
    }

    public void setContentHeight(int i2) {
        this.f649l = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f650m = i2;
        int childCount = this.f644g.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f644g.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f645h;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
