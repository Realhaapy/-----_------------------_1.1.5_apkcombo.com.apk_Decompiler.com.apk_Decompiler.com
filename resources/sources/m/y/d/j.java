package m.y.d;

import m.b0.c;
import m.b0.d;

public class j extends i {
    public j(int i2, Class cls, String str, String str2, int i3) {
        super(i2, c.NO_RECEIVER, cls, str, str2, i3);
    }

    public j(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(i2, obj, cls, str, str2, i3);
    }

    public j(int i2, d dVar, String str, String str2) {
        super(i2, c.NO_RECEIVER, ((d) dVar).b(), str, str2, (dVar instanceof c) ^ true ? 1 : 0);
    }
}
