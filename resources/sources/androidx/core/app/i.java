package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import e.e.g;
import e.f.r.i;

public class i extends Activity implements h, i.a {
    private g<Class<? extends a>, a> mExtraDataMap = new g<>();
    private androidx.lifecycle.i mLifecycleRegistry = new androidx.lifecycle.i(this);

    @Deprecated
    public static class a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        int i2 = Build.VERSION.SDK_INT;
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 1;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return i2 >= 31;
            case 1:
                return i2 >= 29;
            case 2:
                return i2 >= 26;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.f.r.i.d(decorView, keyEvent)) {
            return e.f.r.i.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.f.r.i.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (a) this.mExtraDataMap.get(cls);
    }

    public e getLifecycle() {
        throw null;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.f(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.j(e.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
