package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

public class l0 extends j0 implements k0 {
    private static Method N;
    private k0 M;

    public static class a extends f0 {

        /* renamed from: s  reason: collision with root package name */
        final int f623s;
        final int t;
        private k0 u;
        private MenuItem v;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f623s = 22;
                this.t = 21;
                return;
            }
            this.f623s = 21;
            this.t = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                f fVar = (f) adapter;
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.v;
                if (menuItem != iVar) {
                    g b = fVar.b();
                    if (menuItem != null) {
                        this.u.d(b, menuItem);
                    }
                    this.v = iVar;
                    if (iVar != null) {
                        this.u.c(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f623s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.t) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((f) adapter).b().e(false);
                return true;
            }
        }

        public void setHoverListener(k0 k0Var) {
            this.u = k0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                N = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setEnterTransition((Transition) obj);
        }
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setExitTransition((Transition) obj);
        }
    }

    public void O(k0 k0Var) {
        this.M = k0Var;
    }

    public void P(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = N;
            if (method != null) {
                try {
                    method.invoke(this.I, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.I.setTouchModal(z);
        }
    }

    public void c(g gVar, MenuItem menuItem) {
        k0 k0Var = this.M;
        if (k0Var != null) {
            k0Var.c(gVar, menuItem);
        }
    }

    public void d(g gVar, MenuItem menuItem) {
        k0 k0Var = this.M;
        if (k0Var != null) {
            k0Var.d(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public f0 r(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
