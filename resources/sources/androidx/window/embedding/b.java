package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ SplitRule a;

    public /* synthetic */ b(SplitRule splitRule) {
        this.a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m4translateParentMetricsPredicate$lambda4(this.a, (WindowMetrics) obj);
    }
}
