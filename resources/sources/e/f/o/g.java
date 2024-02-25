package e.f.o;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import e.f.q.d;
import java.util.concurrent.Executor;

public class g {

    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.a = i2;
            this.b = bVarArr;
        }

        static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        private final Uri a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3377d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3378e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            d.d(uri);
            this.a = uri;
            this.b = i2;
            this.c = i3;
            this.f3377d = z;
            this.f3378e = i4;
        }

        static b a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        public int b() {
            return this.f3378e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.f3377d;
        }
    }

    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i2, boolean z, int i3, Handler handler, c cVar) {
        b bVar = new b(cVar, handler);
        return z ? f.e(context, eVar, bVar, i2, i3) : f.d(context, eVar, i2, (Executor) null, bVar);
    }
}
