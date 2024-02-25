package e.f.p;

import java.util.Locale;

public final class e {
    public static final d a = new C0078e((c) null, false);
    public static final d b = new C0078e((c) null, true);
    public static final d c = new C0078e(b.a, false);

    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i2++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                i5 = e.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return i5;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    private static abstract class d implements d {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i2, int i3) {
            int a2 = this.a.a(charSequence, i2, i3);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence != null && i2 >= 0 && i3 >= 0 && charSequence.length() - i3 >= i2) {
                return this.a == null ? b() : c(charSequence, i2, i3);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: e.f.p.e$e  reason: collision with other inner class name */
    private static class C0078e extends d {
        private final boolean b;

        C0078e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.b;
        }
    }

    private static class f extends d {
        static final f b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.b;
        f fVar = f.b;
    }

    static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
