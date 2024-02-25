package f.e.a.a.i.a0;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.e.a.a.h;
import f.e.a.a.i.a0.j.j0;
import f.e.a.a.i.b0.b;
import f.e.a.a.i.j;
import f.e.a.a.i.p;
import f.e.a.a.i.t;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f3756f = Logger.getLogger(t.class.getName());
    private final y a;
    private final Executor b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f3757d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3758e;

    public c(Executor executor, e eVar, y yVar, j0 j0Var, b bVar) {
        this.b = executor;
        this.c = eVar;
        this.a = yVar;
        this.f3757d = j0Var;
        this.f3758e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c(p pVar, j jVar) {
        this.f3757d.w(pVar, jVar);
        this.a.a(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(p pVar, h hVar, j jVar) {
        try {
            m a2 = this.c.a(pVar.b());
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f3756f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f3758e.a(new b(this, pVar, a2.a(jVar)));
            hVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger = f3756f;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    public void a(p pVar, j jVar, h hVar) {
        this.b.execute(new a(this, pVar, hVar, jVar));
    }
}
