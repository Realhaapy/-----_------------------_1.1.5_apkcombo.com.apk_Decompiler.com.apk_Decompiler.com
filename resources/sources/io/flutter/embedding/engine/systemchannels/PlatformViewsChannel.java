package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    /* access modifiers changed from: private */
    public PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    public interface PlatformViewBufferResized {
        void run(PlatformViewBufferSize platformViewBufferSize);
    }

    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;
        public final ByteBuffer params;
        public final int viewId;
        public final String viewType;

        public PlatformViewCreationRequest(int i2, String str, double d2, double d3, double d4, double d5, int i3, ByteBuffer byteBuffer) {
            this.viewId = i2;
            this.viewType = str;
            this.logicalTop = d2;
            this.logicalLeft = d3;
            this.logicalWidth = d4;
            this.logicalHeight = d5;
            this.direction = i3;
            this.params = byteBuffer;
        }
    }

    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i2, double d2, double d3) {
            this.viewId = i2;
            this.newLogicalWidth = d2;
            this.newLogicalHeight = d3;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        public final Number downTime;
        public final int edgeFlags;
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;
        public final Object rawPointerCoords;
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i2, Number number, Number number2, int i3, int i4, Object obj, Object obj2, int i5, int i6, float f2, float f3, int i7, int i8, int i9, int i10, long j2) {
            this.viewId = i2;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i3;
            this.pointerCount = i4;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i5;
            this.buttonState = i6;
            this.xPrecision = f2;
            this.yPrecision = f3;
            this.deviceId = i7;
            this.edgeFlags = i8;
            this.source = i9;
            this.flags = i10;
            this.motionEventId = j2;
        }
    }

    public interface PlatformViewsHandler {
        void clearFocus(int i2);

        void createForPlatformViewLayer(PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i2);

        void offset(int i2, double d2, double d3);

        void onTouch(PlatformViewTouch platformViewTouch);

        void resize(PlatformViewResizeRequest platformViewResizeRequest, PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i2, int i3);

        void synchronizeToNativeViewHierarchy(boolean z);
    }

    public PlatformViewsChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            static /* synthetic */ void a(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
                if (platformViewBufferSize == null) {
                    result.error("error", "Failed to resize the platform view", (Object) null);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("width", Double.valueOf((double) platformViewBufferSize.width));
                hashMap.put("height", Double.valueOf((double) platformViewBufferSize.height));
                result.success(hashMap);
            }

            private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void create(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannel.Result result2 = result;
                Map map = (Map) methodCall.arguments();
                boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                if (z) {
                    try {
                        PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), wrap));
                        result2.success((Object) null);
                    } catch (IllegalStateException e2) {
                        result2.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                    }
                } else {
                    int intValue = ((Integer) map.get("id")).intValue();
                    String str = (String) map.get("viewType");
                    double d2 = 0.0d;
                    double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                    if (map.containsKey("left")) {
                        d2 = ((Double) map.get("left")).doubleValue();
                    }
                    result2.success(Long.valueOf(PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(intValue, str, doubleValue, d2, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), wrap))));
                }
            }

            private void dispose(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void offset(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                    result.success((Object) null);
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void resize(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b(result));
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void synchronizeToNativeViewHierarchy(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                    result.success((Object) null);
                } catch (IllegalStateException e2) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e2), (Object) null);
                }
            }

            private void touch(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannel.Result result2;
                MethodChannel.Result result3 = result;
                List list = (List) methodCall.arguments();
                PlatformViewTouch platformViewTouch = r2;
                PlatformViewTouch platformViewTouch2 = platformViewTouch;
                PlatformViewTouch platformViewTouch3 = new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                try {
                    PlatformViewsChannel.this.handler.onTouch(platformViewTouch);
                    result2 = result;
                    try {
                        result2.success((Object) null);
                    } catch (IllegalStateException e2) {
                        e = e2;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    result2 = result;
                    result2.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (PlatformViewsChannel.this.handler != null) {
                    Log.v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
                    String str = methodCall.method;
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1352294148:
                            if (str.equals("create")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1019779949:
                            if (str.equals("offset")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -934437708:
                            if (str.equals("resize")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -756050293:
                            if (str.equals("clearFocus")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -308988850:
                            if (str.equals("synchronizeToNativeViewHierarchy")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 110550847:
                            if (str.equals("touch")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 576796989:
                            if (str.equals("setDirection")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str.equals("dispose")) {
                                c = 7;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            create(methodCall, result);
                            return;
                        case 1:
                            offset(methodCall, result);
                            return;
                        case 2:
                            resize(methodCall, result);
                            return;
                        case 3:
                            clearFocus(methodCall, result);
                            return;
                        case 4:
                            synchronizeToNativeViewHierarchy(methodCall, result);
                            return;
                        case 5:
                            touch(methodCall, result);
                            return;
                        case 6:
                            setDirection(methodCall, result);
                            return;
                        case 7:
                            dispose(methodCall, result);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                }
            }
        };
        this.parsingHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    /* access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void invokeViewFocused(int i2) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("viewFocused", Integer.valueOf(i2));
        }
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
