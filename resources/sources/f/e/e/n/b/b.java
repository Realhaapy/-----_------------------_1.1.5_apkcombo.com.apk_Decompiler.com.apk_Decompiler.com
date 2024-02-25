package f.e.e.n.b;

public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: e  reason: collision with root package name */
    private final int[] f4556e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4557f;

    private b(int[] iArr, int i2) {
        this.f4556e = iArr;
        this.f4557f = i2;
    }

    public int a() {
        return this.f4557f;
    }

    public int c(c cVar) {
        int f2 = cVar.f();
        return this.f4556e[f2 <= 9 ? 0 : f2 <= 26 ? (char) 1 : 2];
    }
}
