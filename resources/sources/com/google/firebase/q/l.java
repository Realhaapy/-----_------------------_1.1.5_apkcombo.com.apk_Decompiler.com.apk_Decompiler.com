package com.google.firebase.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class l {
    private final SharedPreferences a;

    public l(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j2 = this.a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.a.edit().putStringSet(str2, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    private synchronized String d(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
    }

    private synchronized String e(String str) {
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e2 = e(str);
        if (e2 != null) {
            HashSet hashSet = new HashSet(this.a.getStringSet(e2, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.a.edit().remove(e2) : this.a.edit().putStringSet(e2, hashSet)).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.a.edit();
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized List<m> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(m.a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean f(long j2, long j3) {
        return d(j2).equals(d(j3));
    }

    /* access modifiers changed from: package-private */
    public synchronized void g() {
        String d2 = d(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", d2).commit();
        h(d2);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean i(long j2) {
        return j("fire-global", j2);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean j(String str, long j2) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j2).commit();
            return true;
        } else if (f(this.a.getLong(str, -1), j2)) {
            return false;
        } else {
            this.a.edit().putLong(str, j2).commit();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(long j2, String str) {
        String d2 = d(j2);
        if (!this.a.getString("last-used-date", "").equals(d2)) {
            long j3 = this.a.getLong("fire-count", 0);
            if (j3 + 1 == 30) {
                a();
                j3 = this.a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.add(d2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", d2).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void l(long j2) {
        this.a.edit().putLong("fire-global", j2).commit();
    }
}
