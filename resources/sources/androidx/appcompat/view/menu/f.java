package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    g f327e;

    /* renamed from: f  reason: collision with root package name */
    private int f328f = -1;

    /* renamed from: g  reason: collision with root package name */
    private boolean f329g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f330h;

    /* renamed from: i  reason: collision with root package name */
    private final LayoutInflater f331i;

    /* renamed from: j  reason: collision with root package name */
    private final int f332j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f330h = z;
        this.f331i = layoutInflater;
        this.f327e = gVar;
        this.f332j = i2;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i v = this.f327e.v();
        if (v != null) {
            ArrayList<i> z = this.f327e.z();
            int size = z.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z.get(i2) == v) {
                    this.f328f = i2;
                    return;
                }
            }
        }
        this.f328f = -1;
    }

    public g b() {
        return this.f327e;
    }

    /* renamed from: c */
    public i getItem(int i2) {
        ArrayList<i> z = this.f330h ? this.f327e.z() : this.f327e.E();
        int i3 = this.f328f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return z.get(i2);
    }

    public void d(boolean z) {
        this.f329g = z;
    }

    public int getCount() {
        ArrayList<i> z = this.f330h ? this.f327e.z() : this.f327e.E();
        int i2 = this.f328f;
        int size = z.size();
        return i2 < 0 ? size : size - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f331i.inflate(this.f332j, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f327e.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f329g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
