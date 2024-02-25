package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class b extends g implements DialogInterface {

    /* renamed from: g  reason: collision with root package name */
    final AlertController f150g = new AlertController(getContext(), this, getWindow());

    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(Context context) {
            this(context, b.i(context, 0));
        }

        public a(Context context, int i2) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, b.i(context, i2)));
            this.b = i2;
        }

        public b a() {
            b bVar = new b(this.a.a, this.b);
            this.a.a(bVar.f150g);
            bVar.setCancelable(this.a.f136r);
            if (this.a.f136r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.a.f137s);
            bVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.a.f125g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.a.f122d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.a.f124f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i2) {
        super(context, i(context, i2));
    }

    static int i(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f150g.d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f150g.e();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f150g.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f150g.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f150g.q(charSequence);
    }
}
