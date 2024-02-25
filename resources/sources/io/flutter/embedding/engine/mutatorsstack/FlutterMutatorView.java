package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.util.ViewUtils;

@TargetApi(19)
public class FlutterMutatorView extends FrameLayout {
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private final AndroidTouchProcessor androidTouchProcessor;
    private int left;
    private FlutterMutatorsStack mutatorsStack;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private int top;

    public FlutterMutatorView(Context context) {
        this(context, 1.0f, (AndroidTouchProcessor) null);
    }

    public FlutterMutatorView(Context context, float f2, AndroidTouchProcessor androidTouchProcessor2) {
        super(context, (AttributeSet) null);
        this.screenDensity = f2;
        this.androidTouchProcessor = androidTouchProcessor2;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
        float f2 = this.screenDensity;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate((float) (-this.left), (float) (-this.top));
        return matrix;
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.mutatorsStack.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.left), (float) (-this.top));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (this.androidTouchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.left;
            this.prevLeft = i3;
            i2 = this.top;
            this.prevTop = i2;
            f2 = (float) i3;
        } else if (action != 2) {
            f2 = (float) this.left;
            i2 = this.top;
        } else {
            matrix.postTranslate((float) this.prevLeft, (float) this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
            return this.androidTouchProcessor.onTouchEvent(motionEvent, matrix);
        }
        matrix.postTranslate(f2, (float) i2);
        return this.androidTouchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void readyToDisplay(FlutterMutatorsStack flutterMutatorsStack, int i2, int i3, int i4, int i5) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i2;
        this.top = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            AnonymousClass1 r1 = new ViewTreeObserver.OnGlobalFocusChangeListener() {
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener = onFocusChangeListener;
                    View view3 = this;
                    onFocusChangeListener.onFocusChange(view3, ViewUtils.childHasFocus(view3));
                }
            };
            this.activeFocusListener = r1;
            viewTreeObserver.addOnGlobalFocusChangeListener(r1);
        }
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.activeFocusListener) != null) {
            this.activeFocusListener = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }
}
