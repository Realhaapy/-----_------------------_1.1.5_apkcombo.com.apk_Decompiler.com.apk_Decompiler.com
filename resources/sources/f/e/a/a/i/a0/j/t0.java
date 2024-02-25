package f.e.a.a.i.a0.j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

final class t0 extends SQLiteOpenHelper {

    /* renamed from: g  reason: collision with root package name */
    private static final String f3776g = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: h  reason: collision with root package name */
    static int f3777h = 5;

    /* renamed from: i  reason: collision with root package name */
    private static final a f3778i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f3779j;

    /* renamed from: k  reason: collision with root package name */
    private static final a f3780k;

    /* renamed from: l  reason: collision with root package name */
    private static final a f3781l;

    /* renamed from: m  reason: collision with root package name */
    private static final a f3782m;

    /* renamed from: n  reason: collision with root package name */
    private static final List<a> f3783n;

    /* renamed from: e  reason: collision with root package name */
    private final int f3784e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3785f = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        c0 c0Var = c0.a;
        f3778i = c0Var;
        z zVar = z.a;
        f3779j = zVar;
        a0 a0Var = a0.a;
        f3780k = a0Var;
        b0 b0Var = b0.a;
        f3781l = b0Var;
        d0 d0Var = d0.a;
        f3782m = d0Var;
        f3783n = Arrays.asList(new a[]{c0Var, zVar, a0Var, b0Var, d0Var});
    }

    t0(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f3784e = i2;
    }

    private void B(SQLiteDatabase sQLiteDatabase, int i2) {
        a(sQLiteDatabase);
        E(sQLiteDatabase, 0, i2);
    }

    private void E(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = f3783n;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f3783n.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f3785f) {
            onConfigure(sQLiteDatabase);
        }
    }

    static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    static /* synthetic */ void v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    static /* synthetic */ void z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f3776g);
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3785f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        B(sQLiteDatabase, this.f3784e);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        B(sQLiteDatabase, i3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        a(sQLiteDatabase);
        E(sQLiteDatabase, i2, i3);
    }
}
