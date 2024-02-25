package m.d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m.a0.c;
import m.l;
import m.y.c.p;
import m.y.d.m;

class q extends p {

    static final class a extends m implements p<CharSequence, Integer, l<? extends Integer, ? extends Integer>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f5004e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f5005f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z) {
            super(2);
            this.f5004e = list;
            this.f5005f = z;
        }

        public final l<Integer, Integer> a(CharSequence charSequence, int i2) {
            m.y.d.l.d(charSequence, "$this$$receiver");
            l u = q.x(charSequence, this.f5004e, i2, this.f5005f, false);
            if (u == null) {
                return null;
            }
            return m.p.a(u.c(), Integer.valueOf(((String) u.d()).length()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends m implements m.y.c.l<c, String> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CharSequence f5006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f5006e = charSequence;
        }

        /* renamed from: a */
        public final String invoke(c cVar) {
            m.y.d.l.d(cVar, "it");
            return q.X(this.f5006e, cVar);
        }
    }

    public static final int A(CharSequence charSequence, char c, int i2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i2);
        }
        return G(charSequence, new char[]{c}, i2, z);
    }

    public static final int B(CharSequence charSequence, String str, int i2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return D(charSequence, str, i2, charSequence.length(), z, false, 16, (Object) null);
    }

    private static final int C(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        m.a0.a cVar = !z2 ? new c(f.a(i2, 0), f.c(i3, charSequence.length())) : f.f(f.c(i2, z(charSequence)), f.a(i3, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int h2 = cVar.h();
            int i4 = cVar.i();
            int j2 = cVar.j();
            if ((j2 <= 0 || h2 > i4) && (j2 >= 0 || i4 > h2)) {
                return -1;
            }
            while (true) {
                int i5 = h2 + j2;
                if (Q(charSequence2, 0, charSequence, h2, charSequence2.length(), z)) {
                    return h2;
                }
                if (h2 == i4) {
                    return -1;
                }
                h2 = i5;
            }
        } else {
            int h3 = cVar.h();
            int i6 = cVar.i();
            int j3 = cVar.j();
            if ((j3 <= 0 || h3 > i6) && (j3 >= 0 || i6 > h3)) {
                return -1;
            }
            while (true) {
                int i7 = h3 + j3;
                if (p.n((String) charSequence2, 0, (String) charSequence, h3, charSequence2.length(), z)) {
                    return h3;
                }
                if (h3 == i6) {
                    return -1;
                }
                h3 = i7;
            }
        }
    }

    static /* synthetic */ int D(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return C(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return A(charSequence, c, i2, z);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return B(charSequence, str, i2, z);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a2 = f.a(i2, 0);
            int z3 = z(charSequence);
            if (a2 > z3) {
                return -1;
            }
            while (true) {
                int i3 = a2 + 1;
                char charAt = charSequence.charAt(a2);
                int length = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z2 = false;
                        break;
                    }
                    char c = cArr[i4];
                    i4++;
                    if (c.e(c, charAt, z)) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return a2;
                }
                if (a2 == z3) {
                    return -1;
                }
                a2 = i3;
            }
        } else {
            return ((String) charSequence).indexOf(f.m(cArr), i2);
        }
    }

    public static final int H(CharSequence charSequence, char c, int i2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i2);
        }
        return L(charSequence, new char[]{c}, i2, z);
    }

    public static final int I(CharSequence charSequence, String str, int i2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(str, "string");
        return (z || !(charSequence instanceof String)) ? C(charSequence, str, i2, 0, z, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int J(CharSequence charSequence, char c, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = z(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return H(charSequence, c, i2, z);
    }

    public static /* synthetic */ int K(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = z(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return I(charSequence, str, i2, z);
    }

    public static final int L(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int c = f.c(i2, z(charSequence));
            if (c < 0) {
                return -1;
            }
            while (true) {
                int i3 = c - 1;
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    char c2 = cArr[i4];
                    i4++;
                    if (c.e(c2, charAt, z)) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return c;
                }
                if (i3 < 0) {
                    return -1;
                }
                c = i3;
            }
        } else {
            return ((String) charSequence).lastIndexOf(f.m(cArr), i2);
        }
    }

    public static final m.c0.b<String> M(CharSequence charSequence) {
        m.y.d.l.d(charSequence, "<this>");
        return W(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> N(CharSequence charSequence) {
        m.y.d.l.d(charSequence, "<this>");
        return h.f(M(charSequence));
    }

    private static final m.c0.b<c> O(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        R(i3);
        return new e(charSequence, i2, i3, new a(e.a(strArr), z));
    }

    static /* synthetic */ m.c0.b P(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return O(charSequence, strArr, i2, z, i3);
    }

    public static final boolean Q(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            if (!c.e(charSequence.charAt(i2 + i5), charSequence2.charAt(i5 + i3), z)) {
                return false;
            }
            i5 = i6;
        }
        return true;
    }

    public static final void R(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(m.y.d.l.j("Limit must be non-negative, but was ", Integer.valueOf(i2)).toString());
        }
    }

    public static final List<String> S(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return T(charSequence, str, z, i2);
            }
        }
        Iterable<c> c = h.c(P(charSequence, strArr, 0, z, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(k.j(c, 10));
        for (c X : c) {
            arrayList.add(X(charSequence, X));
        }
        return arrayList;
    }

    private static final List<String> T(CharSequence charSequence, String str, boolean z, int i2) {
        R(i2);
        int i3 = 0;
        int B = B(charSequence, str, 0, z);
        if (B == -1 || i2 == 1) {
            return i.b(charSequence.toString());
        }
        boolean z2 = i2 > 0;
        int i4 = 10;
        if (z2) {
            i4 = f.c(i2, 10);
        }
        ArrayList arrayList = new ArrayList(i4);
        do {
            arrayList.add(charSequence.subSequence(i3, B).toString());
            i3 = str.length() + B;
            if ((z2 && arrayList.size() == i2 - 1) || (B = B(charSequence, str, i3, z)) == -1) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, B).toString());
            i3 = str.length() + B;
            break;
        } while ((B = B(charSequence, str, i3, z)) == -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List U(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return S(charSequence, strArr, z, i2);
    }

    public static final m.c0.b<String> V(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(strArr, "delimiters");
        return h.d(P(charSequence, strArr, 0, z, i2, 2, (Object) null), new b(charSequence));
    }

    public static /* synthetic */ m.c0.b W(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return V(charSequence, strArr, z, i2);
    }

    public static final String X(CharSequence charSequence, c cVar) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(cVar, "range");
        return charSequence.subSequence(cVar.n().intValue(), cVar.m().intValue() + 1).toString();
    }

    public static final String Y(String str, char c, String str2) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "missingDelimiterValue");
        int E = E(str, c, 0, false, 6, (Object) null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        m.y.d.l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String Z(String str, String str2, String str3) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "delimiter");
        m.y.d.l.d(str3, "missingDelimiterValue");
        int F = F(str, str2, 0, false, 6, (Object) null);
        if (F == -1) {
            return str3;
        }
        String substring = str.substring(F + str2.length(), str.length());
        m.y.d.l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String a0(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return Y(str, c, str2);
    }

    public static /* synthetic */ String b0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return Z(str, str2, str3);
    }

    public static final String c0(String str, char c, String str2) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "missingDelimiterValue");
        int J = J(str, c, 0, false, 6, (Object) null);
        if (J == -1) {
            return str2;
        }
        String substring = str.substring(J + 1, str.length());
        m.y.d.l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String d0(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return c0(str, c, str2);
    }

    public static final String e0(String str, char c, String str2) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "missingDelimiterValue");
        int E = E(str, c, 0, false, 6, (Object) null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(0, E);
        m.y.d.l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String f0(String str, String str2, String str3) {
        m.y.d.l.d(str, "<this>");
        m.y.d.l.d(str2, "delimiter");
        m.y.d.l.d(str3, "missingDelimiterValue");
        int F = F(str, str2, 0, false, 6, (Object) null);
        if (F == -1) {
            return str3;
        }
        String substring = str.substring(0, F);
        m.y.d.l.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String g0(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return e0(str, c, str2);
    }

    public static /* synthetic */ String h0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return f0(str, str2, str3);
    }

    public static CharSequence i0(CharSequence charSequence) {
        m.y.d.l.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean c = b.c(charSequence.charAt(!z ? i2 : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        m.y.d.l.d(charSequence, "<this>");
        m.y.d.l.d(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (F(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (D(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean w(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return v(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    public static final l<Integer, String> x(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        int i3;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            m.a0.a cVar = !z2 ? new c(f.a(i2, 0), charSequence.length()) : f.f(f.c(i2, z(charSequence)), 0);
            if (charSequence instanceof String) {
                i3 = cVar.h();
                int i4 = cVar.i();
                int j2 = cVar.j();
                if ((j2 > 0 && i3 <= i4) || (j2 < 0 && i4 <= i3)) {
                    while (true) {
                        int i5 = i3 + j2;
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (p.n(str2, 0, (String) charSequence, i3, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str != null) {
                            break;
                        } else if (i3 == i4) {
                            break;
                        } else {
                            i3 = i5;
                        }
                    }
                }
                return null;
            }
            int h2 = cVar.h();
            int i6 = cVar.i();
            int j3 = cVar.j();
            if ((j3 > 0 && h2 <= i6) || (j3 < 0 && i6 <= h2)) {
                while (true) {
                    int i7 = i3 + j3;
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (Q(str3, 0, charSequence, i3, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str != null) {
                        break;
                    } else if (i3 == i6) {
                        break;
                    } else {
                        h2 = i7;
                    }
                }
            }
            return null;
            return m.p.a(Integer.valueOf(i3), str);
        }
        String str4 = (String) r.y(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i8 = i2;
        int F = !z2 ? F(charSequence2, str5, i8, false, 4, (Object) null) : K(charSequence2, str5, i8, false, 4, (Object) null);
        if (F < 0) {
            return null;
        }
        return m.p.a(Integer.valueOf(F), str4);
    }

    public static final c y(CharSequence charSequence) {
        m.y.d.l.d(charSequence, "<this>");
        return new c(0, charSequence.length() - 1);
    }

    public static final int z(CharSequence charSequence) {
        m.y.d.l.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }
}
