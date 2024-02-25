package com.facebook;

import m.y.d.l;

public final class d0 extends c0 {

    /* renamed from: e  reason: collision with root package name */
    private final m0 f1365e;

    public d0(m0 m0Var, String str) {
        super(str);
        this.f1365e = m0Var;
    }

    public String toString() {
        m0 m0Var = this.f1365e;
        f0 b = m0Var == null ? null : m0Var.b();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        l.c(sb, "StringBuilder().append(\"{FacebookGraphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (b != null) {
            sb.append("httpResponseCode: ");
            sb.append(b.f());
            sb.append(", facebookErrorCode: ");
            sb.append(b.b());
            sb.append(", facebookErrorType: ");
            sb.append(b.d());
            sb.append(", message: ");
            sb.append(b.c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        l.c(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
