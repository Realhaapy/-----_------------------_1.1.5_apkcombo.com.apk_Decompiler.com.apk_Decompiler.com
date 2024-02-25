package com.facebook.internal.s0;

import com.facebook.g0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import m.d0.d;
import m.d0.f;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    public static final k a = new k();

    private k() {
    }

    public static final boolean a(String str) {
        File c = c();
        if (c == null || str == null) {
            return false;
        }
        return new File(c, str).delete();
    }

    public static final String b(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File c() {
        g0 g0Var = g0.a;
        File file = new File(g0.c().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String d(Thread thread) {
        l.d(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        l.c(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.c(stackTrace, "t.stackTrace");
            int i2 = 0;
            int length = stackTrace.length;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean f(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.c(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                String className = stackTraceElement.getClassName();
                l.c(className, "element.className");
                if (p.t(className, "com.facebook", false, 2, (Object) null)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean g(Thread thread) {
        StackTraceElement[] stackTrace;
        if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                l.c(className, "element.className");
                if (p.t(className, "com.facebook", false, 2, (Object) null)) {
                    String className2 = stackTraceElement.getClassName();
                    l.c(className2, "element.className");
                    if (!p.t(className2, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className3 = stackTraceElement.getClassName();
                        l.c(className3, "element.className");
                        if (!p.t(className3, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    l.c(methodName, "element.methodName");
                    if (!p.t(methodName, "onClick", false, 2, (Object) null)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        l.c(methodName2, "element.methodName");
                        if (!p.t(methodName2, "onItemClick", false, 2, (Object) null)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            l.c(methodName3, "element.methodName");
                            if (!p.t(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static final File[] k() {
        File c = c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(e.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean l(File file, String str) {
        l.c(str, "name");
        s sVar = s.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final File[] m() {
        File c = c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(f.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean n(File file, String str) {
        l.c(str, "name");
        s sVar = s.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        l.c(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final File[] o() {
        File c = c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(g.a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean p(File file, String str) {
        l.c(str, "name");
        s sVar = s.a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        l.c(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final JSONObject q(String str, boolean z) {
        File c = c();
        if (!(c == null || str == null)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(c, str));
                o0 o0Var = o0.a;
                return new JSONObject(o0.n0(fileInputStream));
            } catch (Exception unused) {
                if (z) {
                    a(str);
                }
            }
        }
        return null;
    }

    public static final void r(String str, JSONArray jSONArray, j0.b bVar) {
        l.d(jSONArray, "reports");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                o0 o0Var = o0.a;
                JSONObject y = o0.y();
                if (y != null) {
                    Iterator<String> keys = y.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, y.get(next));
                    }
                }
                j0.c cVar = j0.f1546n;
                s sVar = s.a;
                g0 g0Var = g0.a;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{g0.d()}, 1));
                l.c(format, "java.lang.String.format(format, *args)");
                cVar.A((u) null, format, jSONObject, bVar).k();
            } catch (JSONException unused) {
            }
        }
    }

    public static final void s(String str, String str2) {
        File c = c();
        if (c != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(c, str));
                byte[] bytes = str2.getBytes(d.a);
                l.c(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
