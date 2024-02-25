package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ EmbeddingAdapter a;
    public final /* synthetic */ Set b;

    public /* synthetic */ d(EmbeddingAdapter embeddingAdapter, Set set) {
        this.a = embeddingAdapter;
        this.b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m1translateActivityPairPredicates$lambda1(this.a, this.b, (Pair) obj);
    }
}
