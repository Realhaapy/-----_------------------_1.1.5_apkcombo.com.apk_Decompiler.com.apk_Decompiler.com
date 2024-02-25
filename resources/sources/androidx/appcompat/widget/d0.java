package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import e.f.r.c0;

public interface d0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(m.a aVar, g.a aVar2);

    void j(int i2);

    void k(p0 p0Var);

    ViewGroup l();

    void m(boolean z);

    boolean n();

    void o(int i2);

    int p();

    Menu q();

    void r(int i2);

    int s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    c0 t(int i2, long j2);

    void u();

    void v();

    void w(boolean z);
}
