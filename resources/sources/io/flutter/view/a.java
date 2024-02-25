package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

public final /* synthetic */ class a implements Predicate {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    public final boolean test(Object obj) {
        return ((AccessibilityBridge.SemanticsNode) obj).hasFlag(AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING);
    }
}
