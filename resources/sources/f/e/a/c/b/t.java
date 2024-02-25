package f.e.a.c.b;

import android.os.Bundle;

final class t extends u<Void> {
    t(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new v(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }
}
