package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f1265e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f1266f;

    public /* synthetic */ f(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f1265e = splitListenerWrapper;
        this.f1266f = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m5accept$lambda1(this.f1265e, this.f1266f);
    }
}
