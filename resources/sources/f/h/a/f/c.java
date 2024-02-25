package f.h.a.f;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends a {
    final Map<String, Object> a;
    final a b = new a(this);
    final boolean c;

    public class a implements g {
        Object a;
        String b;
        String c;

        /* renamed from: d  reason: collision with root package name */
        Object f4642d;

        public a(c cVar) {
        }

        public void error(String str, String str2, Object obj) {
            this.b = str;
            this.c = str2;
            this.f4642d = obj;
        }

        public void success(Object obj) {
            this.a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z) {
        this.a = map;
        this.c = z;
    }

    public <T> T a(String str) {
        return this.a.get(str);
    }

    public boolean c() {
        return this.c;
    }

    public g i() {
        return this.b;
    }

    public String j() {
        return (String) this.a.get("method");
    }

    public Map<String, Object> k() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.b.b);
        hashMap2.put("message", this.b.c);
        hashMap2.put("data", this.b.f4642d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> l() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.b.a);
        return hashMap;
    }

    public void m(MethodChannel.Result result) {
        a aVar = this.b;
        result.error(aVar.b, aVar.c, aVar.f4642d);
    }

    public void n(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(k());
        }
    }

    public void o(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(l());
        }
    }
}
