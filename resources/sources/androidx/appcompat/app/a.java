package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import e.a.j;
import e.a.n.b;

public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0008a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0008a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0008a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.t);
            this.a = obtainStyledAttributes.getInt(j.u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0008a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public C0008a(C0008a aVar) {
            super(aVar);
            this.a = 0;
            this.a = aVar.a;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i2, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(boolean z);

    public abstract void u(CharSequence charSequence);

    public e.a.n.b v(b.a aVar) {
        return null;
    }
}
