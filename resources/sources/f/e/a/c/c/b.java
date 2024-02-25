package f.e.a.c.c;

import android.os.IBinder;
import com.google.android.gms.common.internal.n;
import f.e.a.c.c.a;
import java.lang.reflect.Field;

public final class b<T> extends a.C0106a {
    private final T a;

    private b(T t) {
        this.a = t;
    }

    public static <T> T b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 == 1) {
            n.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <T> a c(T t) {
        return new b(t);
    }
}
