package com.yalantis.ucrop.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.yalantis.ucrop.l.b;
import com.yalantis.ucrop.l.d;
import com.yalantis.ucrop.n.e;
import com.yalantis.ucrop.n.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

public class a extends AsyncTask<Void, Void, Throwable> {
    private final WeakReference<Context> a;
    private Bitmap b;
    private final RectF c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f3003d;

    /* renamed from: e  reason: collision with root package name */
    private float f3004e;

    /* renamed from: f  reason: collision with root package name */
    private float f3005f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3006g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3007h;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap.CompressFormat f3008i;

    /* renamed from: j  reason: collision with root package name */
    private final int f3009j;

    /* renamed from: k  reason: collision with root package name */
    private final String f3010k;

    /* renamed from: l  reason: collision with root package name */
    private final String f3011l;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f3012m;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f3013n;

    /* renamed from: o  reason: collision with root package name */
    private final com.yalantis.ucrop.k.a f3014o;

    /* renamed from: p  reason: collision with root package name */
    private int f3015p;

    /* renamed from: q  reason: collision with root package name */
    private int f3016q;

    /* renamed from: r  reason: collision with root package name */
    private int f3017r;

    /* renamed from: s  reason: collision with root package name */
    private int f3018s;

    public a(Context context, Bitmap bitmap, d dVar, b bVar, com.yalantis.ucrop.k.a aVar) {
        this.a = new WeakReference<>(context);
        this.b = bitmap;
        this.c = dVar.a();
        this.f3003d = dVar.c();
        this.f3004e = dVar.d();
        this.f3005f = dVar.b();
        this.f3006g = bVar.h();
        this.f3007h = bVar.i();
        this.f3008i = bVar.a();
        this.f3009j = bVar.b();
        this.f3010k = bVar.f();
        this.f3011l = bVar.g();
        this.f3012m = bVar.c();
        this.f3013n = bVar.d();
        bVar.e();
        this.f3014o = aVar;
    }

    private void a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        boolean h2 = com.yalantis.ucrop.n.a.h(this.f3012m);
        boolean h3 = com.yalantis.ucrop.n.a.h(this.f3013n);
        if (!h2 || !h3) {
            if (h2) {
                f.c(context, this.f3015p, this.f3016q, this.f3012m, this.f3011l);
                return;
            } else if (!h3) {
                f.e(new e.i.a.a(this.f3010k), this.f3015p, this.f3016q, this.f3011l);
                return;
            } else if (i2 >= 21) {
                f.d(context, new e.i.a.a(this.f3010k), this.f3015p, this.f3016q, this.f3013n);
                return;
            }
        } else if (i2 >= 21) {
            f.b(context, this.f3015p, this.f3016q, this.f3012m, this.f3013n);
            return;
        }
        Log.e("BitmapCropTask", "It is not possible to write exif info into file represented by \"content\" Uri if Android < LOLLIPOP");
    }

    private boolean b() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return false;
        }
        if (this.f3006g > 0 && this.f3007h > 0) {
            float width = this.c.width() / this.f3004e;
            float height = this.c.height() / this.f3004e;
            int i2 = this.f3006g;
            if (width > ((float) i2) || height > ((float) this.f3007h)) {
                float min = Math.min(((float) i2) / width, ((float) this.f3007h) / height);
                Bitmap bitmap = this.b;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * min), Math.round(((float) this.b.getHeight()) * min), false);
                Bitmap bitmap2 = this.b;
                if (bitmap2 != createScaledBitmap) {
                    bitmap2.recycle();
                }
                this.b = createScaledBitmap;
                this.f3004e /= min;
            }
        }
        if (this.f3005f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f3005f, (float) (this.b.getWidth() / 2), (float) (this.b.getHeight() / 2));
            Bitmap bitmap3 = this.b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.b.getHeight(), matrix, true);
            Bitmap bitmap4 = this.b;
            if (bitmap4 != createBitmap) {
                bitmap4.recycle();
            }
            this.b = createBitmap;
        }
        this.f3017r = Math.round((this.c.left - this.f3003d.left) / this.f3004e);
        this.f3018s = Math.round((this.c.top - this.f3003d.top) / this.f3004e);
        this.f3015p = Math.round(this.c.width() / this.f3004e);
        int round = Math.round(this.c.height() / this.f3004e);
        this.f3016q = round;
        boolean f2 = f(this.f3015p, round);
        Log.i("BitmapCropTask", "Should crop: " + f2);
        if (f2) {
            e(Bitmap.createBitmap(this.b, this.f3017r, this.f3018s, this.f3015p, this.f3016q));
            if (!this.f3008i.equals(Bitmap.CompressFormat.JPEG)) {
                return true;
            }
            a(context);
            return true;
        }
        e.a(context, this.f3012m, this.f3013n);
        return false;
    }

    private void e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = (Context) this.a.get();
        if (context != null) {
            OutputStream outputStream = null;
            try {
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(this.f3013n);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    outputStream = openOutputStream;
                    try {
                        Log.e("BitmapCropTask", e.getLocalizedMessage());
                        com.yalantis.ucrop.n.a.c(outputStream);
                        com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        com.yalantis.ucrop.n.a.c(outputStream);
                        com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    outputStream = openOutputStream;
                    com.yalantis.ucrop.n.a.c(outputStream);
                    com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                    throw th;
                }
                try {
                    bitmap.compress(this.f3008i, this.f3009j, byteArrayOutputStream);
                    openOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    com.yalantis.ucrop.n.a.c(openOutputStream);
                } catch (IOException e3) {
                    e = e3;
                    outputStream = openOutputStream;
                    Log.e("BitmapCropTask", e.getLocalizedMessage());
                    com.yalantis.ucrop.n.a.c(outputStream);
                    com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = openOutputStream;
                    com.yalantis.ucrop.n.a.c(outputStream);
                    com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                byteArrayOutputStream = null;
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                com.yalantis.ucrop.n.a.c(outputStream);
                com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                com.yalantis.ucrop.n.a.c(outputStream);
                com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
                throw th;
            }
            com.yalantis.ucrop.n.a.c(byteArrayOutputStream);
        }
    }

    private boolean f(int i2, int i3) {
        int round = Math.round(((float) Math.max(i2, i3)) / 1000.0f) + 1;
        if (this.f3006g > 0 && this.f3007h > 0) {
            return true;
        }
        float f2 = (float) round;
        return Math.abs(this.c.left - this.f3003d.left) > f2 || Math.abs(this.c.top - this.f3003d.top) > f2 || Math.abs(this.c.bottom - this.f3003d.bottom) > f2 || Math.abs(this.c.right - this.f3003d.right) > f2 || this.f3005f != 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f3003d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f3013n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            b();
            this.b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void onPostExecute(Throwable th) {
        com.yalantis.ucrop.k.a aVar = this.f3014o;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            this.f3014o.b(com.yalantis.ucrop.n.a.h(this.f3013n) ? this.f3013n : Uri.fromFile(new File(this.f3011l)), this.f3017r, this.f3018s, this.f3015p, this.f3016q);
            return;
        }
        aVar.a(th);
    }
}
