package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import e.f.r.h;
import e.f.r.y;

public class l {
    private final Context a;
    private final g b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final int f374d;

    /* renamed from: e  reason: collision with root package name */
    private final int f375e;

    /* renamed from: f  reason: collision with root package name */
    private View f376f;

    /* renamed from: g  reason: collision with root package name */
    private int f377g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f378h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f379i;

    /* renamed from: j  reason: collision with root package name */
    private k f380j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f381k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f382l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f377g = 8388611;
        this.f382l = new a();
        this.a = context;
        this.b = gVar;
        this.f376f = view;
        this.c = z;
        this.f374d = i2;
        this.f375e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.k a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = e.a.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.a
            android.view.View r3 = r14.f376f
            int r4 = r14.f374d
            int r5 = r14.f375e
            boolean r6 = r14.c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.a
            androidx.appcompat.view.menu.g r9 = r14.b
            android.view.View r10 = r14.f376f
            int r11 = r14.f374d
            int r12 = r14.f375e
            boolean r13 = r14.c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.b
            r0.k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f382l
            r0.t(r1)
            android.view.View r1 = r14.f376f
            r0.o(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f379i
            r0.j(r1)
            boolean r1 = r14.f378h
            r0.q(r1)
            int r1 = r14.f377g
            r0.r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.a():androidx.appcompat.view.menu.k");
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        k c2 = c();
        c2.u(z2);
        if (z) {
            if ((h.a(this.f377g, y.s(this.f376f)) & 7) == 5) {
                i2 -= this.f376f.getWidth();
            }
            c2.s(i2);
            c2.v(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.p(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c2.show();
    }

    public void b() {
        if (d()) {
            this.f380j.dismiss();
        }
    }

    public k c() {
        if (this.f380j == null) {
            this.f380j = a();
        }
        return this.f380j;
    }

    public boolean d() {
        k kVar = this.f380j;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f380j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f381k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f376f = view;
    }

    public void g(boolean z) {
        this.f378h = z;
        k kVar = this.f380j;
        if (kVar != null) {
            kVar.q(z);
        }
    }

    public void h(int i2) {
        this.f377g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f381k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f379i = aVar;
        k kVar = this.f380j;
        if (kVar != null) {
            kVar.j(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f376f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f376f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}
