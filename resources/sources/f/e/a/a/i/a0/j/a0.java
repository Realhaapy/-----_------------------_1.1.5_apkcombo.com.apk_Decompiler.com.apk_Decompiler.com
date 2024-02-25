package f.e.a.a.i.a0.j;

import android.database.sqlite.SQLiteDatabase;
import f.e.a.a.i.a0.j.t0;

public final /* synthetic */ class a0 implements t0.a {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
