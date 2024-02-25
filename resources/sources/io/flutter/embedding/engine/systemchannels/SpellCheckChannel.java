package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.json.JSONArray;
import org.json.JSONException;

public class SpellCheckChannel {
    private static final String TAG = "SpellCheckChannel";
    public final MethodChannel channel;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    /* access modifiers changed from: private */
    public SpellCheckMethodHandler spellCheckMethodHandler;

    public interface SpellCheckMethodHandler {
        void initiateSpellCheck(String str, String str2, MethodChannel.Result result);
    }

    public SpellCheckChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (SpellCheckChannel.this.spellCheckMethodHandler == null) {
                    Log.v(SpellCheckChannel.TAG, "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(SpellCheckChannel.TAG, "Received '" + str + "' message.");
                str.hashCode();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    result.notImplemented();
                    return;
                }
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    SpellCheckChannel.this.spellCheckMethodHandler.initiateSpellCheck(jSONArray.getString(0), jSONArray.getString(1), result);
                } catch (JSONException e2) {
                    result.error("error", e2.getMessage(), (Object) null);
                }
            }
        };
        this.parsingMethodHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/spellcheck", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void setSpellCheckMethodHandler(SpellCheckMethodHandler spellCheckMethodHandler2) {
        this.spellCheckMethodHandler = spellCheckMethodHandler2;
    }
}
