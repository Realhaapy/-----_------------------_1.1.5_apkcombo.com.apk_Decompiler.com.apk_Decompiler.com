package androidx.core.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public abstract class r {

    public interface a {
    }

    public abstract Parcelable a(View view, Matrix matrix, RectF rectF);

    public abstract View b(Context context, Parcelable parcelable);

    public abstract void c(List<String> list, Map<String, View> map);

    public abstract void d(List<View> list);

    public abstract void e(List<String> list, List<View> list2, List<View> list3);

    public abstract void f(List<String> list, List<View> list2, List<View> list3);

    public abstract void g(List<String> list, List<View> list2, a aVar);
}
