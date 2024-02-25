package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.ExperimentalWindowApi;
import e.f.q.a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import m.s;
import m.y.d.g;
import m.y.d.l;

@ExperimentalWindowApi
public final class SplitController {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static volatile SplitController globalInstance = null;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = SplitController.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        Companion companion = SplitController.Companion;
                        SplitController.globalInstance = new SplitController((g) null);
                    }
                    s sVar = s.a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            SplitController access$getGlobalInstance$cp = SplitController.globalInstance;
            l.b(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final void initialize(Context context, int i2) {
            l.d(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i2);
            SplitController instance = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = e0.b();
            }
            instance.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = e0.b();
    }

    public /* synthetic */ SplitController(g gVar) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i2) {
        Companion.initialize(context, i2);
    }

    /* access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, a<List<SplitInfo>> aVar) {
        l.d(activity, "activity");
        l.d(executor, "executor");
        l.d(aVar, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, aVar);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return r.G(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule embeddingRule) {
        l.d(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(a<List<SplitInfo>> aVar) {
        l.d(aVar, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(aVar);
    }

    public final void unregisterRule(EmbeddingRule embeddingRule) {
        l.d(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
