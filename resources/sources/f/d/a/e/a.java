package f.d.a.e;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import m.y.d.l;

public final class a {
    public static final float a(Bitmap bitmap, int i2, int i3) {
        l.d(bitmap, "<this>");
        float width = ((float) bitmap.getWidth()) / ((float) i2);
        float height = ((float) bitmap.getHeight()) / ((float) i3);
        e(l.j("width scale = ", Float.valueOf(width)));
        e(l.j("height scale = ", Float.valueOf(height)));
        return Math.max(1.0f, Math.min(width, height));
    }

    public static final void b(Bitmap bitmap, int i2, int i3, int i4, int i5, OutputStream outputStream, int i6) {
        l.d(bitmap, "<this>");
        l.d(outputStream, "outputStream");
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        e(l.j("src width = ", Float.valueOf(width)));
        e(l.j("src height = ", Float.valueOf(height)));
        float a = a(bitmap, i2, i3);
        e(l.j("scale = ", Float.valueOf(a)));
        float f2 = width / a;
        float f3 = height / a;
        e(l.j("dst width = ", Float.valueOf(f2)));
        e(l.j("dst height = ", Float.valueOf(f3)));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f2, (int) f3, true);
        l.c(createScaledBitmap, "createScaledBitmap(\n    …destH.toInt(), true\n    )");
        f(createScaledBitmap, i5).compress(d(i6), i4, outputStream);
    }

    public static final byte[] c(Bitmap bitmap, int i2, int i3, int i4, int i5, int i6) {
        l.d(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(bitmap, i2, i3, i4, i5, byteArrayOutputStream, i6);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.c(byteArray, "outputStream.toByteArray()");
        return byteArray;
    }

    public static final Bitmap.CompressFormat d(int i2) {
        return i2 != 1 ? i2 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    private static final void e(Object obj) {
        if (f.d.a.a.f3732g.a()) {
            PrintStream printStream = System.out;
            if (obj == null) {
                obj = "null";
            }
            printStream.println(obj);
        }
    }

    public static final Bitmap f(Bitmap bitmap, int i2) {
        l.d(bitmap, "<this>");
        if (i2 % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        l.c(createBitmap, "{\n        val matrix = M…ght, matrix, false)\n    }");
        return createBitmap;
    }
}
