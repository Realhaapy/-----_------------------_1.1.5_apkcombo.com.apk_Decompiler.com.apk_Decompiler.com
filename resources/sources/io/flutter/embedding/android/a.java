package io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

public final /* synthetic */ class a implements Predicate {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
