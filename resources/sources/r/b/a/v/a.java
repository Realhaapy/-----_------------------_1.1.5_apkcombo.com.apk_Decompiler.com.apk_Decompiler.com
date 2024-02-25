package r.b.a.v;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r.b.a.f;
import r.b.a.m;
import r.b.a.q;
import r.b.a.r;
import r.b.a.u.b;
import r.b.a.u.h;
import r.b.a.w.c;
import r.b.a.w.d;
import r.b.a.x.e;
import r.b.a.x.i;
import r.b.a.x.j;
import r.b.a.x.k;

final class a extends c implements e, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    final Map<i, Long> f5654e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    h f5655f;

    /* renamed from: g  reason: collision with root package name */
    q f5656g;

    /* renamed from: h  reason: collision with root package name */
    b f5657h;

    /* renamed from: i  reason: collision with root package name */
    r.b.a.h f5658i;

    /* renamed from: j  reason: collision with root package name */
    boolean f5659j;

    /* renamed from: k  reason: collision with root package name */
    m f5660k;

    private void A(e eVar) {
        Iterator<Map.Entry<i, Long>> it = this.f5654e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            i iVar = (i) next.getKey();
            long longValue = ((Long) next.getValue()).longValue();
            if (eVar.j(iVar)) {
                try {
                    long n2 = eVar.n(iVar);
                    if (n2 == longValue) {
                        it.remove();
                    } else {
                        throw new r.b.a.b("Cross check failed: " + iVar + " " + n2 + " vs " + iVar + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private Long B(i iVar) {
        return this.f5654e.get(iVar);
    }

    private void C(i iVar) {
        if (this.f5655f instanceof r.b.a.u.m) {
            y(r.b.a.u.m.f5618g.B(this.f5654e, iVar));
            return;
        }
        Map<i, Long> map = this.f5654e;
        r.b.a.x.a aVar = r.b.a.x.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            y(f.b0(this.f5654e.remove(aVar).longValue()));
        }
    }

    private void D() {
        if (this.f5654e.containsKey(r.b.a.x.a.INSTANT_SECONDS)) {
            q qVar = this.f5656g;
            if (qVar == null) {
                Long l2 = this.f5654e.get(r.b.a.x.a.OFFSET_SECONDS);
                if (l2 != null) {
                    qVar = r.B(l2.intValue());
                } else {
                    return;
                }
            }
            E(qVar);
        }
    }

    private void E(q qVar) {
        Map<i, Long> map = this.f5654e;
        r.b.a.x.a aVar = r.b.a.x.a.INSTANT_SECONDS;
        r.b.a.u.f w = this.f5655f.w(r.b.a.e.B(map.remove(aVar).longValue()), qVar);
        if (this.f5657h == null) {
            w(w.D());
        } else {
            M(aVar, w.D());
        }
        u(r.b.a.x.a.SECOND_OF_DAY, (long) w.F().R());
    }

    private void F(i iVar) {
        r.b.a.x.a aVar;
        long j2;
        Map<i, Long> map = this.f5654e;
        r.b.a.x.a aVar2 = r.b.a.x.a.CLOCK_HOUR_OF_DAY;
        long j3 = 0;
        if (map.containsKey(aVar2)) {
            long longValue = this.f5654e.remove(aVar2).longValue();
            if (!(iVar == i.LENIENT || (iVar == i.SMART && longValue == 0))) {
                aVar2.m(longValue);
            }
            r.b.a.x.a aVar3 = r.b.a.x.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            u(aVar3, longValue);
        }
        Map<i, Long> map2 = this.f5654e;
        r.b.a.x.a aVar4 = r.b.a.x.a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar4)) {
            long longValue2 = this.f5654e.remove(aVar4).longValue();
            if (!(iVar == i.LENIENT || (iVar == i.SMART && longValue2 == 0))) {
                aVar4.m(longValue2);
            }
            r.b.a.x.a aVar5 = r.b.a.x.a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j3 = longValue2;
            }
            u(aVar5, j3);
        }
        i iVar2 = i.LENIENT;
        if (iVar != iVar2) {
            Map<i, Long> map3 = this.f5654e;
            r.b.a.x.a aVar6 = r.b.a.x.a.AMPM_OF_DAY;
            if (map3.containsKey(aVar6)) {
                aVar6.m(this.f5654e.get(aVar6).longValue());
            }
            Map<i, Long> map4 = this.f5654e;
            r.b.a.x.a aVar7 = r.b.a.x.a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar7)) {
                aVar7.m(this.f5654e.get(aVar7).longValue());
            }
        }
        Map<i, Long> map5 = this.f5654e;
        r.b.a.x.a aVar8 = r.b.a.x.a.AMPM_OF_DAY;
        if (map5.containsKey(aVar8)) {
            Map<i, Long> map6 = this.f5654e;
            r.b.a.x.a aVar9 = r.b.a.x.a.HOUR_OF_AMPM;
            if (map6.containsKey(aVar9)) {
                u(r.b.a.x.a.HOUR_OF_DAY, (this.f5654e.remove(aVar8).longValue() * 12) + this.f5654e.remove(aVar9).longValue());
            }
        }
        Map<i, Long> map7 = this.f5654e;
        r.b.a.x.a aVar10 = r.b.a.x.a.NANO_OF_DAY;
        if (map7.containsKey(aVar10)) {
            long longValue3 = this.f5654e.remove(aVar10).longValue();
            if (iVar != iVar2) {
                aVar10.m(longValue3);
            }
            u(r.b.a.x.a.SECOND_OF_DAY, longValue3 / 1000000000);
            u(r.b.a.x.a.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        Map<i, Long> map8 = this.f5654e;
        r.b.a.x.a aVar11 = r.b.a.x.a.MICRO_OF_DAY;
        if (map8.containsKey(aVar11)) {
            long longValue4 = this.f5654e.remove(aVar11).longValue();
            if (iVar != iVar2) {
                aVar11.m(longValue4);
            }
            u(r.b.a.x.a.SECOND_OF_DAY, longValue4 / 1000000);
            u(r.b.a.x.a.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        Map<i, Long> map9 = this.f5654e;
        r.b.a.x.a aVar12 = r.b.a.x.a.MILLI_OF_DAY;
        if (map9.containsKey(aVar12)) {
            long longValue5 = this.f5654e.remove(aVar12).longValue();
            if (iVar != iVar2) {
                aVar12.m(longValue5);
            }
            u(r.b.a.x.a.SECOND_OF_DAY, longValue5 / 1000);
            u(r.b.a.x.a.MILLI_OF_SECOND, longValue5 % 1000);
        }
        Map<i, Long> map10 = this.f5654e;
        r.b.a.x.a aVar13 = r.b.a.x.a.SECOND_OF_DAY;
        if (map10.containsKey(aVar13)) {
            long longValue6 = this.f5654e.remove(aVar13).longValue();
            if (iVar != iVar2) {
                aVar13.m(longValue6);
            }
            u(r.b.a.x.a.HOUR_OF_DAY, longValue6 / 3600);
            u(r.b.a.x.a.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            u(r.b.a.x.a.SECOND_OF_MINUTE, longValue6 % 60);
        }
        Map<i, Long> map11 = this.f5654e;
        r.b.a.x.a aVar14 = r.b.a.x.a.MINUTE_OF_DAY;
        if (map11.containsKey(aVar14)) {
            long longValue7 = this.f5654e.remove(aVar14).longValue();
            if (iVar != iVar2) {
                aVar14.m(longValue7);
            }
            u(r.b.a.x.a.HOUR_OF_DAY, longValue7 / 60);
            u(r.b.a.x.a.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (iVar != iVar2) {
            Map<i, Long> map12 = this.f5654e;
            r.b.a.x.a aVar15 = r.b.a.x.a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar15)) {
                aVar15.m(this.f5654e.get(aVar15).longValue());
            }
            Map<i, Long> map13 = this.f5654e;
            r.b.a.x.a aVar16 = r.b.a.x.a.MICRO_OF_SECOND;
            if (map13.containsKey(aVar16)) {
                aVar16.m(this.f5654e.get(aVar16).longValue());
            }
        }
        Map<i, Long> map14 = this.f5654e;
        r.b.a.x.a aVar17 = r.b.a.x.a.MILLI_OF_SECOND;
        if (map14.containsKey(aVar17)) {
            Map<i, Long> map15 = this.f5654e;
            r.b.a.x.a aVar18 = r.b.a.x.a.MICRO_OF_SECOND;
            if (map15.containsKey(aVar18)) {
                u(aVar18, (this.f5654e.remove(aVar17).longValue() * 1000) + (this.f5654e.get(aVar18).longValue() % 1000));
            }
        }
        Map<i, Long> map16 = this.f5654e;
        r.b.a.x.a aVar19 = r.b.a.x.a.MICRO_OF_SECOND;
        if (map16.containsKey(aVar19)) {
            Map<i, Long> map17 = this.f5654e;
            r.b.a.x.a aVar20 = r.b.a.x.a.NANO_OF_SECOND;
            if (map17.containsKey(aVar20)) {
                u(aVar19, this.f5654e.get(aVar20).longValue() / 1000);
                this.f5654e.remove(aVar19);
            }
        }
        if (this.f5654e.containsKey(aVar17)) {
            Map<i, Long> map18 = this.f5654e;
            r.b.a.x.a aVar21 = r.b.a.x.a.NANO_OF_SECOND;
            if (map18.containsKey(aVar21)) {
                u(aVar17, this.f5654e.get(aVar21).longValue() / 1000000);
                this.f5654e.remove(aVar17);
            }
        }
        if (this.f5654e.containsKey(aVar19)) {
            long longValue8 = this.f5654e.remove(aVar19).longValue();
            aVar = r.b.a.x.a.NANO_OF_SECOND;
            j2 = longValue8 * 1000;
        } else if (this.f5654e.containsKey(aVar17)) {
            long longValue9 = this.f5654e.remove(aVar17).longValue();
            aVar = r.b.a.x.a.NANO_OF_SECOND;
            j2 = longValue9 * 1000000;
        } else {
            return;
        }
        u(aVar, j2);
    }

    private a G(i iVar, long j2) {
        this.f5654e.put(iVar, Long.valueOf(j2));
        return this;
    }

    private boolean I(i iVar) {
        int i2 = 0;
        loop0:
        while (i2 < 100) {
            for (Map.Entry<i, Long> key : this.f5654e.entrySet()) {
                i iVar2 = (i) key.getKey();
                Object j2 = iVar2.j(this.f5654e, this, iVar);
                if (j2 != null) {
                    if (j2 instanceof r.b.a.u.f) {
                        r.b.a.u.f fVar = (r.b.a.u.f) j2;
                        q qVar = this.f5656g;
                        if (qVar == null) {
                            this.f5656g = fVar.x();
                        } else if (!qVar.equals(fVar.x())) {
                            throw new r.b.a.b("ChronoZonedDateTime must use the effective parsed zone: " + this.f5656g);
                        }
                        j2 = fVar.E();
                    }
                    if (j2 instanceof b) {
                        M(iVar2, (b) j2);
                    } else if (j2 instanceof r.b.a.h) {
                        L(iVar2, (r.b.a.h) j2);
                    } else if (j2 instanceof r.b.a.u.c) {
                        r.b.a.u.c cVar = (r.b.a.u.c) j2;
                        M(iVar2, cVar.E());
                        L(iVar2, cVar.F());
                    } else {
                        throw new r.b.a.b("Unknown type: " + j2.getClass().getName());
                    }
                } else if (!this.f5654e.containsKey(iVar2)) {
                }
                i2++;
            }
        }
        if (i2 != 100) {
            return i2 > 0;
        }
        throw new r.b.a.b("Badly written field");
    }

    private void J() {
        if (this.f5658i != null) {
            return;
        }
        if (this.f5654e.containsKey(r.b.a.x.a.INSTANT_SECONDS) || this.f5654e.containsKey(r.b.a.x.a.SECOND_OF_DAY) || this.f5654e.containsKey(r.b.a.x.a.SECOND_OF_MINUTE)) {
            Map<i, Long> map = this.f5654e;
            r.b.a.x.a aVar = r.b.a.x.a.NANO_OF_SECOND;
            if (map.containsKey(aVar)) {
                long longValue = this.f5654e.get(aVar).longValue();
                this.f5654e.put(r.b.a.x.a.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
                this.f5654e.put(r.b.a.x.a.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
                return;
            }
            this.f5654e.put(aVar, 0L);
            this.f5654e.put(r.b.a.x.a.MICRO_OF_SECOND, 0L);
            this.f5654e.put(r.b.a.x.a.MILLI_OF_SECOND, 0L);
        }
    }

    private void K() {
        r.b.a.u.f<?> v;
        if (this.f5657h != null && this.f5658i != null) {
            Long l2 = this.f5654e.get(r.b.a.x.a.OFFSET_SECONDS);
            if (l2 != null) {
                v = this.f5657h.v(this.f5658i).v(r.B(l2.intValue()));
            } else if (this.f5656g != null) {
                v = this.f5657h.v(this.f5658i).v(this.f5656g);
            } else {
                return;
            }
            r.b.a.x.a aVar = r.b.a.x.a.INSTANT_SECONDS;
            this.f5654e.put(aVar, Long.valueOf(v.n(aVar)));
        }
    }

    private void L(i iVar, r.b.a.h hVar) {
        long Q = hVar.Q();
        Long put = this.f5654e.put(r.b.a.x.a.NANO_OF_DAY, Long.valueOf(Q));
        if (put != null && put.longValue() != Q) {
            throw new r.b.a.b("Conflict found: " + r.b.a.h.H(put.longValue()) + " differs from " + hVar + " while resolving  " + iVar);
        }
    }

    private void M(i iVar, b bVar) {
        if (this.f5655f.equals(bVar.x())) {
            long D = bVar.D();
            Long put = this.f5654e.put(r.b.a.x.a.EPOCH_DAY, Long.valueOf(D));
            if (put != null && put.longValue() != D) {
                throw new r.b.a.b("Conflict found: " + f.b0(put.longValue()) + " differs from " + f.b0(D) + " while resolving  " + iVar);
            }
            return;
        }
        throw new r.b.a.b("ChronoLocalDate must use the effective parsed chronology: " + this.f5655f);
    }

    private void N(i iVar) {
        int i2;
        r.b.a.h hVar;
        r.b.a.h E;
        i iVar2 = iVar;
        Map<i, Long> map = this.f5654e;
        r.b.a.x.a aVar = r.b.a.x.a.HOUR_OF_DAY;
        Long l2 = map.get(aVar);
        Map<i, Long> map2 = this.f5654e;
        r.b.a.x.a aVar2 = r.b.a.x.a.MINUTE_OF_HOUR;
        Long l3 = map2.get(aVar2);
        Map<i, Long> map3 = this.f5654e;
        r.b.a.x.a aVar3 = r.b.a.x.a.SECOND_OF_MINUTE;
        Long l4 = map3.get(aVar3);
        Map<i, Long> map4 = this.f5654e;
        r.b.a.x.a aVar4 = r.b.a.x.a.NANO_OF_SECOND;
        Long l5 = map4.get(aVar4);
        if (l2 != null) {
            if (l3 == null && (l4 != null || l5 != null)) {
                return;
            }
            if (l3 == null || l4 != null || l5 == null) {
                if (iVar2 != i.LENIENT) {
                    if (l2 != null) {
                        if (iVar2 == i.SMART && l2.longValue() == 24 && ((l3 == null || l3.longValue() == 0) && ((l4 == null || l4.longValue() == 0) && (l5 == null || l5.longValue() == 0)))) {
                            l2 = 0L;
                            this.f5660k = m.d(1);
                        }
                        int l6 = aVar.l(l2.longValue());
                        if (l3 != null) {
                            int l7 = aVar2.l(l3.longValue());
                            if (l4 != null) {
                                int l8 = aVar3.l(l4.longValue());
                                E = l5 != null ? r.b.a.h.G(l6, l7, l8, aVar4.l(l5.longValue())) : r.b.a.h.F(l6, l7, l8);
                            } else if (l5 == null) {
                                E = r.b.a.h.E(l6, l7);
                            }
                        } else if (l4 == null && l5 == null) {
                            E = r.b.a.h.E(l6, 0);
                        }
                        v(E);
                    }
                } else if (l2 != null) {
                    long longValue = l2.longValue();
                    if (l3 == null) {
                        i2 = d.p(d.e(longValue, 24));
                        hVar = r.b.a.h.E((int) ((long) d.g(longValue, 24)), 0);
                    } else if (l4 != null) {
                        if (l5 == null) {
                            l5 = 0L;
                        }
                        long k2 = d.k(d.k(d.k(d.m(longValue, 3600000000000L), d.m(l3.longValue(), 60000000000L)), d.m(l4.longValue(), 1000000000)), l5.longValue());
                        i2 = (int) d.e(k2, 86400000000000L);
                        hVar = r.b.a.h.H(d.h(k2, 86400000000000L));
                    } else {
                        long k3 = d.k(d.m(longValue, 3600), d.m(l3.longValue(), 60));
                        i2 = (int) d.e(k3, 86400);
                        hVar = r.b.a.h.I(d.h(k3, 86400));
                    }
                    v(hVar);
                    this.f5660k = m.d(i2);
                }
                this.f5654e.remove(aVar);
                this.f5654e.remove(aVar2);
                this.f5654e.remove(aVar3);
                this.f5654e.remove(aVar4);
            }
        }
    }

    private void y(f fVar) {
        if (fVar != null) {
            w(fVar);
            for (i next : this.f5654e.keySet()) {
                if ((next instanceof r.b.a.x.a) && next.a()) {
                    try {
                        long n2 = fVar.n(next);
                        Long l2 = this.f5654e.get(next);
                        if (n2 != l2.longValue()) {
                            throw new r.b.a.b("Conflict found: Field " + next + " " + n2 + " differs from " + next + " " + l2 + " derived from " + fVar);
                        }
                    } catch (r.b.a.b unused) {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [r.b.a.h] */
    /* JADX WARNING: type inference failed for: r0v5, types: [r.b.a.u.c] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z() {
        /*
            r2 = this;
            java.util.Map<r.b.a.x.i, java.lang.Long> r0 = r2.f5654e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0020
            r.b.a.u.b r0 = r2.f5657h
            if (r0 == 0) goto L_0x0015
            r.b.a.h r1 = r2.f5658i
            if (r1 == 0) goto L_0x0015
            r.b.a.u.c r0 = r0.v(r1)
            goto L_0x0017
        L_0x0015:
            if (r0 == 0) goto L_0x001b
        L_0x0017:
            r2.A(r0)
            goto L_0x0020
        L_0x001b:
            r.b.a.h r0 = r2.f5658i
            if (r0 == 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.a.z():void");
    }

    public a H(i iVar, Set<i> set) {
        b bVar;
        if (set != null) {
            this.f5654e.keySet().retainAll(set);
        }
        D();
        C(iVar);
        F(iVar);
        if (I(iVar)) {
            D();
            C(iVar);
            F(iVar);
        }
        N(iVar);
        z();
        m mVar = this.f5660k;
        if (!(mVar == null || mVar.c() || (bVar = this.f5657h) == null || this.f5658i == null)) {
            this.f5657h = bVar.C(this.f5660k);
            this.f5660k = m.f5567h;
        }
        J();
        K();
        return this;
    }

    public <R> R f(k<R> kVar) {
        if (kVar == j.g()) {
            return this.f5656g;
        }
        if (kVar == j.a()) {
            return this.f5655f;
        }
        if (kVar == j.b()) {
            b bVar = this.f5657h;
            if (bVar != null) {
                return f.J(bVar);
            }
            return null;
        } else if (kVar == j.c()) {
            return this.f5658i;
        } else {
            if (kVar == j.f() || kVar == j.d()) {
                return kVar.a(this);
            }
            if (kVar == j.e()) {
                return null;
            }
            return kVar.a(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r2.f5657h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r1 = r2.f5658i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(r.b.a.x.i r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<r.b.a.x.i, java.lang.Long> r1 = r2.f5654e
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L_0x0020
            r.b.a.u.b r1 = r2.f5657h
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.j(r3)
            if (r1 != 0) goto L_0x0020
        L_0x0016:
            r.b.a.h r1 = r2.f5658i
            if (r1 == 0) goto L_0x0021
            boolean r3 = r1.j(r3)
            if (r3 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.v.a.j(r.b.a.x.i):boolean");
    }

    public long n(i iVar) {
        d.i(iVar, "field");
        Long B = B(iVar);
        if (B != null) {
            return B.longValue();
        }
        b bVar = this.f5657h;
        if (bVar != null && bVar.j(iVar)) {
            return this.f5657h.n(iVar);
        }
        r.b.a.h hVar = this.f5658i;
        if (hVar != null && hVar.j(iVar)) {
            return this.f5658i.n(iVar);
        }
        throw new r.b.a.b("Field not found: " + iVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f5654e.size() > 0) {
            sb.append("fields=");
            sb.append(this.f5654e);
        }
        sb.append(", ");
        sb.append(this.f5655f);
        sb.append(", ");
        sb.append(this.f5656g);
        sb.append(", ");
        sb.append(this.f5657h);
        sb.append(", ");
        sb.append(this.f5658i);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public a u(i iVar, long j2) {
        d.i(iVar, "field");
        Long B = B(iVar);
        if (B == null || B.longValue() == j2) {
            G(iVar, j2);
            return this;
        }
        throw new r.b.a.b("Conflict found: " + iVar + " " + B + " differs from " + iVar + " " + j2 + ": " + this);
    }

    /* access modifiers changed from: package-private */
    public void v(r.b.a.h hVar) {
        this.f5658i = hVar;
    }

    /* access modifiers changed from: package-private */
    public void w(b bVar) {
        this.f5657h = bVar;
    }

    public <R> R x(k<R> kVar) {
        return kVar.a(this);
    }
}
