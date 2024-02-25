package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

class i {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f579d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f580e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f581f;

    i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.f579d || this.f580e) {
            Drawable mutate = a.p(a2).mutate();
            if (this.f579d) {
                a.n(mutate, this.b);
            }
            if (this.f580e) {
                a.o(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.c.a(r2.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.b(int):int");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = e.a.j.L0
            r8 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            e.f.r.y.Q(r1, r2, r3, r4, r5, r6, r7)
            int r10 = e.a.j.N0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = e.a.k.a.a.d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = e.a.j.M0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = e.a.k.a.a.d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = e.a.j.O0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = e.a.j.P0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.e0.d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.v()
            return
        L_0x0084:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f581f) {
            this.f581f = false;
            return;
        }
        this.f581f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f579d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.f580e = true;
        a();
    }
}
