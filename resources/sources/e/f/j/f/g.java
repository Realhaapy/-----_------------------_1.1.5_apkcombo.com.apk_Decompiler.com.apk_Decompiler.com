package e.f.j.f;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import e.f.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class g {

    static class a {
        static int a(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public interface b {
    }

    public static final class c implements b {
        private final d[] a;

        public c(d[] dVarArr) {
            this.a = dVarArr;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        private final String a;
        private final int b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3339d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3340e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3341f;

        public d(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.b = i2;
            this.c = z;
            this.f3339d = str2;
            this.f3340e = i3;
            this.f3341f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f3341f;
        }

        public int c() {
            return this.f3340e;
        }

        public String d() {
            return this.f3339d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e implements b {
        private final e.f.o.e a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3342d;

        public e(e.f.o.e eVar, int i2, int i3, String str) {
            this.a = eVar;
            this.c = i2;
            this.b = i3;
            this.f3342d = str;
        }

        public int a() {
            return this.c;
        }

        public e.f.o.e b() {
            return this.a;
        }

        public String c() {
            return this.f3342d;
        }

        public int d() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(typedArray, i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static e.f.j.f.g.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            e.f.j.f.g$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.j.f.g.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):e.f.j.f.g$b");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.f3318g);
        String string = obtainAttributes.getString(i.f3319h);
        String string2 = obtainAttributes.getString(i.f3323l);
        String string3 = obtainAttributes.getString(i.f3324m);
        int resourceId = obtainAttributes.getResourceId(i.f3320i, 0);
        int integer = obtainAttributes.getInteger(i.f3321j, 1);
        int integer2 = obtainAttributes.getInteger(i.f3322k, 500);
        String string4 = obtainAttributes.getString(i.f3325n);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(new e.f.o.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.f3326o);
        int i2 = i.x;
        if (!obtainAttributes.hasValue(i2)) {
            i2 = i.f3328q;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = i.v;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = i.f3329r;
        }
        boolean z = 1 == obtainAttributes.getInt(i4, 0);
        int i5 = i.y;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = i.f3330s;
        }
        int i6 = i.w;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = i.t;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = i.u;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = i.f3327p;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i3, z, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
