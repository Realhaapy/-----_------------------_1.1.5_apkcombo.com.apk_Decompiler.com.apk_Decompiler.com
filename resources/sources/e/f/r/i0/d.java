package e.f.r.i0;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

public class d {

    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollX(i2);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollY(i2);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i2) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.c(accessibilityRecord, i2);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i2) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.d(accessibilityRecord, i2);
        }
    }
}
