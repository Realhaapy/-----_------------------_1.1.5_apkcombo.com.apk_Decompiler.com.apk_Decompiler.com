package f.e.c.a.v.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import f.e.c.a.g;
import f.e.c.a.i;
import f.e.c.a.j;
import f.e.c.a.k;
import f.e.c.a.l;
import f.e.c.a.v.a.c;
import f.e.c.a.z.a.c0;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;

public final class a {
    /* access modifiers changed from: private */
    public static final String c = "a";
    private final f.e.c.a.a a;
    private j b;

    public static final class b {
        private k a = null;
        /* access modifiers changed from: private */
        public l b = null;
        private String c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public f.e.c.a.a f4032d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4033e = true;

        /* renamed from: f  reason: collision with root package name */
        private g f4034f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f4035g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public j f4036h;

        private j e() {
            f.e.c.a.a aVar = this.f4032d;
            if (aVar != null) {
                try {
                    return j.j(i.j(this.a, aVar));
                } catch (c0 | GeneralSecurityException e2) {
                    Log.w(a.c, "cannot decrypt keyset: ", e2);
                }
            }
            return j.j(f.e.c.a.b.a(this.a));
        }

        private j f() {
            try {
                return e();
            } catch (FileNotFoundException e2) {
                Log.w(a.c, "keyset not found, will generate a new one", e2);
                if (this.f4034f != null) {
                    j i2 = j.i();
                    i2.a(this.f4034f);
                    i2.h(i2.c().g().S(0).S());
                    if (this.f4032d != null) {
                        i2.c().k(this.b, this.f4032d);
                    } else {
                        f.e.c.a.b.b(i2.c(), this.b);
                    }
                    return i2;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private f.e.c.a.a g() {
            c cVar;
            if (!a.d()) {
                Log.w(a.c, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.f4035g != null) {
                c.b bVar = new c.b();
                bVar.b(this.f4035g);
                cVar = bVar.a();
            } else {
                cVar = new c();
            }
            boolean e2 = cVar.e(this.c);
            if (!e2) {
                try {
                    c.d(this.c);
                } catch (GeneralSecurityException | ProviderException e3) {
                    Log.w(a.c, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
            }
            try {
                return cVar.b(this.c);
            } catch (GeneralSecurityException | ProviderException e4) {
                if (!e2) {
                    Log.w(a.c, "cannot use Android Keystore, it'll be disabled", e4);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.c}), e4);
            }
        }

        public synchronized a d() {
            if (this.c != null) {
                this.f4032d = g();
            }
            this.f4036h = f();
            return new a(this);
        }

        public b h(g gVar) {
            this.f4034f = gVar;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f4033e) {
                this.c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public b j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.a = new d(context, str, str2);
                this.b = new e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    private a(b bVar) {
        l unused = bVar.b;
        this.a = bVar.f4032d;
        this.b = bVar.f4036h;
    }

    /* access modifiers changed from: private */
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized i c() {
        return this.b.c();
    }
}
