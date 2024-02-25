package androidx.media.d;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.k;
import androidx.core.app.l;
import androidx.media.b;
import androidx.media.c;

public class a extends l.i {

    /* renamed from: e  reason: collision with root package name */
    int[] f1233e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f1234f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1235g;

    /* renamed from: h  reason: collision with root package name */
    PendingIntent f1236h;

    private RemoteViews A(l.a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), c.notification_media_action);
        int i2 = androidx.media.a.action0;
        remoteViews.setImageViewResource(i2, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i2, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i2, aVar.j());
        }
        return remoteViews;
    }

    /* access modifiers changed from: package-private */
    public int B(int i2) {
        return i2 <= 3 ? c.notification_template_big_media_narrow : c.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    public int C() {
        return c.notification_template_media;
    }

    public void b(k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            Notification.Builder a = kVar.a();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            x(mediaStyle);
            a.setStyle(mediaStyle);
        } else if (this.f1235g) {
            kVar.a().setOngoing(true);
        }
    }

    public RemoteViews s(k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return y();
    }

    public RemoteViews t(k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return z();
    }

    /* access modifiers changed from: package-private */
    public Notification.MediaStyle x(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f1233e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f1234f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.b());
        }
        return mediaStyle;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews y() {
        int min = Math.min(this.a.b.size(), 5);
        RemoteViews c = c(false, B(min), false);
        c.removeAllViews(androidx.media.a.media_actions);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                c.addView(androidx.media.a.media_actions, A(this.a.b.get(i2)));
            }
        }
        if (this.f1235g) {
            int i3 = androidx.media.a.cancel_action;
            c.setViewVisibility(i3, 0);
            c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(b.cancel_button_image_alpha));
            c.setOnClickPendingIntent(i3, this.f1236h);
        } else {
            c.setViewVisibility(androidx.media.a.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews z() {
        RemoteViews c = c(false, C(), true);
        int size = this.a.b.size();
        int[] iArr = this.f1233e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c.removeAllViews(androidx.media.a.media_actions);
        if (min > 0) {
            int i2 = 0;
            while (i2 < min) {
                if (i2 < size) {
                    c.addView(androidx.media.a.media_actions, A(this.a.b.get(this.f1233e[i2])));
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f1235g) {
            c.setViewVisibility(androidx.media.a.end_padder, 8);
            int i3 = androidx.media.a.cancel_action;
            c.setViewVisibility(i3, 0);
            c.setOnClickPendingIntent(i3, this.f1236h);
            c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(b.cancel_button_image_alpha));
        } else {
            c.setViewVisibility(androidx.media.a.end_padder, 0);
            c.setViewVisibility(androidx.media.a.cancel_action, 8);
        }
        return c;
    }
}
