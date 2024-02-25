package f.e.c.a.z.a;

import f.e.c.a.z.a.z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class u0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else if (!(obj instanceof i)) {
            return obj instanceof s0 ? obj == ((s0) obj).d() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = i.f4106f;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb, int i2, String str, Object obj) {
        String a;
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                c(sb, i2, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                c(sb, i2, str, c2);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a = m1.c((String) obj);
            } else if (obj instanceof i) {
                sb.append(": \"");
                a = m1.a((i) obj);
            } else {
                if (obj instanceof z) {
                    sb.append(" {");
                    d((z) obj, sb, i2 + 2);
                    sb.append("\n");
                    while (i3 < i2) {
                        sb.append(' ');
                        i3++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i2 + 2;
                    c(sb, i5, "key", entry.getKey());
                    c(sb, i5, "value", entry.getValue());
                    sb.append("\n");
                    while (i3 < i2) {
                        sb.append(' ');
                        i3++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(a);
            sb.append('\"');
        }
    }

    private static void d(s0 s0Var, StringBuilder sb, int i2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : s0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i2, a(str2), z.A(method2, s0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i2, a(str3), z.A(method3, s0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object A = z.A(method4, s0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) z.A(method5, s0Var, new Object[0])).booleanValue();
                    } else if (b(A)) {
                        z = false;
                    }
                    if (z) {
                        c(sb, i2, a(str4), A);
                    }
                }
            }
        }
        if (s0Var instanceof z.c) {
            Iterator<Map.Entry<z.d, Object>> s2 = ((z.c) s0Var).extensions.s();
            while (s2.hasNext()) {
                Map.Entry next = s2.next();
                c(sb, i2, "[" + ((z.d) next.getKey()).b() + "]", next.getValue());
            }
        }
        p1 p1Var = ((z) s0Var).unknownFields;
        if (p1Var != null) {
            p1Var.m(sb, i2);
        }
    }

    static String e(s0 s0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(s0Var, sb, 0);
        return sb.toString();
    }
}
