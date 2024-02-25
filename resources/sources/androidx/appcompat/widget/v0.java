package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class v0 extends n0 {
    private final WeakReference<Context> b;

    public v0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = (Context) this.b.get();
        if (!(drawable == null || context == null)) {
            m0.h().x(context, i2, drawable);
        }
        return drawable;
    }
}
