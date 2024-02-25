package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.MethodChannel;

public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, Log.WARN);
    }

    public ErrorLogResult(String str, int i2) {
        this.tag = str;
        this.level = i2;
    }

    public void error(String str, String str2, Object obj) {
        String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i2 = this.level;
        if (i2 >= Log.WARN) {
            Log.println(i2, this.tag, str2 + str3);
        }
    }

    public void notImplemented() {
        int i2 = this.level;
        if (i2 >= Log.WARN) {
            Log.println(i2, this.tag, "method not implemented");
        }
    }

    public void success(Object obj) {
    }
}
