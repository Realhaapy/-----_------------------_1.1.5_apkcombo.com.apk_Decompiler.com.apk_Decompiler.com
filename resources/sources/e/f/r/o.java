package e.f.r;

import android.view.View;
import android.view.ViewParent;

public class o {
    private ViewParent a;
    private ViewParent b;
    private final View c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3433d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f3434e;

    public o(View view) {
        this.c = view;
    }

    private boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!j() || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] h2 = h();
            h2[0] = 0;
            h2[1] = 0;
            iArr3 = h2;
        } else {
            iArr3 = iArr2;
        }
        b0.d(g2, this.c, i2, i3, i4, i5, i6, iArr3);
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    private ViewParent g(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }

    private int[] h() {
        if (this.f3434e == null) {
            this.f3434e = new int[2];
        }
        return this.f3434e;
    }

    private void l(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.a = viewParent;
        } else if (i2 == 1) {
            this.b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return b0.a(g2, this.c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return b0.b(g2, this.c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        if (!j() || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = h();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            b0.c(g2, this.c, i2, i3, iArr, i4);
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public boolean i(int i2) {
        return g(i2) != null;
    }

    public boolean j() {
        return this.f3433d;
    }

    public void k(boolean z) {
        if (this.f3433d) {
            y.f0(this.c);
        }
        this.f3433d = z;
    }

    public boolean m(int i2, int i3) {
        if (i(i3)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.c;
        for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
            if (b0.f(parent, view, this.c, i2, i3)) {
                l(i3, parent);
                b0.e(parent, view, this.c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            b0.g(g2, this.c, i2);
            l(i2, (ViewParent) null);
        }
    }
}
