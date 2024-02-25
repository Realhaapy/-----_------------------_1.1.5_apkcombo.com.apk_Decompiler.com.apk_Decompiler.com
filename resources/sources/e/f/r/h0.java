package e.f.r;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import e.e.g;

public final class h0 {
    private final e a;

    private static class a extends e {
        protected final Window a;

        a(Window window, View view) {
            this.a = window;
        }

        /* access modifiers changed from: protected */
        public void c(int i2) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i2) {
            this.a.addFlags(i2);
        }

        /* access modifiers changed from: protected */
        public void e(int i2) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void f(int i2) {
            this.a.clearFlags(i2);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z) {
            if (z) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z) {
            if (z) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    private static class d extends e {
        final WindowInsetsController a;
        protected Window b;

        d(Window window, h0 h0Var) {
            this(window.getInsetsController(), h0Var);
            this.b = window;
        }

        d(WindowInsetsController windowInsetsController, h0 h0Var) {
            new g();
            this.a = windowInsetsController;
        }

        public void a(boolean z) {
            if (z) {
                if (this.b != null) {
                    c(16);
                }
                this.a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.b != null) {
                d(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z) {
            if (z) {
                if (this.b != null) {
                    c(8192);
                }
                this.a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.b != null) {
                d(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        public void c(int i2) {
            View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i2) {
            View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }

    public h0(Window window, View view) {
        e aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new d(window, this);
            return;
        }
        if (i2 >= 26) {
            aVar = new c(window, view);
        } else if (i2 >= 23) {
            aVar = new b(window, view);
        } else if (i2 >= 20) {
            aVar = new a(window, view);
        } else {
            this.a = new e();
            return;
        }
        this.a = aVar;
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }
}
