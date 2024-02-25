package f.e.a.a.i;

import f.e.a.a.i.j;
import java.util.Map;
import java.util.Objects;

final class c extends j {
    private final String a;
    private final Integer b;
    private final i c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3788d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3789e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f3790f;

    static final class b extends j.a {
        private String a;
        private Integer b;
        private i c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3791d;

        /* renamed from: e  reason: collision with root package name */
        private Long f3792e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f3793f;

        b() {
        }

        public j d() {
            String str = "";
            if (this.a == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3791d == null) {
                str = str + " eventMillis";
            }
            if (this.f3792e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3793f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.f3791d.longValue(), this.f3792e.longValue(), this.f3793f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f3793f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public j.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f3793f = map;
            return this;
        }

        public j.a g(Integer num) {
            this.b = num;
            return this;
        }

        public j.a h(i iVar) {
            Objects.requireNonNull(iVar, "Null encodedPayload");
            this.c = iVar;
            return this;
        }

        public j.a i(long j2) {
            this.f3791d = Long.valueOf(j2);
            return this;
        }

        public j.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        public j.a k(long j2) {
            this.f3792e = Long.valueOf(j2);
            return this;
        }
    }

    private c(String str, Integer num, i iVar, long j2, long j3, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = iVar;
        this.f3788d = j2;
        this.f3789e = j3;
        this.f3790f = map;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f3790f;
    }

    public Integer d() {
        return this.b;
    }

    public i e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof f.e.a.a.i.j
            r2 = 0
            if (r1 == 0) goto L_0x005b
            f.e.a.a.i.j r8 = (f.e.a.a.i.j) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            f.e.a.a.i.i r1 = r7.c
            f.e.a.a.i.i r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f3788d
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f3789e
            long r5 = r8.k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f3790f
            java.util.Map r8 = r8.c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.a.i.c.equals(java.lang.Object):boolean");
    }

    public long f() {
        return this.f3788d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f3788d;
        long j3 = this.f3789e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f3790f.hashCode();
    }

    public String j() {
        return this.a;
    }

    public long k() {
        return this.f3789e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.f3788d + ", uptimeMillis=" + this.f3789e + ", autoMetadata=" + this.f3790f + "}";
    }
}
