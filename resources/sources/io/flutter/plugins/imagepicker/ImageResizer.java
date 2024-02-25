package io.flutter.plugins.imagepicker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageResizer {
    private final ExifDataCopier exifDataCopier;
    private final File externalFilesDirectory;

    ImageResizer(File file, ExifDataCopier exifDataCopier2) {
        this.externalFilesDirectory = file;
        this.exifDataCopier = exifDataCopier2;
    }

    private void copyExif(String str, String str2) {
        this.exifDataCopier.copyExif(str, str2);
    }

    private File createFile(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File createImageOnExternalDirectory(String str, Bitmap bitmap, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        File createFile = createFile(this.externalFilesDirectory, str);
        FileOutputStream createOutputStream = createOutputStream(createFile);
        createOutputStream.write(byteArrayOutputStream.toByteArray());
        createOutputStream.close();
        return createFile;
    }

    private FileOutputStream createOutputStream(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap createScaledBitmap(Bitmap bitmap, int i2, int i3, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i2, i3, z);
    }

    private Bitmap decodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    private boolean isImageQualityValid(Integer num) {
        return num != null && num.intValue() > 0 && num.intValue() < 100;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r8 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r11 = java.lang.Double.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (r9 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        if (r5 < r1) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File resizedImage(android.graphics.Bitmap r21, java.lang.Double r22, java.lang.Double r23, java.lang.Integer r24, java.lang.String r25) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r21.getWidth()
            double r1 = (double) r1
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 * r3
            int r5 = r21.getHeight()
            double r5 = (double) r5
            double r5 = r5 * r3
            r3 = r24
            boolean r4 = r0.isImageQualityValid(r3)
            if (r4 != 0) goto L_0x0020
            r3 = 100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0020:
            r4 = 1
            r7 = 0
            if (r22 == 0) goto L_0x0026
            r8 = 1
            goto L_0x0027
        L_0x0026:
            r8 = 0
        L_0x0027:
            if (r23 == 0) goto L_0x002b
            r9 = 1
            goto L_0x002c
        L_0x002b:
            r9 = 0
        L_0x002c:
            if (r8 == 0) goto L_0x0037
            double r10 = r22.doubleValue()
            double r10 = java.lang.Math.min(r1, r10)
            goto L_0x0038
        L_0x0037:
            r10 = r1
        L_0x0038:
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            if (r9 == 0) goto L_0x0047
            double r11 = r23.doubleValue()
            double r11 = java.lang.Math.min(r5, r11)
            goto L_0x0048
        L_0x0047:
            r11 = r5
        L_0x0048:
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            if (r8 == 0) goto L_0x0058
            double r12 = r22.doubleValue()
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 >= 0) goto L_0x0058
            r12 = 1
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            if (r9 == 0) goto L_0x0065
            double r13 = r23.doubleValue()
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x0065
            r13 = 1
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            if (r12 != 0) goto L_0x006c
            if (r13 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            if (r4 == 0) goto L_0x00ad
            double r12 = r11.doubleValue()
            double r12 = r12 / r5
            double r12 = r12 * r1
            double r14 = r10.doubleValue()
            double r14 = r14 / r1
            double r14 = r14 * r5
            double r16 = r10.doubleValue()
            double r18 = r11.doubleValue()
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 >= 0) goto L_0x0094
            if (r8 != 0) goto L_0x008f
        L_0x008a:
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            goto L_0x00ad
        L_0x008f:
            java.lang.Double r11 = java.lang.Double.valueOf(r14)
            goto L_0x00ad
        L_0x0094:
            double r16 = r11.doubleValue()
            double r18 = r10.doubleValue()
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a3
            if (r9 != 0) goto L_0x008a
            goto L_0x008f
        L_0x00a3:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a8
            goto L_0x008a
        L_0x00a8:
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ad
            goto L_0x008f
        L_0x00ad:
            int r1 = r10.intValue()
            int r2 = r11.intValue()
            r4 = r21
            android.graphics.Bitmap r1 = r0.createScaledBitmap(r4, r1, r2, r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "/scaled_"
            r2.append(r4)
            r4 = r25
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r3 = r3.intValue()
            java.io.File r1 = r0.createImageOnExternalDirectory(r2, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.ImageResizer.resizedImage(android.graphics.Bitmap, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.String):java.io.File");
    }

    /* access modifiers changed from: package-private */
    public String resizeImageIfNeeded(String str, Double d2, Double d3, Integer num) {
        Bitmap decodeFile = decodeFile(str);
        if (decodeFile == null) {
            return null;
        }
        if (!((d2 == null && d3 == null && !isImageQualityValid(num)) ? false : true)) {
            return str;
        }
        try {
            String[] split = str.split("/");
            File resizedImage = resizedImage(decodeFile, d2, d3, num, split[split.length - 1]);
            copyExif(str, resizedImage.getPath());
            return resizedImage.getPath();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
