package com.yalantis.ucrop.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import com.yalantis.ucrop.k.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class a {
    public static int a(BitmapFactory.Options options, int i2, int i3) {
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 1;
        if (i4 > i3 || i5 > i2) {
            while (true) {
                if (i4 / i6 <= i3 && i5 / i6 <= i2) {
                    break;
                }
                i6 *= 2;
            }
        }
        return i6;
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int c = c.c();
        if (c > 0) {
            sqrt = Math.min(sqrt, c);
        }
        Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
        return sqrt;
    }

    public static void c(Closeable closeable) {
        if (closeable != null && (closeable instanceof Closeable)) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void d(Context context, Uri uri, Uri uri2, int i2, int i3, b bVar) {
        new com.yalantis.ucrop.m.b(context, uri, uri2, i2, i3, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int e(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int f(int i2) {
        return (i2 == 2 || i2 == 7 || i2 == 4 || i2 == 5) ? -1 : 1;
    }

    public static int g(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            int g2 = new f(openInputStream).g();
            c(openInputStream);
            return g2;
        } catch (IOException e2) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e2);
            return 0;
        }
    }

    public static boolean h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static Bitmap i(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError e2) {
            Log.e("BitmapLoadUtils", "transformBitmap: ", e2);
            return bitmap;
        }
    }
}
