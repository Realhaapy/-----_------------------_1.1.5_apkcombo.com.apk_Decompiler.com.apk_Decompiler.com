package e.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import d.a.a.b;

public abstract class e implements ServiceConnection {
    private Context a;

    class a extends c {
        a(e eVar, b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        this.a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a != null) {
            a(componentName, new a(this, b.a.a(iBinder), componentName, this.a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
