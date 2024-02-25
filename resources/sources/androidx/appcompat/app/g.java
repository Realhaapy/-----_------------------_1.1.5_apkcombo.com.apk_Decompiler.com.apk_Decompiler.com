package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import e.a.n.b;
import e.f.r.i;

public class g extends Dialog implements d {

    /* renamed from: e  reason: collision with root package name */
    private e f192e;

    /* renamed from: f  reason: collision with root package name */
    private final i.a f193f = new a();

    class a implements i.a {
        a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.f(keyEvent);
        }
    }

    public g(Context context, int i2) {
        super(context, e(context, i2));
        e c = c();
        c.F(e(context, i2));
        c.q((Bundle) null);
    }

    private static int e(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void a(b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().d(view, layoutParams);
    }

    public void b(b bVar) {
    }

    public e c() {
        if (this.f192e == null) {
            this.f192e = e.h(this, this);
        }
        return this.f192e;
    }

    public b d(b.a aVar) {
        return null;
    }

    public void dismiss() {
        super.dismiss();
        c().r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return i.e(this.f193f, getWindow().getDecorView(), this, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i2) {
        return c().i(i2);
    }

    public boolean g(int i2) {
        return c().z(i2);
    }

    public void invalidateOptionsMenu() {
        c().o();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        c().n();
        super.onCreate(bundle);
        c().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        c().w();
    }

    public void setContentView(int i2) {
        c().B(i2);
    }

    public void setContentView(View view) {
        c().C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().D(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        c().G(getContext().getString(i2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().G(charSequence);
    }
}
