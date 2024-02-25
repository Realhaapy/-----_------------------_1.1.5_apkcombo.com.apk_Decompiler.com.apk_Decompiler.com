package e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import e.f.r.y;
import java.util.Map;

public class c extends m {
    private static final String[] Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> R = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> S = new C0095c(PointF.class, "topLeft");
    private static final Property<k, PointF> T = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> U = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> V = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> W = new g(PointF.class, "position");
    private static k X = new k();
    private int[] N = new int[2];
    private boolean O = false;
    private boolean P = false;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ BitmapDrawable b;
        final /* synthetic */ View c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f3583d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.f3583d = f2;
        }

        public void onAnimationEnd(Animator animator) {
            c0.b(this.a).d(this.b);
            c0.g(this.c, this.f3583d);
        }
    }

    class b extends Property<Drawable, PointF> {
        private Rect a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* renamed from: e.q.c$c  reason: collision with other inner class name */
    class C0095c extends Property<k, PointF> {
        C0095c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k a;
        private k mViewBounds;

        h(c cVar, k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ Rect c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3584d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3585e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f3586f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f3587g;

        i(c cVar, View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.b = view;
            this.c = rect;
            this.f3584d = i2;
            this.f3585e = i3;
            this.f3586f = i4;
            this.f3587g = i5;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                y.W(this.b, this.c);
                c0.f(this.b, this.f3584d, this.f3585e, this.f3586f, this.f3587g);
            }
        }
    }

    class j extends n {
        boolean a = false;
        final /* synthetic */ ViewGroup b;

        j(c cVar, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        public void b(m mVar) {
            x.c(this.b, false);
            this.a = true;
        }

        public void c(m mVar) {
            x.c(this.b, false);
        }

        public void d(m mVar) {
            x.c(this.b, true);
        }

        public void e(m mVar) {
            if (!this.a) {
                x.c(this.b, false);
            }
            mVar.T(this);
        }
    }

    private static class k {
        private int a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3588d;

        /* renamed from: e  reason: collision with root package name */
        private View f3589e;

        /* renamed from: f  reason: collision with root package name */
        private int f3590f;

        /* renamed from: g  reason: collision with root package name */
        private int f3591g;

        k(View view) {
            this.f3589e = view;
        }

        private void b() {
            c0.f(this.f3589e, this.a, this.b, this.c, this.f3588d);
            this.f3590f = 0;
            this.f3591g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.f3588d = Math.round(pointF.y);
            int i2 = this.f3591g + 1;
            this.f3591g = i2;
            if (this.f3590f == i2) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i2 = this.f3590f + 1;
            this.f3590f = i2;
            if (i2 == this.f3591g) {
                b();
            }
        }
    }

    private void g0(s sVar) {
        View view = sVar.b;
        if (y.D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.a.put("android:changeBounds:parent", sVar.b.getParent());
            if (this.P) {
                sVar.b.getLocationInWindow(this.N);
                sVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.N[0]));
                sVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.N[1]));
            }
            if (this.O) {
                sVar.a.put("android:changeBounds:clip", y.o(view));
            }
        }
    }

    private boolean h0(View view, View view2) {
        if (!this.P) {
            return true;
        }
        s x = x(view, true);
        if (x == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == x.b) {
            return true;
        }
        return false;
    }

    public String[] H() {
        return Q;
    }

    public void j(s sVar) {
        g0(sVar);
    }

    public void m(s sVar) {
        g0(sVar);
    }

    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        Animator animator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.a;
        Map<String, Object> map2 = sVar4.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.b;
        if (h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.O) {
                view = view3;
                c0.f(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        path = z().a((float) i4, (float) i6, (float) i5, (float) i7);
                        property = W;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = f.a(kVar, S, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                        ObjectAnimator a3 = f.a(kVar, T, z().a((float) i8, (float) i10, (float) i9, (float) i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a2, a3});
                        animatorSet.addListener(new h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    path = z().a((float) i8, (float) i10, (float) i9, (float) i11);
                    property = U;
                } else {
                    path = z().a((float) i4, (float) i6, (float) i5, (float) i7);
                    property = V;
                }
                animator = f.a(view, property, path);
            } else {
                view = view3;
                c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : f.a(view, W, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                if (rect7 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i3, i3, i14, i15) : rect6;
                if (!rect.equals(rect8)) {
                    y.W(view, rect);
                    k kVar2 = X;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new i(this, view, rect6, i5, i7, i9, i11));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = r.c(a4, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                b(new j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.N);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).b(bitmapDrawable);
        g z = z();
        int[] iArr = this.N;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{i.a(R, z.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
