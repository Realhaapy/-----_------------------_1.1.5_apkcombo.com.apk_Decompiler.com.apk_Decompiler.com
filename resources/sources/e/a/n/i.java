package e.a.n;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i implements Window.Callback {

    /* renamed from: e  reason: collision with root package name */
    final Window.Callback f3196e;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f3196e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f3196e;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3196e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3196e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f3196e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3196e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3196e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3196e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f3196e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f3196e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f3196e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f3196e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f3196e.onCreatePanelMenu(i2, menu);
    }

    public View onCreatePanelView(int i2) {
        return this.f3196e.onCreatePanelView(i2);
    }

    public void onDetachedFromWindow() {
        this.f3196e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f3196e.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f3196e.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.f3196e.onPanelClosed(i2, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f3196e.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f3196e.onPreparePanel(i2, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        this.f3196e.onProvideKeyboardShortcuts(list, menu, i2);
    }

    public boolean onSearchRequested() {
        return this.f3196e.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f3196e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3196e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f3196e.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f3196e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f3196e.onWindowStartingActionMode(callback, i2);
    }
}
