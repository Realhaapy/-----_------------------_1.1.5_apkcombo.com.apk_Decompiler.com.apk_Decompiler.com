package com.facebook.y0.q0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.y.d.p;

public final class l {
    public static final l a = new l();
    /* access modifiers changed from: private */
    public static final String b;
    private static final String[] c = {"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"};

    public static final class a implements InvocationHandler {
        final /* synthetic */ Object a;
        final /* synthetic */ p<String> b;
        final /* synthetic */ ReentrantLock c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Condition f2107d;

        a(Object obj, p<String> pVar, ReentrantLock reentrantLock, Condition condition) {
            this.a = obj;
            this.b = pVar;
            this.c = reentrantLock;
            this.f2107d = condition;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            m.y.d.l.d(method, "method");
            m.y.d.l.d(objArr, "objects");
            try {
                if (m.y.d.l.a(method.getName(), "onChecksumsReady") && objArr.length == 1 && (objArr[0] instanceof List)) {
                    for (Object next : objArr[0]) {
                        if (next != null) {
                            Method method2 = next.getClass().getMethod("getSplitName", new Class[0]);
                            m.y.d.l.c(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = next.getClass().getMethod("getType", new Class[0]);
                            m.y.d.l.c(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(next, new Object[0]) == null && m.y.d.l.a(method3.invoke(next, new Object[0]), this.a)) {
                                Method method4 = next.getClass().getMethod("getValue", new Class[0]);
                                m.y.d.l.c(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(next, new Object[0]);
                                if (invoke != null) {
                                    this.b.f5062e = new BigInteger(1, (byte[]) invoke).toString(16);
                                    this.c.lock();
                                    this.f2107d.signalAll();
                                    this.c.unlock();
                                    return null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.d(l.b, "Can't fetch checksum.", th);
            }
            return null;
        }
    }

    static {
        String simpleName = l.class.getSimpleName();
        m.y.d.l.c(simpleName, "HashUtils::class.java.simpleName");
        b = simpleName;
    }

    private l() {
    }

    public static final String b(String str) {
        return a.d(new File(str));
    }

    public static final String c(Context context, Long l2) {
        m.y.d.l.d(context, "context");
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        String[] strArr = c;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String decode : strArr) {
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(Base64.decode(decode, 0))));
        }
        List F = r.F(arrayList);
        p pVar = new p();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Class<?> cls = Class.forName("android.content.pm.Checksum");
            m.y.d.l.c(cls, "forName(\"android.content.pm.Checksum\")");
            Field field = cls.getField("TYPE_WHOLE_MD5");
            m.y.d.l.c(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get((Object) null);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            m.y.d.l.c(cls2, "forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")");
            Object newProxyInstance = Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{cls2}, new a(obj, pVar, reentrantLock, newCondition));
            m.y.d.l.c(newProxyInstance, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", new Class[]{String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2});
            m.y.d.l.c(method, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), new Object[]{context.getPackageName(), Boolean.FALSE, obj, r.F(F), newProxyInstance});
            if (l2 == null) {
                newCondition.await();
            } else {
                newCondition.awaitNanos(l2.longValue());
            }
            String str = (String) pVar.f5062e;
            reentrantLock.unlock();
            return str;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        m.x.b.a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String d(java.io.File r5) {
        /*
            r4 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r5)
            r5 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r5)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x003b }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x003b }
        L_0x0014:
            int r2 = r0.read(r5)     // Catch:{ all -> 0x003b }
            if (r2 <= 0) goto L_0x001e
            r3 = 0
            r1.update(r5, r3, r2)     // Catch:{ all -> 0x003b }
        L_0x001e:
            r3 = -1
            if (r2 != r3) goto L_0x0014
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x003b }
            r2 = 1
            byte[] r1 = r1.digest()     // Catch:{ all -> 0x003b }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x003b }
            r1 = 16
            java.lang.String r5 = r5.toString(r1)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "BigInteger(1, md.digest()).toString(16)"
            m.y.d.l.c(r5, r1)     // Catch:{ all -> 0x003b }
            r1 = 0
            m.x.b.a(r0, r1)
            return r5
        L_0x003b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            m.x.b.a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.q0.l.d(java.io.File):java.lang.String");
    }
}
