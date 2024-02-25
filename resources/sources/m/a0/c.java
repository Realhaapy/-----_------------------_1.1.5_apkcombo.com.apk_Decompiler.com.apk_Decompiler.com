package m.a0;

import m.y.d.g;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f4981i = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final c f4982j = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f4982j;
        }
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(h() == cVar.h() && i() == cVar.i())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    public boolean isEmpty() {
        return h() > i();
    }

    public Integer m() {
        return Integer.valueOf(i());
    }

    public Integer n() {
        return Integer.valueOf(h());
    }

    public String toString() {
        return h() + ".." + i();
    }
}
