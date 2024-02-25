package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;

public class a extends Service {
    private static int a(ArrayList<Integer> arrayList) {
        int intValue = arrayList.get(0).intValue();
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            intValue |= arrayList.get(i2).intValue();
        }
        return intValue;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        b bVar = (b) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter");
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, bVar.f1334e);
        if (bVar.f1336g == null || Build.VERSION.SDK_INT < 29) {
            startForeground(bVar.f1334e.id.intValue(), createNotification);
        } else {
            startForeground(bVar.f1334e.id.intValue(), createNotification, a(bVar.f1336g));
        }
        return bVar.f1335f;
    }
}
