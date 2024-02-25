package androidx.window.layout;

import android.app.Activity;
import kotlinx.coroutines.k2.b;
import kotlinx.coroutines.k2.d;
import m.y.d.g;
import m.y.d.l;

public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        l.d(windowMetricsCalculator2, "windowMetricsCalculator");
        l.d(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        l.d(activity, "activity");
        return d.a(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (m.v.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
