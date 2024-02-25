package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f253g = {16842964, 16843049};

    /* renamed from: e  reason: collision with root package name */
    private g f254e;

    /* renamed from: f  reason: collision with root package name */
    private int f255f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 u = w0.u(context, attributeSet, f253g, i2, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.f(0));
        }
        if (u.r(1)) {
            setDivider(u.f(1));
        }
        u.v();
    }

    public boolean a(i iVar) {
        return this.f254e.L(iVar, 0);
    }

    public void b(g gVar) {
        this.f254e = gVar;
    }

    public int getWindowAnimations() {
        return this.f255f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((i) getAdapter().getItem(i2));
    }
}