package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.b;

public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = bVar.p(iconCompat.a, 1);
        iconCompat.c = bVar.j(iconCompat.c, 2);
        iconCompat.f880d = bVar.r(iconCompat.f880d, 3);
        iconCompat.f881e = bVar.p(iconCompat.f881e, 4);
        iconCompat.f882f = bVar.p(iconCompat.f882f, 5);
        iconCompat.f883g = (ColorStateList) bVar.r(iconCompat.f883g, 6);
        iconCompat.f885i = bVar.t(iconCompat.f885i, 7);
        iconCompat.f886j = bVar.t(iconCompat.f886j, 8);
        iconCompat.v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.x(true, true);
        iconCompat.w(bVar.f());
        int i2 = iconCompat.a;
        if (-1 != i2) {
            bVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f880d;
        if (parcelable != null) {
            bVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f881e;
        if (i3 != 0) {
            bVar.F(i3, 4);
        }
        int i4 = iconCompat.f882f;
        if (i4 != 0) {
            bVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f883g;
        if (colorStateList != null) {
            bVar.H(colorStateList, 6);
        }
        String str = iconCompat.f885i;
        if (str != null) {
            bVar.J(str, 7);
        }
        String str2 = iconCompat.f886j;
        if (str2 != null) {
            bVar.J(str2, 8);
        }
    }
}
