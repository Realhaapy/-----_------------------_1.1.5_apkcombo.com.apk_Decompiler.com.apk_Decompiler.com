package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ AccessibilityBridge.SemanticsNode a;

    public /* synthetic */ b(AccessibilityBridge.SemanticsNode semanticsNode) {
        this.a = semanticsNode;
    }

    public final boolean test(Object obj) {
        return AccessibilityBridge.a(this.a, (AccessibilityBridge.SemanticsNode) obj);
    }
}
