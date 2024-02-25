package p.e0.i;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: e  reason: collision with root package name */
    public final int f5225e;

    private b(int i2) {
        this.f5225e = i2;
    }

    public static b a(int i2) {
        for (b bVar : values()) {
            if (bVar.f5225e == i2) {
                return bVar;
            }
        }
        return null;
    }
}
