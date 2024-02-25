package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import m.y.d.l;
import m.y.d.s;

public class k0 extends AsyncTask<Void, Void, List<? extends m0>> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1567d = k0.class.getCanonicalName();
    private final HttpURLConnection a;
    private final l0 b;
    private Exception c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var) {
        this((HttpURLConnection) null, l0Var);
        l.d(l0Var, "requests");
    }

    public k0(HttpURLConnection httpURLConnection, l0 l0Var) {
        l.d(l0Var, "requests");
        this.a = httpURLConnection;
        this.b = l0Var;
    }

    public List<m0> a(Void... voidArr) {
        if (a.d(this)) {
            return null;
        }
        try {
            l.d(voidArr, "params");
            HttpURLConnection httpURLConnection = this.a;
            return httpURLConnection == null ? this.b.l() : j0.f1546n.m(httpURLConnection, this.b);
        } catch (Exception e2) {
            this.c = e2;
            return null;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(List<m0> list) {
        if (!a.d(this)) {
            try {
                l.d(list, "result");
                super.onPostExecute(list);
                Exception exc = this.c;
                if (exc != null) {
                    o0 o0Var = o0.a;
                    String str = f1567d;
                    s sVar = s.a;
                    String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    l.c(format, "java.lang.String.format(format, *args)");
                    o0.e0(str, format);
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (a.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!a.d(this)) {
            try {
                b((List) obj);
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public void onPreExecute() {
        if (!a.d(this)) {
            try {
                super.onPreExecute();
                g0 g0Var = g0.a;
                if (g0.t()) {
                    o0 o0Var = o0.a;
                    String str = f1567d;
                    s sVar = s.a;
                    String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    l.c(format, "java.lang.String.format(format, *args)");
                    o0.e0(str, format);
                }
                if (this.b.r() == null) {
                    this.b.D(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                a.b(th, this);
            }
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask: " + " connection: " + this.a + ", requests: " + this.b + "}";
        l.c(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
