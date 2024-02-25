package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class b implements e {
    b() {
    }

    private f o(d dVar) {
        return (f) dVar.g();
    }

    public float a(d dVar) {
        return o(dVar).c();
    }

    public ColorStateList b(d dVar) {
        return o(dVar).b();
    }

    public void c(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        dVar.d(new f(colorStateList, f2));
        View a = dVar.a();
        a.setClipToOutline(true);
        a.setElevation(f3);
        n(dVar, f4);
    }

    public void d(d dVar, float f2) {
        o(dVar).h(f2);
    }

    public float e(d dVar) {
        return dVar.a().getElevation();
    }

    public void f() {
    }

    public float g(d dVar) {
        return o(dVar).d();
    }

    public float h(d dVar) {
        return g(dVar) * 2.0f;
    }

    public float i(d dVar) {
        return g(dVar) * 2.0f;
    }

    public void j(d dVar) {
        n(dVar, a(dVar));
    }

    public void k(d dVar, float f2) {
        dVar.a().setElevation(f2);
    }

    public void l(d dVar) {
        n(dVar, a(dVar));
    }

    public void m(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    public void n(d dVar, float f2) {
        o(dVar).g(f2, dVar.f(), dVar.e());
        p(dVar);
    }

    public void p(d dVar) {
        if (!dVar.f()) {
            dVar.b(0, 0, 0, 0);
            return;
        }
        float a = a(dVar);
        float g2 = g(dVar);
        int ceil = (int) Math.ceil((double) g.c(a, g2, dVar.e()));
        int ceil2 = (int) Math.ceil((double) g.d(a, g2, dVar.e()));
        dVar.b(ceil, ceil2, ceil, ceil2);
    }
}
