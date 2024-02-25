package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

public final class g {

    static class a {
        static boolean a(ListView listView, int i2) {
            return listView.canScrollList(i2);
        }

        static void b(ListView listView, int i2) {
            listView.scrollListBy(i2);
        }
    }

    public static void a(ListView listView, int i2) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            a.b(listView, i2);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
        }
    }
}
