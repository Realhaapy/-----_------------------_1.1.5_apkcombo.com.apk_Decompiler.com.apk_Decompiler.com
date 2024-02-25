package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;

class a extends c {

    /* renamed from: androidx.cardview.widget.a$a  reason: collision with other inner class name */
    class C0013a implements g.a {
        C0013a(a aVar) {
        }

        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    a() {
    }

    public void f() {
        g.f775r = new C0013a(this);
    }
}
