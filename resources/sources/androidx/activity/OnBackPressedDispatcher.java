package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    final ArrayDeque<b> b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements f, a {

        /* renamed from: e  reason: collision with root package name */
        private final e f73e;

        /* renamed from: f  reason: collision with root package name */
        private final b f74f;

        /* renamed from: g  reason: collision with root package name */
        private a f75g;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f73e = eVar;
            this.f74f = bVar;
            eVar.a(this);
        }

        public void a(h hVar, e.b bVar) {
            if (bVar == e.b.ON_START) {
                this.f75g = OnBackPressedDispatcher.this.b(this.f74f);
            } else if (bVar == e.b.ON_STOP) {
                a aVar = this.f75g;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == e.b.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f73e.c(this);
            this.f74f.removeCancellable(this);
            a aVar = this.f75g;
            if (aVar != null) {
                aVar.cancel();
                this.f75g = null;
            }
        }
    }

    private class a implements a {

        /* renamed from: e  reason: collision with root package name */
        private final b f77e;

        a(b bVar) {
            this.f77e = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.f77e);
            this.f77e.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(h hVar, b bVar) {
        e lifecycle = hVar.getLifecycle();
        if (lifecycle.b() != e.c.DESTROYED) {
            bVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.addCancellable(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
