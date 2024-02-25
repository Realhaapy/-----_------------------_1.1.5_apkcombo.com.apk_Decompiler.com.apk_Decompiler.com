package e.r.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import e.f.j.f.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b extends g implements Animatable {

    /* renamed from: f  reason: collision with root package name */
    private C0098b f3648f;

    /* renamed from: g  reason: collision with root package name */
    private Context f3649g;

    /* renamed from: h  reason: collision with root package name */
    private ArgbEvaluator f3650h;

    /* renamed from: i  reason: collision with root package name */
    final Drawable.Callback f3651i;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.r.a.a.b$b  reason: collision with other inner class name */
    private static class C0098b extends Drawable.ConstantState {
        int a;
        h b;
        AnimatorSet c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f3653d;

        /* renamed from: e  reason: collision with root package name */
        e.e.a<Animator, String> f3654e;

        public C0098b(Context context, C0098b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                h hVar = bVar.b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = this.b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.b = hVar3;
                    hVar3.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f3653d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3653d = new ArrayList<>(size);
                    this.f3654e = new e.e.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f3653d.get(i2);
                        Animator clone = animator.clone();
                        String str = bVar.f3654e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.f3653d.add(clone);
                        this.f3654e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.f3653d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable();
            bVar.f3655e = newDrawable;
            newDrawable.setCallback(bVar.f3651i);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable(resources);
            bVar.f3655e = newDrawable;
            newDrawable.setCallback(bVar.f3651i);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            bVar.f3655e = newDrawable;
            newDrawable.setCallback(bVar.f3651i);
            return bVar;
        }
    }

    b() {
        this((Context) null, (C0098b) null, (Resources) null);
    }

    private b(Context context) {
        this(context, (C0098b) null, (Resources) null);
    }

    private b(Context context, C0098b bVar, Resources resources) {
        this.f3650h = null;
        a aVar = new a();
        this.f3651i = aVar;
        this.f3649g = context;
        if (bVar != null) {
            this.f3648f = bVar;
        } else {
            this.f3648f = new C0098b(context, bVar, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f3648f.b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0098b bVar = this.f3648f;
        if (bVar.f3653d == null) {
            bVar.f3653d = new ArrayList<>();
            this.f3648f.f3654e = new e.e.a<>();
        }
        this.f3648f.f3653d.add(animator);
        this.f3648f.f3654e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3650h == null) {
                    this.f3650h = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3650h);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3648f.b.draw(canvas);
        if (this.f3648f.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f3648f.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3648f.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3648f.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3655e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3655e.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3648f.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3648f.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.getOpacity() : this.f3648f.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = k.k(resources, theme, attributeSet, a.f3640e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b = h.b(resources, resourceId, theme);
                        b.h(false);
                        b.setCallback(this.f3651i);
                        h hVar = this.f3648f.b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3648f.b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f3641f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3649g;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3648f.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3655e;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f3648f.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3655e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3648f.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.isStateful() : this.f3648f.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3648f.b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.setLevel(i2) : this.f3648f.b.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3655e;
        return drawable != null ? drawable.setState(iArr) : this.f3648f.b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f3648f.b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.f3648f.b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3648f.b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            this.f3648f.b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f3648f.b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f3648f.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3648f.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3648f.c.isStarted()) {
            this.f3648f.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3655e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3648f.c.end();
        }
    }
}
