package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bVar.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = bVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = bVar.l(remoteActionCompat.c, 3);
        remoteActionCompat.f789d = (PendingIntent) bVar.r(remoteActionCompat.f789d, 4);
        remoteActionCompat.f790e = bVar.h(remoteActionCompat.f790e, 5);
        remoteActionCompat.f791f = bVar.h(remoteActionCompat.f791f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(remoteActionCompat.a, 1);
        bVar.D(remoteActionCompat.b, 2);
        bVar.D(remoteActionCompat.c, 3);
        bVar.H(remoteActionCompat.f789d, 4);
        bVar.z(remoteActionCompat.f790e, 5);
        bVar.z(remoteActionCompat.f791f, 6);
    }
}
