package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ Set a;

    public /* synthetic */ a(Set set) {
        this.a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m2translateActivityPredicates$lambda6(this.a, (Activity) obj);
    }
}
