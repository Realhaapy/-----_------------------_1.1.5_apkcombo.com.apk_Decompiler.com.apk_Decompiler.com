package e.a.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import e.a.i;

public class d extends ContextWrapper {
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f3165d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f3166e;

    public d() {
        super((Context) null);
    }

    public d(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f3166e == null) {
            Configuration configuration = this.f3165d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f3165d);
                this.f3166e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f3166e = resources;
        }
        return this.f3166e;
    }

    private void d() {
        boolean z = this.b == null;
        if (z) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        e(this.b, this.a, z);
    }

    public void a(Configuration configuration) {
        if (this.f3166e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3165d == null) {
            this.f3165d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void e(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.Theme_AppCompat_Light;
        }
        d();
        return this.b;
    }

    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            d();
        }
    }
}
