package com.facebook.y0.m0.n;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.o0;
import com.facebook.internal.s0.n.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m.y.d.l;
import m.y.d.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final f a = new f();
    private static final String b = "com.facebook.y0.m0.n.f";
    private static WeakReference<View> c = new WeakReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static Method f2045d;

    private f() {
    }

    public static final View a(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        while (view != null) {
            try {
                if (!a.q(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i2 = 0;
                if (childCount > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i2));
                        if (i3 >= childCount) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final int c(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return 0;
        }
        try {
            l.d(view, "view");
            int i2 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i2 |= 32;
            }
            f fVar = a;
            if (o(view)) {
                i2 |= 512;
            }
            if (view instanceof TextView) {
                int i3 = i2 | 1024 | 1;
                if (view instanceof Button) {
                    i3 |= 4;
                    if (view instanceof Switch) {
                        i3 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i3 |= 32768;
                    }
                }
                return view instanceof EditText ? i3 | 2048 : i3;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i2 | 65536 : view instanceof RadioGroup ? i2 | 16384 : (!(view instanceof ViewGroup) || !fVar.p(view, (View) c.get())) ? i2 : i2 | 64;
                }
            }
            return i2 | 4096;
        } catch (Throwable th) {
            a.b(th, cls);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        JSONObject jSONObject;
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(view, "view");
            if (l.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                c = new WeakReference<>(view);
            }
            jSONObject = new JSONObject();
            s(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b2 = b(view);
            int i2 = 0;
            int size = b2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    jSONArray.put(d(b2.get(i2)));
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e2) {
            Log.e(b, "Failed to create JSONObject for view.", e2);
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
        return jSONObject;
    }

    private final JSONObject e(View view) {
        JSONObject jSONObject;
        if (a.d(this)) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e2) {
            Log.e(b, "Failed to create JSONObject for dimension.", e2);
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
        return jSONObject;
    }

    private final Class<?> f(String str) {
        if (a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            l.c(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            l.c(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        String str;
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            l.c(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            l.c(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnTouchListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (NoSuchFieldException e2) {
            e = e2;
            o0 o0Var = o0.a;
            str = b;
        } catch (ClassNotFoundException e3) {
            e = e3;
            o0 o0Var2 = o0.a;
            str = b;
        } catch (IllegalAccessException e4) {
            e = e4;
            o0 o0Var3 = o0.a;
            str = b;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
        o0.d0(str, e);
        return null;
    }

    public static final String i(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        Class<f> cls = f.class;
        if (a.d(cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final String k(View view) {
        Object obj;
        Object selectedItem;
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    obj = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i2 = 0;
                    if (view instanceof DatePicker) {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        s sVar = s.a;
                        obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    } else if (view instanceof TimePicker) {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        l.c(currentHour, "view.currentHour");
                        int intValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        l.c(currentMinute, "view.currentMinute");
                        int intValue2 = currentMinute.intValue();
                        s sVar2 = s.a;
                        obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                    } else if (view instanceof RadioGroup) {
                        int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                        int childCount = ((RadioGroup) view).getChildCount();
                        if (childCount > 0) {
                            while (true) {
                                int i3 = i2 + 1;
                                View childAt = ((RadioGroup) view).getChildAt(i2);
                                if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                    obj = ((RadioButton) childAt).getText();
                                    break;
                                } else if (i3 >= childCount) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                    } else if (view instanceof RatingBar) {
                        obj = String.valueOf(((RatingBar) view).getRating());
                    }
                    l.c(obj, "java.lang.String.format(format, *args)");
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    obj = selectedItem.toString();
                }
                obj = null;
            }
            if (obj == null) {
                return "";
            }
            String obj2 = obj.toString();
            return obj2 == null ? "" : obj2;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        String str;
        if (a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f2045d;
            if (!(method == null || view == null)) {
                if (method != null) {
                    Object invoke = method.invoke((Object) null, new Object[]{fArr, view});
                    if (invoke != null) {
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            o0 o0Var = o0.a;
            str = b;
        } catch (InvocationTargetException e3) {
            e = e3;
            o0 o0Var2 = o0.a;
            str = b;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
        return null;
        o0.d0(str, e);
        return null;
    }

    private final float[] m(View view) {
        if (a.d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    private final void n() {
        String str;
        if (!a.d(this)) {
            try {
                if (f2045d == null) {
                    Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                    l.c(cls, "forName(CLASS_TOUCHTARGETHELPER)");
                    Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                    f2045d = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                return;
            } catch (ClassNotFoundException e2) {
                e = e2;
                o0 o0Var = o0.a;
                str = b;
            } catch (NoSuchMethodException e3) {
                e = e3;
                o0 o0Var2 = o0.a;
                str = b;
            } catch (Throwable th) {
                a.b(th, this);
                return;
            }
        } else {
            return;
        }
        o0.d0(str, e);
    }

    private static final boolean o(View view) {
        Class<f> cls = f.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = a;
            Class<?> f2 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f2 != null && f2.isInstance(parent)) {
                return true;
            }
            Class<?> f3 = fVar.f("androidx.core.view.NestedScrollingChild");
            return f3 != null && f3.isInstance(parent);
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }

    private final boolean q(View view) {
        if (a.d(this)) {
            return false;
        }
        try {
            return l.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(android.view.View r5, android.view.View.OnClickListener r6) {
        /*
            java.lang.Class<com.facebook.y0.m0.n.f> r0 = com.facebook.y0.m0.n.f.class
            boolean r1 = com.facebook.internal.s0.n.a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "view"
            m.y.d.l.d(r5, r1)     // Catch:{ all -> 0x004d }
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            goto L_0x002a
        L_0x0028:
            r2 = r1
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x003e }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x003e }
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r1 != 0) goto L_0x0045
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
            return
        L_0x0045:
            r3.set(r1, r6)     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0049:
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return
        L_0x004d:
            r5 = move-exception
            com.facebook.internal.s0.n.a.b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.m0.n.f.r(android.view.View, android.view.View$OnClickListener):void");
    }

    public static final void s(View view, JSONObject jSONObject) {
        Class<f> cls = f.class;
        if (!a.d(cls)) {
            try {
                l.d(view, "view");
                l.d(jSONObject, "json");
                f fVar = a;
                String k2 = k(view);
                String i2 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                d dVar = d.a;
                if (!d.g(view)) {
                    o0 o0Var = o0.a;
                    jSONObject.put("text", o0.i(o0.A0(k2), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                o0 o0Var2 = o0.a;
                jSONObject.put("hint", o0.i(o0.A0(i2), ""));
                if (tag != null) {
                    jSONObject.put("tag", o0.i(o0.A0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", o0.i(o0.A0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", fVar.e(view));
            } catch (JSONException e2) {
                o0 o0Var3 = o0.a;
                o0.d0(b, e2);
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r5 = l(m(r4), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.View r4, android.view.View r5) {
        /*
            r3 = this;
            boolean r0 = com.facebook.internal.s0.n.a.d(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "view"
            m.y.d.l.d(r4, r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class r0 = r4.getClass()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "view.javaClass.name"
            m.y.d.l.c(r0, r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "com.facebook.react.views.view.ReactViewGroup"
            boolean r0 = m.y.d.l.a(r0, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            float[] r0 = r3.m(r4)     // Catch:{ all -> 0x0038 }
            android.view.View r5 = r3.l(r0, r5)     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x0037
            int r5 = r5.getId()     // Catch:{ all -> 0x0038 }
            int r4 = r4.getId()     // Catch:{ all -> 0x0038 }
            if (r5 != r4) goto L_0x0037
            r1 = 1
        L_0x0037:
            return r1
        L_0x0038:
            r4 = move-exception
            com.facebook.internal.s0.n.a.b(r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y0.m0.n.f.p(android.view.View, android.view.View):boolean");
    }
}
