package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

public class DownloadListenerHostApiImpl implements GeneratedAndroidWebView.DownloadListenerHostApi {
    private final DownloadListenerCreator downloadListenerCreator;
    private final DownloadListenerFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;

    public static class DownloadListenerCreator {
        public DownloadListenerImpl createDownloadListener(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            return new DownloadListenerImpl(downloadListenerFlutterApiImpl);
        }
    }

    public static class DownloadListenerImpl implements DownloadListener, Releasable {
        private DownloadListenerFlutterApiImpl flutterApi;

        public DownloadListenerImpl(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            this.flutterApi = downloadListenerFlutterApiImpl;
        }

        static /* synthetic */ void a(Void voidR) {
        }

        static /* synthetic */ void b(Void voidR) {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl = this.flutterApi;
            if (downloadListenerFlutterApiImpl != null) {
                downloadListenerFlutterApiImpl.onDownloadStart(this, str, str2, str3, str4, j2, c.a);
            }
        }

        public void release() {
            DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl = this.flutterApi;
            if (downloadListenerFlutterApiImpl != null) {
                downloadListenerFlutterApiImpl.dispose(this, b.a);
            }
            this.flutterApi = null;
        }
    }

    public DownloadListenerHostApiImpl(InstanceManager instanceManager2, DownloadListenerCreator downloadListenerCreator2, DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.downloadListenerCreator = downloadListenerCreator2;
        this.flutterApi = downloadListenerFlutterApiImpl;
    }

    public void create(Long l2) {
        this.instanceManager.addInstance(this.downloadListenerCreator.createDownloadListener(this.flutterApi), l2.longValue());
    }
}
