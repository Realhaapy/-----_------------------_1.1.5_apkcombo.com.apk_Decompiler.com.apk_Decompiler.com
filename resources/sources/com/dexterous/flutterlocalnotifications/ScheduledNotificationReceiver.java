package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.core.app.o;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;

@Keep
public class ScheduledNotificationReceiver extends BroadcastReceiver {

    class a extends f.e.d.z.a<NotificationDetails> {
        a(ScheduledNotificationReceiver scheduledNotificationReceiver) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        Integer num;
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            Notification notification = (Notification) intent.getParcelableExtra("notification");
            notification.when = System.currentTimeMillis();
            int intExtra = intent.getIntExtra("notification_id", 0);
            o.e(context).h(intExtra, notification);
            if (!intent.getBooleanExtra("repeat", false)) {
                num = Integer.valueOf(intExtra);
            } else {
                return;
            }
        } else {
            NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().i(stringExtra, new a(this).e());
            FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotification(context, notificationDetails);
                return;
            } else if (notificationDetails.matchDateTimeComponents != null) {
                FlutterLocalNotificationsPlugin.zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            } else if (notificationDetails.repeatInterval != null) {
                FlutterLocalNotificationsPlugin.scheduleNextRepeatingNotification(context, notificationDetails);
                return;
            } else {
                num = notificationDetails.id;
            }
        }
        FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, num);
    }
}
