package f.e.a.c.g;

final class v implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w f3971e;

    v(w wVar) {
        this.f3971e = wVar;
    }

    public final void run() {
        synchronized (this.f3971e.b) {
            w wVar = this.f3971e;
            if (wVar.c != null) {
                wVar.c.b();
            }
        }
    }
}
