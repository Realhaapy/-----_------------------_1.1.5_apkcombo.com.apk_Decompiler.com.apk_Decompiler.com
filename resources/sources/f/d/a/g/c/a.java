package f.d.a.g.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import e.k.d;
import java.io.File;
import java.io.OutputStream;
import m.y.d.l;

public final class a implements f.d.a.g.a {
    private final void d(String str, int i2, int i3, int i4, int i5, int i6, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str, g(i6));
        l.c(decodeFile, "bitmap");
        f(decodeFile, i2, i3, i5, str2, i4);
    }

    private final void e(byte[] bArr, int i2, int i3, int i4, int i5, int i6, String str) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, g(i6));
        l.c(decodeByteArray, "bitmap");
        f(decodeByteArray, i2, i3, i5, str, i4);
    }

    private final void f(Bitmap bitmap, int i2, int i3, int i4, String str, int i5) {
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        f.d.a.h.a.a(l.j("src width = ", Float.valueOf(width)));
        f.d.a.h.a.a(l.j("src height = ", Float.valueOf(height)));
        float a = f.d.a.e.a.a(bitmap, i2, i3);
        f.d.a.h.a.a(l.j("scale = ", Float.valueOf(a)));
        float f2 = width / a;
        float f3 = height / a;
        f.d.a.h.a.a(l.j("dst width = ", Float.valueOf(f2)));
        f.d.a.h.a.a(l.j("dst height = ", Float.valueOf(f3)));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f2, (int) f3, true);
        l.c(createScaledBitmap, "createScaledBitmap(\n    …           true\n        )");
        Bitmap f4 = f.d.a.e.a.f(createScaledBitmap, i4);
        d.b bVar = new d.b(str, f4.getWidth(), f4.getHeight(), 2);
        bVar.c(i5);
        bVar.b(1);
        d a2 = bVar.a();
        a2.B();
        a2.a(f4);
        a2.E(5000);
        a2.close();
    }

    private final BitmapFactory.Options g(int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i2;
        if (Build.VERSION.SDK_INT < 23) {
            options.inDither = true;
        }
        return options;
    }

    public void a(Context context, String str, OutputStream outputStream, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        Context context2 = context;
        OutputStream outputStream2 = outputStream;
        l.d(context, "context");
        l.d(str, "path");
        l.d(outputStream, "outputStream");
        File a = f.d.a.i.a.a.a(context);
        String absolutePath = a.getAbsolutePath();
        l.c(absolutePath, "tmpFile.absolutePath");
        d(str, i2, i3, i4, i5, i6, absolutePath);
        outputStream.write(f.a(a));
    }

    public int b() {
        return 2;
    }

    public void c(Context context, byte[] bArr, OutputStream outputStream, int i2, int i3, int i4, int i5, boolean z, int i6) {
        Context context2 = context;
        OutputStream outputStream2 = outputStream;
        l.d(context, "context");
        l.d(bArr, "byteArray");
        l.d(outputStream, "outputStream");
        File a = f.d.a.i.a.a.a(context);
        String absolutePath = a.getAbsolutePath();
        l.c(absolutePath, "tmpFile.absolutePath");
        e(bArr, i2, i3, i4, i5, i6, absolutePath);
        outputStream.write(f.a(a));
    }
}
