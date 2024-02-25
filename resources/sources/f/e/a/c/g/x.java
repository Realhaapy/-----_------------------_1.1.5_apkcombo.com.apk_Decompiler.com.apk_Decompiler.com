package f.e.a.c.g;

final class x implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f3972e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ y f3973f;

    x(y yVar, i iVar) {
        this.f3973f = yVar;
        this.f3972e = iVar;
    }

    public final void run() {
        synchronized (this.f3973f.b) {
            y yVar = this.f3973f;
            if (yVar.c != null) {
                yVar.c.a(this.f3972e);
            }
        }
    }
}
