package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class c extends e.f.j.a {

    /* renamed from: d  reason: collision with root package name */
    private static f f793d;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String[] f794e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f795f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f796g;

        a(String[] strArr, Activity activity, int i2) {
            this.f794e = strArr;
            this.f795f = activity;
            this.f796g = i2;
        }

        public void run() {
            int[] iArr = new int[this.f794e.length];
            PackageManager packageManager = this.f795f.getPackageManager();
            String packageName = this.f795f.getPackageName();
            int length = this.f794e.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f794e[i2], packageName);
            }
            ((e) this.f795f).onRequestPermissionsResult(this.f796g, this.f794e, iArr);
        }
    }

    static class b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i2, Bundle bundle) {
            activity.startActivityForResult(intent, i2, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    static class C0014c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class d {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface e {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface f {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface g {
        void validateRequestPermissionsRequestCode(int i2);
    }

    static class h extends SharedElementCallback {
        private final r a;

        h(r rVar) {
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.a.a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.a.b(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.c(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.a.d(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.e(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.f(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.g(list, list2, new a(onSharedElementsReadyListener));
        }
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.a(activity);
        } else {
            activity.finish();
        }
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0014c.a(activity);
        } else {
            activity.finish();
        }
    }

    static /* synthetic */ void p(Activity activity) {
        if (!activity.isFinishing() && !e.i(activity)) {
            activity.recreate();
        }
    }

    public static void q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0014c.b(activity);
        }
    }

    public static void r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new b(activity));
        }
    }

    public static void s(Activity activity, String[] strArr, int i2) {
        f fVar = f793d;
        if (fVar == null || !fVar.a(activity, strArr, i2)) {
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                if (!TextUtils.isEmpty(strArr[i3])) {
                    i3++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof g) {
                    ((g) activity).validateRequestPermissionsRequestCode(i2);
                }
                d.b(activity, strArr, i2);
            } else if (activity instanceof e) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i2));
            }
        }
    }

    public static void t(Activity activity, r rVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0014c.c(activity, rVar != null ? new h(rVar) : null);
        }
    }

    public static void u(Activity activity, r rVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0014c.d(activity, rVar != null ? new h(rVar) : null);
        }
    }

    public static boolean v(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.c(activity, str);
        }
        return false;
    }

    public static void w(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.b(activity, intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void x(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.c(activity, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }

    public static void y(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0014c.e(activity);
        }
    }
}
