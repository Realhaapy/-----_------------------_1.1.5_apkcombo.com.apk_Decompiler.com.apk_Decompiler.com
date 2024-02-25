package p;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p.e0.l.c;
import q.f;

public final class g {
    public static final g c = new a().a();
    private final Set<b> a;
    private final c b;

    public static final class a {
        private final List<b> a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.a), (c) null);
        }
    }

    static final class b {
        final String a;
        final String b;
        final String c;

        /* renamed from: d  reason: collision with root package name */
        final f f5355d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.a.startsWith("*.")) {
                return str.equals(this.b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.b.length()) {
                String str2 = this.b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.f5355d.equals(bVar.f5355d);
            }
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f5355d.hashCode();
        }

        public String toString() {
            return this.c + this.f5355d.a();
        }
    }

    g(Set<b> set, c cVar) {
        this.a = set;
        this.b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f d(X509Certificate x509Certificate) {
        return f.m(x509Certificate.getPublicKey().getEncoded()).t();
    }

    static f e(X509Certificate x509Certificate) {
        return f.m(x509Certificate.getPublicKey().getEncoded()).u();
    }

    public void a(String str, List<Certificate> list) {
        List<b> b2 = b(str);
        if (!b2.isEmpty()) {
            c cVar = this.b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                int size2 = b2.size();
                f fVar = null;
                f fVar2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    b bVar = b2.get(i3);
                    if (bVar.c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = e(x509Certificate);
                        }
                        if (bVar.f5355d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = d(x509Certificate);
                        }
                        if (bVar.f5355d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
                sb.append("\n    ");
                sb.append(c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = b2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                sb.append("\n    ");
                sb.append(b2.get(i5));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.a) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return p.e0.c.o(this.b, gVar.b) && this.a.equals(gVar.a);
        }
    }

    /* access modifiers changed from: package-private */
    public g f(c cVar) {
        return p.e0.c.o(this.b, cVar) ? this : new g(this.a, cVar);
    }

    public int hashCode() {
        c cVar = this.b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.a.hashCode();
    }
}
