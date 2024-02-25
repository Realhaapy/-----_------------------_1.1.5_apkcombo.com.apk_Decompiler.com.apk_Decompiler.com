package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.AccessibilityBridge;

class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    AccessibilityEventsDelegate() {
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge2 = this.accessibilityBridge;
        if (accessibilityBridge2 == null) {
            return false;
        }
        return accessibilityBridge2.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    public void setAccessibilityBridge(AccessibilityBridge accessibilityBridge2) {
        this.accessibilityBridge = accessibilityBridge2;
    }
}
