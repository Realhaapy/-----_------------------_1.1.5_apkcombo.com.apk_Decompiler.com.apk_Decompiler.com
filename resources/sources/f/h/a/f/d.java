package f.h.a.f;

import io.flutter.plugin.common.MethodChannel;

public class d extends b {
    private final f.h.a.d a;
    private final MethodChannel.Result b;
    private final Boolean c;

    public d(MethodChannel.Result result, f.h.a.d dVar, Boolean bool) {
        this.b = result;
        this.a = dVar;
        this.c = bool;
    }

    public <T> T a(String str) {
        return null;
    }

    public f.h.a.d b() {
        return this.a;
    }

    public Boolean d() {
        return this.c;
    }

    public void error(String str, String str2, Object obj) {
        this.b.error(str, str2, obj);
    }

    public void success(Object obj) {
        this.b.success(obj);
    }
}
