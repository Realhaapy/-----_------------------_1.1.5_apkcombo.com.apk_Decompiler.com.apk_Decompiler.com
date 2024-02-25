package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import java.util.Objects;
import m.y.d.g;
import m.y.d.l;

public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion((g) null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            l.d(bounds, "bounds");
            boolean z = false;
            if ((bounds.getWidth() == 0 && bounds.getHeight() == 0) ? false : true) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    public static final class Type {
        public static final Companion Companion = new Companion((g) null);
        /* access modifiers changed from: private */
        public static final Type FOLD = new Type("FOLD");
        /* access modifiers changed from: private */
        public static final Type HINGE = new Type("HINGE");
        private final String description;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(Bounds bounds, Type type2, FoldingFeature.State state2) {
        l.d(bounds, "featureBounds");
        l.d(type2, "type");
        l.d(state2, "state");
        this.featureBounds = bounds;
        this.type = type2;
        this.state = state2;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(HardwareFoldingFeature.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
        return l.a(this.featureBounds, hardwareFoldingFeature.featureBounds) && l.a(this.type, hardwareFoldingFeature.type) && l.a(getState(), hardwareFoldingFeature.getState());
    }

    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    public FoldingFeature.OcclusionType getOcclusionType() {
        return (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) ? FoldingFeature.OcclusionType.NONE : FoldingFeature.OcclusionType.FULL;
    }

    public FoldingFeature.Orientation getOrientation() {
        return this.featureBounds.getWidth() > this.featureBounds.getHeight() ? FoldingFeature.Orientation.HORIZONTAL : FoldingFeature.Orientation.VERTICAL;
    }

    public FoldingFeature.State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    public boolean isSeparating() {
        Type type2 = this.type;
        Type.Companion companion = Type.Companion;
        if (l.a(type2, companion.getHINGE())) {
            return true;
        }
        return l.a(this.type, companion.getFOLD()) && l.a(getState(), FoldingFeature.State.HALF_OPENED);
    }

    public String toString() {
        return HardwareFoldingFeature.class.getSimpleName() + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
