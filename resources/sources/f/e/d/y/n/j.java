package f.e.d.y.n;

import f.e.d.a0.b;
import f.e.d.a0.c;
import f.e.d.f;
import f.e.d.t;
import f.e.d.v;
import f.e.d.w;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class j extends v<Date> {
    public static final w b = new a();
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    class a implements w {
        a() {
        }

        public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    /* renamed from: f */
    public synchronized Date c(f.e.d.a0.a aVar) {
        if (aVar.d0() == b.NULL) {
            aVar.Z();
            return null;
        }
        try {
            return new Date(this.a.parse(aVar.b0()).getTime());
        } catch (ParseException e2) {
            throw new t((Throwable) e2);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Date date) {
        cVar.f0(date == null ? null : this.a.format(date));
    }
}
