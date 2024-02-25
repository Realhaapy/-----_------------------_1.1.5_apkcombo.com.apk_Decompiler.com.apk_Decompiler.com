package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import e.f.q.a;
import java.util.concurrent.Executor;

public class WindowInfoRepositoryCallbackAdapterWrapper {
    final WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        this.adapter.removeWindowLayoutInfoListener(aVar);
    }
}
