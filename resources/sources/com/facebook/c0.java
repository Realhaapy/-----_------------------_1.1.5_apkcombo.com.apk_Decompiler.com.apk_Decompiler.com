package com.facebook;

import com.facebook.internal.a0;
import com.facebook.internal.s0.o.e;
import java.util.Random;

public class c0 extends RuntimeException {
    public static final long serialVersionUID = 1;

    public c0() {
    }

    public c0(String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            g0 g0Var = g0.a;
            if (g0.v() && random.nextInt(100) > 50) {
                a0 a0Var = a0.a;
                a0.a(a0.b.ErrorReport, new e(str));
            }
        }
    }

    public c0(String str, Throwable th) {
        super(str, th);
    }

    public c0(Throwable th) {
        super(th);
    }

    /* access modifiers changed from: private */
    public static final void a(String str, boolean z) {
        if (z) {
            try {
                e eVar = e.a;
                e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
