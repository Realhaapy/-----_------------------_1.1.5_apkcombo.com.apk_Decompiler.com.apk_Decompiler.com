package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.Keep;
import androidx.core.app.l;
import androidx.core.app.o;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import f.e.d.f;
import f.e.d.g;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b.a.q;
import r.b.a.t;

@Keep
public class FlutterLocalNotificationsPlugin implements MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    private static final String CANCEL_TAG = "tag";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DRAWABLE = "drawable";
    private static final String GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE = "GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_CODE = "GET_ACTIVE_NOTIFICATIONS_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "GET_NOTIFICATION_CHANNELS_ERROR_CODE";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "INVALID_BIG_PICTURE";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "INVALID_ICON";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "INVALID_LARGE_ICON";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "INVALID_LED_DETAILS";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "INVALID_SOUND";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    private static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SCHEDULE_METHOD = "schedule";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_DAILY_AT_TIME_METHOD = "showDailyAtTime";
    private static final String SHOW_METHOD = "show";
    private static final String SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD = "showWeeklyAtDayAndTime";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static f gson;
    private Context applicationContext;
    private MethodChannel channel;
    private Intent launchIntent;
    private Activity mainActivity;

    class a extends f.e.d.z.a<ArrayList<NotificationDetails>> {
        a() {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009c */
        static {
            /*
                com.dexterous.flutterlocalnotifications.NotificationStyle[] r0 = com.dexterous.flutterlocalnotifications.NotificationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                com.dexterous.flutterlocalnotifications.NotificationStyle r2 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigPicture     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dexterous.flutterlocalnotifications.NotificationStyle r3 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigText     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r4 = com.dexterous.flutterlocalnotifications.NotificationStyle.Inbox     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r5 = com.dexterous.flutterlocalnotifications.NotificationStyle.Messaging     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.dexterous.flutterlocalnotifications.NotificationStyle r6 = com.dexterous.flutterlocalnotifications.NotificationStyle.Media     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.dexterous.flutterlocalnotifications.models.IconSource[] r5 = com.dexterous.flutterlocalnotifications.models.IconSource.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                b = r5
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.DrawableResource     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.BitmapFilePath     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ContentUri     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x006d }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.FlutterBitmapAsset     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ByteArray     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                com.dexterous.flutterlocalnotifications.RepeatInterval[] r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                com.dexterous.flutterlocalnotifications.RepeatInterval r5 = com.dexterous.flutterlocalnotifications.RepeatInterval.EveryMinute     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.Hourly     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Daily     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a6 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Weekly     // Catch:{ NoSuchFieldError -> 0x00a6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a6 }
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.b.<clinit>():void");
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, l.e eVar) {
        boolean z;
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            eVar.x(notificationDetails.groupKey);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                eVar.z(true);
            }
            eVar.y(notificationDetails.groupAlertBehavior.intValue());
        }
    }

    private void areNotificationsEnabled(MethodChannel.Result result) {
        result.success(Boolean.valueOf(getNotificationManager(this.applicationContext).a()));
    }

    static f buildGson() {
        if (gson == null) {
            RuntimeTypeAdapterFactory<StyleInformation> registerSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            g gVar = new g();
            gVar.c(registerSubtype);
            gson = gVar.b();
        }
        return gson;
    }

    private static p buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        p.b bVar = new p.b();
        bVar.b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (!(obj == null || (iconSource = personDetails.iconBitmapSource) == null)) {
            bVar.c(getIconFromSource(context, obj, iconSource));
        }
        bVar.d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.g(str3);
        }
        return bVar.a();
    }

    private static long calculateNextNotificationTrigger(long j2, long j3) {
        while (j2 < System.currentTimeMillis()) {
            j2 += j3;
        }
        return j2;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        int i2 = b.a[notificationDetails.repeatInterval.ordinal()];
        if (i2 == 1) {
            return 60000;
        }
        if (i2 == 2) {
            return 3600000;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 604800000;
        }
        return 86400000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.channelAction;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean canCreateNotificationChannel(android.content.Context r2, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x002e
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r0 = r3.id
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r0)
            if (r2 != 0) goto L_0x001e
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r0 = r3.channelAction
            if (r0 == 0) goto L_0x0026
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r1 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.CreateIfNotExists
            if (r0 == r1) goto L_0x0026
        L_0x001e:
            if (r2 == 0) goto L_0x0028
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r2 = r3.channelAction
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r3 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.Update
            if (r2 != r3) goto L_0x0028
        L_0x0026:
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L_0x002e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.canCreateNotificationChannel(android.content.Context, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails):java.lang.Boolean");
    }

    private void cancel(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        result.success((Object) null);
    }

    private void cancelAllNotifications(MethodChannel.Result result) {
        getNotificationManager(this.applicationContext).d();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            result.success((Object) null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success((Object) null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        o notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.b(num.intValue());
        } else {
            notificationManager.c(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bArr[i2] = (byte) ((Double) arrayList.get(i2)).intValue();
        }
        return bArr;
    }

    private static l.h.a createMessage(Context context, MessageDetails messageDetails) {
        String str;
        l.h.a aVar = new l.h.a(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (!(str2 == null || (str = messageDetails.dataMimeType) == null)) {
            aVar.j(str, Uri.parse(str2));
        }
        return aVar;
    }

    protected static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent2 = getLaunchIntent(context);
        launchIntent2.setAction(SELECT_NOTIFICATION);
        launchIntent2.putExtra(PAYLOAD, notificationDetails.payload);
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        }
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent2, i2);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        l.e eVar = new l.e(context, notificationDetails.channelId);
        eVar.s(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        eVar.r(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        eVar.O(notificationDetails.ticker);
        eVar.l(BooleanUtils.getValue(notificationDetails.autoCancel));
        eVar.q(activity);
        eVar.G(notificationDetails.priority.intValue());
        eVar.E(BooleanUtils.getValue(notificationDetails.ongoing));
        eVar.F(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        setSmallIcon(context, notificationDetails, eVar);
        eVar.A(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num = notificationDetails.color;
        if (num != null) {
            eVar.o(num.intValue());
        }
        Boolean bool = notificationDetails.colorized;
        if (bool != null) {
            eVar.p(bool.booleanValue());
        }
        Boolean bool2 = notificationDetails.showWhen;
        if (bool2 != null) {
            eVar.J(BooleanUtils.getValue(bool2));
        }
        Long l2 = notificationDetails.when;
        if (l2 != null) {
            eVar.T(l2.longValue());
        }
        Boolean bool3 = notificationDetails.usesChronometer;
        if (bool3 != null) {
            eVar.Q(bool3.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            eVar.w(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            eVar.I(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            eVar.N(notificationDetails.subText);
        }
        setVisibility(notificationDetails, eVar);
        applyGrouping(notificationDetails, eVar);
        setSound(context, notificationDetails, eVar);
        setVibrationPattern(notificationDetails, eVar);
        setLights(notificationDetails, eVar);
        setStyle(context, notificationDetails, eVar);
        setProgress(notificationDetails, eVar);
        setCategory(notificationDetails, eVar);
        setTimeoutAfter(notificationDetails, eVar);
        Notification b2 = eVar.b();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i3 : iArr) {
                b2.flags = i3 | b2.flags;
            }
        }
        return b2;
    }

    private void createNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) methodCall.arguments()));
        result.success((Object) null);
    }

    private void createNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) methodCall.arguments());
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.id, from.name);
            if (i2 >= 28) {
                notificationChannelGroup.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        result.success((Object) null);
    }

    private void deleteNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) methodCall.arguments());
        }
        result.success((Object) null);
    }

    private void deleteNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) methodCall.arguments());
        }
        result.success((Object) null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String str;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int q2 = iconCompat.q();
        if (q2 == 2) {
            iconSource = IconSource.DrawableResource;
            str = this.applicationContext.getResources().getResourceEntryName(iconCompat.n());
        } else if (q2 != 4) {
            return null;
        } else {
            iconSource = IconSource.ContentUri;
            str = iconCompat.r().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", str);
        return hashMap;
    }

    private Map<String, Object> describePerson(p pVar) {
        if (pVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", pVar.d());
        hashMap.put("name", pVar.e());
        hashMap.put("uri", pVar.f());
        hashMap.put("bot", Boolean.valueOf(pVar.g()));
        hashMap.put("important", Boolean.valueOf(pVar.h()));
        hashMap.put("icon", describeIcon(pVar.c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(MethodChannel.Result result, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(result, from.icon) || hasInvalidLargeIcon(result, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(result, from) || hasInvalidRawSoundResource(result, from) || hasInvalidLedDetails(result, from)) {
            return null;
        }
        return from;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(MethodCall methodCall, MethodChannel.Result result) {
        Notification notification;
        StatusBarNotification statusBarNotification;
        if (Build.VERSION.SDK_INT < 23) {
            result.error(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, "Android version must be 6.0 or newer to use getActiveNotificationMessagingStyle", (Object) null);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) methodCall.arguments();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    notification = null;
                    break;
                }
                statusBarNotification = activeNotifications[i2];
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                    i2++;
                }
            }
            notification = statusBarNotification.getNotification();
            if (notification == null) {
                result.success((Object) null);
                return;
            }
            l.h y = l.h.y(notification);
            if (y == null) {
                result.success((Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(y.E()));
            hashMap.put("person", describePerson(y.C()));
            hashMap.put("conversationTitle", y.A());
            ArrayList arrayList = new ArrayList();
            for (l.h.a next : y.B()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", next.h());
                hashMap2.put("timestamp", Long.valueOf(next.i()));
                hashMap2.put("person", describePerson(next.g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            result.success(hashMap);
        } catch (Throwable th) {
            result.error(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private void getActiveNotifications(MethodChannel.Result result) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            result.error(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE, (Object) null);
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (i2 >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                arrayList.add(hashMap);
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static PendingIntent getActivityPendingIntent(Context context, int i2, Intent intent) {
        return PendingIntent.getActivity(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i2, Intent intent) {
        return PendingIntent.getBroadcast(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i2 = b.b[iconSource.ordinal()];
        if (i2 == 1) {
            return IconCompat.k(context, getDrawableResourceId(context, (String) obj));
        }
        if (i2 == 2) {
            return IconCompat.g(BitmapFactory.decodeFile((String) obj));
        }
        if (i2 == 3) {
            return IconCompat.i((String) obj);
        }
        if (i2 == 4) {
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset((String) obj));
                FileInputStream createInputStream = openFd.createInputStream();
                IconCompat g2 = IconCompat.g(BitmapFactory.decodeStream(createInputStream));
                createInputStream.close();
                openFd.close();
                return g2;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else if (i2 != 5) {
            return null;
        } else {
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.j(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", (Object) null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String[] split = sound.toString().split("/");
                    str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null || (str = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue())) != null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    str = sound.toString();
                }
                hashMap.put("sound", str);
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        }
        return hashMap;
    }

    static String getNextFireDate(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1));
            } else if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1));
            }
        } else {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency2 = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency2 == ScheduledNotificationRepeatFrequency.Daily) {
                return r.b.a.v.b.f5663j.b(r.b.a.g.Y(notificationDetails.scheduledDateTime).b0(1));
            } else if (scheduledNotificationRepeatFrequency2 != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return r.b.a.v.b.f5663j.b(r.b.a.g.Y(notificationDetails.scheduledDateTime).g0(1));
            }
        }
    }

    static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
            ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
            ZonedDateTime now = ZonedDateTime.now(of);
            ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
            while (of3.isBefore(now)) {
                of3 = of3.plusDays(1);
            }
            DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents == DateTimeComponents.Time) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            }
            if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
                while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                    of3 = of3.plusDays(1);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
                while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                    of3 = of3.plusDays(1);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
                    }
                    of3 = of3.plusDays(1);
                }
            }
        } else {
            q o2 = q.o(notificationDetails.timeZoneName);
            t W = t.W(r.b.a.g.Y(notificationDetails.scheduledDateTime), o2);
            t U = t.U(o2);
            t V = t.V(U.R(), U.O(), U.K(), W.M(), W.N(), W.Q(), W.P(), o2);
            while (V.y(U)) {
                V = V.c0(1);
            }
            DateTimeComponents dateTimeComponents2 = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents2 == DateTimeComponents.Time) {
                return r.b.a.v.b.f5663j.b(V);
            }
            if (dateTimeComponents2 == DateTimeComponents.DayOfWeekAndTime) {
                while (V.L() != W.L()) {
                    V = V.c0(1);
                }
                return r.b.a.v.b.f5663j.b(V);
            } else if (dateTimeComponents2 == DateTimeComponents.DayOfMonthAndTime) {
                while (V.K() != W.K()) {
                    V = V.c0(1);
                }
                return r.b.a.v.b.f5663j.b(V);
            } else if (dateTimeComponents2 != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (V.O() == W.O() && V.K() == W.K()) {
                        return r.b.a.v.b.f5663j.b(V);
                    }
                    V = V.c0(1);
                }
            }
        }
    }

    private void getNotificationAppLaunchDetails(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        Activity activity = this.mainActivity;
        Boolean valueOf = Boolean.valueOf(activity != null && SELECT_NOTIFICATION.equals(activity.getIntent().getAction()) && !launchedActivityFromHistory(this.mainActivity.getIntent()));
        hashMap.put(NOTIFICATION_LAUNCHED_APP, valueOf);
        hashMap.put(PAYLOAD, valueOf.booleanValue() ? this.launchIntent.getStringExtra(PAYLOAD) : null);
        result.success(hashMap);
    }

    private void getNotificationChannels(MethodChannel.Result result) {
        try {
            List<NotificationChannel> g2 = getNotificationManager(this.applicationContext).g();
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel mappedNotificationChannel : g2) {
                arrayList.add(getMappedNotificationChannel(mappedNotificationChannel));
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static o getNotificationManager(Context context) {
        return o.e(context);
    }

    private boolean hasInvalidBigPictureResources(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(result, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, result, INVALID_BIG_PICTURE_ERROR_CODE);
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return false;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            return bArr == null || bArr.length == 0;
        }
    }

    private boolean hasInvalidIcon(MethodChannel.Result result, String str) {
        return !StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLargeIcon(MethodChannel.Result result, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return !StringUtils.isNullOrEmpty(str).booleanValue() && bitmapSource == bitmapSource2 && !isValidDrawableResource(this.applicationContext, str, result, INVALID_LARGE_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLedDetails(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        result.error(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, (Object) null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(MethodChannel.Result result, NotificationDetails notificationDetails) {
        SoundSource soundSource;
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue() || (((soundSource = notificationDetails.soundSource) != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0)) {
            return false;
        }
        result.error(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, new Object[]{notificationDetails.sound}), (Object) null);
        return true;
    }

    private static void initAndroidThreeTen(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            f.g.a.a.a(context);
        }
    }

    private void initialize(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE)) {
            initAndroidThreeTen(this.applicationContext);
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            result.success(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, MethodChannel.Result result, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        result.error(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, new Object[]{str}), (Object) null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, (String) null);
        return string != null ? (ArrayList) buildGson().i(string, new a().e()) : arrayList;
    }

    private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger) {
        this.applicationContext = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void pendingNotificationRequests(MethodChannel.Result result) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin = new FlutterLocalNotificationsPlugin();
        flutterLocalNotificationsPlugin.setActivity(registrar.activity());
        registrar.addNewIntentListener(flutterLocalNotificationsPlugin);
        flutterLocalNotificationsPlugin.onAttachedToEngine(registrar.context(), registrar.messenger());
    }

    static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().id.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            result.success((Object) null);
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, notificationDetails.repeatTime.hour.intValue());
            instance.set(12, notificationDetails.repeatTime.minute.intValue());
            instance.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                instance.set(7, num.intValue());
            }
            longValue = instance.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String q2 = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q2);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.f.b(alarmManager, 0, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    static void rescheduleNotifications(Context context) {
        Boolean bool = Boolean.FALSE;
        initAndroidThreeTen(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (next.repeatInterval != null) {
                repeatNotification(context, next, bool);
            } else if (next.timeZoneName == null) {
                scheduleNotification(context, next, bool);
            } else {
                zonedScheduleNotification(context, next, bool);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().q(arrayList)).apply();
    }

    private void schedule(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            scheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            result.success((Object) null);
        }
    }

    static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String q2 = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q2);
        androidx.core.app.f.b(getAlarmManager(context), 0, calculateNextNotificationTrigger, getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String q2 = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q2);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.f.b(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        } else {
            androidx.core.app.f.a(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        this.channel.invokeMethod("selectNotification", intent.getStringExtra(PAYLOAD));
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
        if (activity != null) {
            this.launchIntent = activity.getIntent();
        }
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        Bitmap bitmapFromSource;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        l.b bVar = new l.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.A(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.B(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bitmapFromSource = null;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
            }
            bVar.z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
            eVar.M(bVar);
        }
        bVar.y(bitmapFromSource);
        bVar.z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.M(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, l.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        l.c cVar = new l.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.x(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.y(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            boolean booleanValue = bigTextStyleInformation.htmlFormatSummaryText.booleanValue();
            String str = bigTextStyleInformation.summaryText;
            CharSequence charSequence = str;
            if (booleanValue) {
                charSequence = fromHtml(str);
            }
            cVar.z(charSequence);
        }
        eVar.M(cVar);
    }

    private static void setCategory(NotificationDetails notificationDetails, l.e eVar) {
        String str = notificationDetails.category;
        if (str != null) {
            eVar.m(str);
        }
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, l.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        l.g gVar = new l.g();
        if (inboxStyleInformation.contentTitle != null) {
            gVar.y(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            gVar.z(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                gVar.x(inboxStyleInformation.htmlFormatLines.booleanValue() ? fromHtml(next) : next);
            }
        }
        eVar.M(gVar);
    }

    private static void setLights(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            eVar.B(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
        }
    }

    private static void setMediaStyle(l.e eVar) {
        eVar.M(new androidx.media.d.a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        l.h hVar = new l.h(buildPerson(context, messagingStyleInformation.person));
        hVar.I(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            hVar.H(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                hVar.x(createMessage(context, it.next()));
            }
        }
        eVar.M(hVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.H(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, l.e eVar) {
        int intValue;
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            intValue = getDrawableResourceId(context, notificationDetails.icon);
        } else {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, (String) null);
            intValue = StringUtils.isNullOrEmpty(string).booleanValue() ? notificationDetails.iconResourceId.intValue() : getDrawableResourceId(context, string);
        }
        eVar.K(intValue);
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, l.e eVar) {
        eVar.L(BooleanUtils.getValue(notificationDetails.playSound) ? retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource) : null);
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        int i2 = b.c[notificationDetails.style.ordinal()];
        if (i2 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
        } else if (i2 == 2) {
            setBigTextStyle(notificationDetails, eVar);
        } else if (i2 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i2 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else if (i2 == 5) {
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, l.e eVar) {
        Long l2 = notificationDetails.timeoutAfter;
        if (l2 != null) {
            eVar.P(l2.longValue());
        }
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                eVar.R(jArr);
                return;
            }
            return;
        }
        eVar.R(new long[]{0});
    }

    private static void setVisibility(NotificationDetails notificationDetails, l.e eVar) {
        Integer num = notificationDetails.visibility;
        if (num != null) {
            int intValue = num.intValue();
            int i2 = 1;
            if (intValue == 0) {
                i2 = 0;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    i2 = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
            }
            eVar.S(i2);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannel.setDescription(notificationChannelDetails.description);
            notificationChannel.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(5).build());
            } else {
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            }
            notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannel.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void show(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            result.success((Object) null);
        }
    }

    static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        o notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        int intValue = notificationDetails.id.intValue();
        if (str != null) {
            notificationManager.i(str, intValue, createNotification);
        } else {
            notificationManager.h(intValue, createNotification);
        }
    }

    private void startForegroundService(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        Map map = (Map) methodCall.argument("notificationData");
        Integer num = (Integer) methodCall.argument("startType");
        ArrayList arrayList = (ArrayList) methodCall.argument("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            str = "If foregroundServiceTypes is non-null it must not be empty!";
        } else if (map == null || num == null) {
            str = "An argument passed to startForegroundService was null!";
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(result, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.id.intValue() != 0) {
                b bVar = new b(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, a.class);
                intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", bVar);
                e.f.j.a.m(this.applicationContext, intent);
                result.success((Object) null);
                return;
            }
            str = "The id of the notification for a foreground service must not be 0!";
        }
        result.error("ARGUMENT_ERROR", str, (Object) null);
    }

    private void stopForegroundService(MethodChannel.Result result) {
        this.applicationContext.stopService(new Intent(this.applicationContext, a.class));
        result.success((Object) null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            result.success((Object) null);
        }
    }

    static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate != null) {
            notificationDetails.scheduledDateTime = nextFireDate;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents != null) {
            notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String q2 = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q2);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        long epochMilli = Build.VERSION.SDK_INT >= 26 ? ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli() : t.W(r.b.a.g.Y(notificationDetails.scheduledDateTime), q.o(notificationDetails.timeZoneName)).C().J();
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.f.b(alarmManager, 0, epochMilli, broadcastPendingIntent);
        } else {
            androidx.core.app.f.a(alarmManager, 0, epochMilli, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        this.launchIntent = activity.getIntent();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c = 1;
                    break;
                }
                break;
            case -1889739879:
                if (str.equals(SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD)) {
                    c = 2;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c = 4;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c = 5;
                    break;
                }
                break;
            case -697920873:
                if (str.equals(SCHEDULE_METHOD)) {
                    c = 6;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c = 7;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c = 8;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c = 9;
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c = 10;
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c = 11;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c = 12;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = 13;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c = 14;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c = 15;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 16;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c = 17;
                    break;
                }
                break;
            case 1408864732:
                if (str.equals(SHOW_DAILY_AT_TIME_METHOD)) {
                    c = 18;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c = 19;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                stopForegroundService(result);
                return;
            case 1:
                getNotificationChannels(result);
                return;
            case 2:
            case 9:
            case 18:
                repeat(methodCall, result);
                return;
            case 3:
                deleteNotificationChannelGroup(methodCall, result);
                return;
            case 4:
                cancel(methodCall, result);
                return;
            case 5:
                pendingNotificationRequests(result);
                return;
            case 6:
                schedule(methodCall, result);
                return;
            case 7:
                getNotificationAppLaunchDetails(result);
                return;
            case 8:
                show(methodCall, result);
                return;
            case 10:
                getActiveNotificationMessagingStyle(methodCall, result);
                return;
            case 11:
                cancelAllNotifications(result);
                return;
            case 12:
                zonedSchedule(methodCall, result);
                return;
            case 13:
                createNotificationChannelGroup(methodCall, result);
                return;
            case 14:
                initialize(methodCall, result);
                return;
            case 15:
                areNotificationsEnabled(result);
                return;
            case 16:
                deleteNotificationChannel(methodCall, result);
                return;
            case 17:
                startForegroundService(methodCall, result);
                return;
            case 19:
                getActiveNotifications(result);
                return;
            case 20:
                createNotificationChannel(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}
