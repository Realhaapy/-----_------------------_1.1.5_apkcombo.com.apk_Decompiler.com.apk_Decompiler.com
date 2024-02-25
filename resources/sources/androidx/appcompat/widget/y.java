package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import e.f.j.f.j;
import java.lang.ref.WeakReference;

class y {
    private final TextView a;
    private u0 b;
    private u0 c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f723d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f724e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f725f;

    /* renamed from: g  reason: collision with root package name */
    private u0 f726g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f727h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f728i;

    /* renamed from: j  reason: collision with root package name */
    private int f729j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f730k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f731l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f732m;

    class a extends j.e {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.c = weakReference;
        }

        public void h(int i2) {
        }

        public void i(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            y.this.n(this.c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f734e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f735f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f736g;

        b(y yVar, TextView textView, Typeface typeface, int i2) {
            this.f734e = textView;
            this.f735f = typeface;
            this.f736g = i2;
        }

        public void run() {
            this.f734e.setTypeface(this.f735f, this.f736g);
        }
    }

    y(TextView textView) {
        this.a = textView;
        this.f728i = new a0(textView);
    }

    private void B(int i2, float f2) {
        this.f728i.y(i2, f2);
    }

    private void C(Context context, w0 w0Var) {
        String n2;
        Typeface typeface;
        Typeface typeface2;
        int i2 = Build.VERSION.SDK_INT;
        this.f729j = w0Var.j(e.a.j.u2, this.f729j);
        boolean z = false;
        if (i2 >= 28) {
            int j2 = w0Var.j(e.a.j.z2, -1);
            this.f730k = j2;
            if (j2 != -1) {
                this.f729j = (this.f729j & 2) | 0;
            }
        }
        int i3 = e.a.j.y2;
        if (w0Var.r(i3) || w0Var.r(e.a.j.A2)) {
            this.f731l = null;
            int i4 = e.a.j.A2;
            if (w0Var.r(i4)) {
                i3 = i4;
            }
            int i5 = this.f730k;
            int i6 = this.f729j;
            if (!context.isRestricted()) {
                try {
                    Typeface i7 = w0Var.i(i3, this.f729j, new a(i5, i6, new WeakReference(this.a)));
                    if (i7 != null) {
                        if (i2 >= 28 && this.f730k != -1) {
                            i7 = Typeface.create(Typeface.create(i7, 0), this.f730k, (this.f729j & 2) != 0);
                        }
                        this.f731l = i7;
                    }
                    this.f732m = this.f731l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f731l == null && (n2 = w0Var.n(i3)) != null) {
                if (i2 < 28 || this.f730k == -1) {
                    typeface = Typeface.create(n2, this.f729j);
                } else {
                    Typeface create = Typeface.create(n2, 0);
                    int i8 = this.f730k;
                    if ((this.f729j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i8, z);
                }
                this.f731l = typeface;
                return;
            }
            return;
        }
        int i9 = e.a.j.t2;
        if (w0Var.r(i9)) {
            this.f732m = false;
            int j3 = w0Var.j(i9, 1);
            if (j3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f731l = typeface2;
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            j.i(drawable, u0Var, this.a.getDrawableState());
        }
    }

    private static u0 d(Context context, j jVar, int i2) {
        ColorStateList f2 = jVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f677d = true;
        u0Var.a = f2;
        return u0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i2 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void z() {
        u0 u0Var = this.f727h;
        this.b = u0Var;
        this.c = u0Var;
        this.f723d = u0Var;
        this.f724e = u0Var;
        this.f725f = u0Var;
        this.f726g = u0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i2, float f2) {
        if (!androidx.core.widget.b.a && !l()) {
            B(i2, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.b == null && this.c == null && this.f723d == null && this.f724e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f723d);
            a(compoundDrawables[3], this.f724e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f725f != null || this.f726g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f725f);
            a(compoundDrawablesRelative[2], this.f726g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f728i.b();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f728i.j();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f728i.k();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f728i.l();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f728i.m();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f728i.n();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        u0 u0Var = this.f727h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        u0 u0Var = this.f727h;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f728i.s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.j r11 = androidx.appcompat.widget.j.b()
            int[] r2 = e.a.j.V
            r12 = 0
            androidx.appcompat.widget.w0 r13 = androidx.appcompat.widget.w0.u(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.q()
            r6 = 0
            r3 = r24
            r5 = r25
            e.f.r.y.Q(r0, r1, r2, r3, r4, r5, r6)
            int r0 = e.a.j.W
            r14 = -1
            int r0 = r13.m(r0, r14)
            int r1 = e.a.j.Z
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.b = r1
        L_0x0042:
            int r1 = e.a.j.X
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.c = r1
        L_0x0054:
            int r1 = e.a.j.a0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f723d = r1
        L_0x0066:
            int r1 = e.a.j.Y
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f724e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = e.a.j.b0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.u0 r2 = d(r10, r11, r2)
            r7.f725f = r2
        L_0x0090:
            int r2 = e.a.j.c0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.u0 r2 = d(r10, r11, r2)
            r7.f726g = r2
        L_0x00a2:
            r13.v()
            android.widget.TextView r2 = r7.a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = e.a.j.r2
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.s(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = e.a.j.C2
            boolean r15 = r0.r(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.C(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = e.a.j.v2
            boolean r17 = r0.r(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = e.a.j.w2
            boolean r18 = r0.r(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = e.a.j.x2
            boolean r19 = r0.r(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = e.a.j.D2
            boolean r20 = r0.r(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.n(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = e.a.j.B2
            boolean r21 = r0.r(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.n(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.v()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = e.a.j.r2
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = e.a.j.C2
            boolean r22 = r0.r(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = e.a.j.v2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.c(r3)
        L_0x0152:
            int r3 = e.a.j.w2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.c(r3)
        L_0x015e:
            int r3 = e.a.j.x2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.c(r3)
        L_0x016a:
            int r3 = e.a.j.D2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.n(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = e.a.j.B2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.n(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = e.a.j.s2
            boolean r16 = r0.r(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.e(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.C(r10, r0)
            r0.v()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.s(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f731l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f730k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.a
            int r4 = r7.f729j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.a0 r0 = r7.f728i
            r1 = r24
            r0.t(r1, r9)
            boolean r0 = androidx.core.widget.b.a
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.a0 r0 = r7.f728i
            int r0 = r0.n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.a0 r0 = r7.f728i
            int[] r0 = r0.m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.a
            androidx.appcompat.widget.a0 r2 = r7.f728i
            int r2 = r2.k()
            androidx.appcompat.widget.a0 r3 = r7.f728i
            int r3 = r3.j()
            androidx.appcompat.widget.a0 r4 = r7.f728i
            int r4 = r4.l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = e.a.j.d0
            androidx.appcompat.widget.w0 r8 = androidx.appcompat.widget.w0.t(r10, r1, r0)
            int r0 = e.a.j.l0
            r1 = -1
            int r0 = r8.m(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = e.a.j.q0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = e.a.j.m0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = e.a.j.j0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = e.a.j.n0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = e.a.j.k0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = e.a.j.o0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.a
            androidx.core.widget.i.f(r1, r0)
        L_0x02d6:
            int r0 = e.a.j.p0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.j(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.e0.d(r0, r2)
            android.widget.TextView r2 = r7.a
            androidx.core.widget.i.g(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = e.a.j.r0
            int r0 = r8.e(r0, r1)
            int r2 = e.a.j.s0
            int r2 = r8.e(r2, r1)
            int r3 = e.a.j.t0
            int r3 = r8.e(r3, r1)
            r8.v()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.a
            androidx.core.widget.i.h(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.a
            androidx.core.widget.i.i(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.a
            androidx.core.widget.i.j(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f732m) {
            this.f731l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (e.f.r.y.C(textView)) {
                textView.post(new b(this, textView, typeface, this.f729j));
            } else {
                textView.setTypeface(typeface, this.f729j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z, int i2, int i3, int i4, int i5) {
        if (!androidx.core.widget.b.a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i2) {
        String n2;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        w0 s2 = w0.s(context, i2, e.a.j.r2);
        int i3 = e.a.j.C2;
        if (s2.r(i3)) {
            s(s2.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = e.a.j.v2;
            if (s2.r(i5) && (c4 = s2.c(i5)) != null) {
                this.a.setTextColor(c4);
            }
            int i6 = e.a.j.x2;
            if (s2.r(i6) && (c3 = s2.c(i6)) != null) {
                this.a.setLinkTextColor(c3);
            }
            int i7 = e.a.j.w2;
            if (s2.r(i7) && (c2 = s2.c(i7)) != null) {
                this.a.setHintTextColor(c2);
            }
        }
        int i8 = e.a.j.s2;
        if (s2.r(i8) && s2.e(i8, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, s2);
        if (i4 >= 26) {
            int i9 = e.a.j.B2;
            if (s2.r(i9) && (n2 = s2.n(i9)) != null) {
                this.a.setFontVariationSettings(n2);
            }
        }
        s2.v();
        Typeface typeface = this.f731l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f729j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            e.f.r.j0.a.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void t(int i2, int i3, int i4, int i5) {
        this.f728i.u(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i2) {
        this.f728i.v(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        this.f728i.w(i2);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f727h == null) {
            this.f727h = new u0();
        }
        u0 u0Var = this.f727h;
        u0Var.a = colorStateList;
        u0Var.f677d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f727h == null) {
            this.f727h = new u0();
        }
        u0 u0Var = this.f727h;
        u0Var.b = mode;
        u0Var.c = mode != null;
        z();
    }
}
