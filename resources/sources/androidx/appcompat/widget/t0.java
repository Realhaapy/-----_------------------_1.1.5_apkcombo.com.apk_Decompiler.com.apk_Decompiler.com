package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class t0 extends ContextWrapper {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<t0>> f675d;
    private final Resources a;
    private final Resources.Theme b;

    private t0(Context context) {
        super(context);
        if (b1.c()) {
            b1 b1Var = new b1(this, context.getResources());
            this.a = b1Var;
            Resources.Theme newTheme = b1Var.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new v0(this, context.getResources());
        this.b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b1.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            ArrayList<WeakReference<t0>> arrayList = f675d;
            if (arrayList == null) {
                f675d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f675d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f675d.remove(size);
                    }
                }
                for (int size2 = f675d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f675d.get(size2);
                    t0 t0Var = weakReference2 != null ? (t0) weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            f675d.add(new WeakReference(t0Var2));
            return t0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i2) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
