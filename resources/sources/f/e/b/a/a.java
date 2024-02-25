package f.e.b.a;

import java.util.Arrays;

public final class a {

    public static final class b {
        private final String a;
        private final C0108a b;
        private C0108a c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3976d;

        /* renamed from: f.e.b.a.a$b$a  reason: collision with other inner class name */
        private static final class C0108a {
            String a;
            Object b;
            C0108a c;

            private C0108a() {
            }
        }

        private b(String str) {
            C0108a aVar = new C0108a();
            this.b = aVar;
            this.c = aVar;
            this.f3976d = false;
            b.b(str);
            this.a = str;
        }

        private C0108a a() {
            C0108a aVar = new C0108a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().b = obj;
            return this;
        }

        public b c(Object obj) {
            b(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f3976d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (C0108a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                Object obj = aVar.b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
