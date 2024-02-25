package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;

public class MethodChannel {
    private static final String TAG = "MethodChannel#";
    /* access modifiers changed from: private */
    public final MethodCodec codec;
    private final BinaryMessenger messenger;
    /* access modifiers changed from: private */
    public final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    private final class IncomingMethodCallHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MethodCallHandler handler;

        IncomingMethodCallHandler(MethodCallHandler methodCallHandler) {
            this.handler = methodCallHandler;
        }

        private String getStackTrace(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMethodCall(MethodChannel.this.codec.decodeMethodCall(byteBuffer), new Result() {
                    public void error(String str, String str2, Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                    }

                    public void notImplemented() {
                        binaryReply.reply((ByteBuffer) null);
                    }

                    public void success(Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                    }
                });
            } catch (RuntimeException e2) {
                Log.e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call", e2);
                binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace("error", e2.getMessage(), (Object) null, getStackTrace(e2)));
            }
        }
    }

    private final class IncomingResultHandler implements BinaryMessenger.BinaryReply {
        private final Result callback;

        IncomingResultHandler(Result result) {
            this.callback = result;
        }

        public void reply(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.callback.notImplemented();
                } catch (RuntimeException e2) {
                    Log.e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call result", e2);
                }
            } else {
                try {
                    this.callback.success(MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                } catch (FlutterException e3) {
                    this.callback.error(e3.code, e3.getMessage(), e3.details);
                }
            }
        }
    }

    public interface MethodCallHandler {
        void onMethodCall(MethodCall methodCall, Result result);
    }

    public interface Result {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, (BinaryMessenger.TaskQueue) null);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue2) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue2;
    }

    public void invokeMethod(String str, Object obj) {
        invokeMethod(str, obj, (Result) null);
    }

    public void invokeMethod(String str, Object obj, Result result) {
        this.messenger.send(this.name, this.codec.encodeMethodCall(new MethodCall(str, obj)), result == null ? null : new IncomingResultHandler(result));
    }

    public void resizeChannelBuffer(int i2) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i2);
    }

    public void setMethodCallHandler(MethodCallHandler methodCallHandler) {
        IncomingMethodCallHandler incomingMethodCallHandler = null;
        if (this.taskQueue != null) {
            BinaryMessenger binaryMessenger = this.messenger;
            String str = this.name;
            if (methodCallHandler != null) {
                incomingMethodCallHandler = new IncomingMethodCallHandler(methodCallHandler);
            }
            binaryMessenger.setMessageHandler(str, incomingMethodCallHandler, this.taskQueue);
            return;
        }
        BinaryMessenger binaryMessenger2 = this.messenger;
        String str2 = this.name;
        if (methodCallHandler != null) {
            incomingMethodCallHandler = new IncomingMethodCallHandler(methodCallHandler);
        }
        binaryMessenger2.setMessageHandler(str2, incomingMethodCallHandler);
    }
}
