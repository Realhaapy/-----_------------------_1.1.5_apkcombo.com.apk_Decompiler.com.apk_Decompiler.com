package androidx.versionedparcelable;

import android.os.Parcelable;
import e.e.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class b {
    protected final a<String, Method> a;
    protected final a<String, Method> b;
    protected final a<String, Class> c;

    public b(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    private void N(d dVar) {
        try {
            I(c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    private Class c(Class<? extends d> cls) {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Class<b> cls = b.class;
        Method method = this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", new Class[]{cls, b.class});
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i2) {
        w(i2);
        A(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i2) {
        w(i2);
        C(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void E(int i2);

    public void F(int i2, int i3) {
        w(i3);
        E(i2);
    }

    /* access modifiers changed from: protected */
    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i2) {
        w(i2);
        G(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void I(String str);

    public void J(String str, int i2) {
        w(i2);
        I(str);
    }

    /* access modifiers changed from: protected */
    public <T extends d> void K(T t, b bVar) {
        try {
            e(t.getClass()).invoke((Object) null, new Object[]{t, bVar});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    /* access modifiers changed from: protected */
    public void L(d dVar) {
        if (dVar == null) {
            I((String) null);
            return;
        }
        N(dVar);
        b b2 = b();
        K(dVar, b2);
        b2.a();
    }

    public void M(d dVar, int i2) {
        w(i2);
        L(dVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract b b();

    public boolean f() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public boolean h(boolean z, int i2) {
        return !m(i2) ? z : g();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i2) {
        return !m(i2) ? bArr : i();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i2) {
        return !m(i2) ? charSequence : k();
    }

    /* access modifiers changed from: protected */
    public abstract boolean m(int i2);

    /* access modifiers changed from: protected */
    public <T extends d> T n(String str, b bVar) {
        try {
            return (d) d(str).invoke((Object) null, new Object[]{bVar});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int o();

    public int p(int i2, int i3) {
        return !m(i3) ? i2 : o();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i2) {
        return !m(i2) ? t : q();
    }

    /* access modifiers changed from: protected */
    public abstract String s();

    public String t(String str, int i2) {
        return !m(i2) ? str : s();
    }

    /* access modifiers changed from: protected */
    public <T extends d> T u() {
        String s2 = s();
        if (s2 == null) {
            return null;
        }
        return n(s2, b());
    }

    public <T extends d> T v(T t, int i2) {
        return !m(i2) ? t : u();
    }

    /* access modifiers changed from: protected */
    public abstract void w(int i2);

    public void x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void y(boolean z);

    public void z(boolean z, int i2) {
        w(i2);
        y(z);
    }
}
