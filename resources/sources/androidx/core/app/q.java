package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

public final class q {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(q qVar) {
            Set<String> d2;
            int i2 = Build.VERSION.SDK_INT;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(qVar.i()).setLabel(qVar.h()).setChoices(qVar.e()).setAllowFreeFormInput(qVar.c()).addExtras(qVar.g());
            if (i2 >= 26 && (d2 = qVar.d()) != null) {
                for (String d3 : d2) {
                    b.d(addExtras, d3, true);
                }
            }
            if (i2 >= 29) {
                c.b(addExtras, qVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(q qVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(q.a(qVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    static RemoteInput a(q qVar) {
        return a.b(qVar);
    }

    static RemoteInput[] b(q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[qVarArr.length];
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            remoteInputArr[i2] = a(qVarArr[i2]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        throw null;
    }

    public Set<String> d() {
        throw null;
    }

    public CharSequence[] e() {
        throw null;
    }

    public int f() {
        throw null;
    }

    public Bundle g() {
        throw null;
    }

    public CharSequence h() {
        throw null;
    }

    public String i() {
        throw null;
    }
}
