package e.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import e.a.l.a.b;
import e.a.l.a.d;
import e.e.h;
import e.f.j.f.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements androidx.core.graphics.drawable.b {

    /* renamed from: s  reason: collision with root package name */
    private c f3117s;
    private g t;
    private int u;
    private int v;
    private boolean w;

    private static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    static class c extends d.a {
        e.e.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new e.e.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i2) {
            int z = super.z(iArr, drawable);
            this.L.k(z, Integer.valueOf(i2));
            return z;
        }

        /* access modifiers changed from: package-private */
        public int C(int i2, int i3, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i2, i3);
            long j2 = z ? 8589934592L : 0;
            long j3 = (long) a;
            this.K.b(D, Long.valueOf(j3 | j2));
            if (z) {
                this.K.b(D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        public int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.i(i2, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i2, int i3) {
            return (int) this.K.i(D(i2, i3), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i2, int i3) {
            return (this.K.i(D(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i2, int i3) {
            return (this.K.i(D(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {
        private final e.r.a.a.b a;

        d(e.r.a.a.b bVar) {
            super();
            this.a = bVar;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    private static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        public boolean a() {
            return this.b;
        }

        public void b() {
            this.a.reverse();
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.cancel();
        }
    }

    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.c = i2;
            return i2;
        }

        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * ((float) this.c)) + 0.5f);
            int i3 = this.b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.c) : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((c) null, (Resources) null);
    }

    a(c cVar, Resources resources) {
        super((d.a) null);
        this.u = -1;
        this.v = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = k.k(resources, theme, attributeSet, e.a.m.b.f3155h);
        int resourceId = k2.getResourceId(e.a.m.b.f3156i, 0);
        int resourceId2 = k2.getResourceId(e.a.m.b.f3157j, -1);
        Drawable j2 = resourceId2 > 0 ? m0.h().j(context, resourceId2) : null;
        k2.recycle();
        int[] k3 = k(attributeSet);
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j2 = xmlPullParser.getName().equals("vector") ? e.r.a.a.h.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j2 != null) {
            return this.f3117s.B(k3, j2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = k.k(resources, theme, attributeSet, e.a.m.b.f3158k);
        int resourceId = k2.getResourceId(e.a.m.b.f3161n, -1);
        int resourceId2 = k2.getResourceId(e.a.m.b.f3160m, -1);
        int resourceId3 = k2.getResourceId(e.a.m.b.f3159l, -1);
        Drawable j2 = resourceId3 > 0 ? m0.h().j(context, resourceId3) : null;
        boolean z = k2.getBoolean(e.a.m.b.f3162o, false);
        k2.recycle();
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j2 = xmlPullParser.getName().equals("animated-vector") ? e.r.a.a.b.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f3117s.C(resourceId, resourceId2, j2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i2) {
        int i3;
        int G;
        g gVar;
        g gVar2 = this.t;
        if (gVar2 == null) {
            i3 = c();
        } else if (i2 == this.u) {
            return true;
        } else {
            if (i2 != this.v || !gVar2.a()) {
                i3 = this.u;
                gVar2.d();
            } else {
                gVar2.b();
                this.u = this.v;
                this.v = i2;
                return true;
            }
        }
        this.t = null;
        this.v = -1;
        this.u = -1;
        c cVar = this.f3117s;
        int E = cVar.E(i3);
        int E2 = cVar.E(i2);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof e.r.a.a.b) {
            gVar = new d((e.r.a.a.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.t = gVar;
        this.v = i3;
        this.u = i2;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f3117s;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f3132d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(e.a.m.b.f3151d, cVar.f3137i));
        cVar.t(typedArray.getBoolean(e.a.m.b.f3152e, cVar.f3140l));
        cVar.u(typedArray.getInt(e.a.m.b.f3153f, cVar.A));
        cVar.v(typedArray.getInt(e.a.m.b.f3154g, cVar.B));
        setDither(typedArray.getBoolean(e.a.m.b.b, cVar.x));
    }

    /* access modifiers changed from: package-private */
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f3117s = (c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.t;
        if (gVar != null) {
            gVar.d();
            this.t = null;
            g(this.u);
            this.u = -1;
            this.v = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.f3117s, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.w) {
            super.mutate();
            if (this == this) {
                this.f3117s.r();
                this.w = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k2 = k.k(resources, theme, attributeSet, e.a.m.b.a);
        setVisible(k2.getBoolean(e.a.m.b.c, true), true);
        t(k2);
        i(resources);
        k2.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f3117s.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.t;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
