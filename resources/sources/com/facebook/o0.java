package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.i0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import m.y.d.g;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o0 {
    public static final a c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f1717d;
    private final String a;
    private final SharedPreferences b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j2 = bundle.getLong(str, Long.MIN_VALUE);
            if (j2 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j2);
        }

        public final String a(Bundle bundle) {
            l.d(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date c(Bundle bundle) {
            l.d(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            l.d(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final x e(Bundle bundle) {
            l.d(bundle, "bundle");
            return bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (x) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? x.FACEBOOK_APPLICATION_WEB : x.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            l.d(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return !(string.length() == 0) && bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) != 0;
        }
    }

    static {
        String simpleName = o0.class.getSimpleName();
        l.c(simpleName, "LegacyTokenHelper::class.java.simpleName");
        f1717d = simpleName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o0(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            m.y.d.l.d(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L_0x0018:
            r2.a = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)"
            m.y.d.l.c(r3, r4)
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.o0.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Context context, String str, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? null : str);
    }

    private final void b(String str, Bundle bundle) {
        String str2;
        String string;
        String string2 = this.b.getString(str, "{}");
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString("valueType");
            if (string3 != null) {
                int i2 = 0;
                switch (string3.hashCode()) {
                    case -1573317553:
                        if (string3.equals("stringList")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("value");
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            if (length > 0) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    Object obj = jSONArray.get(i2);
                                    if (obj == JSONObject.NULL) {
                                        str2 = null;
                                    } else {
                                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                                        str2 = (String) obj;
                                    }
                                    arrayList.add(i2, str2);
                                    if (i3 < length) {
                                        i2 = i3;
                                    }
                                }
                            }
                            bundle.putStringArrayList(str, arrayList);
                            return;
                        }
                        return;
                    case -1383386164:
                        if (string3.equals("bool[]")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            int length2 = jSONArray2.length();
                            boolean[] zArr = new boolean[length2];
                            int i4 = length2 - 1;
                            if (i4 >= 0) {
                                while (true) {
                                    int i5 = i2 + 1;
                                    zArr[i2] = jSONArray2.getBoolean(i2);
                                    if (i5 <= i4) {
                                        i2 = i5;
                                    }
                                }
                            }
                            bundle.putBooleanArray(str, zArr);
                            return;
                        }
                        return;
                    case -1374008726:
                        if (string3.equals("byte[]")) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                            int length3 = jSONArray3.length();
                            byte[] bArr = new byte[length3];
                            int i6 = length3 - 1;
                            if (i6 >= 0) {
                                while (true) {
                                    int i7 = i2 + 1;
                                    bArr[i2] = (byte) jSONArray3.getInt(i2);
                                    if (i7 <= i6) {
                                        i2 = i7;
                                    }
                                }
                            }
                            bundle.putByteArray(str, bArr);
                            return;
                        }
                        return;
                    case -1361632968:
                        if (string3.equals("char[]")) {
                            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                            int length4 = jSONArray4.length();
                            char[] cArr = new char[length4];
                            int i8 = length4 - 1;
                            if (i8 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    int i10 = i9 + 1;
                                    String string4 = jSONArray4.getString(i9);
                                    if (string4 != null && string4.length() == 1) {
                                        cArr[i9] = string4.charAt(0);
                                    }
                                    if (i10 <= i8) {
                                        i9 = i10;
                                    }
                                }
                            }
                            bundle.putCharArray(str, cArr);
                            return;
                        }
                        return;
                    case -1325958191:
                        if (string3.equals("double")) {
                            bundle.putDouble(str, jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case -1097129250:
                        if (string3.equals("long[]")) {
                            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                            int length5 = jSONArray5.length();
                            long[] jArr = new long[length5];
                            int i11 = length5 - 1;
                            if (i11 >= 0) {
                                while (true) {
                                    int i12 = i2 + 1;
                                    jArr[i2] = jSONArray5.getLong(i2);
                                    if (i12 <= i11) {
                                        i2 = i12;
                                    }
                                }
                            }
                            bundle.putLongArray(str, jArr);
                            return;
                        }
                        return;
                    case -891985903:
                        if (string3.equals("string")) {
                            bundle.putString(str, jSONObject.getString("value"));
                            return;
                        }
                        return;
                    case -766441794:
                        if (string3.equals("float[]")) {
                            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                            int length6 = jSONArray6.length();
                            float[] fArr = new float[length6];
                            int i13 = length6 - 1;
                            if (i13 >= 0) {
                                while (true) {
                                    int i14 = i2 + 1;
                                    fArr[i2] = (float) jSONArray6.getDouble(i2);
                                    if (i14 <= i13) {
                                        i2 = i14;
                                    }
                                }
                            }
                            bundle.putFloatArray(str, fArr);
                            return;
                        }
                        return;
                    case 104431:
                        if (string3.equals("int")) {
                            bundle.putInt(str, jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3029738:
                        if (string3.equals("bool")) {
                            bundle.putBoolean(str, jSONObject.getBoolean("value"));
                            return;
                        }
                        return;
                    case 3039496:
                        if (string3.equals("byte")) {
                            bundle.putByte(str, (byte) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3052374:
                        if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                            bundle.putChar(str, string.charAt(0));
                            return;
                        }
                        return;
                    case 3118337:
                        if (string3.equals("enum")) {
                            try {
                                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                                return;
                            } catch (ClassNotFoundException | IllegalArgumentException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 3327612:
                        if (string3.equals("long")) {
                            bundle.putLong(str, jSONObject.getLong("value"));
                            return;
                        }
                        return;
                    case 97526364:
                        if (string3.equals("float")) {
                            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case 100361105:
                        if (string3.equals("int[]")) {
                            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                            int length7 = jSONArray7.length();
                            int[] iArr = new int[length7];
                            int i15 = length7 - 1;
                            if (i15 >= 0) {
                                while (true) {
                                    int i16 = i2 + 1;
                                    iArr[i2] = jSONArray7.getInt(i2);
                                    if (i16 <= i15) {
                                        i2 = i16;
                                    }
                                }
                            }
                            bundle.putIntArray(str, iArr);
                            return;
                        }
                        return;
                    case 109413500:
                        if (string3.equals("short")) {
                            bundle.putShort(str, (short) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 1359468275:
                        if (string3.equals("double[]")) {
                            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                            int length8 = jSONArray8.length();
                            double[] dArr = new double[length8];
                            int i17 = length8 - 1;
                            if (i17 >= 0) {
                                while (true) {
                                    int i18 = i2 + 1;
                                    dArr[i2] = jSONArray8.getDouble(i2);
                                    if (i18 <= i17) {
                                        i2 = i18;
                                    }
                                }
                            }
                            bundle.putDoubleArray(str, dArr);
                            return;
                        }
                        return;
                    case 2067161310:
                        if (string3.equals("short[]")) {
                            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                            int length9 = jSONArray9.length();
                            short[] sArr = new short[length9];
                            int i19 = length9 - 1;
                            if (i19 >= 0) {
                                while (true) {
                                    int i20 = i2 + 1;
                                    sArr[i2] = (short) jSONArray9.getInt(i2);
                                    if (i20 <= i19) {
                                        i2 = i20;
                                    }
                                }
                            }
                            bundle.putShortArray(str, sArr);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final void a() {
        this.b.edit().clear().apply();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String next : this.b.getAll().keySet()) {
            try {
                l.c(next, "key");
                b(next, bundle);
            } catch (JSONException e2) {
                i0.a aVar = i0.f1448e;
                p0 p0Var = p0.CACHE;
                String str = f1717d;
                aVar.a(p0Var, 5, str, "Error reading cached value for key: '" + next + "' -- " + e2);
                return null;
            }
        }
        return bundle;
    }
}
