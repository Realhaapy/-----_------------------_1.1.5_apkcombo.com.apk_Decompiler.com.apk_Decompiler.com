package f.e.d;

import f.e.d.a0.b;
import f.e.d.a0.c;
import f.e.d.y.e;
import f.e.d.y.j;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

final class a extends v<Date> {
    private final Class<? extends Date> a;
    private final List<DateFormat> b;

    public a(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        h(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (e.e()) {
            arrayList.add(j.c(i2, i3));
        }
    }

    a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        h(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private Date f(String str) {
        synchronized (this.b) {
            for (DateFormat parse : this.b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = f.e.d.y.n.o.a.c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e2) {
                throw new t(str, e2);
            }
        }
    }

    private static Class<? extends Date> h(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: g */
    public Date c(f.e.d.a0.a aVar) {
        if (aVar.d0() == b.NULL) {
            aVar.Z();
            return null;
        }
        Date f2 = f(aVar.b0());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return f2;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(f2.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(f2.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public void e(c cVar, Date date) {
        if (date == null) {
            cVar.S();
            return;
        }
        synchronized (this.b) {
            cVar.f0(this.b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
