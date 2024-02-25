package f.e.e.n.c;

import f.e.e.n.b.a;
import f.e.e.n.b.b;
import f.e.e.n.b.c;

public final class f {
    private b a;
    private a b;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private int f4560d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f4561e;

    public static boolean b(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public b a() {
        return this.f4561e;
    }

    public void c(a aVar) {
        this.b = aVar;
    }

    public void d(int i2) {
        this.f4560d = i2;
    }

    public void e(b bVar) {
        this.f4561e = bVar;
    }

    public void f(b bVar) {
        this.a = bVar;
    }

    public void g(c cVar) {
        this.c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.f4560d);
        if (this.f4561e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f4561e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
