package f.e.d.y.n;

import f.e.d.a0.b;
import f.e.d.f;
import f.e.d.t;
import f.e.d.v;
import f.e.d.w;
import f.e.d.y.e;
import f.e.d.y.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends v<Date> {
    public static final w b = new a();
    private final List<DateFormat> a;

    class a implements w {
        a() {
        }

        public <T> v<T> create(f fVar, f.e.d.z.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.e()) {
            arrayList.add(j.c(2, 2));
        }
    }

    private synchronized Date f(String str) {
        for (DateFormat parse : this.a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return f.e.d.y.n.o.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new t(str, e2);
        }
    }

    /* renamed from: g */
    public Date c(f.e.d.a0.a aVar) {
        if (aVar.d0() != b.NULL) {
            return f(aVar.b0());
        }
        aVar.Z();
        return null;
    }

    /* renamed from: h */
    public synchronized void e(f.e.d.a0.c cVar, Date date) {
        if (date == null) {
            cVar.S();
        } else {
            cVar.f0(this.a.get(0).format(date));
        }
    }
}
