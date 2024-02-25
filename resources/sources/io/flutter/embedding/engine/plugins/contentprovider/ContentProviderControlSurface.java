package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.lifecycle.e;

public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, e eVar);

    void detachFromContentProvider();
}
