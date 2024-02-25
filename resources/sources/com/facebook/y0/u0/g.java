package com.facebook.y0.u0;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.internal.s0.n.a;
import com.facebook.y0.m0.n.f;
import java.util.ArrayList;
import java.util.List;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public static final g a = new g();
    private static final List<Class<? extends View>> b = j.g(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private g() {
    }

    public static final List<View> a(View view) {
        Class<g> cls = g.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> isInstance : b) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            f fVar = f.a;
            for (View a2 : f.b(view)) {
                arrayList.addAll(a(a2));
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        Class<g> cls = g.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(view, "view");
            l.d(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            f fVar = f.a;
            for (View b2 : f.b(view)) {
                jSONArray.put(b(b2, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            f fVar = f.a;
            for (View next : f.b(view)) {
                f fVar2 = f.a;
                String k2 = f.k(next);
                if (k2.length() > 0) {
                    arrayList.add(k2);
                }
                arrayList.addAll(c(next));
            }
            return arrayList;
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public static final String d(View view) {
        Class<g> cls = g.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(view, "hostView");
            f fVar = f.a;
            String k2 = f.k(view);
            if (k2.length() > 0) {
                return k2;
            }
            String join = TextUtils.join(" ", a.c(view));
            l.c(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        Class<g> cls = g.class;
        if (!a.d(cls)) {
            try {
                l.d(view, "view");
                l.d(jSONObject, "json");
                try {
                    f fVar = f.a;
                    String k2 = f.k(view);
                    String i2 = f.i(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", f.c(view));
                    boolean z = true;
                    if (k2.length() > 0) {
                        jSONObject.put("text", k2);
                    }
                    if (i2.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put("hint", i2);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                a.b(th, cls);
            }
        }
    }
}
