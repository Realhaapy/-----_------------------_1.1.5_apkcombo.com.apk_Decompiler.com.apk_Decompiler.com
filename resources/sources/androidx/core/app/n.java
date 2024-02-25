package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class n {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat f2 = aVar.f();
        bundle.putInt("icon", f2 != null ? f2.n() : 0);
        bundle.putCharSequence("title", aVar.j());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle.putBoolean("showsUserInterface", aVar.i());
        bundle.putInt("semanticAction", aVar.h());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                e = e3;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                c = true;
                return null;
            }
        }
    }

    private static Bundle d(q qVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", qVar.i());
        bundle.putCharSequence("label", qVar.h());
        bundle.putCharSequenceArray("choices", qVar.e());
        bundle.putBoolean("allowFreeFormInput", qVar.c());
        bundle.putBundle("extras", qVar.g());
        Set<String> d2 = qVar.d();
        if (d2 != null && !d2.isEmpty()) {
            ArrayList arrayList = new ArrayList(d2.size());
            for (String add : d2) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qVarArr.length];
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            bundleArr[i2] = d(qVarArr[i2]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, l.a aVar) {
        IconCompat f2 = aVar.f();
        builder.addAction(f2 != null ? f2.n() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
