package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class j {
    private Intent a = new Intent();
    private Bundle b;

    public static class a {
        private final Bundle a = new Bundle();

        public Bundle a() {
            return this.a;
        }

        public void b(int i2) {
            this.a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i2);
        }

        public void c(int i2, com.yalantis.ucrop.l.a... aVarArr) {
            if (i2 < aVarArr.length) {
                this.a.putInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", i2);
                this.a.putParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions", new ArrayList(Arrays.asList(aVarArr)));
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", new Object[]{Integer.valueOf(i2), Integer.valueOf(aVarArr.length)}));
        }

        public void d(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        public void e(Bitmap.CompressFormat compressFormat) {
            this.a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        public void f(int i2) {
            this.a.putInt("com.yalantis.ucrop.CompressionQuality", i2);
        }

        public void g(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropFrameColor", i2);
        }

        public void h(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropFrameStrokeWidth", i2);
        }

        public void i(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropGridColor", i2);
        }

        public void j(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropGridColumnCount", i2);
        }

        public void k(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropGridRowCount", i2);
        }

        public void l(int i2) {
            this.a.putInt("com.yalantis.ucrop.CropGridStrokeWidth", i2);
        }

        public void m(int i2) {
            this.a.putInt("com.yalantis.ucrop.DimmedLayerColor", i2);
        }

        public void n(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z);
        }

        public void o(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        public void p(int i2) {
            this.a.putInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", i2);
        }

        public void q(boolean z) {
            this.a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        public void r(int i2) {
            this.a.putInt("com.yalantis.ucrop.StatusBarColor", i2);
        }

        public void s(int i2) {
            this.a.putInt("com.yalantis.ucrop.ToolbarColor", i2);
        }

        public void t(String str) {
            this.a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        public void u(int i2) {
            this.a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i2);
        }
    }

    private j(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static Throwable a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    public static Uri c(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static j d(Uri uri, Uri uri2) {
        return new j(uri, uri2);
    }

    public Intent b(Context context) {
        this.a.setClass(context, UCropActivity.class);
        this.a.putExtras(this.b);
        return this.a;
    }

    public j e(float f2, float f3) {
        this.b.putFloat("com.yalantis.ucrop.AspectRatioX", f2);
        this.b.putFloat("com.yalantis.ucrop.AspectRatioY", f3);
        return this;
    }

    public j f(int i2, int i3) {
        if (i2 < 10) {
            i2 = 10;
        }
        if (i3 < 10) {
            i3 = 10;
        }
        this.b.putInt("com.yalantis.ucrop.MaxSizeX", i2);
        this.b.putInt("com.yalantis.ucrop.MaxSizeY", i3);
        return this;
    }

    public j g(a aVar) {
        this.b.putAll(aVar.a());
        return this;
    }
}
