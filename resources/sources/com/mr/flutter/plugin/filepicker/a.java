package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import java.util.HashMap;

public class a {
    final String a;
    final String b;
    final Uri c;

    /* renamed from: d  reason: collision with root package name */
    final long f2947d;

    /* renamed from: e  reason: collision with root package name */
    final byte[] f2948e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a  reason: collision with other inner class name */
    public static class C0051a {
        private String a;
        private String b;
        private Uri c;

        /* renamed from: d  reason: collision with root package name */
        private long f2949d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f2950e;

        public a a() {
            return new a(this.a, this.b, this.c, this.f2949d, this.f2950e);
        }

        public C0051a b(byte[] bArr) {
            this.f2950e = bArr;
            return this;
        }

        public C0051a c(String str) {
            this.b = str;
            return this;
        }

        public C0051a d(String str) {
            this.a = str;
            return this;
        }

        public C0051a e(long j2) {
            this.f2949d = j2;
            return this;
        }

        public C0051a f(Uri uri) {
            this.c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.f2947d = j2;
        this.f2948e = bArr;
        this.c = uri;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.a);
        hashMap.put("name", this.b);
        hashMap.put("size", Long.valueOf(this.f2947d));
        hashMap.put("bytes", this.f2948e);
        hashMap.put("identifier", this.c.toString());
        return hashMap;
    }
}
