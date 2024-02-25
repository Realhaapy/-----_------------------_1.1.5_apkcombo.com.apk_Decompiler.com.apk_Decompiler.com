package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import m.y.d.l;

public final class WindowMetrics {
    private final Bounds _bounds;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect) {
        this(new Bounds(rect));
        l.d(rect, "bounds");
    }

    public WindowMetrics(Bounds bounds) {
        l.d(bounds, "_bounds");
        this._bounds = bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(WindowMetrics.class, obj.getClass())) {
            return false;
        }
        return l.a(this._bounds, ((WindowMetrics) obj)._bounds);
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }
}
