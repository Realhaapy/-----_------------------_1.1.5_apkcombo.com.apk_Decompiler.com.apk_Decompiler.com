package e.g.a;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {
    a a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d2 = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d2 != null) {
            filterResults.count = d2.getCount();
        } else {
            filterResults.count = 0;
            d2 = null;
        }
        filterResults.values = d2;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.a.a((Cursor) obj);
        }
    }
}
