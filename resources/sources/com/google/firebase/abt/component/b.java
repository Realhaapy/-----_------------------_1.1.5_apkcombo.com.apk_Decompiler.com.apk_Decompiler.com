package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.l.c;
import com.google.firebase.m.a.a;
import java.util.HashMap;
import java.util.Map;

public class b {
    private final Map<String, c> a = new HashMap();
    private final Context b;
    private final com.google.firebase.r.b<a> c;

    protected b(Context context, com.google.firebase.r.b<a> bVar) {
        this.b = context;
        this.c = bVar;
    }

    /* access modifiers changed from: protected */
    public c a(String str) {
        return new c(this.b, this.c, str);
    }

    public synchronized c b(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, a(str));
        }
        return this.a.get(str);
    }
}
