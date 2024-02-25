package androidx.window.layout;

import java.util.List;
import m.y.d.l;

public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        l.d(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return l.a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return r.u(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (m.y.c.l) null, 56, (Object) null);
    }
}
