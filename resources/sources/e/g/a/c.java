package e.g.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    private int f3453m;

    /* renamed from: n  reason: collision with root package name */
    private int f3454n;

    /* renamed from: o  reason: collision with root package name */
    private LayoutInflater f3455o;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f3454n = i2;
        this.f3453m = i2;
        this.f3455o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3455o.inflate(this.f3454n, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3455o.inflate(this.f3453m, viewGroup, false);
    }
}
