package f.e.c.a.z.a;

public class f0 {
    private i a;
    private q b;
    protected volatile s0 c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f4099d;

    static {
        q.b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.c = r4;
        r3.f4099d = f.e.c.a.z.a.i.f4106f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(f.e.c.a.z.a.s0 r4) {
        /*
            r3 = this;
            f.e.c.a.z.a.s0 r0 = r3.c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            f.e.c.a.z.a.s0 r0 = r3.c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            f.e.c.a.z.a.i r0 = r3.a     // Catch:{ c0 -> 0x002a }
            if (r0 == 0) goto L_0x0025
            f.e.c.a.z.a.a1 r0 = r4.k()     // Catch:{ c0 -> 0x002a }
            f.e.c.a.z.a.i r1 = r3.a     // Catch:{ c0 -> 0x002a }
            f.e.c.a.z.a.q r2 = r3.b     // Catch:{ c0 -> 0x002a }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ c0 -> 0x002a }
            f.e.c.a.z.a.s0 r0 = (f.e.c.a.z.a.s0) r0     // Catch:{ c0 -> 0x002a }
            r3.c = r0     // Catch:{ c0 -> 0x002a }
            f.e.c.a.z.a.i r0 = r3.a     // Catch:{ c0 -> 0x002a }
        L_0x0022:
            r3.f4099d = r0     // Catch:{ c0 -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.c = r4     // Catch:{ c0 -> 0x002a }
            f.e.c.a.z.a.i r0 = f.e.c.a.z.a.i.f4106f     // Catch:{ c0 -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.c = r4     // Catch:{ all -> 0x0032 }
            f.e.c.a.z.a.i r4 = f.e.c.a.z.a.i.f4106f     // Catch:{ all -> 0x0032 }
            r3.f4099d = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.c.a.z.a.f0.a(f.e.c.a.z.a.s0):void");
    }

    public int b() {
        if (this.f4099d != null) {
            return this.f4099d.size();
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.c != null) {
            return this.c.b();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.c;
        this.a = null;
        this.f4099d = null;
        this.c = s0Var;
        return s0Var2;
    }

    public i e() {
        if (this.f4099d != null) {
            return this.f4099d;
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f4099d != null) {
                i iVar2 = this.f4099d;
                return iVar2;
            }
            this.f4099d = this.c == null ? i.f4106f : this.c.j();
            i iVar3 = this.f4099d;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        s0 s0Var = this.c;
        s0 s0Var2 = f0Var.c;
        return (s0Var == null && s0Var2 == null) ? e().equals(f0Var.e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.c(s0Var.d())) : c(s0Var2.d()).equals(s0Var2) : s0Var.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
