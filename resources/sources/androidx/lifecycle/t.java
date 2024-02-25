package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public class t {
    private final b a;
    private final u b;

    public static class a extends d {
        private static a c;
        private Application b;

        public a(Application application) {
            this.b = application;
        }

        public static a c(Application application) {
            if (c == null) {
                c = new a(application);
            }
            return c;
        }

        public <T extends s> T a(Class<T> cls) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (s) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    public interface b {
        <T extends s> T a(Class<T> cls);
    }

    static abstract class c extends e implements b {
        c() {
        }

        public <T extends s> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends s> T c(String str, Class<T> cls);
    }

    public static class d implements b {
        private static d a;

        static d b() {
            if (a == null) {
                a = new d();
            }
            return a;
        }

        public <T extends s> T a(Class<T> cls) {
            try {
                return (s) cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void b(s sVar) {
        }
    }

    public t(u uVar, b bVar) {
        this.a = bVar;
        this.b = uVar;
    }

    public <T extends s> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends s> T b(String str, Class<T> cls) {
        T b2 = this.b.b(str);
        if (cls.isInstance(b2)) {
            b bVar = this.a;
            if (bVar instanceof e) {
                ((e) bVar).b(b2);
            }
            return b2;
        }
        b bVar2 = this.a;
        T c2 = bVar2 instanceof c ? ((c) bVar2).c(str, cls) : bVar2.a(cls);
        this.b.d(str, c2);
        return c2;
    }
}
