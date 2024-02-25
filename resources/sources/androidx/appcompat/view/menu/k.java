package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    private Rect f373e;

    k() {
    }

    protected static int n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    protected static boolean w(g gVar) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    public void c(Context context, g gVar) {
    }

    public boolean h(g gVar, i iVar) {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public abstract void k(g gVar);

    /* access modifiers changed from: protected */
    public boolean l() {
        return true;
    }

    public Rect m() {
        return this.f373e;
    }

    public abstract void o(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        x(listAdapter).f327e.M((MenuItem) listAdapter.getItem(i2), this, l() ? 0 : 4);
    }

    public void p(Rect rect) {
        this.f373e = rect;
    }

    public abstract void q(boolean z);

    public abstract void r(int i2);

    public abstract void s(int i2);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z);

    public abstract void v(int i2);
}
