package e.r.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import e.f.j.f.k;
import e.f.k.c;
import org.xmlpull.v1.XmlPullParser;

public class f implements Interpolator {
    private float[] a;
    private float[] b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k2 = k.k(resources, theme, attributeSet, a.f3647l);
        d(k2, xmlPullParser);
        k2.recycle();
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i3 = 0; i3 < min; i3++) {
                pathMeasure.getPosTan((((float) i3) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.a[i3] = fArr[0];
                this.b[i3] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i4 = min - 1;
                if (((double) Math.abs(this.a[i4] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i4] - 1.0f)) <= 1.0E-5d) {
                    float f2 = 0.0f;
                    int i5 = 0;
                    while (i2 < min) {
                        float[] fArr2 = this.a;
                        int i6 = i5 + 1;
                        float f3 = fArr2[i5];
                        if (f3 >= f2) {
                            fArr2[i2] = f3;
                            i2++;
                            f2 = f3;
                            i5 = i6;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.a[0]);
            sb.append(",");
            sb.append(this.b[0]);
            sb.append(" end:");
            int i7 = min - 1;
            sb.append(this.a[i7]);
            sb.append(",");
            sb.append(this.b[i7]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (k.j(xmlPullParser, "pathData")) {
            String i2 = k.i(typedArray, xmlPullParser, "pathData", 4);
            Path e2 = c.e(i2);
            if (e2 != null) {
                b(e2);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i2);
        } else if (!k.j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (k.j(xmlPullParser, "controlY1")) {
            float f2 = k.f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float f3 = k.f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean j2 = k.j(xmlPullParser, "controlX2");
            if (j2 != k.j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!j2) {
                c(f2, f3);
            } else {
                a(f2, f3, k.f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), k.f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.b[i2];
        }
        float[] fArr2 = this.b;
        float f4 = fArr2[i2];
        return f4 + (((f2 - fArr[i2]) / f3) * (fArr2[length] - f4));
    }
}
