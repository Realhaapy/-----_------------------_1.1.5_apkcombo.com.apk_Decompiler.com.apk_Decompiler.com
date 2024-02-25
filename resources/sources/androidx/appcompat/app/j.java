package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class j {
    private static Field a;
    private static boolean b;
    private static Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f201d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f202e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f203f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f204g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f205h;

    static void a(Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 >= 24) {
                d(resources);
            } else if (i2 >= 23) {
                c(resources);
            } else if (i2 >= 21) {
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Object obj = null;
        Field field = a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f205h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f204g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f205h = true;
        }
        Field field = f204g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj != null) {
                if (!b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    b = true;
                }
                Field field2 = a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    private static void e(Object obj) {
        if (!f201d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f201d = true;
        }
        Class<?> cls = c;
        if (cls != null) {
            if (!f203f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f202e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f203f = true;
            }
            Field field = f202e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
