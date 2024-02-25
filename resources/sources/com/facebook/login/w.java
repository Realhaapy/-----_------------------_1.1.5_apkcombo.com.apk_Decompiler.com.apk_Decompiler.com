package com.facebook.login;

public enum w {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);
    

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1652e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1653f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1654g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1655h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1656i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f1657j;

    private w(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f1652e = z;
        this.f1653f = z2;
        this.f1654g = z3;
        this.f1655h = z4;
        this.f1656i = z5;
        this.f1657j = z7;
    }

    public final boolean c() {
        return this.f1656i;
    }

    public final boolean d() {
        return this.f1655h;
    }

    public final boolean f() {
        return this.f1652e;
    }

    public final boolean g() {
        return this.f1657j;
    }

    public final boolean h() {
        return this.f1653f;
    }

    public final boolean j() {
        return this.f1654g;
    }
}
