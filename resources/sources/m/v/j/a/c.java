package m.v.j.a;

import m.v.d;
import m.v.g;

public final class c implements d<Object> {

    /* renamed from: e  reason: collision with root package name */
    public static final c f5049e = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
