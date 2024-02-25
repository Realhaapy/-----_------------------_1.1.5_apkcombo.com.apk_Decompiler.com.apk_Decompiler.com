package e.f.r;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

public final class f {
    private final C0079f a;

    public static final class a {
        private final c a;

        public a(ClipData clipData, int i2) {
            this.a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i2) : new d(clipData, i2);
        }

        public f a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.b(bundle);
            return this;
        }

        public a c(int i2) {
            this.a.d(i2);
            return this;
        }

        public a d(Uri uri) {
            this.a.c(uri);
            return this;
        }
    }

    private static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int i2) {
            this.a = new ContentInfo.Builder(clipData, i2);
        }

        public f a() {
            return new f(new e(this.a.build()));
        }

        public void b(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public void c(Uri uri) {
            this.a.setLinkUri(uri);
        }

        public void d(int i2) {
            this.a.setFlags(i2);
        }
    }

    private interface c {
        f a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i2);
    }

    private static final class d implements c {
        ClipData a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        Uri f3400d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f3401e;

        d(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }

        public f a() {
            return new f(new g(this));
        }

        public void b(Bundle bundle) {
            this.f3401e = bundle;
        }

        public void c(Uri uri) {
            this.f3400d = uri;
        }

        public void d(int i2) {
            this.c = i2;
        }
    }

    private static final class e implements C0079f {
        private final ContentInfo a;

        e(ContentInfo contentInfo) {
            e.f.q.d.d(contentInfo);
            this.a = contentInfo;
        }

        public int a() {
            return this.a.getSource();
        }

        public ClipData b() {
            return this.a.getClip();
        }

        public int c() {
            return this.a.getFlags();
        }

        public ContentInfo d() {
            return this.a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* renamed from: e.f.r.f$f  reason: collision with other inner class name */
    private interface C0079f {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    private static final class g implements C0079f {
        private final ClipData a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f3402d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f3403e;

        g(d dVar) {
            ClipData clipData = dVar.a;
            e.f.q.d.d(clipData);
            this.a = clipData;
            int i2 = dVar.b;
            e.f.q.d.a(i2, 0, 5, "source");
            this.b = i2;
            int i3 = dVar.c;
            e.f.q.d.c(i3, 1);
            this.c = i3;
            this.f3402d = dVar.f3400d;
            this.f3403e = dVar.f3401e;
        }

        public int a() {
            return this.b;
        }

        public ClipData b() {
            return this.a;
        }

        public int c() {
            return this.c;
        }

        public ContentInfo d() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(f.e(this.b));
            sb.append(", flags=");
            sb.append(f.a(this.c));
            String str2 = "";
            if (this.f3402d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f3402d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f3403e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    f(C0079f fVar) {
        this.a = fVar;
    }

    static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    static String e(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static f g(ContentInfo contentInfo) {
        return new f(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public int d() {
        return this.a.a();
    }

    public ContentInfo f() {
        ContentInfo d2 = this.a.d();
        Objects.requireNonNull(d2);
        return d2;
    }

    public String toString() {
        return this.a.toString();
    }
}
