package com.google.firebase.l;

import android.text.TextUtils;
import com.google.firebase.m.a.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f2693g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f2694h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f2695d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2696e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2697f;

    public b(String str, String str2, String str3, Date date, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f2695d = date;
        this.f2696e = j2;
        this.f2697f = j3;
    }

    static b a(Map<String, String> map) {
        e(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f2694h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (ParseException e2) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e2);
        } catch (NumberFormatException e3) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e3);
        }
    }

    private static void e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f2693g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f2695d.getTime();
    }

    /* access modifiers changed from: package-private */
    public a.C0047a d(String str) {
        a.C0047a aVar = new a.C0047a();
        c();
        aVar.a = this.a;
        boolean isEmpty = TextUtils.isEmpty(this.c);
        return aVar;
    }
}
