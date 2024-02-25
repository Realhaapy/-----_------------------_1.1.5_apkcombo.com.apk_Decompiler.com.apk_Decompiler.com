package e.f.j.f;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import e.f.i;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class h {

    static final class a {
        final int[] a;
        final float[] b;

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.b[i2] = list2.get(i2).floatValue();
            }
        }
    }

    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new a(i2, i3);
        return aVar2;
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k2 = k.k(resources, theme2, attributeSet, i.z);
            float f2 = k.f(k2, xmlPullParser2, "startX", i.I, 0.0f);
            float f3 = k.f(k2, xmlPullParser2, "startY", i.J, 0.0f);
            float f4 = k.f(k2, xmlPullParser2, "endX", i.K, 0.0f);
            float f5 = k.f(k2, xmlPullParser2, "endY", i.L, 0.0f);
            float f6 = k.f(k2, xmlPullParser2, "centerX", i.D, 0.0f);
            float f7 = k.f(k2, xmlPullParser2, "centerY", i.E, 0.0f);
            int g2 = k.g(k2, xmlPullParser2, "type", i.C, 0);
            int b = k.b(k2, xmlPullParser2, "startColor", i.A, 0);
            boolean j2 = k.j(xmlPullParser2, "centerColor");
            int b2 = k.b(k2, xmlPullParser2, "centerColor", i.H, 0);
            int b3 = k.b(k2, xmlPullParser2, "endColor", i.B, 0);
            int g3 = k.g(k2, xmlPullParser2, "tileMode", i.G, 0);
            float f8 = f6;
            float f9 = k.f(k2, xmlPullParser2, "gradientRadius", i.F, 0.0f);
            k2.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j2, b2);
            if (g2 == 1) {
                float f10 = f8;
                if (f9 > 0.0f) {
                    int[] iArr = a2.a;
                    return new RadialGradient(f10, f7, f9, iArr, a2.b, d(g3));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g2 != 2) {
                return new LinearGradient(f2, f3, f4, f5, a2.a, a2.b, d(g3));
            } else {
                return new SweepGradient(f8, f7, a2.a, a2.b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static e.f.j.f.h.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = e.f.i.M
            android.content.res.TypedArray r3 = e.f.j.f.k.k(r9, r12, r11, r3)
            int r5 = e.f.i.N
            boolean r6 = r3.hasValue(r5)
            int r7 = e.f.i.O
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            e.f.j.f.h$a r9 = new e.f.j.f.h$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.j.f.h.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):e.f.j.f.h$a");
    }

    private static Shader.TileMode d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
