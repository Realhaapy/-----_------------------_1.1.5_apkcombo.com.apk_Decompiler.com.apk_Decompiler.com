package f.e.c.a.y;

import f.e.c.a.z.a.b0;

public enum z implements b0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f4067e;

    private z(int i2) {
        this.f4067e = i2;
    }

    public static z a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f4067e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
