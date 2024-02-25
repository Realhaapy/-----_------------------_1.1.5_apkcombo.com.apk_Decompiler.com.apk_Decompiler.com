package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class c implements Predicate {
    public final /* synthetic */ EmbeddingAdapter a;
    public final /* synthetic */ Set b;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set) {
        this.a = embeddingAdapter;
        this.b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m0translateActivityIntentPredicates$lambda3(this.a, this.b, (Pair) obj);
    }
}
