package f.e.a.a.i.a0.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import f.e.a.a.i.b0.b;
import f.e.a.a.i.i;
import f.e.a.a.i.j;
import f.e.a.a.i.p;
import f.e.a.a.i.x.a.a;
import f.e.a.a.i.x.a.b;
import f.e.a.a.i.x.a.c;
import f.e.a.a.i.x.a.d;
import f.e.a.a.i.x.a.e;
import f.e.a.a.i.x.a.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class r0 implements j0, f.e.a.a.i.b0.b, i0 {

    /* renamed from: j  reason: collision with root package name */
    private static final f.e.a.a.b f3768j = f.e.a.a.b.b("proto");

    /* renamed from: e  reason: collision with root package name */
    private final t0 f3769e;

    /* renamed from: f  reason: collision with root package name */
    private final f.e.a.a.i.c0.a f3770f;

    /* renamed from: g  reason: collision with root package name */
    private final f.e.a.a.i.c0.a f3771g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f3772h;

    /* renamed from: i  reason: collision with root package name */
    private final f.e.a.a.i.w.a<String> f3773i;

    interface b<T, U> {
        U a(T t);
    }

    private static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    r0(f.e.a.a.i.c0.a aVar, f.e.a.a.i.c0.a aVar2, k0 k0Var, t0 t0Var, f.e.a.a.i.w.a<String> aVar3) {
        this.f3769e = t0Var;
        this.f3770f = aVar;
        this.f3771g = aVar2;
        this.f3772h = k0Var;
        this.f3773i = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ Object B0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        P0(sQLiteDatabase.rawQuery(str2, (String[]) null), new v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private long B(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long T = T(sQLiteDatabase, pVar);
        if (T != null) {
            return T.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(f.e.a.a.i.d0.a.a(pVar.d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    static /* synthetic */ Boolean C0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    static /* synthetic */ Object D0(String str, c.b bVar, long j2, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) P0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())}), y.a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.b()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())});
        }
        return null;
    }

    static /* synthetic */ Object E0(long j2, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(f.e.a.a.i.d0.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(f.e.a.a.i.d0.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ Object G0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f3770f.a()).execute();
        return null;
    }

    private List<q0> H0(SQLiteDatabase sQLiteDatabase, p pVar) {
        ArrayList arrayList = new ArrayList();
        Long T = T(sQLiteDatabase, pVar);
        if (T == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        P0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{T.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f3772h.d())), new o(this, arrayList, pVar));
        return arrayList;
    }

    private Map<Long, Set<c>> I0(SQLiteDatabase sQLiteDatabase, List<q0> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        P0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new t(hashMap));
        return hashMap;
    }

    private static byte[] J0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void K0(a.C0103a aVar, Map<String, List<f.e.a.a.i.x.a.c>> map) {
        for (Map.Entry next : map.entrySet()) {
            d.a c2 = f.e.a.a.i.x.a.d.c();
            c2.c((String) next.getKey());
            c2.b((List) next.getValue());
            aVar.a(c2.a());
        }
    }

    private f.e.a.a.i.x.a.b L() {
        b.a b2 = f.e.a.a.i.x.a.b.b();
        e.a c2 = e.c();
        c2.b(E());
        c2.c(k0.a.f());
        b2.b(c2.a());
        return b2.a();
    }

    private byte[] L0(long j2) {
        return (byte[]) P0(J().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num"), g.a);
    }

    private <T> T M0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f3771g.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f3771g.a() >= ((long) this.f3772h.b()) + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static f.e.a.a.b N0(String str) {
        return str == null ? f3768j : f.e.a.a.b.b(str);
    }

    private long O() {
        return J().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static String O0(Iterable<q0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<q0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private long P() {
        return J().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    static <T> T P0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private f S() {
        return (f) U(new l(this.f3770f.a()));
    }

    private Long T(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(f.e.a.a.i.d0.a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) P0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), q.a);
    }

    private boolean V() {
        return O() * P() >= this.f3772h.f();
    }

    private List<q0> W(List<q0> list, Map<Long, Set<c>> map) {
        ListIterator<q0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            q0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                j.a l2 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l2.c(cVar.a, cVar.b);
                }
                listIterator.set(q0.a(next.c(), next.d(), l2.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ Object Y(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            g((long) i2, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Integer a0(long j2, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j2)};
        P0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new j(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    static /* synthetic */ Object c0(Throwable th) {
        throw new f.e.a.a.i.b0.a("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase d0(Throwable th) {
        throw new f.e.a.a.i.b0.a("Timed out while trying to open db.", th);
    }

    static /* synthetic */ Long e0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    static /* synthetic */ f f0(long j2, Cursor cursor) {
        cursor.moveToNext();
        long j3 = cursor.getLong(0);
        f.a c2 = f.c();
        c2.c(j3);
        c2.b(j2);
        return c2.a();
    }

    static /* synthetic */ f g0(long j2, SQLiteDatabase sQLiteDatabase) {
        return (f) P0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new c(j2));
    }

    static /* synthetic */ Long h0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ Boolean j0(p pVar, SQLiteDatabase sQLiteDatabase) {
        Long T = T(sQLiteDatabase, pVar);
        if (T == null) {
            return Boolean.FALSE;
        }
        return (Boolean) P0(J().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{T.toString()}), e0.a);
    }

    static /* synthetic */ List k0(SQLiteDatabase sQLiteDatabase) {
        return (List) P0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), h.a);
    }

    static /* synthetic */ List l0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            p.a a2 = p.a();
            a2.b(cursor.getString(1));
            a2.d(f.e.a.a.i.d0.a.b(cursor.getInt(2)));
            a2.c(J0(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ List n0(p pVar, SQLiteDatabase sQLiteDatabase) {
        List<q0> H0 = H0(sQLiteDatabase, pVar);
        W(H0, I0(sQLiteDatabase, H0));
        return H0;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ f.e.a.a.i.x.a.a p0(Map map, a.C0103a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b v = v(cursor.getInt(1));
            long j2 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            c.a c2 = f.e.a.a.i.x.a.c.c();
            c2.c(v);
            c2.b(j2);
            ((List) map.get(string)).add(c2.a());
        }
        K0(aVar, map);
        aVar.e(S());
        aVar.d(L());
        aVar.c(this.f3773i.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ f.e.a.a.i.x.a.a r0(String str, Map map, a.C0103a aVar, SQLiteDatabase sQLiteDatabase) {
        return (f.e.a.a.i.x.a.a) P0(sQLiteDatabase.rawQuery(str, new String[0]), new u(this, map, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ Object t0(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j2 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            j.a a2 = j.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            a2.h(z ? new i(N0(cursor.getString(4)), cursor.getBlob(5)) : new i(N0(cursor.getString(4)), L0(j2)));
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(q0.a(j2, pVar, a2.d()));
        }
        return null;
    }

    static /* synthetic */ Object u0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private c.b v(int i2) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i2 == bVar.b()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i2 == bVar2.b()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i2 == bVar3.b()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i2 == bVar4.b()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i2 == bVar5.b()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i2 == bVar6.b()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i2 == bVar7.b()) {
            return bVar7;
        }
        f.e.a.a.i.y.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ Long w0(j jVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (V()) {
            g(1, c.b.CACHE_FULL, jVar.j());
            return -1L;
        }
        long B = B(sQLiteDatabase, pVar);
        int e2 = this.f3772h.e();
        byte[] a2 = jVar.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(B));
        contentValues.put("transport_name", jVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.k()));
        contentValues.put("payload_encoding", jVar.e().b().a());
        contentValues.put("code", jVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a2.length) / ((double) e2));
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i2 - 1) * e2, Math.min(i2 * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : jVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    static /* synthetic */ byte[] x0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ Object z0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            g((long) i2, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private void z(SQLiteDatabase sQLiteDatabase) {
        M0(new e(sQLiteDatabase), b.a);
    }

    public long D(p pVar) {
        return ((Long) P0(J().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(f.e.a.a.i.d0.a.a(pVar.d()))}), m.a)).longValue();
    }

    /* access modifiers changed from: package-private */
    public long E() {
        return O() * P();
    }

    public boolean I(p pVar) {
        return ((Boolean) U(new k(this, pVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase J() {
        t0 t0Var = this.f3769e;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) M0(new f0(t0Var), a.a);
    }

    public void K(Iterable<q0> iterable) {
        if (iterable.iterator().hasNext()) {
            U(new r(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + O0(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T U(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase J = J();
        J.beginTransaction();
        try {
            T a2 = bVar.a(J);
            J.setTransactionSuccessful();
            return a2;
        } finally {
            J.endTransaction();
        }
    }

    public <T> T a(b.a<T> aVar) {
        SQLiteDatabase J = J();
        z(J);
        try {
            T c2 = aVar.c();
            J.setTransactionSuccessful();
            return c2;
        } finally {
            J.endTransaction();
        }
    }

    public f.e.a.a.i.x.a.a c() {
        return (f.e.a.a.i.x.a.a) U(new n(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), f.e.a.a.i.x.a.a.e()));
    }

    public void close() {
        this.f3769e.close();
    }

    public int f() {
        return ((Integer) U(new w(this, this.f3770f.a() - this.f3772h.c()))).intValue();
    }

    public void g(long j2, c.b bVar, String str) {
        U(new i(str, bVar, j2));
    }

    public void i(Iterable<q0> iterable) {
        if (iterable.iterator().hasNext()) {
            J().compileStatement("DELETE FROM events WHERE _id in " + O0(iterable)).execute();
        }
    }

    public Iterable<q0> n(p pVar) {
        return (Iterable) U(new d(this, pVar));
    }

    public void o() {
        U(new p(this));
    }

    public void r(p pVar, long j2) {
        U(new f(j2, pVar));
    }

    public q0 w(p pVar, j jVar) {
        f.e.a.a.i.y.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), jVar.j(), pVar.b());
        long longValue = ((Long) U(new s(this, jVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return q0.a(longValue, pVar, jVar);
    }

    public Iterable<p> x() {
        return (Iterable) U(x.a);
    }
}
