package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
import e.a.c;
import e.a.d;
import e.a.e;

public final class j {
    /* access modifiers changed from: private */
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static j c;
    private m0 a;

    class a implements m0.f {
        private final int[] a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};
        private final int[] b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl, e.abc_text_select_handle_middle_mtrl, e.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f597d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f598e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f599f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int c2 = r0.c(context, e.a.a.colorControlHighlight);
            int b2 = r0.b(context, e.a.a.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.b, r0.f670d, r0.c, r0.f672f}, new int[]{b2, e.f.k.a.c(c2, i2), e.f.k.a.c(c2, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.c(context, e.a.a.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.c(context, e.a.a.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = e.a.a.colorSwitchThumbNormal;
            ColorStateList e2 = r0.e(context, i2);
            if (e2 == null || !e2.isStateful()) {
                iArr[0] = r0.b;
                iArr2[0] = r0.b(context, i2);
                iArr[1] = r0.f671e;
                iArr2[1] = r0.c(context, e.a.a.colorControlActivated);
                iArr[2] = r0.f672f;
                iArr2[2] = r0.c(context, i2);
            } else {
                iArr[0] = r0.b;
                iArr2[0] = e2.getColorForState(iArr[0], 0);
                iArr[1] = r0.f671e;
                iArr2[1] = r0.c(context, e.a.a.colorControlActivated);
                iArr[2] = r0.f672f;
                iArr2[2] = e2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(m0 m0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable j2 = m0Var.j(context, e.abc_star_black_48dp);
            Drawable j3 = m0Var.j(context, e.abc_star_half_black_48dp);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j3 instanceof BitmapDrawable) && j3.getIntrinsicWidth() == dimensionPixelSize && j3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.b;
            }
            drawable.setColorFilter(j.e(i2, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.b
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = e.a.a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = e.a.a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f597d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = e.a.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = e.a.e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.r0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i2) {
            if (i2 == e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(m0 m0Var, Context context, int i2) {
            int i3;
            if (i2 == e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, e.abc_cab_background_internal_bg), m0Var.j(context, e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i2 == e.abc_ratingbar_material) {
                i3 = d.abc_star_big;
            } else if (i2 == e.abc_ratingbar_indicator_material) {
                i3 = d.abc_star_medium;
            } else if (i2 != e.abc_ratingbar_small_material) {
                return null;
            } else {
                i3 = d.abc_star_small;
            }
            return l(m0Var, context, i3);
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == e.abc_edit_text_material) {
                return e.a.k.a.a.c(context, c.abc_tint_edittext);
            }
            if (i2 == e.abc_switch_track_mtrl_alpha) {
                return e.a.k.a.a.c(context, c.abc_tint_switch_track);
            }
            if (i2 == e.abc_switch_thumb_material) {
                return k(context);
            }
            if (i2 == e.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i2 == e.abc_btn_borderless_material) {
                return g(context);
            }
            if (i2 == e.abc_btn_colored_material) {
                return i(context);
            }
            if (i2 == e.abc_spinner_mtrl_am_alpha || i2 == e.abc_spinner_textfield_background_material) {
                return e.a.k.a.a.c(context, c.abc_tint_spinner);
            }
            if (f(this.b, i2)) {
                return r0.e(context, e.a.a.colorControlNormal);
            }
            if (f(this.f598e, i2)) {
                return e.a.k.a.a.c(context, c.abc_tint_default);
            }
            if (f(this.f599f, i2)) {
                return e.a.k.a.a.c(context, c.abc_tint_btn_checkable);
            }
            if (i2 == e.abc_seekbar_thumb_material) {
                return e.a.k.a.a.c(context, c.abc_tint_seek_thumb);
            }
            return null;
        }

        public boolean e(Context context, int i2, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c2;
            if (i2 == e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i3 = e.a.a.colorControlNormal;
                m(findDrawableByLayerId2, r0.c(context, i3), j.b);
                m(layerDrawable.findDrawableByLayerId(16908303), r0.c(context, i3), j.b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c2 = r0.c(context, e.a.a.colorControlActivated);
            } else if (i2 != e.abc_ratingbar_material && i2 != e.abc_ratingbar_indicator_material && i2 != e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), r0.b(context, e.a.a.colorControlNormal), j.b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i4 = e.a.a.colorControlActivated;
                m(findDrawableByLayerId3, r0.c(context, i4), j.b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c2 = r0.c(context, i4);
            }
            m(findDrawableByLayerId, c2, j.b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                h();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter l2;
        synchronized (j.class) {
            l2 = m0.l(i2, mode);
        }
        return l2;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = m0.h();
                c.a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.a.j(context, i2);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i2, boolean z) {
        return this.a.k(context, i2, z);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i2) {
        return this.a.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
