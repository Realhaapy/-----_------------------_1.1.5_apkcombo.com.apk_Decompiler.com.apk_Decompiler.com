package com.google.firebase.q;

public interface k {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2882e;

        private a(int i2) {
            this.f2882e = i2;
        }

        public int a() {
            return this.f2882e;
        }
    }

    a b(String str);
}
