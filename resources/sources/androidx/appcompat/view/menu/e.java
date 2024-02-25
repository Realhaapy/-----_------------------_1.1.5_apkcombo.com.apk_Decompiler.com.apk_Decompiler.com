package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import e.a.g;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    Context f316e;

    /* renamed from: f  reason: collision with root package name */
    LayoutInflater f317f;

    /* renamed from: g  reason: collision with root package name */
    g f318g;

    /* renamed from: h  reason: collision with root package name */
    ExpandedMenuView f319h;

    /* renamed from: i  reason: collision with root package name */
    int f320i;

    /* renamed from: j  reason: collision with root package name */
    int f321j;

    /* renamed from: k  reason: collision with root package name */
    int f322k;

    /* renamed from: l  reason: collision with root package name */
    private m.a f323l;

    /* renamed from: m  reason: collision with root package name */
    a f324m;

    private class a extends BaseAdapter {

        /* renamed from: e  reason: collision with root package name */
        private int f325e = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i v = e.this.f318g.v();
            if (v != null) {
                ArrayList<i> z = e.this.f318g.z();
                int size = z.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (z.get(i2) == v) {
                        this.f325e = i2;
                        return;
                    }
                }
            }
            this.f325e = -1;
        }

        /* renamed from: b */
        public i getItem(int i2) {
            ArrayList<i> z = e.this.f318g.z();
            int i3 = i2 + e.this.f320i;
            int i4 = this.f325e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return z.get(i3);
        }

        public int getCount() {
            int size = e.this.f318g.z().size() - e.this.f320i;
            return this.f325e < 0 ? size : size - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f317f.inflate(eVar.f322k, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.f322k = i2;
        this.f321j = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f316e = context;
        this.f317f = LayoutInflater.from(context);
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f323l;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.f324m == null) {
            this.f324m = new a();
        }
        return this.f324m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f321j
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f321j
            r0.<init>(r3, r1)
            r2.f316e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f317f = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f316e
            if (r0 == 0) goto L_0x0023
            r2.f316e = r3
            android.view.LayoutInflater r0 = r2.f317f
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f318g = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f324m
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public boolean d(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d((IBinder) null);
        m.a aVar = this.f323l;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    public void e(boolean z) {
        a aVar = this.f324m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n f(ViewGroup viewGroup) {
        if (this.f319h == null) {
            this.f319h = (ExpandedMenuView) this.f317f.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f324m == null) {
                this.f324m = new a();
            }
            this.f319h.setAdapter(this.f324m);
            this.f319h.setOnItemClickListener(this);
        }
        return this.f319h;
    }

    public boolean g() {
        return false;
    }

    public boolean h(g gVar, i iVar) {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public void j(m.a aVar) {
        this.f323l = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f318g.M(this.f324m.getItem(i2), this, 0);
    }
}
