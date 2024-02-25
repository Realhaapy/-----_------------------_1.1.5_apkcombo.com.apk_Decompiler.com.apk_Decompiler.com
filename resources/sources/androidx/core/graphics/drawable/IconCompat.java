package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import e.f.j.f.j;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f879k = PorterDuff.Mode.SRC_IN;
    public int a = -1;
    Object b;
    public byte[] c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f880d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f881e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f882f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f883g = null;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f884h = f879k;

    /* renamed from: i  reason: collision with root package name */
    public String f885i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f886j;

    static class a {
        static IconCompat a(Object obj) {
            e.f.q.d.d(obj);
            int d2 = d(obj);
            if (d2 == 2) {
                return IconCompat.l((Resources) null, c(obj), b(obj));
            }
            if (d2 == 4) {
                return IconCompat.h(e(obj));
            }
            if (d2 == 6) {
                return IconCompat.e(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r0 >= 26) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
            if (r0 >= 26) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.d(r5, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
            r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
            r0 = r4.f883g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
            if (r0 == null) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
            r5.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
            r4 = r4.f884h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
            if (r4 == androidx.core.graphics.drawable.IconCompat.f879k) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            r5.setTintMode(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
            return r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r4.a
                r2 = 0
                r3 = 26
                switch(r1) {
                    case -1: goto L_0x00af;
                    case 0: goto L_0x000a;
                    case 1: goto L_0x0096;
                    case 2: goto L_0x008b;
                    case 3: goto L_0x007e;
                    case 4: goto L_0x0075;
                    case 5: goto L_0x0065;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x0012:
                r1 = 30
                if (r0 < r1) goto L_0x0020
                android.net.Uri r5 = r4.r()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto L_0x009e
            L_0x0020:
                if (r5 == 0) goto L_0x004a
                java.io.InputStream r5 = r4.s(r5)
                if (r5 == 0) goto L_0x002f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r3) goto L_0x0070
                goto L_0x006b
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x004a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0065:
                java.lang.Object r5 = r4.b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                if (r0 < r3) goto L_0x0070
            L_0x006b:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto L_0x009e
            L_0x0070:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.d(r5, r2)
                goto L_0x009a
            L_0x0075:
                java.lang.Object r5 = r4.b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x009e
            L_0x007e:
                java.lang.Object r5 = r4.b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f881e
                int r1 = r4.f882f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x009e
            L_0x008b:
                java.lang.String r5 = r4.o()
                int r0 = r4.f881e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x009e
            L_0x0096:
                java.lang.Object r5 = r4.b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x009a:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L_0x009e:
                android.content.res.ColorStateList r0 = r4.f883g
                if (r0 == 0) goto L_0x00a5
                r5.setTintList(r0)
            L_0x00a5:
                android.graphics.PorterDuff$Mode r4 = r4.f884h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f879k
                if (r4 == r0) goto L_0x00ae
                r5.setTintMode(r4)
            L_0x00ae:
                return r5
            L_0x00af:
                java.lang.Object r4 = r4.b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
    }

    IconCompat(int i2) {
        this.a = i2;
    }

    private static String A(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat b(Bundle bundle) {
        Object obj;
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.f881e = bundle.getInt("int1");
        iconCompat.f882f = bundle.getInt("int2");
        iconCompat.f886j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f883g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f884h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i2) {
            case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
            case 1:
            case 5:
                obj = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString("obj");
                break;
            case 3:
                iconCompat.b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i2);
                return null;
        }
        iconCompat.b = obj;
        return iconCompat;
    }

    public static IconCompat c(Icon icon) {
        return a.a(icon);
    }

    static Bitmap d(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat e(Uri uri) {
        e.f.q.c.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        e.f.q.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        e.f.q.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        e.f.q.c.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        e.f.q.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.b = str;
        return iconCompat;
    }

    public static IconCompat j(byte[] bArr, int i2, int i3) {
        e.f.q.c.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.b = bArr;
        iconCompat.f881e = i2;
        iconCompat.f882f = i3;
        return iconCompat;
    }

    public static IconCompat k(Context context, int i2) {
        e.f.q.c.c(context);
        return l(context.getResources(), context.getPackageName(), i2);
    }

    public static IconCompat l(Resources resources, String str, int i2) {
        e.f.q.c.c(str);
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f881e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.f886j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e2);
            return null;
        }
    }

    private Drawable u(Context context) {
        switch (this.a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.b);
            case 2:
                String o2 = o();
                if (TextUtils.isEmpty(o2)) {
                    o2 = context.getPackageName();
                }
                try {
                    return j.d(p(context, o2), this.f881e, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f881e), this.b}), e2);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.b, this.f881e, this.f882f));
            case 4:
                InputStream s2 = s(context);
                if (s2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s2));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), d((Bitmap) this.b, false));
            case 6:
                InputStream s3 = s(context);
                if (s3 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s3))) : new BitmapDrawable(context.getResources(), d(BitmapFactory.decodeStream(s3), false));
                }
                break;
        }
        return null;
    }

    public void a(Context context) {
        Object obj;
        if (this.a == 2 && (obj = this.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String o2 = o();
                int identifier = p(context, o2).getIdentifier(str4, str3, str5);
                if (this.f881e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + o2 + " " + str);
                    this.f881e = identifier;
                }
            }
        }
    }

    public Bitmap m() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i2 == 1) {
            return (Bitmap) this.b;
        } else {
            if (i2 == 5) {
                return d((Bitmap) this.b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int n() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.b);
        }
        if (i2 == 2) {
            return this.f881e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String o() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.b);
        }
        if (i2 == 2) {
            String str = this.f886j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.b).split(":", -1)[0] : this.f886j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int q() {
        int i2 = this.a;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : a.d(this.b);
    }

    public Uri r() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream s(Context context) {
        String str;
        StringBuilder sb;
        Uri r2 = r();
        String scheme = r2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(r2);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(r2);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(r2);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    public Drawable t(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(z(context), context);
        }
        Drawable u = u(context);
        if (!(u == null || (this.f883g == null && this.f884h == f879k))) {
            u.mutate();
            a.n(u, this.f883g);
            a.o(u, this.f884h);
        }
        return u;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.a
            java.lang.String r1 = A(r1)
            r0.append(r1)
            int r1 = r4.a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.b
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f881e
            r0.append(r1)
            int r1 = r4.f882f
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f882f
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f886j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.n()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f883g
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f883g
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f884h
            android.graphics.PorterDuff$Mode r2 = f879k
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f884h
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public void v() {
        Parcelable parcelable;
        this.f884h = PorterDuff.Mode.valueOf(this.f885i);
        switch (this.a) {
            case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
                parcelable = this.f880d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f880d;
                if (parcelable == null) {
                    byte[] bArr = this.c;
                    this.b = bArr;
                    this.a = 3;
                    this.f881e = 0;
                    this.f882f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName("UTF-16"));
                this.b = str;
                if (this.a == 2 && this.f886j == null) {
                    this.f886j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.c;
                return;
            default:
                return;
        }
        this.b = parcelable;
    }

    public void w(boolean z) {
        this.f885i = this.f884h.name();
        switch (this.a) {
            case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f880d = (Parcelable) this.b;
    }

    public Bundle x() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.a) {
            case FlutterRenderer.ViewportMetrics.unsetValue /*-1*/:
                parcelable = (Parcelable) this.b;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.b;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable("obj", parcelable);
        bundle.putInt("type", this.a);
        bundle.putInt("int1", this.f881e);
        bundle.putInt("int2", this.f882f);
        bundle.putString("string1", this.f886j);
        ColorStateList colorStateList = this.f883g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f884h;
        if (mode != f879k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon y() {
        return z((Context) null);
    }

    public Icon z(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
}
