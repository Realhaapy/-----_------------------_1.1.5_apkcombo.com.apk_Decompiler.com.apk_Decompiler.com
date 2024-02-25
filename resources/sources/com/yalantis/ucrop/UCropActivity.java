package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.n.i;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.b;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import e.q.m;
import e.q.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class UCropActivity extends androidx.appcompat.app.c {
    public static final Bitmap.CompressFormat K = Bitmap.CompressFormat.JPEG;
    /* access modifiers changed from: private */
    public List<ViewGroup> A = new ArrayList();
    private TextView B;
    private TextView C;
    /* access modifiers changed from: private */
    public View D;
    private m E;
    private Bitmap.CompressFormat F = K;
    private int G = 90;
    private int[] H = {1, 2, 3};
    private b.C0055b I = new a();
    private final View.OnClickListener J = new g();

    /* renamed from: g  reason: collision with root package name */
    private String f2962g;

    /* renamed from: h  reason: collision with root package name */
    private int f2963h;

    /* renamed from: i  reason: collision with root package name */
    private int f2964i;

    /* renamed from: j  reason: collision with root package name */
    private int f2965j;

    /* renamed from: k  reason: collision with root package name */
    private int f2966k;

    /* renamed from: l  reason: collision with root package name */
    private int f2967l;

    /* renamed from: m  reason: collision with root package name */
    private int f2968m;

    /* renamed from: n  reason: collision with root package name */
    private int f2969n;

    /* renamed from: o  reason: collision with root package name */
    private int f2970o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2971p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f2972q = true;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public UCropView f2973r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public GestureCropImageView f2974s;
    private OverlayView t;
    private ViewGroup u;
    private ViewGroup v;
    private ViewGroup w;
    private ViewGroup x;
    private ViewGroup y;
    private ViewGroup z;

    class a implements b.C0055b {
        a() {
        }

        public void a(Exception exc) {
            UCropActivity.this.M(exc);
            UCropActivity.this.finish();
        }

        public void b(float f2) {
            UCropActivity.this.O(f2);
        }

        public void c(float f2) {
            UCropActivity.this.I(f2);
        }

        public void d() {
            UCropActivity.this.f2973r.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.D.setClickable(false);
            boolean unused = UCropActivity.this.f2972q = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            UCropActivity.this.f2974s.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).g(view.isSelected()));
            UCropActivity.this.f2974s.B();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.A) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    class c implements HorizontalProgressWheelView.a {
        c() {
        }

        public void a(float f2, float f3) {
            UCropActivity.this.f2974s.z(f2 / 42.0f);
        }

        public void b() {
            UCropActivity.this.f2974s.B();
        }

        public void c() {
            UCropActivity.this.f2974s.v();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            UCropActivity.this.F();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            UCropActivity.this.G(90);
        }
    }

    class f implements HorizontalProgressWheelView.a {
        f() {
        }

        public void a(float f2, float f3) {
            if (f2 > 0.0f) {
                UCropActivity.this.f2974s.E(UCropActivity.this.f2974s.getCurrentScale() + (f2 * ((UCropActivity.this.f2974s.getMaxScale() - UCropActivity.this.f2974s.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f2974s.G(UCropActivity.this.f2974s.getCurrentScale() + (f2 * ((UCropActivity.this.f2974s.getMaxScale() - UCropActivity.this.f2974s.getMinScale()) / 15000.0f)));
            }
        }

        public void b() {
            UCropActivity.this.f2974s.B();
        }

        public void c() {
            UCropActivity.this.f2974s.v();
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.R(view.getId());
            }
        }
    }

    class h implements com.yalantis.ucrop.k.a {
        h() {
        }

        public void a(Throwable th) {
            UCropActivity.this.M(th);
            UCropActivity.this.finish();
        }

        public void b(Uri uri, int i2, int i3, int i4, int i5) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.N(uri, uCropActivity.f2974s.getTargetAspectRatio(), i2, i3, i4, i5);
            UCropActivity.this.finish();
        }
    }

    static {
        androidx.appcompat.app.e.A(true);
    }

    private void A() {
        if (this.D == null) {
            this.D = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, e.toolbar);
            this.D.setLayoutParams(layoutParams);
            this.D.setClickable(true);
        }
        ((RelativeLayout) findViewById(e.ucrop_photobox)).addView(this.D);
    }

    private void B(int i2) {
        o.a((ViewGroup) findViewById(e.ucrop_photobox), this.E);
        int i3 = 0;
        this.w.findViewById(e.text_view_scale).setVisibility(i2 == e.state_scale ? 0 : 8);
        this.u.findViewById(e.text_view_crop).setVisibility(i2 == e.state_aspect_ratio ? 0 : 8);
        View findViewById = this.v.findViewById(e.text_view_rotate);
        if (i2 != e.state_rotate) {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
    }

    private void D() {
        UCropView uCropView = (UCropView) findViewById(e.ucrop);
        this.f2973r = uCropView;
        this.f2974s = uCropView.getCropImageView();
        this.t = this.f2973r.getOverlayView();
        this.f2974s.setTransformImageListener(this.I);
        ((ImageView) findViewById(e.image_view_logo)).setColorFilter(this.f2970o, PorterDuff.Mode.SRC_ATOP);
        int i2 = e.ucrop_frame;
        findViewById(i2).setBackgroundColor(this.f2967l);
        if (!this.f2971p) {
            ((RelativeLayout.LayoutParams) findViewById(i2).getLayoutParams()).bottomMargin = 0;
            findViewById(i2).requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0137, code lost:
        if (java.lang.Float.isNaN(r0) != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x015d, code lost:
        if (java.lang.Float.isNaN(r0) != false) goto L_0x0161;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "com.yalantis.ucrop.CompressionFormatName"
            java.lang.String r0 = r8.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0011
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0)
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0016
            android.graphics.Bitmap$CompressFormat r0 = K
        L_0x0016:
            r7.F = r0
            r0 = 90
            java.lang.String r1 = "com.yalantis.ucrop.CompressionQuality"
            int r0 = r8.getIntExtra(r1, r0)
            r7.G = r0
            java.lang.String r0 = "com.yalantis.ucrop.AllowedGestures"
            int[] r0 = r8.getIntArrayExtra(r0)
            if (r0 == 0) goto L_0x0030
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto L_0x0030
            r7.H = r0
        L_0x0030:
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.f2974s
            java.lang.String r1 = "com.yalantis.ucrop.MaxBitmapSize"
            r2 = 0
            int r1 = r8.getIntExtra(r1, r2)
            r0.setMaxBitmapSize(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.f2974s
            r1 = 1092616192(0x41200000, float:10.0)
            java.lang.String r3 = "com.yalantis.ucrop.MaxScaleMultiplier"
            float r1 = r8.getFloatExtra(r3, r1)
            r0.setMaxScaleMultiplier(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.f2974s
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r3 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
            int r1 = r8.getIntExtra(r3, r1)
            long r3 = (long) r1
            r0.setImageToWrapCropBoundsAnimDuration(r3)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.FreeStyleCrop"
            boolean r1 = r8.getBooleanExtra(r1, r2)
            r0.setFreestyleCropEnabled(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.b.ucrop_color_default_dimmed
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.DimmedLayerColor"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setDimmedColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.CircleDimmedLayer"
            boolean r1 = r8.getBooleanExtra(r1, r2)
            r0.setCircleDimmedLayer(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropFrame"
            r3 = 1
            boolean r1 = r8.getBooleanExtra(r1, r3)
            r0.setShowCropFrame(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.b.ucrop_color_default_crop_frame
            int r1 = r1.getColor(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameColor"
            int r1 = r8.getIntExtra(r4, r1)
            r0.setCropFrameColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.c.ucrop_default_crop_frame_stoke_width
            int r1 = r1.getDimensionPixelSize(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameStrokeWidth"
            int r1 = r8.getIntExtra(r4, r1)
            r0.setCropFrameStrokeWidth(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropGrid"
            boolean r1 = r8.getBooleanExtra(r1, r3)
            r0.setShowCropGrid(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.CropGridRowCount"
            r3 = 2
            int r1 = r8.getIntExtra(r1, r3)
            r0.setCropGridRowCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            java.lang.String r1 = "com.yalantis.ucrop.CropGridColumnCount"
            int r1 = r8.getIntExtra(r1, r3)
            r0.setCropGridColumnCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.b.ucrop_color_default_crop_grid
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridColor"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setCropGridColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.t
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.c.ucrop_default_crop_grid_stoke_width
            int r1 = r1.getDimensionPixelSize(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridStrokeWidth"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setCropGridStrokeWidth(r1)
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioX"
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r8.getFloatExtra(r0, r1)
            java.lang.String r3 = "com.yalantis.ucrop.AspectRatioY"
            float r1 = r8.getFloatExtra(r3, r1)
            java.lang.String r3 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            int r3 = r8.getIntExtra(r3, r2)
            java.lang.String r4 = "com.yalantis.ucrop.AspectRatioOptions"
            java.util.ArrayList r4 = r8.getParcelableArrayListExtra(r4)
            r5 = 0
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x013a
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x013a
            android.view.ViewGroup r3 = r7.u
            if (r3 == 0) goto L_0x0130
            r4 = 8
            r3.setVisibility(r4)
        L_0x0130:
            float r0 = r0 / r1
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.f2974s
            boolean r3 = java.lang.Float.isNaN(r0)
            if (r3 == 0) goto L_0x0160
            goto L_0x0161
        L_0x013a:
            if (r4 == 0) goto L_0x0165
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0165
            java.lang.Object r0 = r4.get(r3)
            com.yalantis.ucrop.l.a r0 = (com.yalantis.ucrop.l.a) r0
            float r0 = r0.b()
            java.lang.Object r1 = r4.get(r3)
            com.yalantis.ucrop.l.a r1 = (com.yalantis.ucrop.l.a) r1
            float r1 = r1.c()
            float r0 = r0 / r1
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.f2974s
            boolean r3 = java.lang.Float.isNaN(r0)
            if (r3 == 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r5 = r0
        L_0x0161:
            r1.setTargetAspectRatio(r5)
            goto L_0x016a
        L_0x0165:
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.f2974s
            r0.setTargetAspectRatio(r5)
        L_0x016a:
            java.lang.String r0 = "com.yalantis.ucrop.MaxSizeX"
            int r0 = r8.getIntExtra(r0, r2)
            java.lang.String r1 = "com.yalantis.ucrop.MaxSizeY"
            int r8 = r8.getIntExtra(r1, r2)
            if (r0 <= 0) goto L_0x0184
            if (r8 <= 0) goto L_0x0184
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.f2974s
            r1.setMaxResultImageSizeX(r0)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.f2974s
            r0.setMaxResultImageSizeY(r8)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.E(android.content.Intent):void");
    }

    /* access modifiers changed from: private */
    public void F() {
        GestureCropImageView gestureCropImageView = this.f2974s;
        gestureCropImageView.z(-gestureCropImageView.getCurrentAngle());
        this.f2974s.B();
    }

    /* access modifiers changed from: private */
    public void G(int i2) {
        this.f2974s.z((float) i2);
        this.f2974s.B();
    }

    private void H(int i2) {
        GestureCropImageView gestureCropImageView = this.f2974s;
        int[] iArr = this.H;
        boolean z2 = false;
        gestureCropImageView.setScaleEnabled(iArr[i2] == 3 || iArr[i2] == 1);
        GestureCropImageView gestureCropImageView2 = this.f2974s;
        int[] iArr2 = this.H;
        if (iArr2[i2] == 3 || iArr2[i2] == 2) {
            z2 = true;
        }
        gestureCropImageView2.setRotateEnabled(z2);
    }

    /* access modifiers changed from: private */
    public void I(float f2) {
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f2)}));
        }
    }

    private void J(int i2) {
        TextView textView = this.B;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    private void K(Intent intent) {
        Throwable e2;
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        E(intent);
        if (uri == null || uri2 == null) {
            e2 = new NullPointerException(getString(h.ucrop_error_input_data_is_absent));
        } else {
            try {
                this.f2974s.p(uri, uri2);
                return;
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        M(e2);
        finish();
    }

    private void L() {
        if (this.f2971p) {
            R(this.u.getVisibility() == 0 ? e.state_aspect_ratio : e.state_scale);
        } else {
            H(0);
        }
    }

    /* access modifiers changed from: private */
    public void O(float f2) {
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f2 * 100.0f))}));
        }
    }

    private void P(int i2) {
        TextView textView = this.C;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    @TargetApi(21)
    private void Q(int i2) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i2);
        }
    }

    /* access modifiers changed from: private */
    public void R(int i2) {
        if (this.f2971p) {
            ViewGroup viewGroup = this.u;
            int i3 = e.state_aspect_ratio;
            viewGroup.setSelected(i2 == i3);
            ViewGroup viewGroup2 = this.v;
            int i4 = e.state_rotate;
            viewGroup2.setSelected(i2 == i4);
            ViewGroup viewGroup3 = this.w;
            int i5 = e.state_scale;
            viewGroup3.setSelected(i2 == i5);
            int i6 = 8;
            this.x.setVisibility(i2 == i3 ? 0 : 8);
            this.y.setVisibility(i2 == i4 ? 0 : 8);
            ViewGroup viewGroup4 = this.z;
            if (i2 == i5) {
                i6 = 0;
            }
            viewGroup4.setVisibility(i6);
            B(i2);
            if (i2 == i5) {
                H(0);
            } else if (i2 == i4) {
                H(1);
            } else {
                H(2);
            }
        }
    }

    private void S() {
        Q(this.f2964i);
        Toolbar toolbar = (Toolbar) findViewById(e.toolbar);
        toolbar.setBackgroundColor(this.f2963h);
        toolbar.setTitleTextColor(this.f2966k);
        TextView textView = (TextView) toolbar.findViewById(e.toolbar_title);
        textView.setTextColor(this.f2966k);
        textView.setText(this.f2962g);
        Drawable mutate = e.f.j.a.f(this, this.f2968m).mutate();
        mutate.setColorFilter(this.f2966k, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        n(toolbar);
        androidx.appcompat.app.a f2 = f();
        if (f2 != null) {
            f2.s(false);
        }
    }

    private void T(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new com.yalantis.ucrop.l.a((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new com.yalantis.ucrop.l.a((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new com.yalantis.ucrop.l.a(getString(h.c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new com.yalantis.ucrop.l.a((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new com.yalantis.ucrop.l.a((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(e.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(f.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f2965j);
            aspectRatioTextView.setAspectRatio((com.yalantis.ucrop.l.a) it.next());
            linearLayout.addView(frameLayout);
            this.A.add(frameLayout);
        }
        this.A.get(intExtra).setSelected(true);
        for (ViewGroup onClickListener : this.A) {
            onClickListener.setOnClickListener(new b());
        }
    }

    private void U() {
        this.B = (TextView) findViewById(e.text_view_rotate);
        int i2 = e.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i2)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i2)).setMiddleLineColor(this.f2965j);
        findViewById(e.wrapper_reset_rotate).setOnClickListener(new d());
        findViewById(e.wrapper_rotate_by_angle).setOnClickListener(new e());
        J(this.f2965j);
    }

    private void V() {
        this.C = (TextView) findViewById(e.text_view_scale);
        int i2 = e.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i2)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i2)).setMiddleLineColor(this.f2965j);
        P(this.f2965j);
    }

    private void W() {
        ImageView imageView = (ImageView) findViewById(e.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(e.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(e.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.f2965j));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.f2965j));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.f2965j));
    }

    private void X(Intent intent) {
        this.f2964i = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", e.f.j.a.d(this, b.ucrop_color_statusbar));
        this.f2963h = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", e.f.j.a.d(this, b.ucrop_color_toolbar));
        this.f2965j = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", e.f.j.a.d(this, b.ucrop_color_active_controls_color));
        this.f2966k = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", e.f.j.a.d(this, b.ucrop_color_toolbar_widget));
        this.f2968m = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", d.ucrop_ic_cross);
        this.f2969n = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", d.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f2962g = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(h.ucrop_label_edit_photo);
        }
        this.f2962g = stringExtra;
        this.f2970o = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", e.f.j.a.d(this, b.ucrop_color_default_logo));
        this.f2971p = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f2967l = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", e.f.j.a.d(this, b.ucrop_color_crop_background));
        S();
        D();
        if (this.f2971p) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(e.ucrop_photobox)).findViewById(e.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(f.ucrop_controls, viewGroup, true);
            e.q.b bVar = new e.q.b();
            this.E = bVar;
            bVar.Y(50);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(e.state_aspect_ratio);
            this.u = viewGroup2;
            viewGroup2.setOnClickListener(this.J);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(e.state_rotate);
            this.v = viewGroup3;
            viewGroup3.setOnClickListener(this.J);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(e.state_scale);
            this.w = viewGroup4;
            viewGroup4.setOnClickListener(this.J);
            this.x = (ViewGroup) findViewById(e.layout_aspect_ratio);
            this.y = (ViewGroup) findViewById(e.layout_rotate_wheel);
            this.z = (ViewGroup) findViewById(e.layout_scale_wheel);
            T(intent);
            U();
            V();
            W();
        }
    }

    /* access modifiers changed from: protected */
    public void C() {
        this.D.setClickable(true);
        this.f2972q = true;
        supportInvalidateOptionsMenu();
        this.f2974s.w(this.F, this.G, new h());
    }

    /* access modifiers changed from: protected */
    public void M(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* access modifiers changed from: protected */
    public void N(Uri uri, float f2, int i2, int i3, int i4, int i5) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f2).putExtra("com.yalantis.ucrop.ImageWidth", i4).putExtra("com.yalantis.ucrop.ImageHeight", i5).putExtra("com.yalantis.ucrop.OffsetX", i2).putExtra("com.yalantis.ucrop.OffsetY", i3));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.ucrop_activity_photobox);
        Intent intent = getIntent();
        X(intent);
        K(intent);
        L();
        A();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(g.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(e.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f2966k, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e2.getMessage(), getString(h.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(e.menu_crop);
        Drawable f2 = e.f.j.a.f(this, this.f2969n);
        if (f2 != null) {
            f2.mutate();
            f2.setColorFilter(this.f2966k, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(f2);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == e.menu_crop) {
            C();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(e.menu_crop).setVisible(!this.f2972q);
        menu.findItem(e.menu_loader).setVisible(this.f2972q);
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f2974s;
        if (gestureCropImageView != null) {
            gestureCropImageView.v();
        }
    }
}
