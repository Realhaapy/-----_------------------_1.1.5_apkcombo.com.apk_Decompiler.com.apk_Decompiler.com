package com.yalantis.ucrop.l;

import android.graphics.Bitmap;
import android.net.Uri;

public class b {
    private int a;
    private int b;
    private Bitmap.CompressFormat c;

    /* renamed from: d  reason: collision with root package name */
    private int f2996d;

    /* renamed from: e  reason: collision with root package name */
    private String f2997e;

    /* renamed from: f  reason: collision with root package name */
    private String f2998f;

    /* renamed from: g  reason: collision with root package name */
    private c f2999g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f3000h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f3001i;

    public b(int i2, int i3, Bitmap.CompressFormat compressFormat, int i4, String str, String str2, c cVar) {
        this.a = i2;
        this.b = i3;
        this.c = compressFormat;
        this.f2996d = i4;
        this.f2997e = str;
        this.f2998f = str2;
        this.f2999g = cVar;
    }

    public Bitmap.CompressFormat a() {
        return this.c;
    }

    public int b() {
        return this.f2996d;
    }

    public Uri c() {
        return this.f3000h;
    }

    public Uri d() {
        return this.f3001i;
    }

    public c e() {
        return this.f2999g;
    }

    public String f() {
        return this.f2997e;
    }

    public String g() {
        return this.f2998f;
    }

    public int h() {
        return this.a;
    }

    public int i() {
        return this.b;
    }

    public void j(Uri uri) {
        this.f3000h = uri;
    }

    public void k(Uri uri) {
        this.f3001i = uri;
    }
}
