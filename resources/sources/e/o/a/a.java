package e.o.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import f.e.c.a.g;
import f.e.c.a.i;
import f.e.c.a.t.f;
import f.e.c.a.v.a.a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements SharedPreferences {
    final SharedPreferences a;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> b = new ArrayList();
    final String c;

    /* renamed from: d  reason: collision with root package name */
    final f.e.c.a.a f3560d;

    /* renamed from: e  reason: collision with root package name */
    final f.e.c.a.d f3561e;

    /* renamed from: e.o.a.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0092a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.o.a.a$c[] r0 = e.o.a.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                e.o.a.a$c r1 = e.o.a.a.c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.o.a.a$c r1 = e.o.a.a.c.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.o.a.a$c r1 = e.o.a.a.c.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.o.a.a$c r1 = e.o.a.a.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.o.a.a$c r1 = e.o.a.a.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.o.a.a$c r1 = e.o.a.a.c.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.o.a.a.C0092a.<clinit>():void");
        }
    }

    private static final class b implements SharedPreferences.Editor {
        private final a a;
        private final SharedPreferences.Editor b;
        private final List<String> c;

        /* renamed from: d  reason: collision with root package name */
        private AtomicBoolean f3562d = new AtomicBoolean(false);

        b(a aVar, SharedPreferences.Editor editor) {
            this.a = aVar;
            this.b = editor;
            this.c = new CopyOnWriteArrayList();
        }

        private void a() {
            if (this.f3562d.getAndSet(false)) {
                for (String next : this.a.getAll().keySet()) {
                    if (!this.c.contains(next) && !this.a.g(next)) {
                        this.b.remove(this.a.d(next));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener next : this.a.b) {
                for (String onSharedPreferenceChanged : this.c) {
                    next.onSharedPreferenceChanged(this.a, onSharedPreferenceChanged);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (!this.a.g(str)) {
                this.c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e2 = this.a.e(str, bArr);
                    this.b.putString((String) e2.first, (String) e2.second);
                } catch (GeneralSecurityException e3) {
                    throw new SecurityException("Could not encrypt data: " + e3.getMessage(), e3);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        public void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        public SharedPreferences.Editor clear() {
            this.f3562d.set(true);
            return this;
        }

        public boolean commit() {
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                this.c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.c());
            allocate.put(z ? (byte) 1 : 0);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.c());
            allocate.putFloat(f2);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.c());
            allocate.putInt(i2);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.c());
            allocate.putLong(j2);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.c());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new e.e.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.a.g(str)) {
                this.b.remove(this.a.d(str));
                this.c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f3570e;

        private c(int i2) {
            this.f3570e = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return STRING_SET;
            }
            if (i2 == 2) {
                return INT;
            }
            if (i2 == 3) {
                return LONG;
            }
            if (i2 == 4) {
                return FLOAT;
            }
            if (i2 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.f3570e;
        }
    }

    public enum d {
        AES256_SIV(f.e.c.a.u.a.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f3573e;

        private d(g gVar) {
            this.f3573e = gVar;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            return this.f3573e;
        }
    }

    public enum e {
        AES256_GCM(f.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f3576e;

        private e(g gVar) {
            this.f3576e = gVar;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            return this.f3576e;
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, f.e.c.a.a aVar, f.e.c.a.d dVar) {
        this.c = str;
        this.a = sharedPreferences;
        this.f3560d = aVar;
        this.f3561e = dVar;
    }

    public static SharedPreferences a(Context context, String str, b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        f.e.c.a.u.b.b();
        f.e.c.a.t.a.b();
        Context applicationContext = context.getApplicationContext();
        a.b bVar = new a.b();
        bVar.h(dVar.a());
        bVar.j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        bVar.i("android-keystore://" + str2);
        i c2 = bVar.d().c();
        a.b bVar2 = new a.b();
        bVar2.h(eVar.a());
        bVar2.j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        bVar2.i("android-keystore://" + str2);
        f.e.c.a.a aVar = (f.e.c.a.a) bVar2.d().c().h(f.e.c.a.a.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), aVar, (f.e.c.a.d) c2.h(f.e.c.a.d.class));
    }

    private Object f(String str) {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d2 = d(str);
                String string = this.a.getString(d2, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f3560d.b(f.e.c.a.a0.f.a(string, 0), d2.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C0092a.a[c.a(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i2 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i2);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 6:
                        e.e.b bVar = new e.e.b();
                        while (wrap.hasRemaining()) {
                            int i3 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i3);
                            wrap.position(wrap.position() + i3);
                            bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (bVar.size() != 1 || !"__NULL__".equals(bVar.o(0))) {
                            return bVar;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        try {
            String str2 = new String(this.f3561e.b(f.e.c.a.a0.f.a(str, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
        }
    }

    public boolean contains(String str) {
        if (!g(str)) {
            return this.a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* access modifiers changed from: package-private */
    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return f.e.c.a.a0.f.d(this.f3561e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public Pair<String, String> e(String str, byte[] bArr) {
        String d2 = d(str);
        return new Pair<>(d2, f.e.c.a.a0.f.d(this.f3560d.a(bArr, d2.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (!g((String) next.getKey())) {
                String c2 = c((String) next.getKey());
                hashMap.put(c2, f(c2));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Boolean)) ? z : ((Boolean) f2).booleanValue();
    }

    public float getFloat(String str, float f2) {
        Object f3 = f(str);
        return (f3 == null || !(f3 instanceof Float)) ? f2 : ((Float) f3).floatValue();
    }

    public int getInt(String str, int i2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Integer)) ? i2 : ((Integer) f2).intValue();
    }

    public long getLong(String str, long j2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Long)) ? j2 : ((Long) f2).longValue();
    }

    public String getString(String str, String str2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof String)) ? str2 : (String) f2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Object f2 = f(str);
        Set<String> bVar = f2 instanceof Set ? (Set) f2 : new e.e.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
