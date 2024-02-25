package m.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import m.a0.c;
import m.y.d.l;

class r extends q {
    public static <T> List<T> A(List<? extends T> list, c cVar) {
        l.d(list, "<this>");
        l.d(cVar, "indices");
        return cVar.isEmpty() ? j.e() : D(list.subList(cVar.n().intValue(), cVar.m().intValue() + 1));
    }

    public static <T> List<T> B(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        l.d(iterable, "<this>");
        l.d(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return D(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e.h(array, comparator);
            return e.a(array);
        }
        List<T> E = E(iterable);
        n.l(E, comparator);
        return E;
    }

    public static final <T, C extends Collection<? super T>> C C(Iterable<? extends T> iterable, C c) {
        l.d(iterable, "<this>");
        l.d(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> D(Iterable<? extends T> iterable) {
        l.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j.h(E(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j.e();
        }
        if (size != 1) {
            return F(collection);
        }
        return i.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> E(Iterable<? extends T> iterable) {
        l.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            return F((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> F(Collection<? extends T> collection) {
        l.d(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> G(Iterable<? extends T> iterable) {
        l.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return e0.b();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(z.a(collection.size()));
                C(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return d0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C(iterable, linkedHashSet2);
        return e0.e(linkedHashSet2);
    }

    public static <T> boolean n(Iterable<? extends T> iterable, T t) {
        l.d(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : q(iterable, t) >= 0;
    }

    public static <T> List<T> o(Iterable<? extends T> iterable, int i2) {
        ArrayList arrayList;
        l.d(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return D(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i2;
                if (size <= 0) {
                    return j.e();
                }
                if (size == 1) {
                    return i.b(v(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i2 < size2) {
                            arrayList.add(((List) iterable).get(i2));
                            i2++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i2);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i3 >= i2) {
                    arrayList.add(next);
                } else {
                    i3++;
                }
            }
            return j.h(arrayList);
        }
    }

    public static <T> T p(List<? extends T> list) {
        l.d(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> int q(Iterable<? extends T> iterable, T t) {
        l.d(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                h.i();
                throw null;
            } else if (l.a(t, next)) {
                return i2;
            } else {
                i2++;
            }
        }
        return -1;
    }

    public static final <T, A extends Appendable> A r(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, m.y.c.l<? super T, ? extends CharSequence> lVar) {
        l.d(iterable, "<this>");
        l.d(a, "buffer");
        l.d(charSequence, "separator");
        l.d(charSequence2, "prefix");
        l.d(charSequence3, "postfix");
        l.d(charSequence4, "truncated");
        a.append(charSequence2);
        int i3 = 0;
        for (Object next : iterable) {
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            h.a(a, next, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ Appendable s(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, m.y.c.l lVar, int i3, Object obj) {
        String str = (i3 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        r(iterable, appendable, str, charSequence6, charSequence5, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String t(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, m.y.c.l<? super T, ? extends CharSequence> lVar) {
        l.d(iterable, "<this>");
        l.d(charSequence, "separator");
        l.d(charSequence2, "prefix");
        l.d(charSequence3, "postfix");
        l.d(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        r(iterable, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String sb2 = sb.toString();
        l.c(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String u(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, m.y.c.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return t(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    public static final <T> T v(Iterable<? extends T> iterable) {
        T next;
        l.d(iterable, "<this>");
        if (iterable instanceof List) {
            return w((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T w(List<? extends T> list) {
        l.d(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(j.f(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> T x(Iterable<? extends T> iterable) {
        l.d(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    public static <T> T y(Iterable<? extends T> iterable) {
        l.d(iterable, "<this>");
        if (iterable instanceof List) {
            return z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T z(List<? extends T> list) {
        l.d(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }
}
