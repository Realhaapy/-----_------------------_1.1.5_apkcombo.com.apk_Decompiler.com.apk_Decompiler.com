package f.e.d;

import f.e.d.y.d;
import f.e.d.y.n.n;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {
    private d a = d.f4342k;
    private u b = u.DEFAULT;
    private e c = d.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, h<?>> f4319d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<w> f4320e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<w> f4321f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f4322g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f4323h;

    /* renamed from: i  reason: collision with root package name */
    private int f4324i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f4325j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4326k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4327l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4328m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4329n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4330o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4331p = false;

    private void a(String str, int i2, int i3, List<w> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new a(Date.class, str);
            aVar = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else if (i2 != 2 && i3 != 2) {
            a aVar4 = new a(Date.class, i2, i3);
            a aVar5 = new a(Timestamp.class, i2, i3);
            a aVar6 = new a(java.sql.Date.class, i2, i3);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(n.a(Date.class, aVar2));
        list.add(n.a(Timestamp.class, aVar));
        list.add(n.a(java.sql.Date.class, aVar3));
    }

    public f b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f4320e.size() + this.f4321f.size() + 3);
        arrayList2.addAll(this.f4320e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f4321f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f4323h, this.f4324i, this.f4325j, arrayList2);
        return new f(this.a, this.c, this.f4319d, this.f4322g, this.f4326k, this.f4330o, this.f4328m, this.f4329n, this.f4331p, this.f4327l, this.b, this.f4323h, this.f4324i, this.f4325j, this.f4320e, this.f4321f, arrayList);
    }

    public g c(w wVar) {
        this.f4320e.add(wVar);
        return this;
    }
}
