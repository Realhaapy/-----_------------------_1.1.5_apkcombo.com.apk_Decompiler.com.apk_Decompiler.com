package f.h.a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

class a {
    final boolean a;
    final String b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final int f4583d;

    /* renamed from: e  reason: collision with root package name */
    SQLiteDatabase f4584e;

    /* renamed from: f  reason: collision with root package name */
    boolean f4585f;

    /* renamed from: f.h.a.a$a  reason: collision with other inner class name */
    class C0133a implements DatabaseErrorHandler {
        C0133a(a aVar) {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    a(String str, int i2, boolean z, int i3) {
        this.b = str;
        this.a = z;
        this.c = i2;
        this.f4583d = i3;
    }

    static void b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void a() {
        this.f4584e.close();
    }

    public SQLiteDatabase c() {
        return this.f4584e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return "[" + e() + "] ";
    }

    /* access modifiers changed from: package-private */
    public String e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase f() {
        return this.f4584e;
    }

    public void g() {
        this.f4584e = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase.CursorFactory) null, 268435456);
    }

    public void h() {
        this.f4584e = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase.CursorFactory) null, 1, new C0133a(this));
    }
}
