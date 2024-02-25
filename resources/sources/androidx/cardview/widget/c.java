package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;

class c implements e {
    final RectF a = new RectF();

    class a implements g.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f3 = 2.0f * f2;
            float width = (rectF.width() - f3) - 1.0f;
            float height = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                c.this.a.set(f5, f5, f4, f4);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f4, rectF2.top + f4);
                Paint paint2 = paint;
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f6 = rectF2.top;
                canvas.drawRect((rectF2.left + f4) - 1.0f, f6, (rectF2.right - f4) + 1.0f, f6 + f4, paint2);
                float f7 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f4) - 1.0f, f7 - f4, (rectF2.right - f4) + 1.0f, f7, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f2, rectF2.right, rectF2.bottom - f2, paint);
        }
    }

    c() {
    }

    private g o(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new g(context.getResources(), colorStateList, f2, f3, f4);
    }

    private g p(d dVar) {
        return (g) dVar.g();
    }

    public float a(d dVar) {
        return p(dVar).i();
    }

    public ColorStateList b(d dVar) {
        return p(dVar).f();
    }

    public void c(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g o2 = o(context, colorStateList, f2, f3, f4);
        o2.m(dVar.e());
        dVar.d(o2);
        q(dVar);
    }

    public void d(d dVar, float f2) {
        p(dVar).p(f2);
        q(dVar);
    }

    public float e(d dVar) {
        return p(dVar).l();
    }

    public void f() {
        g.f775r = new a();
    }

    public float g(d dVar) {
        return p(dVar).g();
    }

    public float h(d dVar) {
        return p(dVar).j();
    }

    public float i(d dVar) {
        return p(dVar).k();
    }

    public void j(d dVar) {
    }

    public void k(d dVar, float f2) {
        p(dVar).r(f2);
    }

    public void l(d dVar) {
        p(dVar).m(dVar.e());
        q(dVar);
    }

    public void m(d dVar, ColorStateList colorStateList) {
        p(dVar).o(colorStateList);
    }

    public void n(d dVar, float f2) {
        p(dVar).q(f2);
        q(dVar);
    }

    public void q(d dVar) {
        Rect rect = new Rect();
        p(dVar).h(rect);
        dVar.c((int) Math.ceil((double) i(dVar)), (int) Math.ceil((double) h(dVar)));
        dVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
