package p.e0;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import p.a0;
import p.c0;
import p.e;
import p.e0.f.c;
import p.e0.f.d;
import p.e0.f.g;
import p.j;
import p.k;
import p.r;

public abstract class a {
    public static a a;

    public abstract void a(r.a aVar, String str);

    public abstract void b(r.a aVar, String str, String str2);

    public abstract void c(k kVar, SSLSocket sSLSocket, boolean z);

    public abstract int d(a0.a aVar);

    public abstract boolean e(j jVar, c cVar);

    public abstract Socket f(j jVar, p.a aVar, g gVar);

    public abstract boolean g(p.a aVar, p.a aVar2);

    public abstract c h(j jVar, p.a aVar, g gVar, c0 c0Var);

    public abstract void i(j jVar, c cVar);

    public abstract d j(j jVar);

    public abstract IOException k(e eVar, IOException iOException);
}
