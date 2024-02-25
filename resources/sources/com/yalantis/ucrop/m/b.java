package com.yalantis.ucrop.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.yalantis.ucrop.l.c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class b extends AsyncTask<Void, Void, a> {
    private final WeakReference<Context> a;
    private Uri b;
    private Uri c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3019d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3020e;

    /* renamed from: f  reason: collision with root package name */
    private final com.yalantis.ucrop.k.b f3021f;

    public static class a {
        Bitmap a;
        c b;
        Exception c;

        public a(Bitmap bitmap, c cVar) {
            this.a = bitmap;
            this.b = cVar;
        }

        public a(Exception exc) {
            this.c = exc;
        }
    }

    public b(Context context, Uri uri, Uri uri2, int i2, int i3, com.yalantis.ucrop.k.b bVar) {
        this.a = new WeakReference<>(context);
        this.b = uri;
        this.c = uri2;
        this.f3019d = i2;
        this.f3020e = i3;
        this.f3021f = bVar;
    }

    private boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.net.Uri r5, android.net.Uri r6) {
        /*
            r4 = this;
            java.lang.String r0 = "BitmapWorkerTask"
            java.lang.String r1 = "downloadFile"
            android.util.Log.d(r0, r1)
            java.lang.String r0 = "Output Uri is null - cannot download image"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "Context is null"
            java.util.Objects.requireNonNull(r0, r1)
            com.yalantis.ucrop.a r1 = com.yalantis.ucrop.a.b
            p.v r1 = r1.a()
            r2 = 0
            p.y$a r3 = new p.y$a     // Catch:{ all -> 0x007d }
            r3.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007d }
            r3.f(r5)     // Catch:{ all -> 0x007d }
            p.y r5 = r3.a()     // Catch:{ all -> 0x007d }
            p.e r5 = r1.u(r5)     // Catch:{ all -> 0x007d }
            p.a0 r5 = r5.c()     // Catch:{ all -> 0x007d }
            p.b0 r3 = r5.a()     // Catch:{ all -> 0x0079 }
            q.e r3 = r3.o()     // Catch:{ all -> 0x0079 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0074 }
            java.io.OutputStream r6 = r0.openOutputStream(r6)     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x006c
            q.r r2 = q.l.d(r6)     // Catch:{ all -> 0x0074 }
            r3.H(r2)     // Catch:{ all -> 0x0074 }
            com.yalantis.ucrop.n.a.c(r3)
            com.yalantis.ucrop.n.a.c(r2)
            if (r5 == 0) goto L_0x0060
            p.b0 r5 = r5.a()
            com.yalantis.ucrop.n.a.c(r5)
        L_0x0060:
            p.n r5 = r1.k()
            r5.a()
            android.net.Uri r5 = r4.c
            r4.b = r5
            return
        L_0x006c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "OutputStream for given output Uri is null"
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            throw r6     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r6 = move-exception
            r0 = r5
            r5 = r2
            r2 = r3
            goto L_0x0080
        L_0x0079:
            r6 = move-exception
            r0 = r5
            r5 = r2
            goto L_0x0080
        L_0x007d:
            r6 = move-exception
            r5 = r2
            r0 = r5
        L_0x0080:
            com.yalantis.ucrop.n.a.c(r2)
            com.yalantis.ucrop.n.a.c(r5)
            if (r0 == 0) goto L_0x008f
            p.b0 r5 = r0.a()
            com.yalantis.ucrop.n.a.c(r5)
        L_0x008f:
            p.n r5 = r1.k()
            r5.a()
            android.net.Uri r5 = r4.c
            r4.b = r5
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.m.b.c(android.net.Uri, android.net.Uri):void");
    }

    private void e() {
        String scheme = this.b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                c(this.b, this.c);
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Downloading failed", e2);
                throw e2;
            }
        } else if (!"file".equals(scheme) && !"content".equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = (Context) this.a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = com.yalantis.ucrop.n.a.a(options, this.f3019d, this.f3020e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.b);
                    bitmap = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        a aVar = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.b + "]"));
                        com.yalantis.ucrop.n.a.c(openInputStream);
                        return aVar;
                    }
                    com.yalantis.ucrop.n.a.c(openInputStream);
                    if (!a(bitmap, options)) {
                        z = true;
                    }
                } catch (OutOfMemoryError e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e2);
                    options.inSampleSize *= 2;
                } catch (IOException e3) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e3);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]", e3));
                } catch (Throwable th) {
                    com.yalantis.ucrop.n.a.c(openInputStream);
                    throw th;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]"));
            }
            int g2 = com.yalantis.ucrop.n.a.g(context, this.b);
            int e4 = com.yalantis.ucrop.n.a.e(g2);
            int f2 = com.yalantis.ucrop.n.a.f(g2);
            c cVar = new c(g2, e4, f2);
            Matrix matrix = new Matrix();
            if (e4 != 0) {
                matrix.preRotate((float) e4);
            }
            if (f2 != 1) {
                matrix.postScale((float) f2, 1.0f);
            }
            return !matrix.isIdentity() ? new a(com.yalantis.ucrop.n.a.i(bitmap, matrix), cVar) : new a(bitmap, cVar);
        } catch (IOException | NullPointerException e5) {
            return new a(e5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.c;
        if (exc == null) {
            this.f3021f.b(aVar.a, aVar.b, this.b, this.c);
        } else {
            this.f3021f.a(exc);
        }
    }
}
