package f.e.d.y.n;

import f.e.d.a0.b;
import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.t;
import f.e.d.v;
import f.e.d.w;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class k extends v<Time> {
    public static final w b = new a();
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    class a implements w {
        a() {
        }

        public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    /* renamed from: f */
    public synchronized Time c(f.e.d.a0.a aVar) {
        if (aVar.d0() == b.NULL) {
            aVar.Z();
            return null;
        }
        try {
            return new Time(this.a.parse(aVar.b0()).getTime());
        } catch (ParseException e2) {
            throw new t((Throwable) e2);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Time time) {
        cVar.f0(time == null ? null : this.a.format(time));
    }
}
