package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.q0;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends q0 {
    public static final a v = new a((g) null);
    private static final String w;
    private boolean u;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final z a(Context context, String str, String str2) {
            l.d(context, "context");
            l.d(str, "url");
            l.d(str2, "expectedRedirectUrl");
            q0.b bVar = q0.f1483q;
            q0.p(context);
            return new z(context, str, str2, (g) null);
        }
    }

    static {
        String name = z.class.getName();
        l.c(name, "FacebookWebFallbackDialog::class.java.name");
        w = name;
    }

    private z(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }

    public /* synthetic */ z(Context context, String str, String str2, g gVar) {
        this(context, str, str2);
    }

    /* access modifiers changed from: private */
    public static final void E(z zVar) {
        l.d(zVar, "this$0");
        super.cancel();
    }

    public void cancel() {
        WebView o2 = o();
        if (!r() || q() || o2 == null || !o2.isShown()) {
            super.cancel();
        } else if (!this.u) {
            this.u = true;
            o2.loadUrl(l.j("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new c(this), 1500);
        }
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        o0 o0Var = o0.a;
        Bundle j0 = o0.j0(parse.getQuery());
        String string = j0.getString("bridge_args");
        j0.remove("bridge_args");
        if (!o0.V(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                s sVar = s.a;
                j0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", s.a(jSONObject));
            } catch (JSONException e2) {
                o0 o0Var2 = o0.a;
                o0.f0(w, "Unable to parse bridge_args JSON", e2);
            }
        }
        String string2 = j0.getString("method_results");
        j0.remove("method_results");
        o0 o0Var3 = o0.a;
        if (!o0.V(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                s sVar2 = s.a;
                j0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", s.a(jSONObject2));
            } catch (JSONException e3) {
                o0 o0Var4 = o0.a;
                o0.f0(w, "Unable to parse bridge_args JSON", e3);
            }
        }
        j0.remove("version");
        j0 j0Var = j0.a;
        j0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", j0.s());
        return j0;
    }
}
