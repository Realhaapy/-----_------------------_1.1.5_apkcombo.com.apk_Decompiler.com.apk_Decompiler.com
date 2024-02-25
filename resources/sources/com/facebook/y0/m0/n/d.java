package com.facebook.y0.m0.n;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.s0.n.a;
import m.d0.f;

public final class d {
    public static final d a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        int i2;
        if (a.d(this)) {
            return false;
        }
        try {
            f fVar = f.a;
            String b = new f("\\s").b(f.k(textView), "");
            int length = b.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i3 = length - 1;
            if (i3 >= 0) {
                boolean z = false;
                i2 = 0;
                while (true) {
                    int i4 = i3 - 1;
                    char charAt = b.charAt(i3);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int d2 = c.d(charAt);
                    if (z && (d2 = d2 * 2) > 9) {
                        d2 = (d2 % 10) + 1;
                    }
                    i2 += d2;
                    z = !z;
                    if (i4 < 0) {
                        break;
                    }
                    i3 = i4;
                }
            } else {
                i2 = 0;
            }
            return i2 % 10 == 0;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (a.d(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            f fVar = f.a;
            String k2 = f.k(textView);
            if (k2 == null) {
                return false;
            }
            if (k2.length() != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(k2).matches();
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            a.b(th, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        Class<d> cls = d.class;
        if (a.d(cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = a;
            return dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view) || dVar.b((TextView) view);
        } catch (Throwable th) {
            a.b(th, cls);
            return false;
        }
    }
}
