package com.facebook.internal.r0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m.y.d.l;

public final class b {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, a>> a = new ConcurrentHashMap<>();

    public final List<a> a(String str) {
        l.d(str, "appId");
        ConcurrentHashMap concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            arrayList.add((a) value.getValue());
        }
        return arrayList;
    }

    public final void b(String str, List<a> list) {
        l.d(str, "appId");
        l.d(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (a aVar : list) {
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.a.put(str, concurrentHashMap);
    }
}
