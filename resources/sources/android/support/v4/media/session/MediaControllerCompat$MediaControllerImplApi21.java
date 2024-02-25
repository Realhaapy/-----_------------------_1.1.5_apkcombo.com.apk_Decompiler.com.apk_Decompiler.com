package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {
    final Object a;
    private final List<c> b;
    private HashMap<c, a> c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f29d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: e  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f30e;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f30e.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                    mediaControllerCompat$MediaControllerImplApi21.f29d.c(b.a.a(h.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f29d.d(androidx.versionedparcelable.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.C0004c {
        a(c cVar) {
            super(cVar);
        }

        public void D(Bundle bundle) {
            throw new AssertionError();
        }

        public void G(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void c0(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void e(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void h() {
            throw new AssertionError();
        }

        public void i(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f29d.a() != null) {
            for (c next : this.b) {
                a aVar = new a(next);
                this.c.put(next, aVar);
                next.b = aVar;
                try {
                    this.f29d.a().f(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.b.clear();
        }
    }
}
