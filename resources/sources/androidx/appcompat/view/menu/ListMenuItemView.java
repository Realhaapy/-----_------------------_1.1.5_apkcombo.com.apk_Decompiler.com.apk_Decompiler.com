package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;
import e.a.a;
import e.a.f;
import e.a.g;
import e.a.j;
import e.f.r.y;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e  reason: collision with root package name */
    private i f256e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f257f;

    /* renamed from: g  reason: collision with root package name */
    private RadioButton f258g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f259h;

    /* renamed from: i  reason: collision with root package name */
    private CheckBox f260i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f261j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f262k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f263l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f264m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f265n;

    /* renamed from: o  reason: collision with root package name */
    private int f266o;

    /* renamed from: p  reason: collision with root package name */
    private Context f267p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f268q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f269r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f270s;
    private LayoutInflater t;
    private boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 u2 = w0.u(getContext(), attributeSet, j.I1, i2, 0);
        this.f265n = u2.f(j.K1);
        this.f266o = u2.m(j.J1, -1);
        this.f268q = u2.a(j.L1, false);
        this.f267p = context;
        this.f269r = u2.f(j.M1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.f270s = obtainStyledAttributes.hasValue(0);
        u2.v();
        obtainStyledAttributes.recycle();
    }

    private void b(View view) {
        c(view, -1);
    }

    private void c(View view, int i2) {
        LinearLayout linearLayout = this.f264m;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f260i = checkBox;
        b(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        this.f257f = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f258g = radioButton;
        b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f262k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public boolean a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f263l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f263l.getLayoutParams();
            rect.top += this.f263l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void d(i iVar, int i2) {
        this.f256e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.f256e;
    }

    public void h(boolean z, char c) {
        int i2 = (!z || !this.f256e.A()) ? 8 : 0;
        if (i2 == 0) {
            this.f261j.setText(this.f256e.h());
        }
        if (this.f261j.getVisibility() != i2) {
            this.f261j.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        y.T(this, this.f265n);
        TextView textView = (TextView) findViewById(f.M);
        this.f259h = textView;
        int i2 = this.f266o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f267p, i2);
        }
        this.f261j = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f262k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f269r);
        }
        this.f263l = (ImageView) findViewById(f.group_divider);
        this.f264m = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f257f != null && this.f268q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f257f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f258g != null || this.f260i != null) {
            if (this.f256e.m()) {
                if (this.f258g == null) {
                    g();
                }
                compoundButton2 = this.f258g;
                compoundButton = this.f260i;
            } else {
                if (this.f260i == null) {
                    e();
                }
                compoundButton2 = this.f260i;
                compoundButton = this.f258g;
            }
            if (z) {
                compoundButton2.setChecked(this.f256e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f260i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f258g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f256e.m()) {
            if (this.f258g == null) {
                g();
            }
            compoundButton = this.f258g;
        } else {
            if (this.f260i == null) {
                e();
            }
            compoundButton = this.f260i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.f268q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f263l;
        if (imageView != null) {
            imageView.setVisibility((this.f270s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f256e.z() || this.u;
        if (z || this.f268q) {
            ImageView imageView = this.f257f;
            if (imageView != null || drawable != null || this.f268q) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f268q) {
                    ImageView imageView2 = this.f257f;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f257f.getVisibility() != 0) {
                        this.f257f.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f257f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f259h.setText(charSequence);
            if (this.f259h.getVisibility() != 0) {
                textView = this.f259h;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f259h.getVisibility() != 8) {
                textView = this.f259h;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
