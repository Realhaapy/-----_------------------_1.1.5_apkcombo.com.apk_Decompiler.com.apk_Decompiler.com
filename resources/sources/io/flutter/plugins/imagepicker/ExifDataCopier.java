package io.flutter.plugins.imagepicker;

import android.util.Log;
import e.i.a.a;
import java.util.Arrays;

class ExifDataCopier {
    ExifDataCopier() {
    }

    private static void setIfNotNull(a aVar, a aVar2, String str) {
        if (aVar.d(str) != null) {
            aVar2.W(str, aVar.d(str));
        }
    }

    /* access modifiers changed from: package-private */
    public void copyExif(String str, String str2) {
        try {
            a aVar = new a(str);
            a aVar2 = new a(str2);
            for (String ifNotNull : Arrays.asList(new String[]{"FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation"})) {
                setIfNotNull(aVar, aVar2, ifNotNull);
            }
            aVar2.S();
        } catch (Exception e2) {
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e2);
        }
    }
}
