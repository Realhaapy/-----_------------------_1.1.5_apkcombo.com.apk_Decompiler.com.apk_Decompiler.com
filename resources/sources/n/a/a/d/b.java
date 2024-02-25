package n.a.a.d;

import android.database.Cursor;

public class b {
    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
