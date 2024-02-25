package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class s implements Iterable<Intent> {

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<Intent> f877e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final Context f878f;

    public interface a {
        Intent c();
    }

    private s(Context context) {
        this.f878f = context;
    }

    public static s k(Context context) {
        return new s(context);
    }

    public s h(Intent intent) {
        this.f877e.add(intent);
        return this;
    }

    public s i(Activity activity) {
        Intent c = activity instanceof a ? ((a) activity).c() : null;
        if (c == null) {
            c = j.a(activity);
        }
        if (c != null) {
            ComponentName component = c.getComponent();
            if (component == null) {
                component = c.resolveActivity(this.f878f.getPackageManager());
            }
            j(component);
            h(c);
        }
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f877e.iterator();
    }

    public s j(ComponentName componentName) {
        int size = this.f877e.size();
        try {
            Context context = this.f878f;
            while (true) {
                Intent b = j.b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f877e.add(size, b);
                context = this.f878f;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void l() {
        m((Bundle) null);
    }

    public void m(Bundle bundle) {
        if (!this.f877e.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f877e.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!e.f.j.a.k(this.f878f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f878f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
