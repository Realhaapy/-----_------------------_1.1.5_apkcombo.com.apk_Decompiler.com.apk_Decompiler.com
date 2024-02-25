package f.e.a.c.d.d;

enum a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    
    private static final e0 t = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f3887e;

    static {
        int i2;
        d0 d0Var = new d0();
        for (a aVar : values()) {
            d0Var.a(Integer.valueOf(aVar.f3887e), aVar);
        }
        t = d0Var.b();
    }

    private a(int i2) {
        this.f3887e = i2;
    }

    static a a(int i2) {
        e0 e0Var = t;
        Integer valueOf = Integer.valueOf(i2);
        return !e0Var.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (a) e0Var.get(valueOf);
    }
}
