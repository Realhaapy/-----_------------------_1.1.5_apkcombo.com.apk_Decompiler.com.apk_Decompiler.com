package com.facebook.internal.s0.o;

import com.facebook.internal.s0.k;
import java.io.File;
import java.util.Objects;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    private String a;
    private String b;
    private Long c;

    public d(File file) {
        l.d(file, "file");
        String name = file.getName();
        l.c(name, "file.name");
        this.a = name;
        k kVar = k.a;
        JSONObject q2 = k.q(name, true);
        if (q2 != null) {
            this.c = Long.valueOf(q2.optLong("timestamp", 0));
            this.b = q2.optString("error_message", (String) null);
        }
    }

    public d(String str) {
        this.c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l2 = this.c;
        Objects.requireNonNull(l2, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l2.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.c(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public final void a() {
        k kVar = k.a;
        k.a(this.a);
    }

    public final int b(d dVar) {
        l.d(dVar, "data");
        Long l2 = this.c;
        if (l2 == null) {
            return -1;
        }
        long longValue = l2.longValue();
        Long l3 = dVar.c;
        if (l3 == null) {
            return 1;
        }
        return l.f(l3.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.c;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            jSONObject.put("error_message", this.b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.b == null || this.c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k kVar = k.a;
            k.s(this.a, toString());
        }
    }

    public String toString() {
        JSONObject c2 = c();
        if (c2 == null) {
            return super.toString();
        }
        String jSONObject = c2.toString();
        l.c(jSONObject, "params.toString()");
        return jSONObject;
    }
}
