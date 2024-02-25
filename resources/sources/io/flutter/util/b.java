package io.flutter.util;

import android.view.View;
import io.flutter.util.ViewUtils;

public final /* synthetic */ class b implements ViewUtils.ViewVisitor {
    public final /* synthetic */ Class[] a;

    public /* synthetic */ b(Class[] clsArr) {
        this.a = clsArr;
    }

    public final boolean run(View view) {
        return ViewUtils.b(this.a, view);
    }
}
