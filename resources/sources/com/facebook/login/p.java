package com.facebook.login;

public enum p {
    NONE((String) null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    

    /* renamed from: e  reason: collision with root package name */
    private final String f1629e;

    private p(String str) {
        this.f1629e = str;
    }

    public final String c() {
        return this.f1629e;
    }
}
