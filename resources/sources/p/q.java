package p;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p.e0.c;

public final class q {
    private final d0 a;
    private final h b;
    private final List<Certificate> c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f5397d;

    private q(d0 d0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.a = d0Var;
        this.b = hVar;
        this.c = list;
        this.f5397d = list2;
    }

    public static q b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            h a2 = h.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                d0 a3 = d0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List s2 = certificateArr != null ? c.s(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new q(a3, a2, s2, localCertificates != null ? c.s(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public h a() {
        return this.b;
    }

    public List<Certificate> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.f5397d.equals(qVar.f5397d);
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f5397d.hashCode();
    }
}
