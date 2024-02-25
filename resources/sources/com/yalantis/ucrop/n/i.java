package com.yalantis.ucrop.n;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class i extends StateListDrawable {

    /* renamed from: e  reason: collision with root package name */
    private int f3030e;

    public i(Drawable drawable, int i2) {
        this.f3030e = i2;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == 16842913) {
                z = true;
            }
        }
        if (z) {
            super.setColorFilter(this.f3030e, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
