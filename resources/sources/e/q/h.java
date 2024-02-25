package e.q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class h<T> extends Property<T, Float> {
    private final Property<T, PointF> a;
    private final PathMeasure b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f3601d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f3602e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f3603f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.b = pathMeasure;
        this.c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f3603f);
    }

    /* renamed from: b */
    public void set(T t, Float f2) {
        this.f3603f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.f3601d, (float[]) null);
        PointF pointF = this.f3602e;
        float[] fArr = this.f3601d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(t, pointF);
    }
}
