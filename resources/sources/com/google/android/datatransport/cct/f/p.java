package com.google.android.datatransport.cct.f;

import android.util.SparseArray;

public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: k  reason: collision with root package name */
    private static final SparseArray<p> f2315k = null;

    static {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6;
        SparseArray<p> sparseArray = new SparseArray<>();
        f2315k = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private p(int i2) {
    }
}
