package f.h.a.f;

import f.h.a.d;
import java.util.List;

public abstract class b implements f {
    private Boolean e(String str) {
        Object a = a(str);
        if (a instanceof Boolean) {
            return (Boolean) a;
        }
        return null;
    }

    private String g() {
        return (String) a("sql");
    }

    private List<Object> h() {
        return (List) a("arguments");
    }

    public d b() {
        return new d(g(), h());
    }

    public boolean c() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    public Boolean d() {
        return e("inTransaction");
    }

    public boolean f() {
        return Boolean.TRUE.equals(a("continueOnError"));
    }
}
