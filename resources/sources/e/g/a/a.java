package e.g.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.g.a.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3445e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f3446f;

    /* renamed from: g  reason: collision with root package name */
    protected Cursor f3447g;

    /* renamed from: h  reason: collision with root package name */
    protected Context f3448h;

    /* renamed from: i  reason: collision with root package name */
    protected int f3449i;

    /* renamed from: j  reason: collision with root package name */
    protected C0084a f3450j;

    /* renamed from: k  reason: collision with root package name */
    protected DataSetObserver f3451k;

    /* renamed from: l  reason: collision with root package name */
    protected b f3452l;

    /* renamed from: e.g.a.a$a  reason: collision with other inner class name */
    private class C0084a extends ContentObserver {
        C0084a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f3445e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3445e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j2 = j(cursor);
        if (j2 != null) {
            j2.close();
        }
    }

    public Cursor b() {
        return this.f3447g;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i2) {
        b bVar;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f3446f = true;
        } else {
            this.f3446f = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f3447g = cursor;
        this.f3445e = z;
        this.f3448h = context;
        this.f3449i = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f3450j = new C0084a();
            bVar = new b();
        } else {
            bVar = null;
            this.f3450j = null;
        }
        this.f3451k = bVar;
        if (z) {
            C0084a aVar = this.f3450j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3451k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f3445e || (cursor = this.f3447g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3445e) {
            return null;
        }
        this.f3447g.moveToPosition(i2);
        if (view == null) {
            view = g(this.f3448h, this.f3447g, viewGroup);
        }
        e(view, this.f3448h, this.f3447g);
        return view;
    }

    public Filter getFilter() {
        if (this.f3452l == null) {
            this.f3452l = new b(this);
        }
        return this.f3452l;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f3445e || (cursor = this.f3447g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f3447g;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f3445e || (cursor = this.f3447g) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f3447g.getLong(this.f3449i);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3445e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3447g.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f3448h, this.f3447g, viewGroup);
            }
            e(view, this.f3448h, this.f3447g);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f3446f && (cursor = this.f3447g) != null && !cursor.isClosed()) {
            this.f3445e = this.f3447g.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f3447g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0084a aVar = this.f3450j;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3451k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3447g = cursor;
        if (cursor != null) {
            C0084a aVar2 = this.f3450j;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f3451k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3449i = cursor.getColumnIndexOrThrow("_id");
            this.f3445e = true;
            notifyDataSetChanged();
        } else {
            this.f3449i = -1;
            this.f3445e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
