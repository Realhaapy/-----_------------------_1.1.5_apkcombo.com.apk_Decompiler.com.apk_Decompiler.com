package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class PlatformChannel {
    private static final String TAG = "PlatformChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodCallHandler;
    /* access modifiers changed from: private */
    public PlatformMessageHandler platformMessageHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode[] r0 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode r5 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay[] r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = r4
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r5 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay     // Catch:{ NoSuchFieldError -> 0x004e }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r5 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation[] r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = r4
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r5 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation     // Catch:{ NoSuchFieldError -> 0x0073 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation     // Catch:{ NoSuchFieldError -> 0x007d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass2.<clinit>():void");
        }
    }

    public static class AppSwitcherDescription {
        public final int color;
        public final String label;

        public AppSwitcherDescription(int i2, String str) {
            this.color = i2;
            this.label = str;
        }
    }

    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        
        private String encodedName;

        private Brightness(String str) {
            this.encodedName = str;
        }

        static Brightness fromValue(String str) {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum ClipboardContentFormat {
        PLAIN_TEXT("text/plain");
        
        private String encodedName;

        private ClipboardContentFormat(String str) {
            this.encodedName = str;
        }

        static ClipboardContentFormat fromValue(String str) {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        
        private String encodedName;

        private DeviceOrientation(String str) {
            this.encodedName = str;
        }

        static DeviceOrientation fromValue(String str) {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum HapticFeedbackType {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        
        private final String encodedName;

        private HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        static HapticFeedbackType fromValue(String str) {
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        CharSequence getClipboardData(ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(String str);

        void setPreferredOrientations(int i2);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(SystemChromeStyle systemChromeStyle);

        void showSystemOverlays(List<SystemUiOverlay> list);

        void showSystemUiMode(SystemUiMode systemUiMode);

        void vibrateHapticFeedback(HapticFeedbackType hapticFeedbackType);
    }

    public enum SoundType {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        
        private final String encodedName;

        private SoundType(String str) {
            this.encodedName = str;
        }

        static SoundType fromValue(String str) {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class SystemChromeStyle {
        public final Integer statusBarColor;
        public final Brightness statusBarIconBrightness;
        public final Integer systemNavigationBarColor;
        public final Boolean systemNavigationBarContrastEnforced;
        public final Integer systemNavigationBarDividerColor;
        public final Brightness systemNavigationBarIconBrightness;
        public final Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(Integer num, Brightness brightness, Boolean bool, Integer num2, Brightness brightness2, Integer num3, Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        
        private String encodedName;

        private SystemUiMode(String str) {
            this.encodedName = str;
        }

        static SystemUiMode fromValue(String str) {
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        
        private String encodedName;

        private SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        static SystemUiOverlay fromValue(String str) {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public PlatformChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
            /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
                r7.success((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
                r7.error("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fe */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x011f A[Catch:{ JSONException -> 0x0216 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onMethodCall(io.flutter.plugin.common.MethodCall r6, io.flutter.plugin.common.MethodChannel.Result r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "error"
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler
                    if (r1 != 0) goto L_0x000b
                    return
                L_0x000b:
                    java.lang.String r1 = r6.method
                    java.lang.Object r6 = r6.arguments
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Received '"
                    r2.append(r3)
                    r2.append(r1)
                    java.lang.String r3 = "' message."
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "PlatformChannel"
                    io.flutter.Log.v(r3, r2)
                    r2 = -1
                    r3 = 0
                    int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0216 }
                    switch(r4) {
                        case -766342101: goto L_0x00b4;
                        case -720677196: goto L_0x00a9;
                        case -577225884: goto L_0x009f;
                        case -548468504: goto L_0x0095;
                        case -247230243: goto L_0x008b;
                        case -215273374: goto L_0x0081;
                        case 241845679: goto L_0x0077;
                        case 875995648: goto L_0x006c;
                        case 1128339786: goto L_0x0062;
                        case 1390477857: goto L_0x0057;
                        case 1514180520: goto L_0x004b;
                        case 1674312266: goto L_0x0040;
                        case 2119655719: goto L_0x0035;
                        default: goto L_0x0033;
                    }     // Catch:{ JSONException -> 0x0216 }
                L_0x0033:
                    goto L_0x00be
                L_0x0035:
                    java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 2
                    goto L_0x00be
                L_0x0040:
                    java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 4
                    goto L_0x00be
                L_0x004b:
                    java.lang.String r4 = "Clipboard.getData"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 10
                    goto L_0x00be
                L_0x0057:
                    java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 8
                    goto L_0x00be
                L_0x0062:
                    java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 5
                    goto L_0x00be
                L_0x006c:
                    java.lang.String r4 = "Clipboard.hasStrings"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 12
                    goto L_0x00be
                L_0x0077:
                    java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 7
                    goto L_0x00be
                L_0x0081:
                    java.lang.String r4 = "SystemSound.play"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 0
                    goto L_0x00be
                L_0x008b:
                    java.lang.String r4 = "HapticFeedback.vibrate"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 1
                    goto L_0x00be
                L_0x0095:
                    java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 3
                    goto L_0x00be
                L_0x009f:
                    java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 6
                    goto L_0x00be
                L_0x00a9:
                    java.lang.String r4 = "Clipboard.setData"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 11
                    goto L_0x00be
                L_0x00b4:
                    java.lang.String r4 = "SystemNavigator.pop"
                    boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                    if (r1 == 0) goto L_0x00be
                    r2 = 9
                L_0x00be:
                    java.lang.String r1 = "text"
                    switch(r2) {
                        case 0: goto L_0x01fc;
                        case 1: goto L_0x01e2;
                        case 2: goto L_0x01c4;
                        case 3: goto L_0x01a8;
                        case 4: goto L_0x018a;
                        case 5: goto L_0x016c;
                        case 6: goto L_0x0162;
                        case 7: goto L_0x0158;
                        case 8: goto L_0x0136;
                        case 9: goto L_0x012c;
                        case 10: goto L_0x00f5;
                        case 11: goto L_0x00e1;
                        case 12: goto L_0x00c8;
                        default: goto L_0x00c3;
                    }
                L_0x00c3:
                    r7.notImplemented()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x022f
                L_0x00c8:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r6 = r6.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    boolean r6 = r6.clipboardHasStrings()     // Catch:{ JSONException -> 0x0216 }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                    r1.<init>()     // Catch:{ JSONException -> 0x0216 }
                    java.lang.String r2 = "value"
                    r1.put(r2, r6)     // Catch:{ JSONException -> 0x0216 }
                    r7.success(r1)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x022f
                L_0x00e1:
                    org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0216 }
                    java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    r1.setClipboardData(r6)     // Catch:{ JSONException -> 0x0216 }
                L_0x00f0:
                    r7.success(r3)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x022f
                L_0x00f5:
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0216 }
                    if (r6 == 0) goto L_0x0112
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x00fe }
                    goto L_0x0113
                L_0x00fe:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0216 }
                    r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                    java.lang.String r4 = "No such clipboard content format: "
                    r2.append(r4)     // Catch:{ JSONException -> 0x0216 }
                    r2.append(r6)     // Catch:{ JSONException -> 0x0216 }
                    java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0216 }
                    r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
                L_0x0112:
                    r6 = r3
                L_0x0113:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r2 = r2.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    java.lang.CharSequence r6 = r2.getClipboardData(r6)     // Catch:{ JSONException -> 0x0216 }
                    if (r6 == 0) goto L_0x00f0
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                    r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                    r2.put(r1, r6)     // Catch:{ JSONException -> 0x0216 }
                    r7.success(r2)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x022f
                L_0x012c:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r6 = r6.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    r6.popSystemNavigator()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x00f0
                L_0x0136:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemChromeStyle r6 = r1.decodeSystemChromeStyle(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    r1.setSystemUiOverlayStyle(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    r7.success(r3)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                    goto L_0x022f
                L_0x014c:
                    r6 = move-exception
                    goto L_0x014f
                L_0x014e:
                    r6 = move-exception
                L_0x014f:
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                L_0x0153:
                    r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x022f
                L_0x0158:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r6 = r6.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    r6.restoreSystemUiOverlays()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x00f0
                L_0x0162:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0216 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r6 = r6.platformMessageHandler     // Catch:{ JSONException -> 0x0216 }
                    r6.setSystemUiChangeListener()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x00f0
                L_0x016c:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode r6 = r1.decodeSystemUiMode(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    r1.showSystemUiMode(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    r7.success(r3)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                    goto L_0x022f
                L_0x0182:
                    r6 = move-exception
                    goto L_0x0185
                L_0x0184:
                    r6 = move-exception
                L_0x0185:
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x018a:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    java.util.List r6 = r1.decodeSystemUiOverlays(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    r1.showSystemOverlays(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    r7.success(r3)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                    goto L_0x022f
                L_0x01a0:
                    r6 = move-exception
                    goto L_0x01a3
                L_0x01a2:
                    r6 = move-exception
                L_0x01a3:
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x01a8:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01be }
                    org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01be }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$AppSwitcherDescription r6 = r1.decodeAppSwitcherDescription(r6)     // Catch:{ JSONException -> 0x01be }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01be }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x01be }
                    r1.setApplicationSwitcherDescription(r6)     // Catch:{ JSONException -> 0x01be }
                    r7.success(r3)     // Catch:{ JSONException -> 0x01be }
                    goto L_0x022f
                L_0x01be:
                    r6 = move-exception
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x01c4:
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    int r6 = r1.decodeOrientations(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    r1.setPreferredOrientations(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    r7.success(r3)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                    goto L_0x022f
                L_0x01d9:
                    r6 = move-exception
                    goto L_0x01dc
                L_0x01db:
                    r6 = move-exception
                L_0x01dc:
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x01e2:
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    r1.vibrateHapticFeedback(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                    goto L_0x022f
                L_0x01f5:
                    r6 = move-exception
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x01fc:
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x020f }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$SoundType r6 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ NoSuchFieldException -> 0x020f }
                    io.flutter.embedding.engine.systemchannels.PlatformChannel$PlatformMessageHandler r1 = r1.platformMessageHandler     // Catch:{ NoSuchFieldException -> 0x020f }
                    r1.playSystemSound(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                    r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x020f }
                    goto L_0x022f
                L_0x020f:
                    r6 = move-exception
                    java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x0153
                L_0x0216:
                    r6 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "JSON error: "
                    r1.append(r2)
                    java.lang.String r6 = r6.getMessage()
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    r7.error(r0, r6, r3)
                L_0x022f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass1.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.parsingMethodCallHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    /* access modifiers changed from: private */
    public AppSwitcherDescription decodeAppSwitcherDescription(JSONObject jSONObject) {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new AppSwitcherDescription(i2, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decodeOrientations(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.fromValue(r4)
            int[] r8 = io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.decodeOrientations(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    public SystemChromeStyle decodeSystemChromeStyle(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        Brightness fromValue = !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        Brightness fromValue2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new SystemChromeStyle(valueOf, fromValue, valueOf2, valueOf3, fromValue2, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    public SystemUiMode decodeSystemUiMode(String str) {
        int i2 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[SystemUiMode.fromValue(str).ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? SystemUiMode.EDGE_TO_EDGE : SystemUiMode.EDGE_TO_EDGE : SystemUiMode.IMMERSIVE_STICKY : SystemUiMode.IMMERSIVE : SystemUiMode.LEAN_BACK;
    }

    /* access modifiers changed from: private */
    public List<SystemUiOverlay> decodeSystemUiOverlays(JSONArray jSONArray) {
        SystemUiOverlay systemUiOverlay;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[SystemUiOverlay.fromValue(jSONArray.getString(i2)).ordinal()];
            if (i3 == 1) {
                systemUiOverlay = SystemUiOverlay.TOP_OVERLAYS;
            } else if (i3 != 2) {
            } else {
                systemUiOverlay = SystemUiOverlay.BOTTOM_OVERLAYS;
            }
            arrayList.add(systemUiOverlay);
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler2) {
        this.platformMessageHandler = platformMessageHandler2;
    }

    public void systemChromeChanged(boolean z) {
        Log.v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z)}));
    }
}
