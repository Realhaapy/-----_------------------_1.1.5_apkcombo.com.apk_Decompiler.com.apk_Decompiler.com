package f.e.c.a.z.a;

import java.io.IOException;

public class c0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: e  reason: collision with root package name */
    private s0 f4072e;

    public static class a extends c0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public c0(String str) {
        super(str);
    }

    static c0 a() {
        return new c0("Protocol message end-group tag did not match expected tag.");
    }

    static c0 b() {
        return new c0("Protocol message contained an invalid tag (zero).");
    }

    static c0 c() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static c0 e() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    static c0 f() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static c0 g() {
        return new c0("Failed to parse the message.");
    }

    static c0 h() {
        return new c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static c0 j() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public c0 i(s0 s0Var) {
        this.f4072e = s0Var;
        return this;
    }
}
