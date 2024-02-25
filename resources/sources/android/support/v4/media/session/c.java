package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {
    b a;
    a b;

    private static class a extends MediaController.Callback {
        private final WeakReference<c> a;

        a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = (c) this.a.get();
            if (cVar != null && cVar.b == null) {
                cVar.d(PlaybackStateCompat.a(playbackState));
            }
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        public void onSessionDestroyed() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = (c) this.a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.b == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }
    }

    private class b extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    private static class C0004c extends a.C0002a {
        private final WeakReference<c> a;

        C0004c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void A(int i2) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i2), (Bundle) null);
            }
        }

        public void C() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(13, (Object) null, (Bundle) null);
            }
        }

        public void D(Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(7, bundle, (Bundle) null);
            }
        }

        public void G(List<MediaSessionCompat.QueueItem> list) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(5, list, (Bundle) null);
            }
        }

        public void R(boolean z) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        public void X(PlaybackStateCompat playbackStateCompat) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void Y(String str, Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void c0(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f37e, parcelableVolumeInfo.f38f, parcelableVolumeInfo.f39g, parcelableVolumeInfo.f40h, parcelableVolumeInfo.f41i) : null, (Bundle) null);
            }
        }

        public void d(boolean z) {
        }

        public void e(CharSequence charSequence) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, (Bundle) null);
            }
        }

        public void h() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(8, (Object) null, (Bundle) null);
            }
        }

        public void i(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        public void q(int i2) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i2), (Bundle) null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            new a(this);
        } else {
            this.b = new C0004c(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void i(int i2, Object obj, Bundle bundle) {
        b bVar = this.a;
        if (bVar != null) {
            Message obtainMessage = bVar.obtainMessage(i2, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
