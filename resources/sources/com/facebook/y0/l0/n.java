package com.facebook.y0.l0;

public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    

    /* renamed from: e  reason: collision with root package name */
    private final String f1973e;

    private n(String str) {
        this.f1973e = str;
    }

    public final String c() {
        return this.f1973e;
    }
}
