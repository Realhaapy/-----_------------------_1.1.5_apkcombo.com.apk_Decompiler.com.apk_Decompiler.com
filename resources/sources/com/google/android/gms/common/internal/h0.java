package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;

public final class h0 {
    private final SparseIntArray a = new SparseIntArray();
    private e b;

    public h0(e eVar) {
        n.h(eVar);
        this.b = eVar;
    }

    public final int a(Context context, int i2) {
        return this.a.get(i2, -1);
    }

    public final int b(Context context, a.f fVar) {
        n.h(context);
        n.h(fVar);
        int i2 = 0;
        if (!fVar.f()) {
            return 0;
        }
        int h2 = fVar.h();
        int a2 = a(context, h2);
        if (a2 == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.a.size()) {
                    i2 = -1;
                    break;
                }
                int keyAt = this.a.keyAt(i3);
                if (keyAt > h2 && this.a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            a2 = i2 == -1 ? this.b.f(context, h2) : i2;
            this.a.put(h2, a2);
        }
        return a2;
    }

    public final void c() {
        this.a.clear();
    }
}
