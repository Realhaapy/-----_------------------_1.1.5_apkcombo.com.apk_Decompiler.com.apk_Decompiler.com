package f.h.a;

import android.util.Log;
import f.h.a.e.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d {
    private final String a;
    private final List<Object> b;

    public d(String str, List<Object> list) {
        this.a = str;
        this.b = list == null ? new ArrayList<>() : list;
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            hashMap.put(j(next.getKey()), value instanceof Map ? a((Map) value) : j(value));
        }
        return hashMap;
    }

    private String[] c(List<Object> list) {
        return (String[]) h(list).toArray(new String[0]);
    }

    private Object[] g(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object k2 : list) {
                arrayList.add(k(k2));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private List<String> h(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object j2 : list) {
                arrayList.add(j(j2));
            }
        }
        return arrayList;
    }

    private static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : (byte[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList.toString();
    }

    private static Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (a.c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                bArr[i2] = (byte) ((Integer) list.get(i2)).intValue();
            }
            obj = bArr;
        }
        if (a.c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        return obj;
    }

    public String[] b() {
        return c(this.b);
    }

    public List<Object> d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null) {
            if (!str.equals(dVar.a)) {
                return false;
            }
        } else if (dVar.a != null) {
            return false;
        }
        if (this.b.size() != dVar.b.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (!(this.b.get(i2) instanceof byte[]) || !(dVar.b.get(i2) instanceof byte[])) {
                if (!this.b.get(i2).equals(dVar.b.get(i2))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.b.get(i2), (byte[]) dVar.b.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public Object[] f() {
        return g(this.b);
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public d i() {
        if (this.b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.a.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = this.a.charAt(i4);
            if (charAt == '?') {
                int i5 = i4 + 1;
                if (i5 < length && Character.isDigit(this.a.charAt(i5))) {
                    return this;
                }
                i2++;
                if (i3 >= this.b.size()) {
                    return this;
                }
                int i6 = i3 + 1;
                Object obj = this.b.get(i3);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i3 = i6;
                } else {
                    arrayList.add(obj);
                    i3 = i6;
                }
            }
            sb.append(charAt);
        }
        return i2 != this.b.size() ? this : new d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        List<Object> list = this.b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + h(this.b);
        }
        sb.append(str);
        return sb.toString();
    }
}
