package m.d0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.y.d.l;

public final class f implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final Pattern f4999e;

    private static final class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e  reason: collision with root package name */
        private final String f5000e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5001f;

        public a(String str, int i2) {
            l.d(str, "pattern");
            this.f5000e = str;
            this.f5001f = i2;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f5000e, this.f5001f);
            l.c(compile, "compile(pattern, flags)");
            return new f(compile);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            m.y.d.l.d(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            m.y.d.l.c(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d0.f.<init>(java.lang.String):void");
    }

    public f(Pattern pattern) {
        l.d(pattern, "nativePattern");
        this.f4999e = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f4999e.pattern();
        l.c(pattern, "nativePattern.pattern()");
        return new a(pattern, this.f4999e.flags());
    }

    public final boolean a(CharSequence charSequence) {
        l.d(charSequence, "input");
        return this.f4999e.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        l.d(charSequence, "input");
        l.d(str, "replacement");
        String replaceAll = this.f4999e.matcher(charSequence).replaceAll(str);
        l.c(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence charSequence, int i2) {
        l.d(charSequence, "input");
        q.R(i2);
        Matcher matcher = this.f4999e.matcher(charSequence);
        if (i2 == 1 || !matcher.find()) {
            return i.b(charSequence.toString());
        }
        int i3 = 10;
        if (i2 > 0) {
            i3 = f.c(i2, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = i2 - 1;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if ((i5 >= 0 && arrayList.size() == i5) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f4999e.toString();
        l.c(pattern, "nativePattern.toString()");
        return pattern;
    }
}
