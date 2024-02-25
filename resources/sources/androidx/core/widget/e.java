package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class e {

    static class a {
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static ColorStateList a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(imageView);
        }
        if (imageView instanceof m) {
            return ((m) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(imageView);
        }
        if (imageView instanceof m) {
            return ((m) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a.c(imageView, colorStateList);
            if (i2 == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof m) {
            ((m) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a.d(imageView, mode);
            if (i2 == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof m) {
            ((m) imageView).setSupportImageTintMode(mode);
        }
    }
}
