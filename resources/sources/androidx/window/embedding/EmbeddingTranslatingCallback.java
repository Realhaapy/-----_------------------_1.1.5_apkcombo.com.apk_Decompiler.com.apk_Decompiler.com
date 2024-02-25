package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import m.y.d.l;

@ExperimentalWindowApi
@SuppressLint({"NewApi"})
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingAdapter embeddingAdapter) {
        l.d(embeddingCallbackInterface, "callback");
        l.d(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    public void accept(List<? extends SplitInfo> list) {
        l.d(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}
