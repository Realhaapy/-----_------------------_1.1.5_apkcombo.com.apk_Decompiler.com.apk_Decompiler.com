package r.b.a.y;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r.b.a.w.d;

public final class c extends i {
    private List<String> c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentNavigableMap<String, a> f5804d = new ConcurrentSkipListMap();

    static class a {
        /* access modifiers changed from: private */
        public final String a;
        private final String[] b;
        private final short[] c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicReferenceArray<Object> f5805d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f5805d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        /* access modifiers changed from: package-private */
        public f b(short s2) {
            Object obj = this.f5805d.get(s2);
            if (obj instanceof byte[]) {
                obj = a.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f5805d.set(s2, obj);
            }
            return (f) obj;
        }

        /* access modifiers changed from: package-private */
        public f c(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return b(this.c[binarySearch]);
            } catch (Exception e2) {
                throw new g("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.a, e2);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            h(inputStream);
        } catch (Exception e2) {
            throw new g("Unable to load TZDB time-zone rules", e2);
        }
    }

    private boolean h(InputStream inputStream) {
        boolean z = false;
        for (a next : i(inputStream)) {
            a aVar = (a) this.f5804d.putIfAbsent(next.a, next);
            if (aVar == null || aVar.a.equals(next.a)) {
                z = true;
            } else {
                throw new g("Data already loaded for TZDB time-zone rules version: " + next.a);
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Iterable<r.b.a.y.c.a> i(java.io.InputStream r13) {
        /*
            r12 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r13)
            byte r13 = r0.readByte()
            java.lang.String r1 = "File format not recognised"
            r2 = 1
            if (r13 != r2) goto L_0x0099
            java.lang.String r13 = r0.readUTF()
            java.lang.String r2 = "TZDB"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x0093
            short r13 = r0.readShort()
            java.lang.String[] r1 = new java.lang.String[r13]
            r2 = 0
            r3 = 0
        L_0x0022:
            if (r3 >= r13) goto L_0x002d
            java.lang.String r4 = r0.readUTF()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002d:
            short r3 = r0.readShort()
            java.lang.String[] r4 = new java.lang.String[r3]
            r5 = 0
        L_0x0034:
            if (r5 >= r3) goto L_0x003f
            java.lang.String r6 = r0.readUTF()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0034
        L_0x003f:
            java.util.List r3 = java.util.Arrays.asList(r4)
            r12.c = r3
            short r3 = r0.readShort()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = 0
        L_0x004c:
            if (r6 >= r3) goto L_0x005c
            short r7 = r0.readShort()
            byte[] r7 = new byte[r7]
            r0.readFully(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r13)
            r6 = 0
        L_0x0067:
            if (r6 >= r13) goto L_0x0092
            short r7 = r0.readShort()
            java.lang.String[] r8 = new java.lang.String[r7]
            short[] r9 = new short[r7]
            r10 = 0
        L_0x0072:
            if (r10 >= r7) goto L_0x0085
            short r11 = r0.readShort()
            r11 = r4[r11]
            r8[r10] = r11
            short r11 = r0.readShort()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0085:
            r.b.a.y.c$a r7 = new r.b.a.y.c$a
            r10 = r1[r6]
            r7.<init>(r10, r8, r9, r3)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0092:
            return r5
        L_0x0093:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        L_0x0099:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a.y.c.i(java.io.InputStream):java.lang.Iterable");
    }

    /* access modifiers changed from: protected */
    public f d(String str, boolean z) {
        d.i(str, "zoneId");
        f c2 = ((a) this.f5804d.lastEntry().getValue()).c(str);
        if (c2 != null) {
            return c2;
        }
        throw new g("Unknown time-zone ID: " + str);
    }

    /* access modifiers changed from: protected */
    public Set<String> e() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }
}
