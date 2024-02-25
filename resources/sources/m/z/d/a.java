package m.z.d;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import m.y.d.l;

public final class a extends m.z.a {
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.c(current, "current()");
        return current;
    }
}
