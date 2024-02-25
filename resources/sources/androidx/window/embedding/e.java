package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class e implements Predicate {
    public final /* synthetic */ Set a;

    public /* synthetic */ e(Set set) {
        this.a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m3translateIntentPredicates$lambda8(this.a, (Intent) obj);
    }
}
