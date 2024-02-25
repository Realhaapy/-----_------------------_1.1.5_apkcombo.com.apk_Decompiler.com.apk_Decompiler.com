package com.google.firebase.l;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.m.a.a;
import com.google.firebase.r.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c {
    private final b<a> a;
    private final String b;
    private Integer c = null;

    public c(Context context, b<a> bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    private void a(a.C0047a aVar) {
        this.a.get().b(aVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g2 = g();
        for (b next : list) {
            while (arrayDeque.size() >= g2) {
                i(((a.C0047a) arrayDeque.pollFirst()).a);
            }
            a.C0047a d2 = next.d(this.b);
            a(d2);
            arrayDeque.offer(d2);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a2 : list) {
            arrayList.add(b.a(a2));
        }
        return arrayList;
    }

    private List<a.C0047a> d() {
        return this.a.get().d(this.b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b next : list) {
            if (!set.contains(next.b())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private ArrayList<a.C0047a> f(List<a.C0047a> list, Set<String> set) {
        ArrayList<a.C0047a> arrayList = new ArrayList<>();
        for (a.C0047a next : list) {
            if (!set.contains(next.a)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.get().g(this.b));
        }
        return this.c.intValue();
    }

    private void i(String str) {
        this.a.get().c(str, (String) null, (Bundle) null);
    }

    private void j(Collection<a.C0047a> collection) {
        for (a.C0047a aVar : collection) {
            i(aVar.a);
        }
    }

    private void l(List<b> list) {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (b b2 : list) {
            hashSet.add(b2.b());
        }
        List<a.C0047a> d2 = d();
        HashSet hashSet2 = new HashSet();
        for (a.C0047a aVar : d2) {
            hashSet2.add(aVar.a);
        }
        j(f(d2, hashSet));
        b(e(list, hashSet2));
    }

    private void m() {
        if (this.a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
