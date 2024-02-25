package p;

import java.io.IOException;

public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: e  reason: collision with root package name */
    private final String f5448e;

    private w(String str) {
        this.f5448e = str;
    }

    public static w a(String str) {
        w wVar = HTTP_1_0;
        if (str.equals(wVar.f5448e)) {
            return wVar;
        }
        w wVar2 = HTTP_1_1;
        if (str.equals(wVar2.f5448e)) {
            return wVar2;
        }
        w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(wVar3.f5448e)) {
            return wVar3;
        }
        w wVar4 = HTTP_2;
        if (str.equals(wVar4.f5448e)) {
            return wVar4;
        }
        w wVar5 = SPDY_3;
        if (str.equals(wVar5.f5448e)) {
            return wVar5;
        }
        w wVar6 = QUIC;
        if (str.equals(wVar6.f5448e)) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f5448e;
    }
}
