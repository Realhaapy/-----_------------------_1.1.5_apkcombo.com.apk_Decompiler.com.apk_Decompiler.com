package f.d.a.g.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import f.d.a.d.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import m.y.d.l;

public final class a implements f.d.a.g.a {
    private final int a;
    private final Bitmap.CompressFormat b;

    public a(int i2) {
        this.a = i2;
        int b2 = b();
        int b3 = b();
        this.b = b3 != 1 ? b3 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    private final byte[] d(byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i6;
        if (Build.VERSION.SDK_INT < 23) {
            options.inDither = true;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = (float) decodeByteArray.getWidth();
        float height = (float) decodeByteArray.getHeight();
        f.d.a.h.a.a(l.j("src width = ", Float.valueOf(width)));
        f.d.a.h.a.a(l.j("src height = ", Float.valueOf(height)));
        l.c(decodeByteArray, "bitmap");
        float a2 = f.d.a.e.a.a(decodeByteArray, i2, i3);
        f.d.a.h.a.a(l.j("scale = ", Float.valueOf(a2)));
        float f2 = width / a2;
        float f3 = height / a2;
        f.d.a.h.a.a(l.j("dst width = ", Float.valueOf(f2)));
        f.d.a.h.a.a(l.j("dst height = ", Float.valueOf(f3)));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, (int) f2, (int) f3, true);
        l.c(createScaledBitmap, "createScaledBitmap(\n    …           true\n        )");
        f.d.a.e.a.f(createScaledBitmap, i5).compress(this.b, i4, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.c(byteArray, "outputStream.toByteArray()");
        return byteArray;
    }

    public void a(Context context, String str, OutputStream outputStream, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        Context context2 = context;
        String str2 = str;
        OutputStream outputStream2 = outputStream;
        int i8 = i6;
        l.d(context, "context");
        l.d(str2, "path");
        l.d(outputStream2, "outputStream");
        if (i7 > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inSampleSize = i8;
                if (Build.VERSION.SDK_INT < 23) {
                    options.inDither = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
                l.c(decodeFile, "bitmap");
                byte[] c = f.d.a.e.a.c(decodeFile, i2, i3, i4, i5, b());
                if (z) {
                    try {
                        if (this.b == Bitmap.CompressFormat.JPEG) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(c);
                            outputStream2.write(new b(str2).c(context, byteArrayOutputStream).toByteArray());
                            return;
                        }
                    } catch (OutOfMemoryError unused) {
                        System.gc();
                        a(context, str, outputStream, i2, i3, i4, i5, z, i8 * 2, i7 - 1);
                    }
                }
                outputStream2.write(c);
            } catch (OutOfMemoryError unused2) {
                System.gc();
                a(context, str, outputStream, i2, i3, i4, i5, z, i8 * 2, i7 - 1);
            }
        }
    }

    public int b() {
        return this.a;
    }

    public void c(Context context, byte[] bArr, OutputStream outputStream, int i2, int i3, int i4, int i5, boolean z, int i6) {
        Context context2 = context;
        byte[] bArr2 = bArr;
        OutputStream outputStream2 = outputStream;
        l.d(context, "context");
        l.d(bArr, "byteArray");
        l.d(outputStream, "outputStream");
        byte[] d2 = d(bArr, i2, i3, i4, i5, i6);
        if (!z || this.b != Bitmap.CompressFormat.JPEG) {
            outputStream.write(d2);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(d2);
        outputStream.write(new b(bArr).c(context, byteArrayOutputStream).toByteArray());
    }
}
