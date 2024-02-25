package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import e.c.b.b;
import e.c.b.c;
import e.c.b.e;
import e.c.b.f;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import m.y.d.g;
import m.y.d.l;

public final class o extends e {
    public static final a b = new a((g) null);
    /* access modifiers changed from: private */
    public static c c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static f f1622d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f1623e = new ReentrantLock();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void d() {
            c c;
            o.f1623e.lock();
            if (o.f1622d == null && (c = o.c) != null) {
                a aVar = o.b;
                o.f1622d = c.d((b) null);
            }
            o.f1623e.unlock();
        }

        public final f b() {
            o.f1623e.lock();
            f e2 = o.f1622d;
            o.f1622d = null;
            o.f1623e.unlock();
            return e2;
        }

        public final void c(Uri uri) {
            l.d(uri, "url");
            d();
            o.f1623e.lock();
            f e2 = o.f1622d;
            if (e2 != null) {
                e2.f(uri, (Bundle) null, (List<Bundle>) null);
            }
            o.f1623e.unlock();
        }
    }

    public void a(ComponentName componentName, c cVar) {
        l.d(componentName, "name");
        l.d(cVar, "newClient");
        cVar.f(0);
        a aVar = b;
        c = cVar;
        aVar.d();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        l.d(componentName, "componentName");
    }
}
