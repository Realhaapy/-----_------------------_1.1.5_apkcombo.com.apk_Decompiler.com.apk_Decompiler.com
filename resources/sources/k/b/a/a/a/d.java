package k.b.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Objects;
import m.y.d.l;

public final class d implements MethodChannel.MethodCallHandler {

    /* renamed from: e  reason: collision with root package name */
    private Context f4778e;

    /* renamed from: f  reason: collision with root package name */
    private Toast f4779f;

    public d(Context context) {
        l.d(context, "context");
        this.f4778e = context;
    }

    /* access modifiers changed from: private */
    public static final void c(d dVar) {
        l.d(dVar, "this$0");
        Toast toast = dVar.f4779f;
        if (toast != null) {
            toast.show();
        } else {
            l.n("mToast");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final void e(d dVar) {
        l.d(dVar, "this$0");
        dVar.d();
    }

    public final void d() {
        Toast toast = this.f4779f;
        if (toast == null) {
            return;
        }
        if (toast == null) {
            l.n("mToast");
            throw null;
        } else if (toast != null) {
            View view = toast.getView();
            boolean z = false;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                new Handler().postDelayed(new a(this), 1000);
            } else if (this.f4779f == null) {
                l.n("mToast");
                throw null;
            }
        } else {
            l.n("mToast");
            throw null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Toast toast;
        String str;
        Drawable drawable;
        MethodCall methodCall2 = methodCall;
        MethodChannel.Result result2 = result;
        Boolean bool = Boolean.TRUE;
        int i2 = Build.VERSION.SDK_INT;
        l.d(methodCall2, "call");
        l.d(result2, "result");
        String str2 = methodCall2.method;
        if (l.a(str2, "showToast")) {
            String valueOf = String.valueOf(methodCall2.argument("msg"));
            String valueOf2 = String.valueOf(methodCall2.argument("length"));
            String valueOf3 = String.valueOf(methodCall2.argument("gravity"));
            Number number = (Number) methodCall2.argument("bgcolor");
            Number number2 = (Number) methodCall2.argument("textcolor");
            Number number3 = (Number) methodCall2.argument("fontSize");
            int i3 = l.a(valueOf3, "top") ? 48 : l.a(valueOf3, "center") ? 17 : 80;
            boolean a = l.a(valueOf2, "long");
            if (number == null || i2 > 31) {
                Toast makeText = Toast.makeText(this.f4778e, valueOf, a ? 1 : 0);
                l.c(makeText, "makeText(context, mMessage, mDuration)");
                this.f4779f = makeText;
                if (i2 <= 31) {
                    if (makeText != null) {
                        try {
                            View view = makeText.getView();
                            l.b(view);
                            View findViewById = view.findViewById(16908299);
                            l.c(findViewById, "mToast.view!!.findViewById(android.R.id.message)");
                            TextView textView = (TextView) findViewById;
                            if (number3 != null) {
                                textView.setTextSize(number3.floatValue());
                            }
                            if (number2 != null) {
                                textView.setTextColor(number2.intValue());
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        l.n("mToast");
                        throw null;
                    }
                }
            } else {
                Object systemService = this.f4778e.getSystemService("layout_inflater");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(g.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(f.a);
                textView2.setText(valueOf);
                if (i2 >= 21) {
                    drawable = this.f4778e.getDrawable(e.corner);
                    l.b(drawable);
                    str = "{\n                      …)!!\n                    }";
                } else {
                    drawable = this.f4778e.getResources().getDrawable(e.corner);
                    str = "{\n                      …er)\n                    }";
                }
                l.c(drawable, str);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f4778e);
                this.f4779f = toast2;
                toast2.setDuration(a);
                Toast toast3 = this.f4779f;
                if (toast3 != null) {
                    toast3.setView(inflate);
                } else {
                    l.n("mToast");
                    throw null;
                }
            }
            if (i2 <= 31) {
                if (i3 != 17) {
                    if (i3 != 48) {
                        toast = this.f4779f;
                        if (toast == null) {
                            l.n("mToast");
                            throw null;
                        }
                    } else {
                        toast = this.f4779f;
                        if (toast == null) {
                            l.n("mToast");
                            throw null;
                        }
                    }
                    toast.setGravity(i3, 0, 100);
                } else {
                    Toast toast4 = this.f4779f;
                    if (toast4 != null) {
                        toast4.setGravity(i3, 0, 0);
                    } else {
                        l.n("mToast");
                        throw null;
                    }
                }
            }
            Context context = this.f4778e;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new b(this));
            } else {
                Toast toast5 = this.f4779f;
                if (toast5 != null) {
                    toast5.show();
                } else {
                    l.n("mToast");
                    throw null;
                }
            }
            d();
        } else if (l.a(str2, "cancel")) {
            Toast toast6 = this.f4779f;
            if (toast6 != null) {
                if (toast6 != null) {
                    toast6.cancel();
                } else {
                    l.n("mToast");
                    throw null;
                }
            }
        } else {
            result.notImplemented();
            return;
        }
        result2.success(bool);
    }
}
