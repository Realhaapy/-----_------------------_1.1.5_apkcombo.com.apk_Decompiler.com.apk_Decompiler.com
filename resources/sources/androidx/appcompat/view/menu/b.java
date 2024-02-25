package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: e  reason: collision with root package name */
    protected Context f287e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f288f;

    /* renamed from: g  reason: collision with root package name */
    protected g f289g;

    /* renamed from: h  reason: collision with root package name */
    protected LayoutInflater f290h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f291i;

    /* renamed from: j  reason: collision with root package name */
    private int f292j;

    /* renamed from: k  reason: collision with root package name */
    private int f293k;

    /* renamed from: l  reason: collision with root package name */
    protected n f294l;

    public b(Context context, int i2, int i3) {
        this.f287e = context;
        this.f290h = LayoutInflater.from(context);
        this.f292j = i2;
        this.f293k = i3;
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f291i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f294l).addView(view, i2);
    }

    public void c(Context context, g gVar) {
        this.f288f = context;
        LayoutInflater.from(context);
        this.f289g = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(androidx.appcompat.view.menu.r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f291i
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f289g
        L_0x0009:
            boolean r2 = r0.b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.d(androidx.appcompat.view.menu.r):boolean");
    }

    public void e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f294l;
        if (viewGroup != null) {
            g gVar = this.f289g;
            int i2 = 0;
            if (gVar != null) {
                gVar.r();
                ArrayList<i> E = this.f289g.E();
                int size = E.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = E.get(i4);
                    if (q(i3, iVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View n2 = n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n2.setPressed(false);
                            n2.jumpDrawablesToCurrentState();
                        }
                        if (n2 != childAt) {
                            b(n2, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public abstract void f(i iVar, n.a aVar);

    public boolean h(g gVar, i iVar) {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public void j(m.a aVar) {
        this.f291i = aVar;
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f290h.inflate(this.f293k, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a m() {
        return this.f291i;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a k2 = view instanceof n.a ? (n.a) view : k(viewGroup);
        f(iVar, k2);
        return (View) k2;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f294l == null) {
            n nVar = (n) this.f290h.inflate(this.f292j, viewGroup, false);
            this.f294l = nVar;
            nVar.b(this.f289g);
            e(true);
        }
        return this.f294l;
    }

    public void p(int i2) {
    }

    public abstract boolean q(int i2, i iVar);
}
