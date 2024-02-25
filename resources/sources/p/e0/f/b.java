package p.e0.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p.e0.a;
import p.k;

public final class b {
    private final List<k> a;
    private int b = 0;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5149d;

    public b(List<k> list) {
        this.a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i2 = this.b; i2 < this.a.size(); i2++) {
            if (this.a.get(i2).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public k a(SSLSocket sSLSocket) {
        k kVar;
        int i2 = this.b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = this.a.get(i2);
            i2++;
            if (kVar.c(sSLSocket)) {
                this.b = i2;
                break;
            }
        }
        if (kVar != null) {
            this.c = c(sSLSocket);
            a.a.c(kVar, sSLSocket, this.f5149d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f5149d + ", modes=" + this.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f5149d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
        }
        return false;
    }
}
