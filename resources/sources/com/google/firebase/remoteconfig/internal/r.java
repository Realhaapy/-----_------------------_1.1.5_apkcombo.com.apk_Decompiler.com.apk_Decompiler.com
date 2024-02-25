package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.m.a.a;
import com.google.firebase.r.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class r {
    private final b<a> a;
    private final Map<String, String> b = Collections.synchronizedMap(new HashMap());

    public r(b<a> bVar) {
        this.a = bVar;
    }

    public void a(String str, k kVar) {
        JSONObject optJSONObject;
        a aVar = this.a.get();
        if (aVar != null) {
            JSONObject f2 = kVar.f();
            if (f2.length() >= 1) {
                JSONObject d2 = kVar.d();
                if (d2.length() >= 1 && (optJSONObject = f2.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.b) {
                            if (!optString.equals(this.b.get(str))) {
                                this.b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", d2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.f("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.f("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
