package f.e.c.a.z.a;

public enum d0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(i.class, i.class, i.f4106f),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f4087e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4088f;

    private d0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f4087e = cls2;
        this.f4088f = obj;
    }

    public Class<?> a() {
        return this.f4087e;
    }
}
