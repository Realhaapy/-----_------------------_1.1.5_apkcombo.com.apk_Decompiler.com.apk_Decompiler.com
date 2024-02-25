package com.facebook.y0;

import android.content.Context;
import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.y0.t;
import com.facebook.y0.v;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import m.y.d.l;

public final class x {
    public static final x a = new x();
    private static final String b;

    private static final class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (l.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = t.a.class;
            } else {
                if (l.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                    cls = v.b.class;
                }
                l.c(readClassDescriptor, "resultClassDescriptor");
                return readClassDescriptor;
            }
            readClassDescriptor = ObjectStreamClass.lookup(cls);
            l.c(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        String name = x.class.getName();
        l.c(name, "AppEventDiskStore::class.java.name");
        b = name;
    }

    private x() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5 A[Catch:{ Exception -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.facebook.y0.h0 a() {
        /*
            java.lang.Class<com.facebook.y0.x> r0 = com.facebook.y0.x.class
            monitor-enter(r0)
            com.facebook.y0.q0.g r1 = com.facebook.y0.q0.g.a     // Catch:{ all -> 0x00ac }
            com.facebook.y0.q0.g.b()     // Catch:{ all -> 0x00ac }
            com.facebook.g0 r1 = com.facebook.g0.a     // Catch:{ all -> 0x00ac }
            android.content.Context r1 = com.facebook.g0.c()     // Catch:{ all -> 0x00ac }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            m.y.d.l.c(r3, r4)     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            com.facebook.y0.x$a r4 = new com.facebook.y0.x$a     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008d, Exception -> 0x0053, all -> 0x004f }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x008e, Exception -> 0x004d }
            if (r3 == 0) goto L_0x0045
            com.facebook.y0.h0 r3 = (com.facebook.y0.h0) r3     // Catch:{ FileNotFoundException -> 0x008e, Exception -> 0x004d }
            com.facebook.internal.o0 r2 = com.facebook.internal.o0.a     // Catch:{ all -> 0x00ac }
            com.facebook.internal.o0.h(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x003b }
            r1.delete()     // Catch:{ Exception -> 0x003b }
            goto L_0x0043
        L_0x003b:
            r1 = move-exception
            java.lang.String r2 = b     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x00ac }
        L_0x0043:
            r2 = r3
            goto L_0x00a3
        L_0x0045:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ FileNotFoundException -> 0x008e, Exception -> 0x004d }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008e, Exception -> 0x004d }
            throw r3     // Catch:{ FileNotFoundException -> 0x008e, Exception -> 0x004d }
        L_0x004d:
            r3 = move-exception
            goto L_0x0055
        L_0x004f:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x0075
        L_0x0053:
            r3 = move-exception
            r4 = r2
        L_0x0055:
            java.lang.String r5 = b     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0074 }
            com.facebook.internal.o0 r3 = com.facebook.internal.o0.a     // Catch:{ all -> 0x00ac }
            com.facebook.internal.o0.h(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x00a3
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = b     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0070:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00a3
        L_0x0074:
            r2 = move-exception
        L_0x0075:
            com.facebook.internal.o0 r3 = com.facebook.internal.o0.a     // Catch:{ all -> 0x00ac }
            com.facebook.internal.o0.h(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0084 }
            r1.delete()     // Catch:{ Exception -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            r1 = move-exception
            java.lang.String r3 = b     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x00ac }
        L_0x008c:
            throw r2     // Catch:{ all -> 0x00ac }
        L_0x008d:
            r4 = r2
        L_0x008e:
            com.facebook.internal.o0 r3 = com.facebook.internal.o0.a     // Catch:{ all -> 0x00ac }
            com.facebook.internal.o0.h(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x009d }
            r1.delete()     // Catch:{ Exception -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r1 = move-exception
            java.lang.String r3 = b     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0070
        L_0x00a3:
            if (r2 != 0) goto L_0x00aa
            com.facebook.y0.h0 r2 = new com.facebook.y0.h0     // Catch:{ all -> 0x00ac }
            r2.<init>()     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r0)
            return r2
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.x.a():com.facebook.y0.h0");
    }

    public static final void b(h0 h0Var) {
        g0 g0Var = g0.a;
        Context c = g0.c();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(c.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(h0Var);
                o0 o0Var = o0.a;
                o0.h(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(b, "Got unexpected exception while persisting events: ", th);
                    try {
                        c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    o0 o0Var2 = o0.a;
                    o0.h(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            Log.w(b, "Got unexpected exception while persisting events: ", th);
            c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }
}
