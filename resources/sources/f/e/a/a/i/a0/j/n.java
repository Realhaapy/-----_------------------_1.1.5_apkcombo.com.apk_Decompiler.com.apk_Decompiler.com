package f.e.a.a.i.a0.j;

import android.database.sqlite.SQLiteDatabase;
import f.e.a.a.i.a0.j.r0;
import f.e.a.a.i.x.a.a;
import java.util.Map;

public final /* synthetic */ class n implements r0.b {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0103a f3767d;

    public /* synthetic */ n(r0 r0Var, String str, Map map, a.C0103a aVar) {
        this.a = r0Var;
        this.b = str;
        this.c = map;
        this.f3767d = aVar;
    }

    public final Object a(Object obj) {
        return this.a.r0(this.b, this.c, this.f3767d, (SQLiteDatabase) obj);
    }
}
