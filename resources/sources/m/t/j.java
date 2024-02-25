package m.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m.y.d.l;

class j extends i {
    public static <T> ArrayList<T> c(T... tArr) {
        l.d(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new a(tArr, true));
    }

    public static final <T> Collection<T> d(T[] tArr) {
        l.d(tArr, "<this>");
        return new a(tArr, false);
    }

    public static <T> List<T> e() {
        return t.f5022e;
    }

    public static <T> int f(List<? extends T> list) {
        l.d(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> g(T... tArr) {
        l.d(tArr, "elements");
        return tArr.length > 0 ? e.a(tArr) : e();
    }

    public static <T> List<T> h(List<? extends T> list) {
        l.d(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : i.b(list.get(0)) : e();
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
