package m.a0;

import java.util.NoSuchElementException;
import m.t.w;

public final class b extends w {

    /* renamed from: e  reason: collision with root package name */
    private final int f4977e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4978f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4979g;

    /* renamed from: h  reason: collision with root package name */
    private int f4980h;

    public b(int i2, int i3, int i4) {
        this.f4977e = i4;
        this.f4978f = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f4979g = z;
        this.f4980h = !z ? i3 : i2;
    }

    public int b() {
        int i2 = this.f4980h;
        if (i2 != this.f4978f) {
            this.f4980h = this.f4977e + i2;
        } else if (this.f4979g) {
            this.f4979g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f4979g;
    }
}
