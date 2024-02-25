package e.f.r.j0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class c {
    private final C0083c a;

    private static final class a implements C0083c {
        final InputContentInfo a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.a;
        }

        public Uri b() {
            return this.a.getContentUri();
        }

        public void c() {
            this.a.requestPermission();
        }

        public Uri d() {
            return this.a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    private static final class b implements C0083c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.a;
        }

        public void c() {
        }

        public Uri d() {
            return this.c;
        }

        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* renamed from: e.f.r.j0.c$c  reason: collision with other inner class name */
    private interface C0083c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private c(C0083c cVar) {
        this.a = cVar;
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }
}
