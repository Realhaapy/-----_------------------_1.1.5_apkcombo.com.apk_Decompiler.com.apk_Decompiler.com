package io.flutter.util;

import android.view.View;
import io.flutter.util.ViewUtils;

public final /* synthetic */ class a implements ViewUtils.ViewVisitor {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    public final boolean run(View view) {
        return view.hasFocus();
    }
}
