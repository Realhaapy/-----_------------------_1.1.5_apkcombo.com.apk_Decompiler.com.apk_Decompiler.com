package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.i;

public class q {
    private final Resources a;
    private final String b;

    public q(Context context) {
        n.h(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(i.a);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
