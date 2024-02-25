package e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import e.q.a;
import e.q.m;

public abstract class j0 extends m {
    private static final String[] O = {"android:visibility:visibility", "android:visibility:parent"};
    private int N = 3;

    class a extends n {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        public void c(m mVar) {
            x.a(this.a).c(this.b);
        }

        public void d(m mVar) {
            if (this.b.getParent() == null) {
                x.a(this.a).a(this.b);
            } else {
                j0.this.i();
            }
        }

        public void e(m mVar) {
            this.c.setTag(j.save_overlay_view, (Object) null);
            x.a(this.a).c(this.b);
            mVar.T(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements m.f, a.C0094a {
        private final View a;
        private final int b;
        private final ViewGroup c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3606d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3607e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3608f = false;

        b(View view, int i2, boolean z) {
            this.a = view;
            this.b = i2;
            this.c = (ViewGroup) view.getParent();
            this.f3606d = z;
            g(true);
        }

        private void f() {
            if (!this.f3608f) {
                c0.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.f3606d && this.f3607e != z && (viewGroup = this.c) != null) {
                this.f3607e = z;
                x.c(viewGroup, z);
            }
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
            g(false);
        }

        public void d(m mVar) {
            g(true);
        }

        public void e(m mVar) {
            f();
            mVar.T(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f3608f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f3608f) {
                c0.h(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f3608f) {
                c0.h(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {
        boolean a;
        boolean b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f3609d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f3610e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f3611f;

        c() {
        }
    }

    private void g0(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.b.getParent());
        int[] iArr = new int[2];
        sVar.b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f3610e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.c == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e.q.j0.c h0(e.q.s r8, e.q.s r9) {
        /*
            r7 = this;
            e.q.j0$c r0 = new e.q.j0$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3610e = r6
            goto L_0x0037
        L_0x0033:
            r0.c = r4
            r0.f3610e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f3609d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3611f = r2
            goto L_0x005e
        L_0x005a:
            r0.f3609d = r4
            r0.f3611f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.c
            int r9 = r0.f3609d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f3610e
            android.view.ViewGroup r4 = r0.f3611f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f3611f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f3610e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f3609d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.b = r2
        L_0x008a:
            r0.a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.j0.h0(e.q.s, e.q.s):e.q.j0$c");
    }

    public String[] H() {
        return O;
    }

    public boolean J(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c h0 = h0(sVar, sVar2);
        if (h0.a) {
            return h0.c == 0 || h0.f3609d == 0;
        }
        return false;
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void j(s sVar) {
        g0(sVar);
    }

    public Animator j0(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.N & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.b.getParent();
            if (h0(x(view, false), I(view, false)).a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.b, sVar, sVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.z != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l0(android.view.ViewGroup r18, e.q.s r19, int r20, e.q.s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.N
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = e.q.j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            e.q.s r14 = r0.I(r13, r12)
            e.q.s r15 = r0.x(r13, r12)
            e.q.j0$c r14 = r0.h0(r14, r15)
            boolean r14 = r14.a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = e.q.r.a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.z
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            e.q.w r4 = e.q.x.a(r18)
            r4.a(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.k0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            e.q.w r1 = e.q.x.a(r18)
            r1.c(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            e.q.j0$a r3 = new e.q.j0$a
            r3.<init>(r1, r10, r5)
            r0.b(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            e.q.c0.h(r8, r11)
            android.animation.Animator r1 = r0.k0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            e.q.j0$b r2 = new e.q.j0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            e.q.a.a(r1, r2)
            r0.b(r2)
            goto L_0x0106
        L_0x0103:
            e.q.c0.h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.j0.l0(android.view.ViewGroup, e.q.s, int, e.q.s, int):android.animation.Animator");
    }

    public void m(s sVar) {
        g0(sVar);
    }

    public void m0(int i2) {
        if ((i2 & -4) == 0) {
            this.N = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        c h0 = h0(sVar, sVar2);
        if (!h0.a) {
            return null;
        }
        if (h0.f3610e == null && h0.f3611f == null) {
            return null;
        }
        if (h0.b) {
            return j0(viewGroup, sVar, h0.c, sVar2, h0.f3609d);
        }
        return l0(viewGroup, sVar, h0.c, sVar2, h0.f3609d);
    }
}
