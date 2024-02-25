package e.f.o;

import android.util.Base64;
import e.f.q.d;
import java.util.List;

public final class e {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f3371d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3372e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f3373f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        d.d(str);
        this.a = str;
        d.d(str2);
        this.b = str2;
        d.d(str3);
        this.c = str3;
        d.d(list);
        this.f3371d = list;
        this.f3373f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f3371d;
    }

    public int c() {
        return this.f3372e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f3373f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f3371d.size(); i2++) {
            sb.append(" [");
            List list = this.f3371d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3372e);
        return sb.toString();
    }
}
