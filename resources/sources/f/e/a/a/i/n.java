package f.e.a.a.i;

import java.util.concurrent.Executor;

class n implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f3811e;

    static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f3812e;

        a(Runnable runnable) {
            this.f3812e = runnable;
        }

        public void run() {
            try {
                this.f3812e.run();
            } catch (Exception e2) {
                f.e.a.a.i.y.a.d("Executor", "Background execution failure.", e2);
            }
        }
    }

    n(Executor executor) {
        this.f3811e = executor;
    }

    public void execute(Runnable runnable) {
        this.f3811e.execute(new a(runnable));
    }
}
