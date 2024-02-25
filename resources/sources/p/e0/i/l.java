package p.e0.i;

import java.util.List;
import q.e;

public interface l {
    public static final l a = new a();

    class a implements l {
        a() {
        }

        public boolean a(int i2, List<c> list) {
            return true;
        }

        public boolean b(int i2, List<c> list, boolean z) {
            return true;
        }

        public void c(int i2, b bVar) {
        }

        public boolean d(int i2, e eVar, int i3, boolean z) {
            eVar.skip((long) i3);
            return true;
        }
    }

    boolean a(int i2, List<c> list);

    boolean b(int i2, List<c> list, boolean z);

    void c(int i2, b bVar);

    boolean d(int i2, e eVar, int i3, boolean z);
}
