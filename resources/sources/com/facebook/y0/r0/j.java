package com.facebook.y0.r0;

import android.text.TextUtils;
import com.facebook.g0;
import com.facebook.internal.s0.n.a;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import m.d0.d;
import m.d0.f;
import m.y.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j {
    public static final j a = new j();

    private j() {
    }

    public static final File a() {
        Class<j> cls = j.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            g0 g0Var = g0.a;
            File file = new File(g0.c().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            a.b(th, cls);
            return null;
        }
    }

    public static final Map<String, f> c(File file) {
        Map<String, f> map;
        File file2 = file;
        Class<j> cls = j.class;
        if (a.d(cls)) {
            return null;
        }
        try {
            l.d(file2, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i3 = wrap.getInt();
                int i4 = i3 + 4;
                if (available < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, d.a));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i5 = length - 1;
                if (i5 >= 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        strArr[i6] = names.getString(i6);
                        if (i7 > i5) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                e.g(strArr);
                HashMap hashMap = new HashMap();
                int i8 = 0;
                while (i8 < length) {
                    String str = strArr[i8];
                    i8++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i9 = length2 - 1;
                        int i10 = 1;
                        if (i9 >= 0) {
                            while (true) {
                                int i11 = i2 + 1;
                                try {
                                    iArr[i2] = jSONArray.getInt(i2);
                                    i10 *= iArr[i2];
                                    if (i11 > i9) {
                                        break;
                                    }
                                    i2 = i11;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    map = null;
                                    a.b(th, cls);
                                    return map;
                                }
                            }
                        }
                        int i12 = i10 * 4;
                        int i13 = i4 + i12;
                        if (i13 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i4, i12);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        f fVar = new f(iArr);
                        wrap2.asFloatBuffer().get(fVar.a(), 0, i10);
                        hashMap.put(str, fVar);
                        i4 = i13;
                        i2 = 0;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
            a.b(th, cls);
            return map;
        }
    }

    public final String b(String str) {
        if (a.d(this)) {
            return null;
        }
        try {
            l.d(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                boolean z2 = l.e(str.charAt(!z ? i2 : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new f("\\s+").c(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                l.c(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }

    public final int[] d(String str, int i2) {
        if (a.d(this)) {
            return null;
        }
        try {
            l.d(str, "texts");
            int[] iArr = new int[i2];
            String b = b(str);
            Charset forName = Charset.forName("UTF-8");
            l.c(forName, "forName(\"UTF-8\")");
            if (b != null) {
                byte[] bytes = b.getBytes(forName);
                l.c(bytes, "(this as java.lang.String).getBytes(charset)");
                if (i2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 < bytes.length) {
                            iArr[i3] = bytes[i3] & 255;
                        } else {
                            iArr[i3] = 0;
                        }
                        if (i4 >= i2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            a.b(th, this);
            return null;
        }
    }
}
