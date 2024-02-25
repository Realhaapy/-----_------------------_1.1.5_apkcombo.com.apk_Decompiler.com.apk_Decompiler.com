package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {
    private Random a = new Random();
    private final Map<Integer, String> b = new HashMap();
    private final Map<String, Integer> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f79d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f80e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f81f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f82g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f83h = new Bundle();

    class a extends c<I> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ androidx.activity.result.f.a c;

        a(String str, int i2, androidx.activity.result.f.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        public void b(I i2, androidx.core.app.d dVar) {
            ActivityResultRegistry.this.f80e.add(this.a);
            ActivityResultRegistry.this.f(this.b, this.c, i2, dVar);
        }

        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    class b extends c<I> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ androidx.activity.result.f.a c;

        b(String str, int i2, androidx.activity.result.f.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        public void b(I i2, androidx.core.app.d dVar) {
            ActivityResultRegistry.this.f80e.add(this.a);
            ActivityResultRegistry.this.f(this.b, this.c, i2, dVar);
        }

        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    private static class c<O> {
        final b<O> a;
        final androidx.activity.result.f.a<?, O> b;

        c(b<O> bVar, androidx.activity.result.f.a<?, O> aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    private static class d {
        final e a;
        private final ArrayList<f> b = new ArrayList<>();

        d(e eVar) {
            this.a = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a(f fVar) {
            this.a.a(fVar);
            this.b.add(fVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator<f> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    private void a(int i2, String str) {
        this.b.put(Integer.valueOf(i2), str);
        this.c.put(str, Integer.valueOf(i2));
    }

    private <O> void d(String str, int i2, Intent intent, c<O> cVar) {
        b<O> bVar;
        if (cVar == null || (bVar = cVar.a) == null) {
            this.f82g.remove(str);
            this.f83h.putParcelable(str, new a(i2, intent));
            return;
        }
        bVar.a(cVar.b.c(i2, intent));
    }

    private int e() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + 65536;
            if (!this.b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    private int k(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e2 = e();
        a(e2, str);
        return e2;
    }

    public final boolean b(int i2, int i3, Intent intent) {
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f80e.remove(str);
        d(str, i3, intent, this.f81f.get(str));
        return true;
    }

    public final <O> boolean c(int i2, @SuppressLint({"UnknownNullness"}) O o2) {
        b<O> bVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f80e.remove(str);
        c cVar = this.f81f.get(str);
        if (cVar == null || (bVar = cVar.a) == null) {
            this.f83h.remove(str);
            this.f82g.put(str, o2);
            return true;
        }
        bVar.a(o2);
        return true;
    }

    public abstract <I, O> void f(int i2, androidx.activity.result.f.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, androidx.core.app.d dVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
                }
                this.f80e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f83h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f80e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f83h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    public final <I, O> c<I> i(String str, androidx.activity.result.f.a<I, O> aVar, b<O> bVar) {
        int k2 = k(str);
        this.f81f.put(str, new c(bVar, aVar));
        if (this.f82g.containsKey(str)) {
            Object obj = this.f82g.get(str);
            this.f82g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f83h.getParcelable(str);
        if (aVar2 != null) {
            this.f83h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, k2, aVar);
    }

    public final <I, O> c<I> j(final String str, h hVar, final androidx.activity.result.f.a<I, O> aVar, final b<O> bVar) {
        e lifecycle = hVar.getLifecycle();
        if (!lifecycle.b().a(e.c.STARTED)) {
            int k2 = k(str);
            d dVar = this.f79d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new f() {
                public void a(h hVar, e.b bVar) {
                    if (e.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f81f.put(str, new c(bVar, aVar));
                        if (ActivityResultRegistry.this.f82g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f82g.get(str);
                            ActivityResultRegistry.this.f82g.remove(str);
                            bVar.a(obj);
                        }
                        a aVar = (a) ActivityResultRegistry.this.f83h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f83h.remove(str);
                            bVar.a(aVar.c(aVar.b(), aVar.a()));
                        }
                    } else if (e.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f81f.remove(str);
                    } else if (e.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f79d.put(str, dVar);
            return new a(str, k2, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + hVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer remove;
        if (!this.f80e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f81f.remove(str);
        if (this.f82g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f82g.get(str));
            this.f82g.remove(str);
        }
        if (this.f83h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f83h.getParcelable(str));
            this.f83h.remove(str);
        }
        d dVar = this.f79d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f79d.remove(str);
        }
    }
}
