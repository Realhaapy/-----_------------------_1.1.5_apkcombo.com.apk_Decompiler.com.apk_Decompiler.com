package com.facebook;

import m.y.d.l;

public final class b0 extends c0 {
    public static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    private final int f1357e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1358f;

    public b0(String str, int i2, String str2) {
        super(str);
        this.f1357e = i2;
        this.f1358f = str2;
    }

    public String toString() {
        String str = "{FacebookDialogException: " + "errorCode: " + this.f1357e + ", message: " + getMessage() + ", url: " + this.f1358f + "}";
        l.c(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
