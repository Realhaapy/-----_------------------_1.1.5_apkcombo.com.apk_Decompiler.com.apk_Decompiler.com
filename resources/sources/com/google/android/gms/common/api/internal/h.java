package com.google.android.gms.common.api.internal;

public final class h<L> {
    private final L a;
    private final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b.equals(hVar.b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
