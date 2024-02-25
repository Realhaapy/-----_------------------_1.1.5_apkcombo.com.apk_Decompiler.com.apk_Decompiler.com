package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

public class b implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final NotificationDetails f1334e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1335f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Integer> f1336g;

    public b(NotificationDetails notificationDetails, int i2, ArrayList<Integer> arrayList) {
        this.f1334e = notificationDetails;
        this.f1335f = i2;
        this.f1336g = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f1334e + ", startMode=" + this.f1335f + ", foregroundServiceTypes=" + this.f1336g + '}';
    }
}
