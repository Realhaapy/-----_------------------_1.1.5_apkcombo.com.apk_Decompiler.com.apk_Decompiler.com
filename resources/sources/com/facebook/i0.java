package com.facebook;

import m.y.d.l;

public final class i0 extends c0 {
    private static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    private final f0 f1398e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, String str) {
        super(str);
        l.d(f0Var, "requestError");
        this.f1398e = f0Var;
    }

    public final f0 c() {
        return this.f1398e;
    }

    public String toString() {
        String str = "{FacebookServiceException: " + "httpResponseCode: " + this.f1398e.f() + ", facebookErrorCode: " + this.f1398e.b() + ", facebookErrorType: " + this.f1398e.d() + ", message: " + this.f1398e.c() + "}";
        l.c(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
