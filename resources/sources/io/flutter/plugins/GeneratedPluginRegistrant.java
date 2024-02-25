package io.flutter.plugins;

import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import f.c.a.m;
import f.f.a.d;
import g.a.a.a.a;
import h.a.a.a.b;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import k.b.a.a.a.c;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new b());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin contacts_service, flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new a());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new j.a.a.a.a());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FilePickerPlugin());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseCorePlugin());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseMessagingPlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FirebaseRemoteConfigPlugin());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new i.a.a.a());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin flutter_app_badger, fr.g123k.flutterappbadger.FlutterAppBadgerPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new f.d.a.a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin flutter_image_compress, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterLocalNotificationsPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new o.a.a.a());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterAndroidLifecyclePlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new d());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new k.a.a.a.a());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin flutter_windowmanager, io.adaptant.labs.flutter_windowmanager.FlutterWindowManagerPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new c());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new s.a.a.a.a.c());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin image_cropper, vn.hunghd.flutter.plugins.imagecropper.ImageCropperPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new ImagePickerPlugin());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new InAppPurchasePlugin());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new g.a.a.b.a());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new PathProviderPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new m());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new SharedPreferencesPlugin());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new f.a.a.a.a());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new f.h.a.c());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new UrlLauncherPlugin());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new WebViewFlutterPlugin());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e27);
        }
    }
}
