package f.e.c.a.z.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    private static final g0 f4104g;

    /* renamed from: f  reason: collision with root package name */
    private final List<Object> f4105f;

    static {
        g0 g0Var = new g0();
        f4104g = g0Var;
        g0Var.a();
    }

    public g0() {
        this(10);
    }

    public g0(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    private g0(ArrayList<Object> arrayList) {
        this.f4105f = arrayList;
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).z() : b0.j((byte[]) obj);
    }

    public boolean addAll(int i2, Collection<? extends String> collection) {
        h();
        if (collection instanceof h0) {
            collection = ((h0) collection).f();
        }
        boolean addAll = this.f4105f.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void c(i iVar) {
        h();
        this.f4105f.add(iVar);
        this.modCount++;
    }

    public void clear() {
        h();
        this.f4105f.clear();
        this.modCount++;
    }

    public h0 d() {
        return g() ? new r1(this) : this;
    }

    public Object e(int i2) {
        return this.f4105f.get(i2);
    }

    public List<?> f() {
        return Collections.unmodifiableList(this.f4105f);
    }

    /* renamed from: i */
    public void add(int i2, String str) {
        h();
        this.f4105f.add(i2, str);
        this.modCount++;
    }

    /* renamed from: k */
    public String get(int i2) {
        Object obj = this.f4105f.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String z = iVar.z();
            if (iVar.p()) {
                this.f4105f.set(i2, z);
            }
            return z;
        }
        byte[] bArr = (byte[]) obj;
        String j2 = b0.j(bArr);
        if (b0.g(bArr)) {
            this.f4105f.set(i2, j2);
        }
        return j2;
    }

    /* renamed from: l */
    public g0 b(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f4105f);
            return new g0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public String remove(int i2) {
        h();
        Object remove = this.f4105f.remove(i2);
        this.modCount++;
        return j(remove);
    }

    /* renamed from: n */
    public String set(int i2, String str) {
        h();
        return j(this.f4105f.set(i2, str));
    }

    public int size() {
        return this.f4105f.size();
    }
}
