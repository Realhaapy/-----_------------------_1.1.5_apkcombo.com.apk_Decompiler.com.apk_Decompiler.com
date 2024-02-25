package f.e.a.c.d.d;

import java.util.NoSuchElementException;

abstract class v extends j {

    /* renamed from: e  reason: collision with root package name */
    private final int f3912e;

    /* renamed from: f  reason: collision with root package name */
    private int f3913f;

    protected v(int i2, int i3) {
        t.b(i3, i2, "index");
        this.f3912e = i2;
        this.f3913f = i3;
    }

    /* access modifiers changed from: protected */
    public abstract Object b(int i2);

    public final boolean hasNext() {
        return this.f3913f < this.f3912e;
    }

    public final boolean hasPrevious() {
        return this.f3913f > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.f3913f;
            this.f3913f = i2 + 1;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f3913f;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f3913f - 1;
            this.f3913f = i2;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f3913f - 1;
    }
}
