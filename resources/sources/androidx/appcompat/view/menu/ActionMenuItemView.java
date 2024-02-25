package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z;
import e.a.j;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: j  reason: collision with root package name */
    i f242j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f243k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f244l;

    /* renamed from: m  reason: collision with root package name */
    g.b f245m;

    /* renamed from: n  reason: collision with root package name */
    private h0 f246n;

    /* renamed from: o  reason: collision with root package name */
    b f247o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f248p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f249q;

    /* renamed from: r  reason: collision with root package name */
    private int f250r;

    /* renamed from: s  reason: collision with root package name */
    private int f251s;
    private int t;

    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            b bVar = ActionMenuItemView.this.f247o;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f245m
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f242j
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f248p = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.v, i2, 0);
        this.f250r = obtainStyledAttributes.getDimensionPixelSize(j.w, 0);
        obtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f251s = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f243k);
        if (this.f244l != null && (!this.f242j.B() || (!this.f248p && !this.f249q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f243k : null);
        CharSequence contentDescription = this.f242j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f242j.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f242j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f242j.getTitle();
            }
            y0.a(this, charSequence);
            return;
        }
        y0.a(this, tooltipText);
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return f();
    }

    public boolean c() {
        return f() && this.f242j.getIcon() == null;
    }

    public void d(i iVar, int i2) {
        this.f242j = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f246n == null) {
            this.f246n = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public i getItemData() {
        return this.f242j;
    }

    public void onClick(View view) {
        g.b bVar = this.f245m;
        if (bVar != null) {
            bVar.a(this.f242j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f248p = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean f2 = f();
        if (f2 && (i4 = this.f251s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f250r) : this.f250r;
        if (mode != 1073741824 && this.f250r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!f2 && this.f244l != null) {
            super.setPadding((getMeasuredWidth() - this.f244l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f242j.hasSubMenu() || (h0Var = this.f246n) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f249q != z) {
            this.f249q = z;
            i iVar = this.f242j;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f244l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.t;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(g.b bVar) {
        this.f245m = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f251s = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f247o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f243k = charSequence;
        h();
    }
}
