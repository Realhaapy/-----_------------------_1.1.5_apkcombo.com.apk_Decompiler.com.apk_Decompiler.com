package e.r.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import e.f.j.f.k;
import e.f.k.c;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class h extends g {

    /* renamed from: n  reason: collision with root package name */
    static final PorterDuff.Mode f3656n = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    private C0099h f3657f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuffColorFilter f3658g;

    /* renamed from: h  reason: collision with root package name */
    private ColorFilter f3659h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3660i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3661j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f3662k;

    /* renamed from: l  reason: collision with root package name */
    private final Matrix f3663l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f3664m;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = e.f.k.c.d(string2);
            }
            this.c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k2 = k.k(resources, theme, attributeSet, a.f3639d);
                f(k2, xmlPullParser);
                k2.recycle();
            }
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f3665e;

        /* renamed from: f  reason: collision with root package name */
        e.f.j.f.f f3666f;

        /* renamed from: g  reason: collision with root package name */
        float f3667g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        e.f.j.f.f f3668h;

        /* renamed from: i  reason: collision with root package name */
        float f3669i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f3670j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f3671k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f3672l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f3673m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f3674n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f3675o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f3676p = 4.0f;

        c() {
        }

        c(c cVar) {
            super(cVar);
            this.f3665e = cVar.f3665e;
            this.f3666f = cVar.f3666f;
            this.f3667g = cVar.f3667g;
            this.f3669i = cVar.f3669i;
            this.f3668h = cVar.f3668h;
            this.c = cVar.c;
            this.f3670j = cVar.f3670j;
            this.f3671k = cVar.f3671k;
            this.f3672l = cVar.f3672l;
            this.f3673m = cVar.f3673m;
            this.f3674n = cVar.f3674n;
            this.f3675o = cVar.f3675o;
            this.f3676p = cVar.f3676p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3665e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = e.f.k.c.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f3668h = k.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f3670j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3670j);
                this.f3674n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3674n);
                this.f3675o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3675o);
                this.f3676p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3676p);
                this.f3666f = k.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f3669i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3669i);
                this.f3667g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3667g);
                this.f3672l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3672l);
                this.f3673m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3673m);
                this.f3671k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3671k);
                this.c = k.g(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        public boolean a() {
            return this.f3668h.i() || this.f3666f.i();
        }

        public boolean b(int[] iArr) {
            return this.f3666f.j(iArr) | this.f3668h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = k.k(resources, theme, attributeSet, a.c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3670j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3668h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3669i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3666f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3667g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3672l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3673m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3671k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.f3670j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.f3668h.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.f3669i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f3666f.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.f3667g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.f3672l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.f3673m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.f3671k = f2;
        }
    }

    private static class d extends e {
        final Matrix a;
        final ArrayList<e> b;
        float c;

        /* renamed from: d  reason: collision with root package name */
        private float f3677d;

        /* renamed from: e  reason: collision with root package name */
        private float f3678e;

        /* renamed from: f  reason: collision with root package name */
        private float f3679f;

        /* renamed from: g  reason: collision with root package name */
        private float f3680g;

        /* renamed from: h  reason: collision with root package name */
        private float f3681h;

        /* renamed from: i  reason: collision with root package name */
        private float f3682i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f3683j;

        /* renamed from: k  reason: collision with root package name */
        int f3684k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f3685l;

        /* renamed from: m  reason: collision with root package name */
        private String f3686m;

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f3677d = 0.0f;
            this.f3678e = 0.0f;
            this.f3679f = 1.0f;
            this.f3680g = 1.0f;
            this.f3681h = 0.0f;
            this.f3682i = 0.0f;
            this.f3683j = new Matrix();
            this.f3686m = null;
        }

        public d(d dVar, e.e.a<String, Object> aVar) {
            super();
            f fVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f3677d = 0.0f;
            this.f3678e = 0.0f;
            this.f3679f = 1.0f;
            this.f3680g = 1.0f;
            this.f3681h = 0.0f;
            this.f3682i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3683j = matrix;
            this.f3686m = null;
            this.c = dVar.c;
            this.f3677d = dVar.f3677d;
            this.f3678e = dVar.f3678e;
            this.f3679f = dVar.f3679f;
            this.f3680g = dVar.f3680g;
            this.f3681h = dVar.f3681h;
            this.f3682i = dVar.f3682i;
            this.f3685l = dVar.f3685l;
            String str = dVar.f3686m;
            this.f3686m = str;
            this.f3684k = dVar.f3684k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3683j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f3683j.reset();
            this.f3683j.postTranslate(-this.f3677d, -this.f3678e);
            this.f3683j.postScale(this.f3679f, this.f3680g);
            this.f3683j.postRotate(this.c, 0.0f, 0.0f);
            this.f3683j.postTranslate(this.f3681h + this.f3677d, this.f3682i + this.f3678e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3685l = null;
            this.c = k.f(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.f3677d = typedArray.getFloat(1, this.f3677d);
            this.f3678e = typedArray.getFloat(2, this.f3678e);
            this.f3679f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f3679f);
            this.f3680g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f3680g);
            this.f3681h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f3681h);
            this.f3682i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f3682i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3686m = string;
            }
            d();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = k.k(resources, theme, attributeSet, a.b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.f3686m;
        }

        public Matrix getLocalMatrix() {
            return this.f3683j;
        }

        public float getPivotX() {
            return this.f3677d;
        }

        public float getPivotY() {
            return this.f3678e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f3679f;
        }

        public float getScaleY() {
            return this.f3680g;
        }

        public float getTranslateX() {
            return this.f3681h;
        }

        public float getTranslateY() {
            return this.f3682i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f3677d) {
                this.f3677d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f3678e) {
                this.f3678e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f3679f) {
                this.f3679f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f3680g) {
                this.f3680g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f3681h) {
                this.f3681h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f3682i) {
                this.f3682i = f2;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {
        protected c.b[] a = null;
        String b;
        int c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3687d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.b = fVar.b;
            this.f3687d = fVar.f3687d;
            this.a = e.f.k.c.f(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!e.f.k.c.b(this.a, bVarArr)) {
                this.a = e.f.k.c.f(bVarArr);
            } else {
                e.f.k.c.j(this.a, bVarArr);
            }
        }
    }

    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f3688q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        Paint f3689d;

        /* renamed from: e  reason: collision with root package name */
        Paint f3690e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f3691f;

        /* renamed from: g  reason: collision with root package name */
        private int f3692g;

        /* renamed from: h  reason: collision with root package name */
        final d f3693h;

        /* renamed from: i  reason: collision with root package name */
        float f3694i;

        /* renamed from: j  reason: collision with root package name */
        float f3695j;

        /* renamed from: k  reason: collision with root package name */
        float f3696k;

        /* renamed from: l  reason: collision with root package name */
        float f3697l;

        /* renamed from: m  reason: collision with root package name */
        int f3698m;

        /* renamed from: n  reason: collision with root package name */
        String f3699n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f3700o;

        /* renamed from: p  reason: collision with root package name */
        final e.e.a<String, Object> f3701p;

        public g() {
            this.c = new Matrix();
            this.f3694i = 0.0f;
            this.f3695j = 0.0f;
            this.f3696k = 0.0f;
            this.f3697l = 0.0f;
            this.f3698m = 255;
            this.f3699n = null;
            this.f3700o = null;
            this.f3701p = new e.e.a<>();
            this.f3693h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.f3694i = 0.0f;
            this.f3695j = 0.0f;
            this.f3696k = 0.0f;
            this.f3697l = 0.0f;
            this.f3698m = 255;
            this.f3699n = null;
            this.f3700o = null;
            e.e.a<String, Object> aVar = new e.e.a<>();
            this.f3701p = aVar;
            this.f3693h = new d(gVar.f3693h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f3694i = gVar.f3694i;
            this.f3695j = gVar.f3695j;
            this.f3696k = gVar.f3696k;
            this.f3697l = gVar.f3697l;
            this.f3692g = gVar.f3692g;
            this.f3698m = gVar.f3698m;
            this.f3699n = gVar.f3699n;
            String str = gVar.f3699n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3700o = gVar.f3700o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f3683j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.f3696k;
            float f3 = ((float) i3) / this.f3697l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                fVar.d(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.c()) {
                    this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                float f4 = cVar.f3671k;
                if (!(f4 == 0.0f && cVar.f3672l == 1.0f)) {
                    float f5 = cVar.f3673m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.f3672l + f5) % 1.0f;
                    if (this.f3691f == null) {
                        this.f3691f = new PathMeasure();
                    }
                    this.f3691f.setPath(this.a, false);
                    float length = this.f3691f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f3691f.getSegment(f8, length, path, true);
                        this.f3691f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f3691f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(path, this.c);
                if (cVar.f3668h.l()) {
                    e.f.j.f.f fVar2 = cVar.f3668h;
                    if (this.f3690e == null) {
                        Paint paint = new Paint(1);
                        this.f3690e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f3690e;
                    if (fVar2.h()) {
                        Shader f10 = fVar2.f();
                        f10.setLocalMatrix(this.c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.f3670j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(fVar2.e(), cVar.f3670j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.f3666f.l()) {
                    e.f.j.f.f fVar3 = cVar.f3666f;
                    if (this.f3689d == null) {
                        Paint paint3 = new Paint(1);
                        this.f3689d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f3689d;
                    Paint.Join join = cVar.f3675o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f3674n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f3676p);
                    if (fVar3.h()) {
                        Shader f11 = fVar3.f();
                        f11.setLocalMatrix(this.c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.f3669i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(fVar3.e(), cVar.f3669i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f3667g * min * e2);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f3693h, f3688q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.f3700o == null) {
                this.f3700o = Boolean.valueOf(this.f3693h.a());
            }
            return this.f3700o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3693h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3698m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f3698m = i2;
        }
    }

    /* renamed from: e.r.a.a.h$h  reason: collision with other inner class name */
    private static class C0099h extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f3702d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3703e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f3704f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f3705g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f3706h;

        /* renamed from: i  reason: collision with root package name */
        int f3707i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3708j;

        /* renamed from: k  reason: collision with root package name */
        boolean f3709k;

        /* renamed from: l  reason: collision with root package name */
        Paint f3710l;

        public C0099h() {
            this.c = null;
            this.f3702d = h.f3656n;
            this.b = new g();
        }

        public C0099h(C0099h hVar) {
            this.c = null;
            this.f3702d = h.f3656n;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f3690e != null) {
                    gVar.f3690e = new Paint(hVar.b.f3690e);
                }
                if (hVar.b.f3689d != null) {
                    this.b.f3689d = new Paint(hVar.b.f3689d);
                }
                this.c = hVar.c;
                this.f3702d = hVar.f3702d;
                this.f3703e = hVar.f3703e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f3704f.getWidth() && i3 == this.f3704f.getHeight();
        }

        public boolean b() {
            return !this.f3709k && this.f3705g == this.c && this.f3706h == this.f3702d && this.f3708j == this.f3703e && this.f3707i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f3704f == null || !a(i2, i3)) {
                this.f3704f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f3709k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3704f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3710l == null) {
                Paint paint = new Paint();
                this.f3710l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3710l.setAlpha(this.b.getRootAlpha());
            this.f3710l.setColorFilter(colorFilter);
            return this.f3710l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.b.g(iArr);
            this.f3709k |= g2;
            return g2;
        }

        public void i() {
            this.f3705g = this.c;
            this.f3706h = this.f3702d;
            this.f3707i = this.b.getRootAlpha();
            this.f3708j = this.f3703e;
            this.f3709k = false;
        }

        public void j(int i2, int i3) {
            this.f3704f.eraseColor(0);
            this.b.b(new Canvas(this.f3704f), i2, i3, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    private static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f3655e = (VectorDrawable) this.a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f3655e = (VectorDrawable) this.a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f3655e = (VectorDrawable) this.a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f3661j = true;
        this.f3662k = new float[9];
        this.f3663l = new Matrix();
        this.f3664m = new Rect();
        this.f3657f = new C0099h();
    }

    h(C0099h hVar) {
        this.f3661j = true;
        this.f3662k = new float[9];
        this.f3663l = new Matrix();
        this.f3664m = new Rect();
        this.f3657f = hVar;
        this.f3658g = j(this.f3658g, hVar.c, hVar.f3702d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.r.a.a.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            e.r.a.a.h r0 = new e.r.a.a.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = e.f.j.f.j.d(r6, r7, r8)
            r0.f3655e = r6
            e.r.a.a.h$i r6 = new e.r.a.a.h$i
            android.graphics.drawable.Drawable r7 = r0.f3655e
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            e.r.a.a.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.r.a.a.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):e.r.a.a.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: e.r.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: e.r.a.a.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: e.r.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: e.r.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: e.r.a.a.h$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            e.r.a.a.h$h r0 = r10.f3657f
            e.r.a.a.h$g r1 = r0.b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            e.r.a.a.h$d r3 = r1.f3693h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            e.r.a.a.h$d r7 = (e.r.a.a.h.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            e.r.a.a.h$c r3 = new e.r.a.a.h$c
            r3.<init>()
            r3.g(r11, r13, r14, r12)
            java.util.ArrayList<e.r.a.a.h$e> r6 = r7.b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            e.e.a<java.lang.String, java.lang.Object> r6 = r1.f3701p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            e.r.a.a.h$b r3 = new e.r.a.a.h$b
            r3.<init>()
            r3.e(r11, r13, r14, r12)
            java.util.ArrayList<e.r.a.a.h$e> r7 = r7.b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            e.e.a<java.lang.String, java.lang.Object> r7 = r1.f3701p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.a
            int r3 = r3.f3687d
        L_0x0081:
            r3 = r3 | r7
            r0.a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            e.r.a.a.h$d r3 = new e.r.a.a.h$d
            r3.<init>()
            r3.c(r11, r13, r14, r12)
            java.util.ArrayList<e.r.a.a.h$e> r7 = r7.b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            e.e.a<java.lang.String, java.lang.Object> r7 = r1.f3701p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.a
            int r3 = r3.f3684k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.r.a.a.h.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0099h hVar = this.f3657f;
        g gVar = hVar.b;
        hVar.f3702d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            hVar.c = c2;
        }
        hVar.f3703e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3703e);
        gVar.f3696k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3696k);
        float f2 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3697l);
        gVar.f3697l = f2;
        if (gVar.f3696k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            gVar.f3694i = typedArray.getDimension(3, gVar.f3694i);
            float dimension = typedArray.getDimension(2, gVar.f3695j);
            gVar.f3695j = dimension;
            if (gVar.f3694i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f3699n = string;
                    gVar.f3701p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3655e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f3657f.b.f3701p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3664m);
        if (this.f3664m.width() > 0 && this.f3664m.height() > 0) {
            ColorFilter colorFilter = this.f3659h;
            if (colorFilter == null) {
                colorFilter = this.f3658g;
            }
            canvas.getMatrix(this.f3663l);
            this.f3663l.getValues(this.f3662k);
            float abs = Math.abs(this.f3662k[0]);
            float abs2 = Math.abs(this.f3662k[4]);
            float abs3 = Math.abs(this.f3662k[1]);
            float abs4 = Math.abs(this.f3662k[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3664m.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3664m.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3664m;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.f3664m.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3664m.offsetTo(0, 0);
                this.f3657f.c(min, min2);
                if (!this.f3661j) {
                    this.f3657f.j(min, min2);
                } else if (!this.f3657f.b()) {
                    this.f3657f.j(min, min2);
                    this.f3657f.i();
                }
                this.f3657f.d(canvas, colorFilter, this.f3664m);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f3657f.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3657f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3659h;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3655e != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3655e.getConstantState());
        }
        this.f3657f.a = getChangingConfigurations();
        return this.f3657f;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3657f.b.f3695j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3657f.b.f3694i;
    }

    public int getOpacity() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        this.f3661j = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0099h hVar = this.f3657f;
        hVar.b = new g();
        TypedArray k2 = k.k(resources, theme, attributeSet, a.a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f3709k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3658g = j(this.f3658g, hVar.c, hVar.f3702d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f3657f.f3703e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f3657f.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f3657f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3655e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e.r.a.a.h$h r0 = r1.f3657f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            e.r.a.a.h$h r0 = r1.f3657f
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.r.a.a.h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3660i && super.mutate() == this) {
            this.f3657f = new C0099h(this.f3657f);
            this.f3660i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0099h hVar = this.f3657f;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.f3702d) == null)) {
            this.f3658g = j(this.f3658g, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3657f.b.getRootAlpha() != i2) {
            this.f3657f.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.f3657f.f3703e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3659h = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        C0099h hVar = this.f3657f;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f3658g = j(this.f3658g, colorStateList, hVar.f3702d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        C0099h hVar = this.f3657f;
        if (hVar.f3702d != mode) {
            hVar.f3702d = mode;
            this.f3658g = j(this.f3658g, hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
